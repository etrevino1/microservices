/**
 * RestoreSTBRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.ird.messages;

public class RestoreSTBRequest  implements java.io.Serializable {
    private java.lang.String hardwareId;

    private tv.mirada.www.iris.core.ird.messages.RestoreClass restoreClass;

    public RestoreSTBRequest() {
    }

    public RestoreSTBRequest(
           java.lang.String hardwareId,
           tv.mirada.www.iris.core.ird.messages.RestoreClass restoreClass) {
           this.hardwareId = hardwareId;
           this.restoreClass = restoreClass;
    }


    /**
     * Gets the hardwareId value for this RestoreSTBRequest.
     * 
     * @return hardwareId
     */
    public java.lang.String getHardwareId() {
        return hardwareId;
    }


    /**
     * Sets the hardwareId value for this RestoreSTBRequest.
     * 
     * @param hardwareId
     */
    public void setHardwareId(java.lang.String hardwareId) {
        this.hardwareId = hardwareId;
    }


    /**
     * Gets the restoreClass value for this RestoreSTBRequest.
     * 
     * @return restoreClass
     */
    public tv.mirada.www.iris.core.ird.messages.RestoreClass getRestoreClass() {
        return restoreClass;
    }


    /**
     * Sets the restoreClass value for this RestoreSTBRequest.
     * 
     * @param restoreClass
     */
    public void setRestoreClass(tv.mirada.www.iris.core.ird.messages.RestoreClass restoreClass) {
        this.restoreClass = restoreClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RestoreSTBRequest)) return false;
        RestoreSTBRequest other = (RestoreSTBRequest) obj;
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
            ((this.restoreClass==null && other.getRestoreClass()==null) || 
             (this.restoreClass!=null &&
              this.restoreClass.equals(other.getRestoreClass())));
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
        if (getRestoreClass() != null) {
            _hashCode += getRestoreClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RestoreSTBRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", ">RestoreSTBRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restoreClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "RestoreClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "RestoreClass"));
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
