package tv.mirada.www.iris.core.types;

public class ServicesProxy implements tv.mirada.www.iris.core.types.Services {
  private String _endpoint = null;
  private tv.mirada.www.iris.core.types.Services services = null;
  
  public ServicesProxy() {
    _initServicesProxy();
  }
  
  public ServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicesProxy();
  }
  
  private void _initServicesProxy() {
    try {
      services = (new tv.mirada.www.iris.core.types.ServicesServiceLocator()).getServicesSoap11();
      if (services != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)services)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (services != null)
      ((javax.xml.rpc.Stub)services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tv.mirada.www.iris.core.types.Services getServices() {
    if (services == null)
      _initServicesProxy();
    return services;
  }
  
  public void removeServiceFromPackage(tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequest removeServiceFromPackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.removeServiceFromPackage(removeServiceFromPackageRequest);
  }
  
  public tv.mirada.www.iris.core.service.messages.CreateServiceResponse createService(tv.mirada.www.iris.core.service.messages.CreateServiceRequest createServiceRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.createService(createServiceRequest);
  }
  
  public void activateService(tv.mirada.www.iris.core.service.messages.ActivateServiceRequest activateServiceRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.activateService(activateServiceRequest);
  }
  
  public tv.mirada.www.iris.core.service.messages.FindServiceResponse findService(tv.mirada.www.iris.core.service.messages.FindServiceRequest findServiceRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.findService(findServiceRequest);
  }
  
  public tv.mirada.www.iris.core.service.messages.FindServicesInPackageResponse findServicesInPackage(tv.mirada.www.iris.core.service.messages.FindServicesInPackageRequest findServicesInPackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.findServicesInPackage(findServicesInPackageRequest);
  }
  
  public tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse subscribeToPackage(tv.mirada.www.iris.core.service.messages.SubscribeToPackageRequest subscribeToPackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.subscribeToPackage(subscribeToPackageRequest);
  }
  
  public tv.mirada.www.iris.core.service.messages.FindPackageResponse findPackage(tv.mirada.www.iris.core.service.messages.FindPackageRequest findPackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.findPackage(findPackageRequest);
  }
  
  public tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceResponse findPackagesContainingService(tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceRequest findPackagesContainingServiceRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.findPackagesContainingService(findPackagesContainingServiceRequest);
  }
  
  public tv.mirada.www.iris.core.service.messages.CreatePackageResponse createPackage(tv.mirada.www.iris.core.service.messages.CreatePackageRequest createPackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.createPackage(createPackageRequest);
  }
  
  public void deletePackage(tv.mirada.www.iris.core.service.messages.DeletePackageRequest deletePackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.deletePackage(deletePackageRequest);
  }
  
  public void addServiceToPackage(tv.mirada.www.iris.core.service.messages.AddServiceToPackageRequest addServiceToPackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.addServiceToPackage(addServiceToPackageRequest);
  }
  
  public void deleteService(tv.mirada.www.iris.core.service.messages.DeleteServiceRequest deleteServiceRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.deleteService(deleteServiceRequest);
  }
  
  public void unsubscribeFromAllPackages(tv.mirada.www.iris.core.service.messages.UnsubscribeFromAllPackagesRequest unsubscribeFromAllPackagesRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.unsubscribeFromAllPackages(unsubscribeFromAllPackagesRequest);
  }
  
  public void activatePackage(tv.mirada.www.iris.core.service.messages.ActivatePackageRequest activatePackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.activatePackage(activatePackageRequest);
  }
  
  public void updatePackage(tv.mirada.www.iris.core.service.messages.UpdatePackageRequest updatePackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.updatePackage(updatePackageRequest);
  }
  
  public void deactivatePackage(tv.mirada.www.iris.core.service.messages.DeactivatePackageRequest deactivatePackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.deactivatePackage(deactivatePackageRequest);
  }
  
  public void deactivateService(tv.mirada.www.iris.core.service.messages.DeactivateServiceRequest deactivateServiceRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.deactivateService(deactivateServiceRequest);
  }
  
  public void unsubscribeFromPackage(tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequest unsubscribeFromPackageRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.unsubscribeFromPackage(unsubscribeFromPackageRequest);
  }
  
  public void updateService(tv.mirada.www.iris.core.service.messages.UpdateServiceRequest updateServiceRequest) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    services.updateService(updateServiceRequest);
  }
  
  
}