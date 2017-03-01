/**
 * UpdateCustomerPremisesEquipmentTypeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.CPE.messages;

public class UpdateCustomerPremisesEquipmentTypeRequest  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.CustomerPremisesEquipmentType customerPremisesEquipmentType;

    public UpdateCustomerPremisesEquipmentTypeRequest() {
    }

    public UpdateCustomerPremisesEquipmentTypeRequest(
           tv.mirada.www.iris.core.types.CustomerPremisesEquipmentType customerPremisesEquipmentType) {
           this.customerPremisesEquipmentType = customerPremisesEquipmentType;
    }


    /**
     * Gets the customerPremisesEquipmentType value for this UpdateCustomerPremisesEquipmentTypeRequest.
     * 
     * @return customerPremisesEquipmentType
     */
    public tv.mirada.www.iris.core.types.CustomerPremisesEquipmentType getCustomerPremisesEquipmentType() {
        return customerPremisesEquipmentType;
    }


    /**
     * Sets the customerPremisesEquipmentType value for this UpdateCustomerPremisesEquipmentTypeRequest.
     * 
     * @param customerPremisesEquipmentType
     */
    public void setCustomerPremisesEquipmentType(tv.mirada.www.iris.core.types.CustomerPremisesEquipmentType customerPremisesEquipmentType) {
        this.customerPremisesEquipmentType = customerPremisesEquipmentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCustomerPremisesEquipmentTypeRequest)) return false;
        UpdateCustomerPremisesEquipmentTypeRequest other = (UpdateCustomerPremisesEquipmentTypeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerPremisesEquipmentType==null && other.getCustomerPremisesEquipmentType()==null) || 
             (this.customerPremisesEquipmentType!=null &&
              this.customerPremisesEquipmentType.equals(other.getCustomerPremisesEquipmentType())));
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
        if (getCustomerPremisesEquipmentType() != null) {
            _hashCode += getCustomerPremisesEquipmentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCustomerPremisesEquipmentTypeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">UpdateCustomerPremisesEquipmentTypeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPremisesEquipmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "CustomerPremisesEquipmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipmentType"));
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
