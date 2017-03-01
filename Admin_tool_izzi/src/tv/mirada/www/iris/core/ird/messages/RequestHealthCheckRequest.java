/**
 * RequestHealthCheckRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.ird.messages;

public class RequestHealthCheckRequest  implements java.io.Serializable {
    private java.lang.String customerPremisesEquipmentId;

    private tv.mirada.www.iris.core.ird.messages.RequestHealthCheckModules requestHealthCheckModules;

    public RequestHealthCheckRequest() {
    }

    public RequestHealthCheckRequest(
           java.lang.String customerPremisesEquipmentId,
           tv.mirada.www.iris.core.ird.messages.RequestHealthCheckModules requestHealthCheckModules) {
           this.customerPremisesEquipmentId = customerPremisesEquipmentId;
           this.requestHealthCheckModules = requestHealthCheckModules;
    }


    /**
     * Gets the customerPremisesEquipmentId value for this RequestHealthCheckRequest.
     * 
     * @return customerPremisesEquipmentId
     */
    public java.lang.String getCustomerPremisesEquipmentId() {
        return customerPremisesEquipmentId;
    }


    /**
     * Sets the customerPremisesEquipmentId value for this RequestHealthCheckRequest.
     * 
     * @param customerPremisesEquipmentId
     */
    public void setCustomerPremisesEquipmentId(java.lang.String customerPremisesEquipmentId) {
        this.customerPremisesEquipmentId = customerPremisesEquipmentId;
    }


    /**
     * Gets the requestHealthCheckModules value for this RequestHealthCheckRequest.
     * 
     * @return requestHealthCheckModules
     */
    public tv.mirada.www.iris.core.ird.messages.RequestHealthCheckModules getRequestHealthCheckModules() {
        return requestHealthCheckModules;
    }


    /**
     * Sets the requestHealthCheckModules value for this RequestHealthCheckRequest.
     * 
     * @param requestHealthCheckModules
     */
    public void setRequestHealthCheckModules(tv.mirada.www.iris.core.ird.messages.RequestHealthCheckModules requestHealthCheckModules) {
        this.requestHealthCheckModules = requestHealthCheckModules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHealthCheckRequest)) return false;
        RequestHealthCheckRequest other = (RequestHealthCheckRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerPremisesEquipmentId==null && other.getCustomerPremisesEquipmentId()==null) || 
             (this.customerPremisesEquipmentId!=null &&
              this.customerPremisesEquipmentId.equals(other.getCustomerPremisesEquipmentId()))) &&
            ((this.requestHealthCheckModules==null && other.getRequestHealthCheckModules()==null) || 
             (this.requestHealthCheckModules!=null &&
              this.requestHealthCheckModules.equals(other.getRequestHealthCheckModules())));
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
        if (getCustomerPremisesEquipmentId() != null) {
            _hashCode += getCustomerPremisesEquipmentId().hashCode();
        }
        if (getRequestHealthCheckModules() != null) {
            _hashCode += getRequestHealthCheckModules().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHealthCheckRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", ">RequestHealthCheckRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPremisesEquipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "CustomerPremisesEquipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHealthCheckModules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "RequestHealthCheckModules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "RequestHealthCheckModules"));
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
