/**
 * CreateCustomerPremisesEquipmentTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.CPE.messages;

public class CreateCustomerPremisesEquipmentTypeResponse  implements java.io.Serializable {
    private long irisCustomerPremisesEquipmentTypeId;

    public CreateCustomerPremisesEquipmentTypeResponse() {
    }

    public CreateCustomerPremisesEquipmentTypeResponse(
           long irisCustomerPremisesEquipmentTypeId) {
           this.irisCustomerPremisesEquipmentTypeId = irisCustomerPremisesEquipmentTypeId;
    }


    /**
     * Gets the irisCustomerPremisesEquipmentTypeId value for this CreateCustomerPremisesEquipmentTypeResponse.
     * 
     * @return irisCustomerPremisesEquipmentTypeId
     */
    public long getIrisCustomerPremisesEquipmentTypeId() {
        return irisCustomerPremisesEquipmentTypeId;
    }


    /**
     * Sets the irisCustomerPremisesEquipmentTypeId value for this CreateCustomerPremisesEquipmentTypeResponse.
     * 
     * @param irisCustomerPremisesEquipmentTypeId
     */
    public void setIrisCustomerPremisesEquipmentTypeId(long irisCustomerPremisesEquipmentTypeId) {
        this.irisCustomerPremisesEquipmentTypeId = irisCustomerPremisesEquipmentTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerPremisesEquipmentTypeResponse)) return false;
        CreateCustomerPremisesEquipmentTypeResponse other = (CreateCustomerPremisesEquipmentTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.irisCustomerPremisesEquipmentTypeId == other.getIrisCustomerPremisesEquipmentTypeId();
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
        _hashCode += new Long(getIrisCustomerPremisesEquipmentTypeId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerPremisesEquipmentTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisCustomerPremisesEquipmentTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "IrisCustomerPremisesEquipmentTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
