/**
 * RemoveServiceFromPackageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.service.messages;

public class RemoveServiceFromPackageRequest  implements java.io.Serializable {
    private tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestPackageId packageId;

    private tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestServiceId serviceId;

    public RemoveServiceFromPackageRequest() {
    }

    public RemoveServiceFromPackageRequest(
           tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestPackageId packageId,
           tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestServiceId serviceId) {
           this.packageId = packageId;
           this.serviceId = serviceId;
    }


    /**
     * Gets the packageId value for this RemoveServiceFromPackageRequest.
     * 
     * @return packageId
     */
    public tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestPackageId getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this RemoveServiceFromPackageRequest.
     * 
     * @param packageId
     */
    public void setPackageId(tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestPackageId packageId) {
        this.packageId = packageId;
    }


    /**
     * Gets the serviceId value for this RemoveServiceFromPackageRequest.
     * 
     * @return serviceId
     */
    public tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestServiceId getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this RemoveServiceFromPackageRequest.
     * 
     * @param serviceId
     */
    public void setServiceId(tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestServiceId serviceId) {
        this.serviceId = serviceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveServiceFromPackageRequest)) return false;
        RemoveServiceFromPackageRequest other = (RemoveServiceFromPackageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageId==null && other.getPackageId()==null) || 
             (this.packageId!=null &&
              this.packageId.equals(other.getPackageId()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId())));
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
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveServiceFromPackageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">RemoveServiceFromPackageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "PackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>RemoveServiceFromPackageRequest>PackageId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>RemoveServiceFromPackageRequest>ServiceId"));
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
