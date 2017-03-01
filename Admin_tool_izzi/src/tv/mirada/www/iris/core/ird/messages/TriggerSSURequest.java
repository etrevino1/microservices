/**
 * TriggerSSURequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.ird.messages;

public class TriggerSSURequest  implements java.io.Serializable {
    private java.lang.String hardwareId;

    private tv.mirada.www.iris.core.ird.messages.SSUData SSUData;

    public TriggerSSURequest() {
    }

    public TriggerSSURequest(
           java.lang.String hardwareId,
           tv.mirada.www.iris.core.ird.messages.SSUData SSUData) {
           this.hardwareId = hardwareId;
           this.SSUData = SSUData;
    }


    /**
     * Gets the hardwareId value for this TriggerSSURequest.
     * 
     * @return hardwareId
     */
    public java.lang.String getHardwareId() {
        return hardwareId;
    }


    /**
     * Sets the hardwareId value for this TriggerSSURequest.
     * 
     * @param hardwareId
     */
    public void setHardwareId(java.lang.String hardwareId) {
        this.hardwareId = hardwareId;
    }


    /**
     * Gets the SSUData value for this TriggerSSURequest.
     * 
     * @return SSUData
     */
    public tv.mirada.www.iris.core.ird.messages.SSUData getSSUData() {
        return SSUData;
    }


    /**
     * Sets the SSUData value for this TriggerSSURequest.
     * 
     * @param SSUData
     */
    public void setSSUData(tv.mirada.www.iris.core.ird.messages.SSUData SSUData) {
        this.SSUData = SSUData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerSSURequest)) return false;
        TriggerSSURequest other = (TriggerSSURequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hardwareId==null && other.getHardwareId()==null) || 
             (this.hardwareId!=null &&
              this.hardwareId.equals(other.getHardwareId()))) &&
            ((this.SSUData==null && other.getSSUData()==null) || 
             (this.SSUData!=null &&
              this.SSUData.equals(other.getSSUData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHardwareId() != null) {
            _hashCode += getHardwareId().hashCode();
        }
        if (getSSUData() != null) {
            _hashCode += getSSUData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TriggerSSURequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", ">TriggerSSURequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSUData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "SSUData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "SSUData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
