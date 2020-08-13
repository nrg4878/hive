/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class WMValidateResourcePlanResponse implements org.apache.thrift.TBase<WMValidateResourcePlanResponse, WMValidateResourcePlanResponse._Fields>, java.io.Serializable, Cloneable, Comparable<WMValidateResourcePlanResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMValidateResourcePlanResponse");

  private static final org.apache.thrift.protocol.TField ERRORS_FIELD_DESC = new org.apache.thrift.protocol.TField("errors", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField WARNINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("warnings", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WMValidateResourcePlanResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WMValidateResourcePlanResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> errors; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> warnings; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERRORS((short)1, "errors"),
    WARNINGS((short)2, "warnings");

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
        case 1: // ERRORS
          return ERRORS;
        case 2: // WARNINGS
          return WARNINGS;
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
  private static final _Fields optionals[] = {_Fields.ERRORS,_Fields.WARNINGS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERRORS, new org.apache.thrift.meta_data.FieldMetaData("errors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.WARNINGS, new org.apache.thrift.meta_data.FieldMetaData("warnings", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMValidateResourcePlanResponse.class, metaDataMap);
  }

  public WMValidateResourcePlanResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMValidateResourcePlanResponse(WMValidateResourcePlanResponse other) {
    if (other.isSetErrors()) {
      java.util.List<java.lang.String> __this__errors = new java.util.ArrayList<java.lang.String>(other.errors);
      this.errors = __this__errors;
    }
    if (other.isSetWarnings()) {
      java.util.List<java.lang.String> __this__warnings = new java.util.ArrayList<java.lang.String>(other.warnings);
      this.warnings = __this__warnings;
    }
  }

  public WMValidateResourcePlanResponse deepCopy() {
    return new WMValidateResourcePlanResponse(this);
  }

  @Override
  public void clear() {
    this.errors = null;
    this.warnings = null;
  }

  public int getErrorsSize() {
    return (this.errors == null) ? 0 : this.errors.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getErrorsIterator() {
    return (this.errors == null) ? null : this.errors.iterator();
  }

  public void addToErrors(java.lang.String elem) {
    if (this.errors == null) {
      this.errors = new java.util.ArrayList<java.lang.String>();
    }
    this.errors.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getErrors() {
    return this.errors;
  }

  public void setErrors(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> errors) {
    this.errors = errors;
  }

  public void unsetErrors() {
    this.errors = null;
  }

  /** Returns true if field errors is set (has been assigned a value) and false otherwise */
  public boolean isSetErrors() {
    return this.errors != null;
  }

  public void setErrorsIsSet(boolean value) {
    if (!value) {
      this.errors = null;
    }
  }

  public int getWarningsSize() {
    return (this.warnings == null) ? 0 : this.warnings.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getWarningsIterator() {
    return (this.warnings == null) ? null : this.warnings.iterator();
  }

  public void addToWarnings(java.lang.String elem) {
    if (this.warnings == null) {
      this.warnings = new java.util.ArrayList<java.lang.String>();
    }
    this.warnings.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getWarnings() {
    return this.warnings;
  }

  public void setWarnings(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> warnings) {
    this.warnings = warnings;
  }

  public void unsetWarnings() {
    this.warnings = null;
  }

  /** Returns true if field warnings is set (has been assigned a value) and false otherwise */
  public boolean isSetWarnings() {
    return this.warnings != null;
  }

  public void setWarningsIsSet(boolean value) {
    if (!value) {
      this.warnings = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ERRORS:
      if (value == null) {
        unsetErrors();
      } else {
        setErrors((java.util.List<java.lang.String>)value);
      }
      break;

    case WARNINGS:
      if (value == null) {
        unsetWarnings();
      } else {
        setWarnings((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERRORS:
      return getErrors();

    case WARNINGS:
      return getWarnings();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERRORS:
      return isSetErrors();
    case WARNINGS:
      return isSetWarnings();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof WMValidateResourcePlanResponse)
      return this.equals((WMValidateResourcePlanResponse)that);
    return false;
  }

  public boolean equals(WMValidateResourcePlanResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_errors = true && this.isSetErrors();
    boolean that_present_errors = true && that.isSetErrors();
    if (this_present_errors || that_present_errors) {
      if (!(this_present_errors && that_present_errors))
        return false;
      if (!this.errors.equals(that.errors))
        return false;
    }

    boolean this_present_warnings = true && this.isSetWarnings();
    boolean that_present_warnings = true && that.isSetWarnings();
    if (this_present_warnings || that_present_warnings) {
      if (!(this_present_warnings && that_present_warnings))
        return false;
      if (!this.warnings.equals(that.warnings))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetErrors()) ? 131071 : 524287);
    if (isSetErrors())
      hashCode = hashCode * 8191 + errors.hashCode();

    hashCode = hashCode * 8191 + ((isSetWarnings()) ? 131071 : 524287);
    if (isSetWarnings())
      hashCode = hashCode * 8191 + warnings.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WMValidateResourcePlanResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetErrors()).compareTo(other.isSetErrors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errors, other.errors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWarnings()).compareTo(other.isSetWarnings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWarnings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.warnings, other.warnings);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WMValidateResourcePlanResponse(");
    boolean first = true;

    if (isSetErrors()) {
      sb.append("errors:");
      if (this.errors == null) {
        sb.append("null");
      } else {
        sb.append(this.errors);
      }
      first = false;
    }
    if (isSetWarnings()) {
      if (!first) sb.append(", ");
      sb.append("warnings:");
      if (this.warnings == null) {
        sb.append("null");
      } else {
        sb.append(this.warnings);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class WMValidateResourcePlanResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WMValidateResourcePlanResponseStandardScheme getScheme() {
      return new WMValidateResourcePlanResponseStandardScheme();
    }
  }

  private static class WMValidateResourcePlanResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<WMValidateResourcePlanResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WMValidateResourcePlanResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERRORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
<<<<<<< HEAD
                org.apache.thrift.protocol.TList _list1104 = iprot.readListBegin();
                struct.errors = new java.util.ArrayList<java.lang.String>(_list1104.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1105;
                for (int _i1106 = 0; _i1106 < _list1104.size; ++_i1106)
                {
                  _elem1105 = iprot.readString();
                  struct.errors.add(_elem1105);
=======
                org.apache.thrift.protocol.TList _list1106 = iprot.readListBegin();
                struct.errors = new java.util.ArrayList<java.lang.String>(_list1106.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1107;
                for (int _i1108 = 0; _i1108 < _list1106.size; ++_i1108)
                {
                  _elem1107 = iprot.readString();
                  struct.errors.add(_elem1107);
>>>>>>> External metastore: clean after rebase
                }
                iprot.readListEnd();
              }
              struct.setErrorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WARNINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
<<<<<<< HEAD
                org.apache.thrift.protocol.TList _list1107 = iprot.readListBegin();
                struct.warnings = new java.util.ArrayList<java.lang.String>(_list1107.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1108;
                for (int _i1109 = 0; _i1109 < _list1107.size; ++_i1109)
                {
                  _elem1108 = iprot.readString();
                  struct.warnings.add(_elem1108);
=======
                org.apache.thrift.protocol.TList _list1109 = iprot.readListBegin();
                struct.warnings = new java.util.ArrayList<java.lang.String>(_list1109.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1110;
                for (int _i1111 = 0; _i1111 < _list1109.size; ++_i1111)
                {
                  _elem1110 = iprot.readString();
                  struct.warnings.add(_elem1110);
>>>>>>> External metastore: clean after rebase
                }
                iprot.readListEnd();
              }
              struct.setWarningsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WMValidateResourcePlanResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.errors != null) {
        if (struct.isSetErrors()) {
          oprot.writeFieldBegin(ERRORS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.errors.size()));
<<<<<<< HEAD
            for (java.lang.String _iter1110 : struct.errors)
            {
              oprot.writeString(_iter1110);
=======
            for (java.lang.String _iter1112 : struct.errors)
            {
              oprot.writeString(_iter1112);
>>>>>>> External metastore: clean after rebase
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.warnings != null) {
        if (struct.isSetWarnings()) {
          oprot.writeFieldBegin(WARNINGS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.warnings.size()));
<<<<<<< HEAD
            for (java.lang.String _iter1111 : struct.warnings)
            {
              oprot.writeString(_iter1111);
=======
            for (java.lang.String _iter1113 : struct.warnings)
            {
              oprot.writeString(_iter1113);
>>>>>>> External metastore: clean after rebase
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

  private static class WMValidateResourcePlanResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WMValidateResourcePlanResponseTupleScheme getScheme() {
      return new WMValidateResourcePlanResponseTupleScheme();
    }
  }

  private static class WMValidateResourcePlanResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<WMValidateResourcePlanResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMValidateResourcePlanResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetErrors()) {
        optionals.set(0);
      }
      if (struct.isSetWarnings()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetErrors()) {
        {
          oprot.writeI32(struct.errors.size());
<<<<<<< HEAD
          for (java.lang.String _iter1112 : struct.errors)
          {
            oprot.writeString(_iter1112);
=======
          for (java.lang.String _iter1114 : struct.errors)
          {
            oprot.writeString(_iter1114);
>>>>>>> External metastore: clean after rebase
          }
        }
      }
      if (struct.isSetWarnings()) {
        {
          oprot.writeI32(struct.warnings.size());
<<<<<<< HEAD
          for (java.lang.String _iter1113 : struct.warnings)
          {
            oprot.writeString(_iter1113);
=======
          for (java.lang.String _iter1115 : struct.warnings)
          {
            oprot.writeString(_iter1115);
>>>>>>> External metastore: clean after rebase
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMValidateResourcePlanResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
<<<<<<< HEAD
          org.apache.thrift.protocol.TList _list1114 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.errors = new java.util.ArrayList<java.lang.String>(_list1114.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1115;
          for (int _i1116 = 0; _i1116 < _list1114.size; ++_i1116)
          {
            _elem1115 = iprot.readString();
            struct.errors.add(_elem1115);
=======
          org.apache.thrift.protocol.TList _list1116 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.errors = new java.util.ArrayList<java.lang.String>(_list1116.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1117;
          for (int _i1118 = 0; _i1118 < _list1116.size; ++_i1118)
          {
            _elem1117 = iprot.readString();
            struct.errors.add(_elem1117);
>>>>>>> External metastore: clean after rebase
          }
        }
        struct.setErrorsIsSet(true);
      }
      if (incoming.get(1)) {
        {
<<<<<<< HEAD
          org.apache.thrift.protocol.TList _list1117 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.warnings = new java.util.ArrayList<java.lang.String>(_list1117.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1118;
          for (int _i1119 = 0; _i1119 < _list1117.size; ++_i1119)
          {
            _elem1118 = iprot.readString();
            struct.warnings.add(_elem1118);
=======
          org.apache.thrift.protocol.TList _list1119 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.warnings = new java.util.ArrayList<java.lang.String>(_list1119.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1120;
          for (int _i1121 = 0; _i1121 < _list1119.size; ++_i1121)
          {
            _elem1120 = iprot.readString();
            struct.warnings.add(_elem1120);
>>>>>>> External metastore: clean after rebase
          }
        }
        struct.setWarningsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

