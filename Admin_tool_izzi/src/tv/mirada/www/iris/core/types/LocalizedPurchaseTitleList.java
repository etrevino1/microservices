/**
 * LocalizedPurchaseTitleList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class LocalizedPurchaseTitleList  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.LocalizedPurchaseTitle localizedPurchaseTitle;

    public LocalizedPurchaseTitleList() {
    }

    public LocalizedPurchaseTitleList(
           tv.mirada.www.iris.core.types.LocalizedPurchaseTitle localizedPurchaseTitle) {
           this.localizedPurchaseTitle = localizedPurchaseTitle;
    }


    /**
     * Gets the localizedPurchaseTitle value for this LocalizedPurchaseTitleList.
     * 
     * @return localizedPurchaseTitle
     */
    public tv.mirada.www.iris.core.types.LocalizedPurchaseTitle getLocalizedPurchaseTitle() {
        return localizedPurchaseTitle;
    }


    /**
     * Sets the localizedPurchaseTitle value for this LocalizedPurchaseTitleList.
     * 
     * @param localizedPurchaseTitle
     */
    public void setLocalizedPurchaseTitle(tv.mirada.www.iris.core.types.LocalizedPurchaseTitle localizedPurchaseTitle) {
        this.localizedPurchaseTitle = localizedPurchaseTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalizedPurchaseTitleList)) return false;
        LocalizedPurchaseTitleList other = (LocalizedPurchaseTitleList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.localizedPurchaseTitle==null && other.getLocalizedPurchaseTitle()==null) || 
             (this.localizedPurchaseTitle!=null &&
              this.localizedPurchaseTitle.equals(other.getLocalizedPurchaseTitle())));
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
        if (getLocalizedPurchaseTitle() != null) {
            _hashCode += getLocalizedPurchaseTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalizedPurchaseTitleList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "LocalizedPurchaseTitleList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedPurchaseTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "LocalizedPurchaseTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "LocalizedPurchaseTitle"));
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
