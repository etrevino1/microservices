/**
 * PurchasesStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class PurchasesStatus  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.Purchase purchases;

    private tv.mirada.www.iris.core.types.SystemStatusList systemStatusList;

    public PurchasesStatus() {
    }

    public PurchasesStatus(
           tv.mirada.www.iris.core.types.Purchase purchases,
           tv.mirada.www.iris.core.types.SystemStatusList systemStatusList) {
           this.purchases = purchases;
           this.systemStatusList = systemStatusList;
    }


    /**
     * Gets the purchases value for this PurchasesStatus.
     * 
     * @return purchases
     */
    public tv.mirada.www.iris.core.types.Purchase getPurchases() {
        return purchases;
    }


    /**
     * Sets the purchases value for this PurchasesStatus.
     * 
     * @param purchases
     */
    public void setPurchases(tv.mirada.www.iris.core.types.Purchase purchases) {
        this.purchases = purchases;
    }


    /**
     * Gets the systemStatusList value for this PurchasesStatus.
     * 
     * @return systemStatusList
     */
    public tv.mirada.www.iris.core.types.SystemStatusList getSystemStatusList() {
        return systemStatusList;
    }


    /**
     * Sets the systemStatusList value for this PurchasesStatus.
     * 
     * @param systemStatusList
     */
    public void setSystemStatusList(tv.mirada.www.iris.core.types.SystemStatusList systemStatusList) {
        this.systemStatusList = systemStatusList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchasesStatus)) return false;
        PurchasesStatus other = (PurchasesStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.purchases==null && other.getPurchases()==null) || 
             (this.purchases!=null &&
              this.purchases.equals(other.getPurchases()))) &&
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
        if (getPurchases() != null) {
            _hashCode += getPurchases().hashCode();
        }
        if (getSystemStatusList() != null) {
            _hashCode += getSystemStatusList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchasesStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PurchasesStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Purchases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Purchase"));
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
