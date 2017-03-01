/**
 * CPEStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class CPEStatus  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.CustomerPremisesEquipment customerPremisesEquipment;

    private tv.mirada.www.iris.core.types.SystemStatusList systemStatusList;

    public CPEStatus() {
    }

    public CPEStatus(
           tv.mirada.www.iris.core.types.CustomerPremisesEquipment customerPremisesEquipment,
           tv.mirada.www.iris.core.types.SystemStatusList systemStatusList) {
           this.customerPremisesEquipment = customerPremisesEquipment;
           this.systemStatusList = systemStatusList;
    }


    /**
     * Gets the customerPremisesEquipment value for this CPEStatus.
     * 
     * @return customerPremisesEquipment
     */
    public tv.mirada.www.iris.core.types.CustomerPremisesEquipment getCustomerPremisesEquipment() {
        return customerPremisesEquipment;
    }


    /**
     * Sets the customerPremisesEquipment value for this CPEStatus.
     * 
     * @param customerPremisesEquipment
     */
    public void setCustomerPremisesEquipment(tv.mirada.www.iris.core.types.CustomerPremisesEquipment customerPremisesEquipment) {
        this.customerPremisesEquipment = customerPremisesEquipment;
    }


    /**
     * Gets the systemStatusList value for this CPEStatus.
     * 
     * @return systemStatusList
     */
    public tv.mirada.www.iris.core.types.SystemStatusList getSystemStatusList() {
        return systemStatusList;
    }


    /**
     * Sets the systemStatusList value for this CPEStatus.
     * 
     * @param systemStatusList
     */
    public void setSystemStatusList(tv.mirada.www.iris.core.types.SystemStatusList systemStatusList) {
        this.systemStatusList = systemStatusList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPEStatus)) return false;
        CPEStatus other = (CPEStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerPremisesEquipment==null && other.getCustomerPremisesEquipment()==null) || 
             (this.customerPremisesEquipment!=null &&
              this.customerPremisesEquipment.equals(other.getCustomerPremisesEquipment()))) &&
            ((this.systemStatusList==null && other.getSystemStatusList()==null) || 
             (this.systemStatusList!=null &&
              this.systemStatusList.equals(other.getSystemStatusList())));
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
        if (getCustomerPremisesEquipment() != null) {
            _hashCode += getCustomerPremisesEquipment().hashCode();
        }
        if (getSystemStatusList() != null) {
            _hashCode += getSystemStatusList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CPEStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CPEStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPremisesEquipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipment"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemStatusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "SystemStatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "SystemStatusList"));
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
