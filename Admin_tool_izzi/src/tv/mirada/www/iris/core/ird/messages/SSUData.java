/**
 * SSUData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.ird.messages;

public class SSUData  implements java.io.Serializable {
    private short productId;

    private short platformType;

    private short platformVersion;

    private org.apache.axis.types.UnsignedByte usageId;

    private org.apache.axis.types.UnsignedByte version;

    private org.apache.axis.types.UnsignedByte level;

    private org.apache.axis.types.UnsignedByte timeout;

    public SSUData() {
    }

    public SSUData(
           short productId,
           short platformType,
           short platformVersion,
           org.apache.axis.types.UnsignedByte usageId,
           org.apache.axis.types.UnsignedByte version,
           org.apache.axis.types.UnsignedByte level,
           org.apache.axis.types.UnsignedByte timeout) {
           this.productId = productId;
           this.platformType = platformType;
           this.platformVersion = platformVersion;
           this.usageId = usageId;
           this.version = version;
           this.level = level;
           this.timeout = timeout;
    }


    /**
     * Gets the productId value for this SSUData.
     * 
     * @return productId
     */
    public short getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this SSUData.
     * 
     * @param productId
     */
    public void setProductId(short productId) {
        this.productId = productId;
    }


    /**
     * Gets the platformType value for this SSUData.
     * 
     * @return platformType
     */
    public short getPlatformType() {
        return platformType;
    }


    /**
     * Sets the platformType value for this SSUData.
     * 
     * @param platformType
     */
    public void setPlatformType(short platformType) {
        this.platformType = platformType;
    }


    /**
     * Gets the platformVersion value for this SSUData.
     * 
     * @return platformVersion
     */
    public short getPlatformVersion() {
        return platformVersion;
    }


    /**
     * Sets the platformVersion value for this SSUData.
     * 
     * @param platformVersion
     */
    public void setPlatformVersion(short platformVersion) {
        this.platformVersion = platformVersion;
    }


    /**
     * Gets the usageId value for this SSUData.
     * 
     * @return usageId
     */
    public org.apache.axis.types.UnsignedByte getUsageId() {
        return usageId;
    }


    /**
     * Sets the usageId value for this SSUData.
     * 
     * @param usageId
     */
    public void setUsageId(org.apache.axis.types.UnsignedByte usageId) {
        this.usageId = usageId;
    }


    /**
     * Gets the version value for this SSUData.
     * 
     * @return version
     */
    public org.apache.axis.types.UnsignedByte getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SSUData.
     * 
     * @param version
     */
    public void setVersion(org.apache.axis.types.UnsignedByte version) {
        this.version = version;
    }


    /**
     * Gets the level value for this SSUData.
     * 
     * @return level
     */
    public org.apache.axis.types.UnsignedByte getLevel() {
        return level;
    }


    /**
     * Sets the level value for this SSUData.
     * 
     * @param level
     */
    public void setLevel(org.apache.axis.types.UnsignedByte level) {
        this.level = level;
    }


    /**
     * Gets the timeout value for this SSUData.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedByte getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this SSUData.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedByte timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SSUData)) return false;
        SSUData other = (SSUData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.productId == other.getProductId() &&
            this.platformType == other.getPlatformType() &&
            this.platformVersion == other.getPlatformVersion() &&
            ((this.usageId==null && other.getUsageId()==null) || 
             (this.usageId!=null &&
              this.usageId.equals(other.getUsageId()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout())));
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
        _hashCode += getProductId();
        _hashCode += getPlatformType();
        _hashCode += getPlatformVersion();
        if (getUsageId() != null) {
            _hashCode += getUsageId().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SSUData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "SSUData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "ProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "PlatformType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "PlatformVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "UsageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "Level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "Timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
