/**
 * FindSubscribersSubscriptionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.subscriber.messages;

import java.util.ArrayList;
import java.util.List;

import tv.mirada.www.iris.core.types.Subscription;

public class FindSubscribersSubscriptionsResponse  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.Subscription subscriptions;
    private List<Subscription> subscription = null;

    public FindSubscribersSubscriptionsResponse() {
    	subscription = new ArrayList<Subscription>();
    }

    public FindSubscribersSubscriptionsResponse(
           tv.mirada.www.iris.core.types.Subscription subscriptions) {
           this.subscriptions = subscriptions;
    }


    /**
     * Gets the subscriptions value for this FindSubscribersSubscriptionsResponse.
     * 
     * @return subscriptions
     */
    public tv.mirada.www.iris.core.types.Subscription getSubscriptions() {
        return subscriptions;
    }
    public List<Subscription> getSubscription(){
    	return subscription;
    }

    /**
     * Sets the subscriptions value for this FindSubscribersSubscriptionsResponse.
     * 
     * @param subscriptions
     */
    public void setSubscriptions(tv.mirada.www.iris.core.types.Subscription subscriptions) {
    	this.subscription.add(subscriptions);
        this.subscriptions = subscriptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindSubscribersSubscriptionsResponse)) return false;
        FindSubscribersSubscriptionsResponse other = (FindSubscribersSubscriptionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriptions==null && other.getSubscriptions()==null) || 
             (this.subscriptions!=null &&
              this.subscriptions.equals(other.getSubscriptions())));
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
        if (getSubscriptions() != null) {
            _hashCode += getSubscriptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindSubscribersSubscriptionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/subscriber/messages", ">FindSubscribersSubscriptionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/subscriber/messages", "Subscriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Subscription"));
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
