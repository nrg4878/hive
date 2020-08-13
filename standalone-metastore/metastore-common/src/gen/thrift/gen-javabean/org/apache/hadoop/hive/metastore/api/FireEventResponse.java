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
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class FireEventResponse implements org.apache.thrift.TBase<FireEventResponse, FireEventResponse._Fields>, java.io.Serializable, Cloneable, Comparable<FireEventResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FireEventResponse");

  private static final org.apache.thrift.protocol.TField EVENT_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("eventIds", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FireEventResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FireEventResponseTupleSchemeFactory());
  }

  private List<Long> eventIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EVENT_IDS((short)1, "eventIds");

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
        case 1: // EVENT_IDS
          return EVENT_IDS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EVENT_IDS, new org.apache.thrift.meta_data.FieldMetaData("eventIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FireEventResponse.class, metaDataMap);
  }

  public FireEventResponse() {
  }

  public FireEventResponse(
    List<Long> eventIds)
  {
    this();
    this.eventIds = eventIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FireEventResponse(FireEventResponse other) {
    if (other.isSetEventIds()) {
      List<Long> __this__eventIds = new ArrayList<Long>(other.eventIds);
      this.eventIds = __this__eventIds;
    }
  }

  public FireEventResponse deepCopy() {
    return new FireEventResponse(this);
  }

  @Override
  public void clear() {
    this.eventIds = null;
  }

  public int getEventIdsSize() {
    return (this.eventIds == null) ? 0 : this.eventIds.size();
  }

  public java.util.Iterator<Long> getEventIdsIterator() {
    return (this.eventIds == null) ? null : this.eventIds.iterator();
  }

  public void addToEventIds(long elem) {
    if (this.eventIds == null) {
      this.eventIds = new ArrayList<Long>();
    }
    this.eventIds.add(elem);
  }

  public List<Long> getEventIds() {
    return this.eventIds;
  }

  public void setEventIds(List<Long> eventIds) {
    this.eventIds = eventIds;
  }

  public void unsetEventIds() {
    this.eventIds = null;
  }

  /** Returns true if field eventIds is set (has been assigned a value) and false otherwise */
  public boolean isSetEventIds() {
    return this.eventIds != null;
  }

  public void setEventIdsIsSet(boolean value) {
    if (!value) {
      this.eventIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EVENT_IDS:
      if (value == null) {
        unsetEventIds();
      } else {
        setEventIds((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EVENT_IDS:
      return getEventIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EVENT_IDS:
      return isSetEventIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FireEventResponse)
      return this.equals((FireEventResponse)that);
    return false;
  }

  public boolean equals(FireEventResponse that) {
    if (that == null)
      return false;

    boolean this_present_eventIds = true && this.isSetEventIds();
    boolean that_present_eventIds = true && that.isSetEventIds();
    if (this_present_eventIds || that_present_eventIds) {
      if (!(this_present_eventIds && that_present_eventIds))
        return false;
      if (!this.eventIds.equals(that.eventIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_eventIds = true && (isSetEventIds());
    list.add(present_eventIds);
    if (present_eventIds)
      list.add(eventIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(FireEventResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEventIds()).compareTo(other.isSetEventIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventIds, other.eventIds);
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
    StringBuilder sb = new StringBuilder("FireEventResponse(");
    boolean first = true;

    sb.append("eventIds:");
    if (this.eventIds == null) {
      sb.append("null");
    } else {
      sb.append(this.eventIds);
    }
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FireEventResponseStandardSchemeFactory implements SchemeFactory {
    public FireEventResponseStandardScheme getScheme() {
      return new FireEventResponseStandardScheme();
    }
  }

  private static class FireEventResponseStandardScheme extends StandardScheme<FireEventResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FireEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EVENT_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list862 = iprot.readListBegin();
                struct.eventIds = new ArrayList<Long>(_list862.size);
                long _elem863;
                for (int _i864 = 0; _i864 < _list862.size; ++_i864)
                {
                  _elem863 = iprot.readI64();
                  struct.eventIds.add(_elem863);
                }
                iprot.readListEnd();
              }
              struct.setEventIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FireEventResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.eventIds != null) {
        oprot.writeFieldBegin(EVENT_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.eventIds.size()));
          for (long _iter865 : struct.eventIds)
          {
            oprot.writeI64(_iter865);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FireEventResponseTupleSchemeFactory implements SchemeFactory {
    public FireEventResponseTupleScheme getScheme() {
      return new FireEventResponseTupleScheme();
    }
  }

  private static class FireEventResponseTupleScheme extends TupleScheme<FireEventResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FireEventResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEventIds()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetEventIds()) {
        {
          oprot.writeI32(struct.eventIds.size());
          for (long _iter866 : struct.eventIds)
          {
            oprot.writeI64(_iter866);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FireEventResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list867 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.eventIds = new ArrayList<Long>(_list867.size);
          long _elem868;
          for (int _i869 = 0; _i869 < _list867.size; ++_i869)
          {
            _elem868 = iprot.readI64();
            struct.eventIds.add(_elem868);
          }
        }
        struct.setEventIdsIsSet(true);
      }
    }
  }

}

