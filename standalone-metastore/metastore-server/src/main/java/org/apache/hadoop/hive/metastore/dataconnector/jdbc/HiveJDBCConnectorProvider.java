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

package org.apache.hadoop.hive.metastore.dataconnector.jdbc;

import org.apache.hadoop.hive.metastore.ColumnType;
import org.apache.hadoop.hive.metastore.api.DataConnector;
import org.apache.hadoop.hive.metastore.api.MetaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HiveJDBCConnectorProvider extends AbstractJDBCConnectorProvider {
  private static final Logger LOG = LoggerFactory.getLogger(HiveJDBCConnectorProvider.class);
  private static final String DRIVER_CLASS = "org.apache.hive.jdbc.HiveDriver";
  // for Hive the type for connector is "HIVEJDBC" where as on the table we want it to be "HIVE"
  protected static final String mappedType = "HIVE";

  public HiveJDBCConnectorProvider(String dbName, DataConnector dataConn) {
    super(dbName, dataConn, DRIVER_CLASS);
  }

  @Override protected String getCatalogName() {
    return null;
  }

  @Override protected String getDatabaseName() {
    return scoped_db;
  }

  @Override protected String getDataType(String dbDataType, int size) {
    String mappedType = super.getDataType(dbDataType, size);
    if (!mappedType.equalsIgnoreCase(ColumnType.VOID_TYPE_NAME)) {
      return mappedType;
    }

    // map any db specific types here.
    switch (dbDataType.trim().toLowerCase())
    {
      case "string":
      case "varchar":
        mappedType = ColumnType.STRING_TYPE_NAME;
        break;
      default:
        // TODO Hive has support for complex data types but JDBCSerDe only supports primitive types
        // SerDe needs to enhanced first to be able to support complex types over federation
        mappedType = ColumnType.VOID_TYPE_NAME;
        break;
      }
    return mappedType;
  }

  @Override protected  String getDatasourceType() { return mappedType; }
}
