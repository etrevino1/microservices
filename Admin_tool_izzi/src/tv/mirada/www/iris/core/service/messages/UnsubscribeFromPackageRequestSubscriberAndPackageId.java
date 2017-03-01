/**
 * UnsubscribeFromPackageRequestSubscriberAndPackageId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.service.messages;

public class UnsubscribeFromPackageRequestSubscriberAndPackageId  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.PackageSubscriberId packageSubscriberId;

    private tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId;

    private tv.mirada.www.iris.core.types.PackageId packageId;

    public UnsubscribeFromPackageRequestSubscriberAndPackageId() {
    }

    public UnsubscribeFromPackageRequestSubscriberAndPackageId(
           tv.mirada.www.iris.core.types.PackageSubscriberId packageSubscriberId,
           tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId,
           tv.mirada.www.iris.core.types.PackageId packageId) {
           this.packageSubscriberId = packageSubscriberId;
           this.customerPremisesEquipmentId = customerPremisesEquipmentId;
           this.packageId = packageId;
    }


    /**
     * Gets the packageSubscriberId value for this UnsubscribeFromPackageRequestSubscriberAndPackageId.
     * 
     * @return packageSubscriberId
     */
    public tv.mirada.www.iris.core.types.PackageSubscriberId getPackageSubscriberId() {
        return packageSubscriberId;
    }


    /**
     * Sets the packageSubscriberId value for this UnsubscribeFromPackageRequestSubscriberAndPackageId.
     * 
     * @param packageSubscriberId
     */
    public void setPackageSubscriberId(tv.mirada.www.iris.core.types.PackageSubscriberId packageSubscriberId) {
        this.packageSubscriberId = packageSubscriberId;
    }


    /**
     * Gets the customerPremisesEquipmentId value for this UnsubscribeFromPackageRequestSubscriberAndPackageId.
     * 
     * @return customerPremisesEquipmentId
     */
    public tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId getCustomerPremisesEquipmentId() {
        return customerPremisesEquipmentId;
    }


    /**
     * Sets the customerPremisesEquipmentId value for this UnsubscribeFromPackageRequestSubscriberAndPackageId.
     * 
     * @param customerPremisesEquipmentId
     */
    public void setCustomerPremisesEquipmentId(tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId) {
        this.customerPremisesEquipmentId = customerPremisesEquipmentId;
    }


    /**
     * Gets the packageId value for this UnsubscribeFromPackageRequestSubscriberAndPackageId.
     * 
     * @return packageId
     */
    public tv.mirada.www.iris.core.types.PackageId getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this UnsubscribeFromPackageRequestSubscriberAndPackageId.
     * 
     * @param packageId
     */
    public void setPackageId(tv.mirada.www.iris.core.types.PackageId packageId) {
        this.packageId = packageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnsubscribeFromPackageRequestSubscriberAndPackageId)) return false;
        UnsubscribeFromPackageRequestSubscriberAndPackageId other = (UnsubscribeFromPackageRequestSubscriberAndPackageId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageSubscriberId==null && other.getPackageSubscriberId()==null) || 
             (this.packageSubscriberId!=null &&
              this.packageSubscriberId.equals(other.getPackageSubscriberId()))) &&
            ((this.customerPremisesEquipmentId==null && other.getCustomerPremisesEquipmentId()==null) || 
             (this.customerPremisesEquipmentId!=null &&
              this.customerPremisesEquipmentId.equals(other.getCustomerPremisesEquipmentId()))) &&
            ((this.packageId==null && other.getPackageId()==null) || 
             (this.packageId!=null &&
              this.packageId.equals(other.getPackageId())));
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
        if (getPackageSubscriberId() != null) {
            _hashCode += getPackageSubscriberId().hashCode();
        }
        if (getCustomerPremisesEquipmentId() != null) {
            _hashCode += getCustomerPremisesEquipmentId().hashCode();
        }
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnsubscribeFromPackageRequestSubscriberAndPackageId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>UnsubscribeFromPackageRequest>SubscriberAndPackageId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "PackageSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PackageSubscriberId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPremisesEquipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "CustomerPremisesEquipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipmentId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "PackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PackageId"));
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
