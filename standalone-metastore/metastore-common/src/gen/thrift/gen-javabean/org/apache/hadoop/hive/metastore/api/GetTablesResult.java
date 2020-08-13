/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetTablesResult implements org.apache.thrift.TBase<GetTablesResult, GetTablesResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetTablesResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetTablesResult");

  private static final org.apache.thrift.protocol.TField TABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("tables", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetTablesResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetTablesResultTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<Table> tables; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLES((short)1, "tables");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLES
          return TABLES;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLES, new org.apache.thrift.meta_data.FieldMetaData("tables", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Table.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetTablesResult.class, metaDataMap);
  }

  public GetTablesResult() {
  }

  public GetTablesResult(
    java.util.List<Table> tables)
  {
    this();
    this.tables = tables;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetTablesResult(GetTablesResult other) {
    if (other.isSetTables()) {
      java.util.List<Table> __this__tables = new java.util.ArrayList<Table>(other.tables.size());
      for (Table other_element : other.tables) {
        __this__tables.add(new Table(other_element));
      }
      this.tables = __this__tables;
    }
  }

  public GetTablesResult deepCopy() {
    return new GetTablesResult(this);
  }

  @Override
  public void clear() {
    this.tables = null;
  }

  public int getTablesSize() {
    return (this.tables == null) ? 0 : this.tables.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Table> getTablesIterator() {
    return (this.tables == null) ? null : this.tables.iterator();
  }

  public void addToTables(Table elem) {
    if (this.tables == null) {
      this.tables = new java.util.ArrayList<Table>();
    }
    this.tables.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Table> getTables() {
    return this.tables;
  }

  public void setTables(@org.apache.thrift.annotation.Nullable java.util.List<Table> tables) {
    this.tables = tables;
  }

  public void unsetTables() {
    this.tables = null;
  }

  /** Returns true if field tables is set (has been assigned a value) and false otherwise */
  public boolean isSetTables() {
    return this.tables != null;
  }

  public void setTablesIsSet(boolean value) {
    if (!value) {
      this.tables = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLES:
      if (value == null) {
        unsetTables();
      } else {
        setTables((java.util.List<Table>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLES:
      return getTables();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLES:
      return isSetTables();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetTablesResult)
      return this.equals((GetTablesResult)that);
    return false;
  }

  public boolean equals(GetTablesResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tables = true && this.isSetTables();
    boolean that_present_tables = true && that.isSetTables();
    if (this_present_tables || that_present_tables) {
      if (!(this_present_tables && that_present_tables))
        return false;
      if (!this.tables.equals(that.tables))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTables()) ? 131071 : 524287);
    if (isSetTables())
      hashCode = hashCode * 8191 + tables.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetTablesResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTables()).compareTo(other.isSetTables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tables, other.tables);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetTablesResult(");
    boolean first = true;

    sb.append("tables:");
    if (this.tables == null) {
      sb.append("null");
    } else {
      sb.append(this.tables);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTables()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tables' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetTablesResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetTablesResultStandardScheme getScheme() {
      return new GetTablesResultStandardScheme();
    }
  }

  private static class GetTablesResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetTablesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetTablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
<<<<<<< HEAD
                org.apache.thrift.protocol.TList _list1024 = iprot.readListBegin();
                struct.tables = new java.util.ArrayList<Table>(_list1024.size);
                @org.apache.thrift.annotation.Nullable Table _elem1025;
                for (int _i1026 = 0; _i1026 < _list1024.size; ++_i1026)
                {
                  _elem1025 = new Table();
                  _elem1025.read(iprot);
                  struct.tables.add(_elem1025);
=======
                org.apache.thrift.protocol.TList _list1026 = iprot.readListBegin();
                struct.tables = new java.util.ArrayList<Table>(_list1026.size);
                @org.apache.thrift.annotation.Nullable Table _elem1027;
                for (int _i1028 = 0; _i1028 < _list1026.size; ++_i1028)
                {
                  _elem1027 = new Table();
                  _elem1027.read(iprot);
                  struct.tables.add(_elem1027);
>>>>>>> External metastore: clean after rebase
                }
                iprot.readListEnd();
              }
              struct.setTablesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetTablesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tables != null) {
        oprot.writeFieldBegin(TABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tables.size()));
<<<<<<< HEAD
          for (Table _iter1027 : struct.tables)
          {
            _iter1027.write(oprot);
=======
          for (Table _iter1029 : struct.tables)
          {
            _iter1029.write(oprot);
>>>>>>> External metastore: clean after rebase
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetTablesResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetTablesResultTupleScheme getScheme() {
      return new GetTablesResultTupleScheme();
    }
  }

  private static class GetTablesResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetTablesResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetTablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tables.size());
<<<<<<< HEAD
        for (Table _iter1028 : struct.tables)
        {
          _iter1028.write(oprot);
=======
        for (Table _iter1030 : struct.tables)
        {
          _iter1030.write(oprot);
>>>>>>> External metastore: clean after rebase
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetTablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
<<<<<<< HEAD
        org.apache.thrift.protocol.TList _list1029 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tables = new java.util.ArrayList<Table>(_list1029.size);
        @org.apache.thrift.annotation.Nullable Table _elem1030;
        for (int _i1031 = 0; _i1031 < _list1029.size; ++_i1031)
        {
          _elem1030 = new Table();
          _elem1030.read(iprot);
          struct.tables.add(_elem1030);
=======
        org.apache.thrift.protocol.TList _list1031 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tables = new java.util.ArrayList<Table>(_list1031.size);
        @org.apache.thrift.annotation.Nullable Table _elem1032;
        for (int _i1033 = 0; _i1033 < _list1031.size; ++_i1033)
        {
          _elem1032 = new Table();
          _elem1032.read(iprot);
          struct.tables.add(_elem1032);
>>>>>>> External metastore: clean after rebase
        }
      }
      struct.setTablesIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

