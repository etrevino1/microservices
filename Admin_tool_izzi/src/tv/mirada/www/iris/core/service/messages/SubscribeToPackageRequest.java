/**
 * SubscribeToPackageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.service.messages;

public class SubscribeToPackageRequest  implements java.io.Serializable {
    private java.lang.String operatorSubscriptionId;

    private tv.mirada.www.iris.core.types.PackageSubscriberId packageSubscriberId;

    private tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId;

    private tv.mirada.www.iris.core.types.PackageId packageId;

    private java.lang.String conditionalAccessId;

    private java.util.Calendar creationDatetime;

    private java.util.Calendar deactivationDatetime;

    public SubscribeToPackageRequest() {
    }

    public SubscribeToPackageRequest(
           java.lang.String operatorSubscriptionId,
           tv.mirada.www.iris.core.types.PackageSubscriberId packageSubscriberId,
           tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId,
           tv.mirada.www.iris.core.types.PackageId packageId,
           java.lang.String conditionalAccessId,
           java.util.Calendar creationDatetime,
           java.util.Calendar deactivationDatetime) {
           this.operatorSubscriptionId = operatorSubscriptionId;
           this.packageSubscriberId = packageSubscriberId;
           this.customerPremisesEquipmentId = customerPremisesEquipmentId;
           this.packageId = packageId;
           this.conditionalAccessId = conditionalAccessId;
           this.creationDatetime = creationDatetime;
           this.deactivationDatetime = deactivationDatetime;
    }


    /**
     * Gets the operatorSubscriptionId value for this SubscribeToPackageRequest.
     * 
     * @return operatorSubscriptionId
     */
    public java.lang.String getOperatorSubscriptionId() {
        return operatorSubscriptionId;
    }


    /**
     * Sets the operatorSubscriptionId value for this SubscribeToPackageRequest.
     * 
     * @param operatorSubscriptionId
     */
    public void setOperatorSubscriptionId(java.lang.String operatorSubscriptionId) {
        this.operatorSubscriptionId = operatorSubscriptionId;
    }


    /**
     * Gets the packageSubscriberId value for this SubscribeToPackageRequest.
     * 
     * @return packageSubscriberId
     */
    public tv.mirada.www.iris.core.types.PackageSubscriberId getPackageSubscriberId() {
        return packageSubscriberId;
    }


    /**
     * Sets the packageSubscriberId value for this SubscribeToPackageRequest.
     * 
     * @param packageSubscriberId
     */
    public void setPackageSubscriberId(tv.mirada.www.iris.core.types.PackageSubscriberId packageSubscriberId) {
        this.packageSubscriberId = packageSubscriberId;
    }


    /**
     * Gets the customerPremisesEquipmentId value for this SubscribeToPackageRequest.
     * 
     * @return customerPremisesEquipmentId
     */
    public tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId getCustomerPremisesEquipmentId() {
        return customerPremisesEquipmentId;
    }


    /**
     * Sets the customerPremisesEquipmentId value for this SubscribeToPackageRequest.
     * 
     * @param customerPremisesEquipmentId
     */
    public void setCustomerPremisesEquipmentId(tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId) {
        this.customerPremisesEquipmentId = customerPremisesEquipmentId;
    }


    /**
     * Gets the packageId value for this SubscribeToPackageRequest.
     * 
     * @return packageId
     */
    public tv.mirada.www.iris.core.types.PackageId getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this SubscribeToPackageRequest.
     * 
     * @param packageId
     */
    public void setPackageId(tv.mirada.www.iris.core.types.PackageId packageId) {
        this.packageId = packageId;
    }


    /**
     * Gets the conditionalAccessId value for this SubscribeToPackageRequest.
     * 
     * @return conditionalAccessId
     */
    public java.lang.String getConditionalAccessId() {
        return conditionalAccessId;
    }


    /**
     * Sets the conditionalAccessId value for this SubscribeToPackageRequest.
     * 
     * @param conditionalAccessId
     */
    public void setConditionalAccessId(java.lang.String conditionalAccessId) {
        this.conditionalAccessId = conditionalAccessId;
    }


    /**
     * Gets the creationDatetime value for this SubscribeToPackageRequest.
     * 
     * @return creationDatetime
     */
    public java.util.Calendar getCreationDatetime() {
        return creationDatetime;
    }


    /**
     * Sets the creationDatetime value for this SubscribeToPackageRequest.
     * 
     * @param creationDatetime
     */
    public void setCreationDatetime(java.util.Calendar creationDatetime) {
        this.creationDatetime = creationDatetime;
    }


    /**
     * Gets the deactivationDatetime value for this SubscribeToPackageRequest.
     * 
     * @return deactivationDatetime
     */
    public java.util.Calendar getDeactivationDatetime() {
        return deactivationDatetime;
    }


    /**
     * Sets the deactivationDatetime value for this SubscribeToPackageRequest.
     * 
     * @param deactivationDatetime
     */
    public void setDeactivationDatetime(java.util.Calendar deactivationDatetime) {
        this.deactivationDatetime = deactivationDatetime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribeToPackageRequest)) return false;
        SubscribeToPackageRequest other = (SubscribeToPackageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operatorSubscriptionId==null && other.getOperatorSubscriptionId()==null) || 
             (this.operatorSubscriptionId!=null &&
              this.operatorSubscriptionId.equals(other.getOperatorSubscriptionId()))) &&
            ((this.packageSubscriberId==null && other.getPackageSubscriberId()==null) || 
             (this.packageSubscriberId!=null &&
              this.packageSubscriberId.equals(other.getPackageSubscriberId()))) &&
            ((this.customerPremisesEquipmentId==null && other.getCustomerPremisesEquipmentId()==null) || 
             (this.customerPremisesEquipmentId!=null &&
              this.customerPremisesEquipmentId.equals(other.getCustomerPremisesEquipmentId()))) &&
            ((this.packageId==null && other.getPackageId()==null) || 
             (this.packageId!=null &&
              this.packageId.equals(other.getPackageId()))) &&
            ((this.conditionalAccessId==null && other.getConditionalAccessId()==null) || 
             (this.conditionalAccessId!=null &&
              this.conditionalAccessId.equals(other.getConditionalAccessId()))) &&
            ((this.creationDatetime==null && other.getCreationDatetime()==null) || 
             (this.creationDatetime!=null &&
              this.creationDatetime.equals(other.getCreationDatetime()))) &&
            ((this.deactivationDatetime==null && other.getDeactivationDatetime()==null) || 
             (this.deactivationDatetime!=null &&
              this.deactivationDatetime.equals(other.getDeactivationDatetime())));
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
        if (getOperatorSubscriptionId() != null) {
            _hashCode += getOperatorSubscriptionId().hashCode();
        }
        if (getPackageSubscriberId() != null) {
            _hashCode += getPackageSubscriberId().hashCode();
        }
        if (getCustomerPremisesEquipmentId() != null) {
            _hashCode += getCustomerPremisesEquipmentId().hashCode();
        }
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
        }
        if (getConditionalAccessId() != null) {
            _hashCode += getConditionalAccessId().hashCode();
        }
        if (getCreationDatetime() != null) {
            _hashCode += getCreationDatetime().hashCode();
        }
        if (getDeactivationDatetime() != null) {
            _hashCode += getDeactivationDatetime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscribeToPackageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">SubscribeToPackageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorSubscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "OperatorSubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionalAccessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "ConditionalAccessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "CreationDatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deactivationDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "DeactivationDatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
