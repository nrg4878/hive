/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetSchemaResponse implements org.apache.thrift.TBase<GetSchemaResponse, GetSchemaResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetSchemaResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetSchemaResponse");

  private static final org.apache.thrift.protocol.TField FIELDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fields", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetSchemaResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetSchemaResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<FieldSchema> fields; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELDS((short)1, "fields");

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
        case 1: // FIELDS
          return FIELDS;
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
    tmpMap.put(_Fields.FIELDS, new org.apache.thrift.meta_data.FieldMetaData("fields", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FieldSchema.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetSchemaResponse.class, metaDataMap);
  }

  public GetSchemaResponse() {
  }

  public GetSchemaResponse(
    java.util.List<FieldSchema> fields)
  {
    this();
    this.fields = fields;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSchemaResponse(GetSchemaResponse other) {
    if (other.isSetFields()) {
      java.util.List<FieldSchema> __this__fields = new java.util.ArrayList<FieldSchema>(other.fields.size());
      for (FieldSchema other_element : other.fields) {
        __this__fields.add(new FieldSchema(other_element));
      }
      this.fields = __this__fields;
    }
  }

  public GetSchemaResponse deepCopy() {
    return new GetSchemaResponse(this);
  }

  @Override
  public void clear() {
    this.fields = null;
  }

  public int getFieldsSize() {
    return (this.fields == null) ? 0 : this.fields.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<FieldSchema> getFieldsIterator() {
    return (this.fields == null) ? null : this.fields.iterator();
  }

  public void addToFields(FieldSchema elem) {
    if (this.fields == null) {
      this.fields = new java.util.ArrayList<FieldSchema>();
    }
    this.fields.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<FieldSchema> getFields() {
    return this.fields;
  }

  public void setFields(@org.apache.thrift.annotation.Nullable java.util.List<FieldSchema> fields) {
    this.fields = fields;
  }

  public void unsetFields() {
    this.fields = null;
  }

  /** Returns true if field fields is set (has been assigned a value) and false otherwise */
  public boolean isSetFields() {
    return this.fields != null;
  }

  public void setFieldsIsSet(boolean value) {
    if (!value) {
      this.fields = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FIELDS:
      if (value == null) {
        unsetFields();
      } else {
        setFields((java.util.List<FieldSchema>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELDS:
      return getFields();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FIELDS:
      return isSetFields();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSchemaResponse)
      return this.equals((GetSchemaResponse)that);
    return false;
  }

  public boolean equals(GetSchemaResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fields = true && this.isSetFields();
    boolean that_present_fields = true && that.isSetFields();
    if (this_present_fields || that_present_fields) {
      if (!(this_present_fields && that_present_fields))
        return false;
      if (!this.fields.equals(that.fields))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFields()) ? 131071 : 524287);
    if (isSetFields())
      hashCode = hashCode * 8191 + fields.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetSchemaResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetFields()).compareTo(other.isSetFields());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFields()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fields, other.fields);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSchemaResponse(");
    boolean first = true;

    sb.append("fields:");
    if (this.fields == null) {
      sb.append("null");
    } else {
      sb.append(this.fields);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFields()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fields' is unset! Struct:" + toString());
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

  private static class GetSchemaResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSchemaResponseStandardScheme getScheme() {
      return new GetSchemaResponseStandardScheme();
    }
  }

  private static class GetSchemaResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetSchemaResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetSchemaResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1284 = iprot.readListBegin();
                struct.fields = new java.util.ArrayList<FieldSchema>(_list1284.size);
                @org.apache.thrift.annotation.Nullable FieldSchema _elem1285;
                for (int _i1286 = 0; _i1286 < _list1284.size; ++_i1286)
                {
                  _elem1285 = new FieldSchema();
                  _elem1285.read(iprot);
                  struct.fields.add(_elem1285);
                }
                iprot.readListEnd();
              }
              struct.setFieldsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetSchemaResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fields != null) {
        oprot.writeFieldBegin(FIELDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.fields.size()));
          for (FieldSchema _iter1287 : struct.fields)
          {
            _iter1287.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetSchemaResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSchemaResponseTupleScheme getScheme() {
      return new GetSchemaResponseTupleScheme();
    }
  }

  private static class GetSchemaResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetSchemaResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetSchemaResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.fields.size());
        for (FieldSchema _iter1288 : struct.fields)
        {
          _iter1288.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetSchemaResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list1289 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.fields = new java.util.ArrayList<FieldSchema>(_list1289.size);
        @org.apache.thrift.annotation.Nullable FieldSchema _elem1290;
        for (int _i1291 = 0; _i1291 < _list1289.size; ++_i1291)
        {
          _elem1290 = new FieldSchema();
          _elem1290.read(iprot);
          struct.fields.add(_elem1290);
        }
      }
      struct.setFieldsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

