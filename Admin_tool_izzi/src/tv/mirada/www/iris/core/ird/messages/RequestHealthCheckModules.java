/**
 * RequestHealthCheckModules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.ird.messages;

public class RequestHealthCheckModules  implements java.io.Serializable {
    private java.lang.Integer healthCheckModules;

    private tv.mirada.www.iris.core.ird.messages.HealthCheckModulesList healthCheckModulesList;

    public RequestHealthCheckModules() {
    }

    public RequestHealthCheckModules(
           java.lang.Integer healthCheckModules,
           tv.mirada.www.iris.core.ird.messages.HealthCheckModulesList healthCheckModulesList) {
           this.healthCheckModules = healthCheckModules;
           this.healthCheckModulesList = healthCheckModulesList;
    }


    /**
     * Gets the healthCheckModules value for this RequestHealthCheckModules.
     * 
     * @return healthCheckModules
     */
    public java.lang.Integer getHealthCheckModules() {
        return healthCheckModules;
    }


    /**
     * Sets the healthCheckModules value for this RequestHealthCheckModules.
     * 
     * @param healthCheckModules
     */
    public void setHealthCheckModules(java.lang.Integer healthCheckModules) {
        this.healthCheckModules = healthCheckModules;
    }


    /**
     * Gets the healthCheckModulesList value for this RequestHealthCheckModules.
     * 
     * @return healthCheckModulesList
     */
    public tv.mirada.www.iris.core.ird.messages.HealthCheckModulesList getHealthCheckModulesList() {
        return healthCheckModulesList;
    }


    /**
     * Sets the healthCheckModulesList value for this RequestHealthCheckModules.
     * 
     * @param healthCheckModulesList
     */
    public void setHealthCheckModulesList(tv.mirada.www.iris.core.ird.messages.HealthCheckModulesList healthCheckModulesList) {
        this.healthCheckModulesList = healthCheckModulesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHealthCheckModules)) return false;
        RequestHealthCheckModules other = (RequestHealthCheckModules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.healthCheckModules==null && other.getHealthCheckModules()==null) || 
             (this.healthCheckModules!=null &&
              this.healthCheckModules.equals(other.getHealthCheckModules()))) &&
            ((this.healthCheckModulesList==null && other.getHealthCheckModulesList()==null) || 
             (this.healthCheckModulesList!=null &&
              this.healthCheckModulesList.equals(other.getHealthCheckModulesList())));
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
        if (getHealthCheckModules() != null) {
            _hashCode += getHealthCheckModules().hashCode();
        }
        if (getHealthCheckModulesList() != null) {
            _hashCode += getHealthCheckModulesList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHealthCheckModules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "RequestHealthCheckModules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCheckModules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HealthCheckModules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCheckModulesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HealthCheckModulesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HealthCheckModulesList"));
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
