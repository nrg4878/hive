/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.exec.vector.expressions;

import java.sql.Timestamp;
import java.util.Arrays;

import org.apache.hadoop.hive.common.type.Date;
import org.apache.hadoop.hive.ql.exec.vector.LongColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.hadoop.hive.ql.exec.vector.*;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.util.DateTimeMath;
import org.apache.hadoop.hive.serde.serdeConstants;
import org.apache.hadoop.hive.serde2.io.DateWritableV2;

// A type date (LongColumnVector storing epoch days) minus a type date produces a
// type interval_day_time (TimestampColumnVector storing nanosecond interval in 2 longs).
public class DateColSubtractDateScalar extends VectorExpression {

  private static final long serialVersionUID = 1L;

  private final Timestamp value;

  private transient final Timestamp scratchTimestamp1 = new Timestamp(0);
  private transient final DateTimeMath dtm = new DateTimeMath();

  public DateColSubtractDateScalar(int colNum, long value, int outputColumnNum) {
    super(colNum, outputColumnNum);
    this.value = new Timestamp(0);
    this.value.setTime(DateWritableV2.daysToMillis((int) value));
  }

  public DateColSubtractDateScalar() {
    super();

    // Dummy final assignments.
    value = null;
  }

  @Override
  public void evaluate(VectorizedRowBatch batch) throws HiveException {

    if (childExpressions != null) {
      super.evaluateChildren(batch);
    }

    // Input #1 is type date (epochDays).
    LongColumnVector inputColVector1 = (LongColumnVector) batch.cols[inputColumnNum[0]];

    // Output is type HiveIntervalDayTime.
    IntervalDayTimeColumnVector outputColVector = (IntervalDayTimeColumnVector) batch.cols[outputColumnNum];

    int[] sel = batch.selected;
    boolean[] inputIsNull = inputColVector1.isNull;
    boolean[] outputIsNull = outputColVector.isNull;
    int n = batch.size;
    long[] vector1 = inputColVector1.vector;

    // return immediately if batch is empty
    if (n == 0) {
      return;
    }

    // We do not need to do a column reset since we are carefully changing the output.
    outputColVector.isRepeating = false;

    if (inputColVector1.isRepeating) {
      if (inputColVector1.noNulls || !inputIsNull[0]) {
        outputIsNull[0] = false;
        scratchTimestamp1.setTime(DateWritableV2.daysToMillis((int) vector1[0]));
        dtm.subtract(scratchTimestamp1, value, outputColVector.getScratchIntervalDayTime());
        outputColVector.setFromScratchIntervalDayTime(0);

      } else {
        outputIsNull[0] = true;
        outputColVector.noNulls = false;
      }
      outputColVector.isRepeating = true;
      NullUtil.setNullOutputEntriesColScalar(outputColVector, batch.selectedInUse, sel, n);
      return;
    }

    if (inputColVector1.noNulls) {
      if (batch.selectedInUse) {

        // CONSIDER: For large n, fill n or all of isNull array and use the tighter ELSE loop.

        if (!outputColVector.noNulls) {
          for(int j = 0; j != n; j++) {
           final int i = sel[j];
           // Set isNull before call in case it changes it mind.
           outputIsNull[i] = false;
           scratchTimestamp1.setTime(DateWritableV2.daysToMillis((int) vector1[i]));
           dtm.subtract(scratchTimestamp1, value, outputColVector.getScratchIntervalDayTime());
           outputColVector.setFromScratchIntervalDayTime(i);
         }
        } else {
          for(int j = 0; j != n; j++) {
            final int i = sel[j];
            scratchTimestamp1.setTime(DateWritableV2.daysToMillis((int) vector1[i]));
            dtm.subtract(scratchTimestamp1, value, outputColVector.getScratchIntervalDayTime());
            outputColVector.setFromScratchIntervalDayTime(i);
          }
        }
      } else {
        if (!outputColVector.noNulls) {

          // Assume it is almost always a performance win to fill all of isNull so we can
          // safely reset noNulls.
          Arrays.fill(outputIsNull, false);
          outputColVector.noNulls = true;
        }
        for(int i = 0; i != n; i++) {
          scratchTimestamp1.setTime(DateWritableV2.daysToMillis((int) vector1[i]));
          dtm.subtract(scratchTimestamp1, value, outputColVector.getScratchIntervalDayTime());
          outputColVector.setFromScratchIntervalDayTime(i);
        }
      }
    } else /* there are NULLs in the inputColVector */ {

      // Carefully handle NULLs...
      outputColVector.noNulls = false;

      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          outputIsNull[i] = inputIsNull[i];
          scratchTimestamp1.setTime(DateWritableV2.daysToMillis((int) vector1[i]));
          dtm.subtract(scratchTimestamp1, value, outputColVector.getScratchIntervalDayTime());
          outputColVector.setFromScratchIntervalDayTime(i);
        }
      } else {
        System.arraycopy(inputIsNull, 0, outputIsNull, 0, n);
        for(int i = 0; i != n; i++) {
          scratchTimestamp1.setTime(DateWritableV2.daysToMillis((int) vector1[i]));
          dtm.subtract(scratchTimestamp1, value, outputColVector.getScratchIntervalDayTime());
          outputColVector.setFromScratchIntervalDayTime(i);
        }
      }
    }

    NullUtil.setNullOutputEntriesColScalar(outputColVector, batch.selectedInUse, sel, n);
  }

  @Override
  public String vectorExpressionParameters() {
    return getColumnParamString(0, inputColumnNum[0]) + ", val " + Date.ofEpochMilli(value.getTime());
  }

  @Override
  public VectorExpressionDescriptor.Descriptor getDescriptor() {
    return (new VectorExpressionDescriptor.Builder())
        .setMode(
            VectorExpressionDescriptor.Mode.PROJECTION)
        .setNumArguments(2)
        .setArgumentTypes(
            VectorExpressionDescriptor.ArgumentType.getType(serdeConstants.DATE_TYPE_NAME),
            VectorExpressionDescriptor.ArgumentType.getType(serdeConstants.DATE_TYPE_NAME))
        .setInputExpressionTypes(
            VectorExpressionDescriptor.InputExpressionType.COLUMN,
            VectorExpressionDescriptor.InputExpressionType.SCALAR).build();
  }
}
