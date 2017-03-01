/**
 * FindSubscribersCustomerPremisesEquipmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.subscriber.messages;

import java.util.ArrayList;
import java.util.List;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class FindSubscribersCustomerPremisesEquipmentResponse  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.CustomerPremisesEquipment customerPremisesEquipment;

    private List<CustomerPremisesEquipment> customerPremisesEquipments= null;
    
    public FindSubscribersCustomerPremisesEquipmentResponse() {
    	customerPremisesEquipments = new ArrayList<CustomerPremisesEquipment>();
    }

    public FindSubscribersCustomerPremisesEquipmentResponse(
           tv.mirada.www.iris.core.types.CustomerPremisesEquipment customerPremisesEquipment) {
           this.customerPremisesEquipment = customerPremisesEquipment;
    }
	public void setCustomerPremisesEquipments(
			List<CustomerPremisesEquipment> customerPremisesEquipments) {
		this.customerPremisesEquipments = customerPremisesEquipments;
	}

    /**
     * Gets the customerPremisesEquipment value for this FindSubscribersCustomerPremisesEquipmentResponse.
     * 
     * @return customerPremisesEquipment
     */
    public tv.mirada.www.iris.core.types.CustomerPremisesEquipment getCustomerPremisesEquipment() {
        return customerPremisesEquipment;
    }

    public List<CustomerPremisesEquipment> getCustomerPremisesEquipments() {
		return customerPremisesEquipments;
	}    

    /**
     * Sets the customerPremisesEquipment value for this FindSubscribersCustomerPremisesEquipmentResponse.
     * 
     * @param customerPremisesEquipment
     */
    public void setCustomerPremisesEquipment(tv.mirada.www.iris.core.types.CustomerPremisesEquipment customerPremisesEquipment) {
    	customerPremisesEquipments.add(customerPremisesEquipment);
        this.customerPremisesEquipment = customerPremisesEquipment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindSubscribersCustomerPremisesEquipmentResponse)) return false;
        FindSubscribersCustomerPremisesEquipmentResponse other = (FindSubscribersCustomerPremisesEquipmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerPremisesEquipment==null && other.getCustomerPremisesEquipment()==null) || 
             (this.customerPremisesEquipment!=null &&
              this.customerPremisesEquipment.equals(other.getCustomerPremisesEquipment())));
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
        if (getCustomerPremisesEquipment() != null) {
            _hashCode += getCustomerPremisesEquipment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindSubscribersCustomerPremisesEquipmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/subscriber/messages", ">FindSubscribersCustomerPremisesEquipmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPremisesEquipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/subscriber/messages", "CustomerPremisesEquipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipment"));
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
