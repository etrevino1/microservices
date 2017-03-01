/**
 * CustomerPremisesEquipmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class CustomerPremisesEquipmentType  implements java.io.Serializable {
    private java.lang.Long irisId;

    private java.lang.String name;

    private tv.mirada.www.iris.core.types.DeviceClassName deviceClass;

    private java.lang.Short tunerCount;

    private java.lang.String CASProvider;

    public CustomerPremisesEquipmentType() {
    }

    public CustomerPremisesEquipmentType(
           java.lang.Long irisId,
           java.lang.String name,
           tv.mirada.www.iris.core.types.DeviceClassName deviceClass,
           java.lang.Short tunerCount,
           java.lang.String CASProvider) {
           this.irisId = irisId;
           this.name = name;
           this.deviceClass = deviceClass;
           this.tunerCount = tunerCount;
           this.CASProvider = CASProvider;
    }


    /**
     * Gets the irisId value for this CustomerPremisesEquipmentType.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this CustomerPremisesEquipmentType.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the name value for this CustomerPremisesEquipmentType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomerPremisesEquipmentType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the deviceClass value for this CustomerPremisesEquipmentType.
     * 
     * @return deviceClass
     */
    public tv.mirada.www.iris.core.types.DeviceClassName getDeviceClass() {
        return deviceClass;
    }


    /**
     * Sets the deviceClass value for this CustomerPremisesEquipmentType.
     * 
     * @param deviceClass
     */
    public void setDeviceClass(tv.mirada.www.iris.core.types.DeviceClassName deviceClass) {
        this.deviceClass = deviceClass;
    }


    /**
     * Gets the tunerCount value for this CustomerPremisesEquipmentType.
     * 
     * @return tunerCount
     */
    public java.lang.Short getTunerCount() {
        return tunerCount;
    }


    /**
     * Sets the tunerCount value for this CustomerPremisesEquipmentType.
     * 
     * @param tunerCount
     */
    public void setTunerCount(java.lang.Short tunerCount) {
        this.tunerCount = tunerCount;
    }


    /**
     * Gets the CASProvider value for this CustomerPremisesEquipmentType.
     * 
     * @return CASProvider
     */
    public java.lang.String getCASProvider() {
        return CASProvider;
    }


    /**
     * Sets the CASProvider value for this CustomerPremisesEquipmentType.
     * 
     * @param CASProvider
     */
    public void setCASProvider(java.lang.String CASProvider) {
        this.CASProvider = CASProvider;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerPremisesEquipmentType)) return false;
        CustomerPremisesEquipmentType other = (CustomerPremisesEquipmentType) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.deviceClass==null && other.getDeviceClass()==null) || 
             (this.deviceClass!=null &&
              this.deviceClass.equals(other.getDeviceClass()))) &&
            ((this.tunerCount==null && other.getTunerCount()==null) || 
             (this.tunerCount!=null &&
              this.tunerCount.equals(other.getTunerCount()))) &&
            ((this.CASProvider==null && other.getCASProvider()==null) || 
             (this.CASProvider!=null &&
              this.CASProvider.equals(other.getCASProvider())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDeviceClass() != null) {
            _hashCode += getDeviceClass().hashCode();
        }
        if (getTunerCount() != null) {
            _hashCode += getTunerCount().hashCode();
        }
        if (getCASProvider() != null) {
            _hashCode += getCASProvider().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerPremisesEquipmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DeviceClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DeviceClassName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunerCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "TunerCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CASProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CASProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
