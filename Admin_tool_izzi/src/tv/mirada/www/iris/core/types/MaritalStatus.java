/**
 * MaritalStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class MaritalStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MaritalStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _SINGLE = "SINGLE";
    public static final java.lang.String _MARRIED = "MARRIED";
    public static final java.lang.String _WIDOW = "WIDOW";
    public static final java.lang.String _DIVORCED = "DIVORCED";
    public static final java.lang.String _SEPARATED = "SEPARATED";
    public static final MaritalStatus UNKNOWN = new MaritalStatus(_UNKNOWN);
    public static final MaritalStatus SINGLE = new MaritalStatus(_SINGLE);
    public static final MaritalStatus MARRIED = new MaritalStatus(_MARRIED);
    public static final MaritalStatus WIDOW = new MaritalStatus(_WIDOW);
    public static final MaritalStatus DIVORCED = new MaritalStatus(_DIVORCED);
    public static final MaritalStatus SEPARATED = new MaritalStatus(_SEPARATED);
    public java.lang.String getValue() { return _value_;}
    public static MaritalStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MaritalStatus enumeration = (MaritalStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MaritalStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MaritalStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "MaritalStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
