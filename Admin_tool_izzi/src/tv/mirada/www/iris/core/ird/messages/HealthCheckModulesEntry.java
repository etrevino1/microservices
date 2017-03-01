/**
 * HealthCheckModulesEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.ird.messages;

public class HealthCheckModulesEntry implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HealthCheckModulesEntry(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _BOOTSTRAP = "BOOTSTRAP";
    public static final java.lang.String _CABLEMODEM = "CABLEMODEM";
    public static final java.lang.String _CAS_STATUS = "CAS_STATUS";
    public static final java.lang.String _CONNECTIVITY = "CONNECTIVITY";
    public static final java.lang.String _INFORMATION_STATUS = "INFORMATION_STATUS";
    public static final java.lang.String _RF_SCAN = "RF_SCAN";
    public static final java.lang.String _SERVICES_STATUS = "SERVICES_STATUS";
    public static final HealthCheckModulesEntry ALL = new HealthCheckModulesEntry(_ALL);
    public static final HealthCheckModulesEntry BOOTSTRAP = new HealthCheckModulesEntry(_BOOTSTRAP);
    public static final HealthCheckModulesEntry CABLEMODEM = new HealthCheckModulesEntry(_CABLEMODEM);
    public static final HealthCheckModulesEntry CAS_STATUS = new HealthCheckModulesEntry(_CAS_STATUS);
    public static final HealthCheckModulesEntry CONNECTIVITY = new HealthCheckModulesEntry(_CONNECTIVITY);
    public static final HealthCheckModulesEntry INFORMATION_STATUS = new HealthCheckModulesEntry(_INFORMATION_STATUS);
    public static final HealthCheckModulesEntry RF_SCAN = new HealthCheckModulesEntry(_RF_SCAN);
    public static final HealthCheckModulesEntry SERVICES_STATUS = new HealthCheckModulesEntry(_SERVICES_STATUS);
    public java.lang.String getValue() { return _value_;}
    public static HealthCheckModulesEntry fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HealthCheckModulesEntry enumeration = (HealthCheckModulesEntry)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HealthCheckModulesEntry fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HealthCheckModulesEntry.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HealthCheckModulesEntry"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
