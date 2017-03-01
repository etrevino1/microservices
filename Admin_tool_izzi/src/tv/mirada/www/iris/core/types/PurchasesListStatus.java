/**
 * PurchasesListStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class PurchasesListStatus  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.PurchasesStatus purchasesStatus;

    public PurchasesListStatus() {
    }

    public PurchasesListStatus(
           tv.mirada.www.iris.core.types.PurchasesStatus purchasesStatus) {
           this.purchasesStatus = purchasesStatus;
    }


    /**
     * Gets the purchasesStatus value for this PurchasesListStatus.
     * 
     * @return purchasesStatus
     */
    public tv.mirada.www.iris.core.types.PurchasesStatus getPurchasesStatus() {
        return purchasesStatus;
    }


    /**
     * Sets the purchasesStatus value for this PurchasesListStatus.
     * 
     * @param purchasesStatus
     */
    public void setPurchasesStatus(tv.mirada.www.iris.core.types.PurchasesStatus purchasesStatus) {
        this.purchasesStatus = purchasesStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchasesListStatus)) return false;
        PurchasesListStatus other = (PurchasesListStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.purchasesStatus==null && other.getPurchasesStatus()==null) || 
             (this.purchasesStatus!=null &&
              this.purchasesStatus.equals(other.getPurchasesStatus())));
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
        if (getPurchasesStatus() != null) {
            _hashCode += getPurchasesStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchasesListStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PurchasesListStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasesStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PurchasesStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PurchasesStatus"));
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
