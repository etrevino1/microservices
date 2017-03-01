/**
 * UnsubscribeFromPackageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.service.messages;

public class UnsubscribeFromPackageRequest  implements java.io.Serializable {
    private java.lang.Long irisId;

    private java.lang.String operatorSubscriptionId;

    private tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequestSubscriberAndPackageId subscriberAndPackageId;

    public UnsubscribeFromPackageRequest() {
    }

    public UnsubscribeFromPackageRequest(
           java.lang.Long irisId,
           java.lang.String operatorSubscriptionId,
           tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequestSubscriberAndPackageId subscriberAndPackageId) {
           this.irisId = irisId;
           this.operatorSubscriptionId = operatorSubscriptionId;
           this.subscriberAndPackageId = subscriberAndPackageId;
    }


    /**
     * Gets the irisId value for this UnsubscribeFromPackageRequest.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this UnsubscribeFromPackageRequest.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the operatorSubscriptionId value for this UnsubscribeFromPackageRequest.
     * 
     * @return operatorSubscriptionId
     */
    public java.lang.String getOperatorSubscriptionId() {
        return operatorSubscriptionId;
    }


    /**
     * Sets the operatorSubscriptionId value for this UnsubscribeFromPackageRequest.
     * 
     * @param operatorSubscriptionId
     */
    public void setOperatorSubscriptionId(java.lang.String operatorSubscriptionId) {
        this.operatorSubscriptionId = operatorSubscriptionId;
    }


    /**
     * Gets the subscriberAndPackageId value for this UnsubscribeFromPackageRequest.
     * 
     * @return subscriberAndPackageId
     */
    public tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequestSubscriberAndPackageId getSubscriberAndPackageId() {
        return subscriberAndPackageId;
    }


    /**
     * Sets the subscriberAndPackageId value for this UnsubscribeFromPackageRequest.
     * 
     * @param subscriberAndPackageId
     */
    public void setSubscriberAndPackageId(tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequestSubscriberAndPackageId subscriberAndPackageId) {
        this.subscriberAndPackageId = subscriberAndPackageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnsubscribeFromPackageRequest)) return false;
        UnsubscribeFromPackageRequest other = (UnsubscribeFromPackageRequest) obj;
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
            ((this.subscriberAndPackageId==null && other.getSubscriberAndPackageId()==null) || 
             (this.subscriberAndPackageId!=null &&
              this.subscriberAndPackageId.equals(other.getSubscriberAndPackageId())));
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
        if (getSubscriberAndPackageId() != null) {
            _hashCode += getSubscriberAndPackageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnsubscribeFromPackageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UnsubscribeFromPackageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorSubscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "OperatorSubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAndPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "SubscriberAndPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>UnsubscribeFromPackageRequest>SubscriberAndPackageId"));
        elemField.setMinOccurs(0);
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
