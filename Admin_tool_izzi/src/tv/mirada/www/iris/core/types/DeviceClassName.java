/**
 * DeviceClassName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class DeviceClassName implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeviceClassName(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PVR = "PVR";
    public static final java.lang.String _ZAPPER = "ZAPPER";
    public static final java.lang.String _MOBILE = "MOBILE";
    public static final java.lang.String _TABLET = "TABLET";
    public static final java.lang.String _PC = "PC";
    public static final java.lang.String _STB = "STB";
    public static final DeviceClassName PVR = new DeviceClassName(_PVR);
    public static final DeviceClassName ZAPPER = new DeviceClassName(_ZAPPER);
    public static final DeviceClassName MOBILE = new DeviceClassName(_MOBILE);
    public static final DeviceClassName TABLET = new DeviceClassName(_TABLET);
    public static final DeviceClassName PC = new DeviceClassName(_PC);
    public static final DeviceClassName STB = new DeviceClassName(_STB);
    public java.lang.String getValue() { return _value_;}
    public static DeviceClassName fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DeviceClassName enumeration = (DeviceClassName)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeviceClassName fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceClassName.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DeviceClassName"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
