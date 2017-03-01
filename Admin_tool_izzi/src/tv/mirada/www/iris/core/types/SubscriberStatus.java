/**
 * SubscriberStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class SubscriberStatus  implements java.io.Serializable {
    private java.lang.Long irisId;

    private tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId;

    private tv.mirada.www.iris.core.types.SystemStatusList systemStatusList;

    private tv.mirada.www.iris.core.types.DevicesListStatus devicesListStatus;

    private tv.mirada.www.iris.core.types.SubscriptionsListStatus subscriptionsListStatus;

    private tv.mirada.www.iris.core.types.PurchasesListStatus purchasesListStatus;

    public SubscriberStatus() {
    }

    public SubscriberStatus(
           java.lang.Long irisId,
           tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId,
           tv.mirada.www.iris.core.types.SystemStatusList systemStatusList,
           tv.mirada.www.iris.core.types.DevicesListStatus devicesListStatus,
           tv.mirada.www.iris.core.types.SubscriptionsListStatus subscriptionsListStatus,
           tv.mirada.www.iris.core.types.PurchasesListStatus purchasesListStatus) {
           this.irisId = irisId;
           this.operatorSubscriberId = operatorSubscriberId;
           this.systemStatusList = systemStatusList;
           this.devicesListStatus = devicesListStatus;
           this.subscriptionsListStatus = subscriptionsListStatus;
           this.purchasesListStatus = purchasesListStatus;
    }


    /**
     * Gets the irisId value for this SubscriberStatus.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this SubscriberStatus.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the operatorSubscriberId value for this SubscriberStatus.
     * 
     * @return operatorSubscriberId
     */
    public tv.mirada.www.iris.core.types.OperatorSubscriberId getOperatorSubscriberId() {
        return operatorSubscriberId;
    }


    /**
     * Sets the operatorSubscriberId value for this SubscriberStatus.
     * 
     * @param operatorSubscriberId
     */
    public void setOperatorSubscriberId(tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId) {
        this.operatorSubscriberId = operatorSubscriberId;
    }


    /**
     * Gets the systemStatusList value for this SubscriberStatus.
     * 
     * @return systemStatusList
     */
    public tv.mirada.www.iris.core.types.SystemStatusList getSystemStatusList() {
        return systemStatusList;
    }


    /**
     * Sets the systemStatusList value for this SubscriberStatus.
     * 
     * @param systemStatusList
     */
    public void setSystemStatusList(tv.mirada.www.iris.core.types.SystemStatusList systemStatusList) {
        this.systemStatusList = systemStatusList;
    }


    /**
     * Gets the devicesListStatus value for this SubscriberStatus.
     * 
     * @return devicesListStatus
     */
    public tv.mirada.www.iris.core.types.DevicesListStatus getDevicesListStatus() {
        return devicesListStatus;
    }


    /**
     * Sets the devicesListStatus value for this SubscriberStatus.
     * 
     * @param devicesListStatus
     */
    public void setDevicesListStatus(tv.mirada.www.iris.core.types.DevicesListStatus devicesListStatus) {
        this.devicesListStatus = devicesListStatus;
    }


    /**
     * Gets the subscriptionsListStatus value for this SubscriberStatus.
     * 
     * @return subscriptionsListStatus
     */
    public tv.mirada.www.iris.core.types.SubscriptionsListStatus getSubscriptionsListStatus() {
        return subscriptionsListStatus;
    }


    /**
     * Sets the subscriptionsListStatus value for this SubscriberStatus.
     * 
     * @param subscriptionsListStatus
     */
    public void setSubscriptionsListStatus(tv.mirada.www.iris.core.types.SubscriptionsListStatus subscriptionsListStatus) {
        this.subscriptionsListStatus = subscriptionsListStatus;
    }


    /**
     * Gets the purchasesListStatus value for this SubscriberStatus.
     * 
     * @return purchasesListStatus
     */
    public tv.mirada.www.iris.core.types.PurchasesListStatus getPurchasesListStatus() {
        return purchasesListStatus;
    }


    /**
     * Sets the purchasesListStatus value for this SubscriberStatus.
     * 
     * @param purchasesListStatus
     */
    public void setPurchasesListStatus(tv.mirada.www.iris.core.types.PurchasesListStatus purchasesListStatus) {
        this.purchasesListStatus = purchasesListStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberStatus)) return false;
        SubscriberStatus other = (SubscriberStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.irisId==null && other.getIrisId()==null) || 
             (this.irisId!=null &&
              this.irisId.equals(other.getIrisId()))) &&
            ((this.operatorSubscriberId==null && other.getOperatorSubscriberId()==null) || 
             (this.operatorSubscriberId!=null &&
              this.operatorSubscriberId.equals(other.getOperatorSubscriberId()))) &&
            ((this.systemStatusList==null && other.getSystemStatusList()==null) || 
             (this.systemStatusList!=null &&
              this.systemStatusList.equals(other.getSystemStatusList()))) &&
            ((this.devicesListStatus==null && other.getDevicesListStatus()==null) || 
             (this.devicesListStatus!=null &&
              this.devicesListStatus.equals(other.getDevicesListStatus()))) &&
            ((this.subscriptionsListStatus==null && other.getSubscriptionsListStatus()==null) || 
             (this.subscriptionsListStatus!=null &&
              this.subscriptionsListStatus.equals(other.getSubscriptionsListStatus()))) &&
            ((this.purchasesListStatus==null && other.getPurchasesListStatus()==null) || 
             (this.purchasesListStatus!=null &&
              this.purchasesListStatus.equals(other.getPurchasesListStatus())));
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
        if (getIrisId() != null) {
            _hashCode += getIrisId().hashCode();
        }
        if (getOperatorSubscriberId() != null) {
            _hashCode += getOperatorSubscriberId().hashCode();
        }
        if (getSystemStatusList() != null) {
            _hashCode += getSystemStatusList().hashCode();
        }
        if (getDevicesListStatus() != null) {
            _hashCode += getDevicesListStatus().hashCode();
        }
        if (getSubscriptionsListStatus() != null) {
            _hashCode += getSubscriptionsListStatus().hashCode();
        }
        if (getPurchasesListStatus() != null) {
            _hashCode += getPurchasesListStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "SubscriberStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemStatusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "SystemStatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "SystemStatusList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicesListStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DevicesListStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DevicesListStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionsListStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "SubscriptionsListStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "SubscriptionsListStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasesListStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PurchasesListStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PurchasesListStatus"));
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
