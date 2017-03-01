package tv.mirada.www.iris.core.types;

public class SubscribersProxy implements tv.mirada.www.iris.core.types.Subscribers {
  private String _endpoint = null;
  private tv.mirada.www.iris.core.types.Subscribers subscribers = null;
  
  public SubscribersProxy() {
    _initSubscribersProxy();
  }
  
  public SubscribersProxy(String endpoint) {
    _endpoint = endpoint;
    _initSubscribersProxy();
  }
  
  private void _initSubscribersProxy() {
    try {
      subscribers = (new tv.mirada.www.iris.core.types.SubscribersServiceLocator()).getSubscribersSoap11();
      if (subscribers != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)subscribers)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)subscribers)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (subscribers != null)
      ((javax.xml.rpc.Stub)subscribers)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tv.mirada.www.iris.core.types.Subscribers getSubscribers() {
    if (subscribers == null)
      _initSubscribersProxy();
    return subscribers;
  }
  
  public tv.mirada.www.iris.core.subscriber.messages.CreateSubscriberResponse createSubscriber(tv.mirada.www.iris.core.subscriber.messages.CreateSubscriberRequest createSubscriberRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    return subscribers.createSubscriber(createSubscriberRequest);
  }
  
  public tv.mirada.www.iris.core.subscriber.messages.FindSubscribersSubscriptionsResponse findSubscribersSubscriptions(tv.mirada.www.iris.core.subscriber.messages.FindSubscribersSubscriptionsRequest findSubscribersSubscriptionsRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    return subscribers.findSubscribersSubscriptions(findSubscribersSubscriptionsRequest);
  }
  
  public tv.mirada.www.iris.core.subscriber.messages.FindSubscribersCustomerPremisesEquipmentResponse findSubscribersCustomerPremisesEquipment(tv.mirada.www.iris.core.subscriber.messages.FindSubscribersCustomerPremisesEquipmentRequest findSubscribersCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    return subscribers.findSubscribersCustomerPremisesEquipment(findSubscribersCustomerPremisesEquipmentRequest);
  }
  
  public tv.mirada.www.iris.core.subscriber.messages.CheckStatusSubscriberResponse checkStatusSubscriber(tv.mirada.www.iris.core.subscriber.messages.CheckStatusSubscriberRequest checkStatusSubscriberRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    return subscribers.checkStatusSubscriber(checkStatusSubscriberRequest);
  }
  
  public void updateSubscriber(tv.mirada.www.iris.core.subscriber.messages.UpdateSubscriberRequest updateSubscriberRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    subscribers.updateSubscriber(updateSubscriberRequest);
  }
  
  public tv.mirada.www.iris.core.subscriber.messages.FindSubscriberResponse findSubscriber(tv.mirada.www.iris.core.subscriber.messages.FindSubscriberRequest findSubscriberRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    return subscribers.findSubscriber(findSubscriberRequest);
  }
  
  public void activateSubscriber(tv.mirada.www.iris.core.subscriber.messages.ActivateSubscriberRequest activateSubscriberRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    subscribers.activateSubscriber(activateSubscriberRequest);
  }
  
  public void deactivateSubscriber(tv.mirada.www.iris.core.subscriber.messages.DeactivateSubscriberRequest deactivateSubscriberRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    subscribers.deactivateSubscriber(deactivateSubscriberRequest);
  }
  
  public void deleteSubscriber(tv.mirada.www.iris.core.subscriber.messages.DeleteSubscriberRequest deleteSubscriberRequest) throws java.rmi.RemoteException{
    if (subscribers == null)
      _initSubscribersProxy();
    subscribers.deleteSubscriber(deleteSubscriberRequest);
  }
  
  
}