/**
 * Subscribers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public interface Subscribers extends java.rmi.Remote {
    public tv.mirada.www.iris.core.subscriber.messages.CreateSubscriberResponse createSubscriber(tv.mirada.www.iris.core.subscriber.messages.CreateSubscriberRequest createSubscriberRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.subscriber.messages.FindSubscribersSubscriptionsResponse findSubscribersSubscriptions(tv.mirada.www.iris.core.subscriber.messages.FindSubscribersSubscriptionsRequest findSubscribersSubscriptionsRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.subscriber.messages.FindSubscribersCustomerPremisesEquipmentResponse findSubscribersCustomerPremisesEquipment(tv.mirada.www.iris.core.subscriber.messages.FindSubscribersCustomerPremisesEquipmentRequest findSubscribersCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.subscriber.messages.CheckStatusSubscriberResponse checkStatusSubscriber(tv.mirada.www.iris.core.subscriber.messages.CheckStatusSubscriberRequest checkStatusSubscriberRequest) throws java.rmi.RemoteException;
    public void updateSubscriber(tv.mirada.www.iris.core.subscriber.messages.UpdateSubscriberRequest updateSubscriberRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.subscriber.messages.FindSubscriberResponse findSubscriber(tv.mirada.www.iris.core.subscriber.messages.FindSubscriberRequest findSubscriberRequest) throws java.rmi.RemoteException;
    public void activateSubscriber(tv.mirada.www.iris.core.subscriber.messages.ActivateSubscriberRequest activateSubscriberRequest) throws java.rmi.RemoteException;
    public void deactivateSubscriber(tv.mirada.www.iris.core.subscriber.messages.DeactivateSubscriberRequest deactivateSubscriberRequest) throws java.rmi.RemoteException;
    public void deleteSubscriber(tv.mirada.www.iris.core.subscriber.messages.DeleteSubscriberRequest deleteSubscriberRequest) throws java.rmi.RemoteException;
}
