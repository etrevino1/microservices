/**
 * Purchase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class Purchase  implements java.io.Serializable {
    private java.lang.Long irisId;

    private java.lang.String operatorSubscriptionId;

    private java.lang.Long irisSubscriberId;

    private tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId;

    private java.lang.Long irisHardwareId;

    private java.lang.String hardwareId;

    private java.lang.Long irisDeliveryId;

    private java.lang.Long irisProductId;

    private java.lang.String productIdentifier;

    private tv.mirada.www.iris.core.types.ProductType productType;

    private tv.mirada.www.iris.core.types.LocalizedPurchaseTitleList localizedPurchaseTitle;

    private java.util.Calendar creationDatetime;

    public Purchase() {
    }

    public Purchase(
           java.lang.Long irisId,
           java.lang.String operatorSubscriptionId,
           java.lang.Long irisSubscriberId,
           tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId,
           java.lang.Long irisHardwareId,
           java.lang.String hardwareId,
           java.lang.Long irisDeliveryId,
           java.lang.Long irisProductId,
           java.lang.String productIdentifier,
           tv.mirada.www.iris.core.types.ProductType productType,
           tv.mirada.www.iris.core.types.LocalizedPurchaseTitleList localizedPurchaseTitle,
           java.util.Calendar creationDatetime) {
           this.irisId = irisId;
           this.operatorSubscriptionId = operatorSubscriptionId;
           this.irisSubscriberId = irisSubscriberId;
           this.operatorSubscriberId = operatorSubscriberId;
           this.irisHardwareId = irisHardwareId;
           this.hardwareId = hardwareId;
           this.irisDeliveryId = irisDeliveryId;
           this.irisProductId = irisProductId;
           this.productIdentifier = productIdentifier;
           this.productType = productType;
           this.localizedPurchaseTitle = localizedPurchaseTitle;
           this.creationDatetime = creationDatetime;
    }


    /**
     * Gets the irisId value for this Purchase.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this Purchase.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the operatorSubscriptionId value for this Purchase.
     * 
     * @return operatorSubscriptionId
     */
    public java.lang.String getOperatorSubscriptionId() {
        return operatorSubscriptionId;
    }


    /**
     * Sets the operatorSubscriptionId value for this Purchase.
     * 
     * @param operatorSubscriptionId
     */
    public void setOperatorSubscriptionId(java.lang.String operatorSubscriptionId) {
        this.operatorSubscriptionId = operatorSubscriptionId;
    }


    /**
     * Gets the irisSubscriberId value for this Purchase.
     * 
     * @return irisSubscriberId
     */
    public java.lang.Long getIrisSubscriberId() {
        return irisSubscriberId;
    }


    /**
     * Sets the irisSubscriberId value for this Purchase.
     * 
     * @param irisSubscriberId
     */
    public void setIrisSubscriberId(java.lang.Long irisSubscriberId) {
        this.irisSubscriberId = irisSubscriberId;
    }


    /**
     * Gets the operatorSubscriberId value for this Purchase.
     * 
     * @return operatorSubscriberId
     */
    public tv.mirada.www.iris.core.types.OperatorSubscriberId getOperatorSubscriberId() {
        return operatorSubscriberId;
    }


    /**
     * Sets the operatorSubscriberId value for this Purchase.
     * 
     * @param operatorSubscriberId
     */
    public void setOperatorSubscriberId(tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId) {
        this.operatorSubscriberId = operatorSubscriberId;
    }


    /**
     * Gets the irisHardwareId value for this Purchase.
     * 
     * @return irisHardwareId
     */
    public java.lang.Long getIrisHardwareId() {
        return irisHardwareId;
    }


    /**
     * Sets the irisHardwareId value for this Purchase.
     * 
     * @param irisHardwareId
     */
    public void setIrisHardwareId(java.lang.Long irisHardwareId) {
        this.irisHardwareId = irisHardwareId;
    }


    /**
     * Gets the hardwareId value for this Purchase.
     * 
     * @return hardwareId
     */
    public java.lang.String getHardwareId() {
        return hardwareId;
    }


    /**
     * Sets the hardwareId value for this Purchase.
     * 
     * @param hardwareId
     */
    public void setHardwareId(java.lang.String hardwareId) {
        this.hardwareId = hardwareId;
    }


    /**
     * Gets the irisDeliveryId value for this Purchase.
     * 
     * @return irisDeliveryId
     */
    public java.lang.Long getIrisDeliveryId() {
        return irisDeliveryId;
    }


    /**
     * Sets the irisDeliveryId value for this Purchase.
     * 
     * @param irisDeliveryId
     */
    public void setIrisDeliveryId(java.lang.Long irisDeliveryId) {
        this.irisDeliveryId = irisDeliveryId;
    }


    /**
     * Gets the irisProductId value for this Purchase.
     * 
     * @return irisProductId
     */
    public java.lang.Long getIrisProductId() {
        return irisProductId;
    }


    /**
     * Sets the irisProductId value for this Purchase.
     * 
     * @param irisProductId
     */
    public void setIrisProductId(java.lang.Long irisProductId) {
        this.irisProductId = irisProductId;
    }


    /**
     * Gets the productIdentifier value for this Purchase.
     * 
     * @return productIdentifier
     */
    public java.lang.String getProductIdentifier() {
        return productIdentifier;
    }


    /**
     * Sets the productIdentifier value for this Purchase.
     * 
     * @param productIdentifier
     */
    public void setProductIdentifier(java.lang.String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }


    /**
     * Gets the productType value for this Purchase.
     * 
     * @return productType
     */
    public tv.mirada.www.iris.core.types.ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this Purchase.
     * 
     * @param productType
     */
    public void setProductType(tv.mirada.www.iris.core.types.ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the localizedPurchaseTitle value for this Purchase.
     * 
     * @return localizedPurchaseTitle
     */
    public tv.mirada.www.iris.core.types.LocalizedPurchaseTitleList getLocalizedPurchaseTitle() {
        return localizedPurchaseTitle;
    }


    /**
     * Sets the localizedPurchaseTitle value for this Purchase.
     * 
     * @param localizedPurchaseTitle
     */
    public void setLocalizedPurchaseTitle(tv.mirada.www.iris.core.types.LocalizedPurchaseTitleList localizedPurchaseTitle) {
        this.localizedPurchaseTitle = localizedPurchaseTitle;
    }


    /**
     * Gets the creationDatetime value for this Purchase.
     * 
     * @return creationDatetime
     */
    public java.util.Calendar getCreationDatetime() {
        return creationDatetime;
    }


    /**
     * Sets the creationDatetime value for this Purchase.
     * 
     * @param creationDatetime
     */
    public void setCreationDatetime(java.util.Calendar creationDatetime) {
        this.creationDatetime = creationDatetime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Purchase)) return false;
        Purchase other = (Purchase) obj;
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
            ((this.operatorSubscriptionId==null && other.getOperatorSubscriptionId()==null) || 
             (this.operatorSubscriptionId!=null &&
              this.operatorSubscriptionId.equals(other.getOperatorSubscriptionId()))) &&
            ((this.irisSubscriberId==null && other.getIrisSubscriberId()==null) || 
             (this.irisSubscriberId!=null &&
              this.irisSubscriberId.equals(other.getIrisSubscriberId()))) &&
            ((this.operatorSubscriberId==null && other.getOperatorSubscriberId()==null) || 
             (this.operatorSubscriberId!=null &&
              this.operatorSubscriberId.equals(other.getOperatorSubscriberId()))) &&
            ((this.irisHardwareId==null && other.getIrisHardwareId()==null) || 
             (this.irisHardwareId!=null &&
              this.irisHardwareId.equals(other.getIrisHardwareId()))) &&
            ((this.hardwareId==null && other.getHardwareId()==null) || 
             (this.hardwareId!=null &&
              this.hardwareId.equals(other.getHardwareId()))) &&
            ((this.irisDeliveryId==null && other.getIrisDeliveryId()==null) || 
             (this.irisDeliveryId!=null &&
              this.irisDeliveryId.equals(other.getIrisDeliveryId()))) &&
            ((this.irisProductId==null && other.getIrisProductId()==null) || 
             (this.irisProductId!=null &&
              this.irisProductId.equals(other.getIrisProductId()))) &&
            ((this.productIdentifier==null && other.getProductIdentifier()==null) || 
             (this.productIdentifier!=null &&
              this.productIdentifier.equals(other.getProductIdentifier()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.localizedPurchaseTitle==null && other.getLocalizedPurchaseTitle()==null) || 
             (this.localizedPurchaseTitle!=null &&
              this.localizedPurchaseTitle.equals(other.getLocalizedPurchaseTitle()))) &&
            ((this.creationDatetime==null && other.getCreationDatetime()==null) || 
             (this.creationDatetime!=null &&
              this.creationDatetime.equals(other.getCreationDatetime())));
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
        if (getOperatorSubscriptionId() != null) {
            _hashCode += getOperatorSubscriptionId().hashCode();
        }
        if (getIrisSubscriberId() != null) {
            _hashCode += getIrisSubscriberId().hashCode();
        }
        if (getOperatorSubscriberId() != null) {
            _hashCode += getOperatorSubscriberId().hashCode();
        }
        if (getIrisHardwareId() != null) {
            _hashCode += getIrisHardwareId().hashCode();
        }
        if (getHardwareId() != null) {
            _hashCode += getHardwareId().hashCode();
        }
        if (getIrisDeliveryId() != null) {
            _hashCode += getIrisDeliveryId().hashCode();
        }
        if (getIrisProductId() != null) {
            _hashCode += getIrisProductId().hashCode();
        }
        if (getProductIdentifier() != null) {
            _hashCode += getProductIdentifier().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getLocalizedPurchaseTitle() != null) {
            _hashCode += getLocalizedPurchaseTitle().hashCode();
        }
        if (getCreationDatetime() != null) {
            _hashCode += getCreationDatetime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Purchase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Purchase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorSubscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisHardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisHardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "HardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisDeliveryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisDeliveryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ProductIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ProductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ProductType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedPurchaseTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "LocalizedPurchaseTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "LocalizedPurchaseTitleList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CreationDatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
