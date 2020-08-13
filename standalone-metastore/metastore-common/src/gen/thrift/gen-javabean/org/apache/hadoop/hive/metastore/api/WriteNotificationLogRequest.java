/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class WriteNotificationLogRequest implements org.apache.thrift.TBase<WriteNotificationLogRequest, WriteNotificationLogRequest._Fields>, java.io.Serializable, Cloneable, Comparable<WriteNotificationLogRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WriteNotificationLogRequest");

  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("writeId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DB_FIELD_DESC = new org.apache.thrift.protocol.TField("db", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField FILE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("fileInfo", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField PARTITION_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionVals", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WriteNotificationLogRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WriteNotificationLogRequestTupleSchemeFactory());
  }

  private long txnId; // required
  private long writeId; // required
  private String db; // required
  private String table; // required
  private InsertEventRequestData fileInfo; // required
  private List<String> partitionVals; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXN_ID((short)1, "txnId"),
    WRITE_ID((short)2, "writeId"),
    DB((short)3, "db"),
    TABLE((short)4, "table"),
    FILE_INFO((short)5, "fileInfo"),
    PARTITION_VALS((short)6, "partitionVals");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TXN_ID
          return TXN_ID;
        case 2: // WRITE_ID
          return WRITE_ID;
        case 3: // DB
          return DB;
        case 4: // TABLE
          return TABLE;
        case 5: // FILE_INFO
          return FILE_INFO;
        case 6: // PARTITION_VALS
          return PARTITION_VALS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TXNID_ISSET_ID = 0;
  private static final int __WRITEID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITION_VALS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txnId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("writeId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DB, new org.apache.thrift.meta_data.FieldMetaData("db", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FILE_INFO, new org.apache.thrift.meta_data.FieldMetaData("fileInfo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, InsertEventRequestData.class)));
    tmpMap.put(_Fields.PARTITION_VALS, new org.apache.thrift.meta_data.FieldMetaData("partitionVals", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WriteNotificationLogRequest.class, metaDataMap);
  }

  public WriteNotificationLogRequest() {
  }

  public WriteNotificationLogRequest(
    long txnId,
    long writeId,
    String db,
    String table,
    InsertEventRequestData fileInfo)
  {
    this();
    this.txnId = txnId;
    setTxnIdIsSet(true);
    this.writeId = writeId;
    setWriteIdIsSet(true);
    this.db = db;
    this.table = table;
    this.fileInfo = fileInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WriteNotificationLogRequest(WriteNotificationLogRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txnId = other.txnId;
    this.writeId = other.writeId;
    if (other.isSetDb()) {
      this.db = other.db;
    }
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetFileInfo()) {
      this.fileInfo = new InsertEventRequestData(other.fileInfo);
    }
    if (other.isSetPartitionVals()) {
      List<String> __this__partitionVals = new ArrayList<String>(other.partitionVals);
      this.partitionVals = __this__partitionVals;
    }
  }

  public WriteNotificationLogRequest deepCopy() {
    return new WriteNotificationLogRequest(this);
  }

  @Override
  public void clear() {
    setTxnIdIsSet(false);
    this.txnId = 0;
    setWriteIdIsSet(false);
    this.writeId = 0;
    this.db = null;
    this.table = null;
    this.fileInfo = null;
    this.partitionVals = null;
  }

  public long getTxnId() {
    return this.txnId;
  }

  public void setTxnId(long txnId) {
    this.txnId = txnId;
    setTxnIdIsSet(true);
  }

  public void unsetTxnId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnId is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnId() {
    return EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public long getWriteId() {
    return this.writeId;
  }

  public void setWriteId(long writeId) {
    this.writeId = writeId;
    setWriteIdIsSet(true);
  }

  public void unsetWriteId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  /** Returns true if field writeId is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteId() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  public void setWriteIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITEID_ISSET_ID, value);
  }

  public String getDb() {
    return this.db;
  }

  public void setDb(String db) {
    this.db = db;
  }

  public void unsetDb() {
    this.db = null;
  }

  /** Returns true if field db is set (has been assigned a value) and false otherwise */
  public boolean isSetDb() {
    return this.db != null;
  }

  public void setDbIsSet(boolean value) {
    if (!value) {
      this.db = null;
    }
  }

  public String getTable() {
    return this.table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  public InsertEventRequestData getFileInfo() {
    return this.fileInfo;
  }

  public void setFileInfo(InsertEventRequestData fileInfo) {
    this.fileInfo = fileInfo;
  }

  public void unsetFileInfo() {
    this.fileInfo = null;
  }

  /** Returns true if field fileInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetFileInfo() {
    return this.fileInfo != null;
  }

  public void setFileInfoIsSet(boolean value) {
    if (!value) {
      this.fileInfo = null;
    }
  }

  public int getPartitionValsSize() {
    return (this.partitionVals == null) ? 0 : this.partitionVals.size();
  }

  public java.util.Iterator<String> getPartitionValsIterator() {
    return (this.partitionVals == null) ? null : this.partitionVals.iterator();
  }

  public void addToPartitionVals(String elem) {
    if (this.partitionVals == null) {
      this.partitionVals = new ArrayList<String>();
    }
    this.partitionVals.add(elem);
  }

  public List<String> getPartitionVals() {
    return this.partitionVals;
  }

  public void setPartitionVals(List<String> partitionVals) {
    this.partitionVals = partitionVals;
  }

  public void unsetPartitionVals() {
    this.partitionVals = null;
  }

  /** Returns true if field partitionVals is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionVals() {
    return this.partitionVals != null;
  }

  public void setPartitionValsIsSet(boolean value) {
    if (!value) {
      this.partitionVals = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TXN_ID:
      if (value == null) {
        unsetTxnId();
      } else {
        setTxnId((Long)value);
      }
      break;

    case WRITE_ID:
      if (value == null) {
        unsetWriteId();
      } else {
        setWriteId((Long)value);
      }
      break;

    case DB:
      if (value == null) {
        unsetDb();
      } else {
        setDb((String)value);
      }
      break;

    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((String)value);
      }
      break;

    case FILE_INFO:
      if (value == null) {
        unsetFileInfo();
      } else {
        setFileInfo((InsertEventRequestData)value);
      }
      break;

    case PARTITION_VALS:
      if (value == null) {
        unsetPartitionVals();
      } else {
        setPartitionVals((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TXN_ID:
      return getTxnId();

    case WRITE_ID:
      return getWriteId();

    case DB:
      return getDb();

    case TABLE:
      return getTable();

    case FILE_INFO:
      return getFileInfo();

    case PARTITION_VALS:
      return getPartitionVals();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TXN_ID:
      return isSetTxnId();
    case WRITE_ID:
      return isSetWriteId();
    case DB:
      return isSetDb();
    case TABLE:
      return isSetTable();
    case FILE_INFO:
      return isSetFileInfo();
    case PARTITION_VALS:
      return isSetPartitionVals();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WriteNotificationLogRequest)
      return this.equals((WriteNotificationLogRequest)that);
    return false;
  }

  public boolean equals(WriteNotificationLogRequest that) {
    if (that == null)
      return false;

    boolean this_present_txnId = true;
    boolean that_present_txnId = true;
    if (this_present_txnId || that_present_txnId) {
      if (!(this_present_txnId && that_present_txnId))
        return false;
      if (this.txnId != that.txnId)
        return false;
    }

    boolean this_present_writeId = true;
    boolean that_present_writeId = true;
    if (this_present_writeId || that_present_writeId) {
      if (!(this_present_writeId && that_present_writeId))
        return false;
      if (this.writeId != that.writeId)
        return false;
    }

    boolean this_present_db = true && this.isSetDb();
    boolean that_present_db = true && that.isSetDb();
    if (this_present_db || that_present_db) {
      if (!(this_present_db && that_present_db))
        return false;
      if (!this.db.equals(that.db))
        return false;
    }

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_fileInfo = true && this.isSetFileInfo();
    boolean that_present_fileInfo = true && that.isSetFileInfo();
    if (this_present_fileInfo || that_present_fileInfo) {
      if (!(this_present_fileInfo && that_present_fileInfo))
        return false;
      if (!this.fileInfo.equals(that.fileInfo))
        return false;
    }

    boolean this_present_partitionVals = true && this.isSetPartitionVals();
    boolean that_present_partitionVals = true && that.isSetPartitionVals();
    if (this_present_partitionVals || that_present_partitionVals) {
      if (!(this_present_partitionVals && that_present_partitionVals))
        return false;
      if (!this.partitionVals.equals(that.partitionVals))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_txnId = true;
    list.add(present_txnId);
    if (present_txnId)
      list.add(txnId);

    boolean present_writeId = true;
    list.add(present_writeId);
    if (present_writeId)
      list.add(writeId);

    boolean present_db = true && (isSetDb());
    list.add(present_db);
    if (present_db)
      list.add(db);

    boolean present_table = true && (isSetTable());
    list.add(present_table);
    if (present_table)
      list.add(table);

    boolean present_fileInfo = true && (isSetFileInfo());
    list.add(present_fileInfo);
    if (present_fileInfo)
      list.add(fileInfo);

    boolean present_partitionVals = true && (isSetPartitionVals());
    list.add(present_partitionVals);
    if (present_partitionVals)
      list.add(partitionVals);

    return list.hashCode();
  }

  @Override
  public int compareTo(WriteNotificationLogRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTxnId()).compareTo(other.isSetTxnId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnId, other.txnId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteId()).compareTo(other.isSetWriteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeId, other.writeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDb()).compareTo(other.isSetDb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db, other.db);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable()).compareTo(other.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, other.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFileInfo()).compareTo(other.isSetFileInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileInfo, other.fileInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionVals()).compareTo(other.isSetPartitionVals());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionVals()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionVals, other.partitionVals);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WriteNotificationLogRequest(");
    boolean first = true;

    sb.append("txnId:");
    sb.append(this.txnId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("writeId:");
    sb.append(this.writeId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("db:");
    if (this.db == null) {
      sb.append("null");
    } else {
      sb.append(this.db);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("table:");
    if (this.table == null) {
      sb.append("null");
    } else {
      sb.append(this.table);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fileInfo:");
    if (this.fileInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.fileInfo);
    }
    first = false;
    if (isSetPartitionVals()) {
      if (!first) sb.append(", ");
      sb.append("partitionVals:");
      if (this.partitionVals == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionVals);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTxnId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txnId' is unset! Struct:" + toString());
    }

    if (!isSetWriteId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'writeId' is unset! Struct:" + toString());
    }

    if (!isSetDb()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'db' is unset! Struct:" + toString());
    }

    if (!isSetTable()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table' is unset! Struct:" + toString());
    }

    if (!isSetFileInfo()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fileInfo' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (fileInfo != null) {
      fileInfo.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WriteNotificationLogRequestStandardSchemeFactory implements SchemeFactory {
    public WriteNotificationLogRequestStandardScheme getScheme() {
      return new WriteNotificationLogRequestStandardScheme();
    }
  }

  private static class WriteNotificationLogRequestStandardScheme extends StandardScheme<WriteNotificationLogRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WriteNotificationLogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnId = iprot.readI64();
              struct.setTxnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeId = iprot.readI64();
              struct.setWriteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db = iprot.readString();
              struct.setDbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table = iprot.readString();
              struct.setTableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FILE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fileInfo = new InsertEventRequestData();
              struct.fileInfo.read(iprot);
              struct.setFileInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PARTITION_VALS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list870 = iprot.readListBegin();
                struct.partitionVals = new ArrayList<String>(_list870.size);
                String _elem871;
                for (int _i872 = 0; _i872 < _list870.size; ++_i872)
                {
                  _elem871 = iprot.readString();
                  struct.partitionVals.add(_elem871);
                }
                iprot.readListEnd();
              }
              struct.setPartitionValsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WriteNotificationLogRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
      oprot.writeI64(struct.txnId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(WRITE_ID_FIELD_DESC);
      oprot.writeI64(struct.writeId);
      oprot.writeFieldEnd();
      if (struct.db != null) {
        oprot.writeFieldBegin(DB_FIELD_DESC);
        oprot.writeString(struct.db);
        oprot.writeFieldEnd();
      }
      if (struct.table != null) {
        oprot.writeFieldBegin(TABLE_FIELD_DESC);
        oprot.writeString(struct.table);
        oprot.writeFieldEnd();
      }
      if (struct.fileInfo != null) {
        oprot.writeFieldBegin(FILE_INFO_FIELD_DESC);
        struct.fileInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.partitionVals != null) {
        if (struct.isSetPartitionVals()) {
          oprot.writeFieldBegin(PARTITION_VALS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partitionVals.size()));
            for (String _iter873 : struct.partitionVals)
            {
              oprot.writeString(_iter873);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WriteNotificationLogRequestTupleSchemeFactory implements SchemeFactory {
    public WriteNotificationLogRequestTupleScheme getScheme() {
      return new WriteNotificationLogRequestTupleScheme();
    }
  }

  private static class WriteNotificationLogRequestTupleScheme extends TupleScheme<WriteNotificationLogRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WriteNotificationLogRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.txnId);
      oprot.writeI64(struct.writeId);
      oprot.writeString(struct.db);
      oprot.writeString(struct.table);
      struct.fileInfo.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetPartitionVals()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPartitionVals()) {
        {
          oprot.writeI32(struct.partitionVals.size());
          for (String _iter874 : struct.partitionVals)
          {
            oprot.writeString(_iter874);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WriteNotificationLogRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.txnId = iprot.readI64();
      struct.setTxnIdIsSet(true);
      struct.writeId = iprot.readI64();
      struct.setWriteIdIsSet(true);
      struct.db = iprot.readString();
      struct.setDbIsSet(true);
      struct.table = iprot.readString();
      struct.setTableIsSet(true);
      struct.fileInfo = new InsertEventRequestData();
      struct.fileInfo.read(iprot);
      struct.setFileInfoIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list875 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.partitionVals = new ArrayList<String>(_list875.size);
          String _elem876;
          for (int _i877 = 0; _i877 < _list875.size; ++_i877)
          {
            _elem876 = iprot.readString();
            struct.partitionVals.add(_elem876);
          }
        }
        struct.setPartitionValsIsSet(true);
      }
    }
  }

}

