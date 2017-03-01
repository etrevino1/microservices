/**
 * HealthCheckModulesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.ird.messages;

public class HealthCheckModulesList  implements java.io.Serializable {
    private tv.mirada.www.iris.core.ird.messages.HealthCheckModulesEntry healthCheckModulesEntry;

    public HealthCheckModulesList() {
    }

    public HealthCheckModulesList(
           tv.mirada.www.iris.core.ird.messages.HealthCheckModulesEntry healthCheckModulesEntry) {
           this.healthCheckModulesEntry = healthCheckModulesEntry;
    }


    /**
     * Gets the healthCheckModulesEntry value for this HealthCheckModulesList.
     * 
     * @return healthCheckModulesEntry
     */
    public tv.mirada.www.iris.core.ird.messages.HealthCheckModulesEntry getHealthCheckModulesEntry() {
        return healthCheckModulesEntry;
    }


    /**
     * Sets the healthCheckModulesEntry value for this HealthCheckModulesList.
     * 
     * @param healthCheckModulesEntry
     */
    public void setHealthCheckModulesEntry(tv.mirada.www.iris.core.ird.messages.HealthCheckModulesEntry healthCheckModulesEntry) {
        this.healthCheckModulesEntry = healthCheckModulesEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HealthCheckModulesList)) return false;
        HealthCheckModulesList other = (HealthCheckModulesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.healthCheckModulesEntry==null && other.getHealthCheckModulesEntry()==null) || 
             (this.healthCheckModulesEntry!=null &&
              this.healthCheckModulesEntry.equals(other.getHealthCheckModulesEntry())));
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
        if (getHealthCheckModulesEntry() != null) {
            _hashCode += getHealthCheckModulesEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HealthCheckModulesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HealthCheckModulesList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCheckModulesEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HealthCheckModulesEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HealthCheckModulesEntry"));
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
