package tv.mirada.www.iris.core.types;

public class DevicesProxy implements tv.mirada.www.iris.core.types.Devices {
  private String _endpoint = null;
  private tv.mirada.www.iris.core.types.Devices devices = null;
  
  public DevicesProxy() {
    _initDevicesProxy();
  }
  
  public DevicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initDevicesProxy();
  }
  
  private void _initDevicesProxy() {
    try {
      devices = (new tv.mirada.www.iris.core.types.DevicesServiceLocator()).getDevicesSoap11();
      if (devices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)devices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)devices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (devices != null)
      ((javax.xml.rpc.Stub)devices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tv.mirada.www.iris.core.types.Devices getDevices() {
    if (devices == null)
      _initDevicesProxy();
    return devices;
  }
  
  public void deleteCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentRequest deleteCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    devices.deleteCustomerPremisesEquipment(deleteCustomerPremisesEquipmentRequest);
  }
  
  public tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentResponse createCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentRequest createCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    return devices.createCustomerPremisesEquipment(createCustomerPremisesEquipmentRequest);
  }
  
  public void deactivateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.DeactivateCustomerPremisesEquipmentRequest deactivateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    devices.deactivateCustomerPremisesEquipment(deactivateCustomerPremisesEquipmentRequest);
  }
  
  public tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeResponse findCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeRequest findCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    return devices.findCustomerPremisesEquipmentType(findCustomerPremisesEquipmentTypeRequest);
  }
  
  public void updateCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentTypeRequest updateCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    devices.updateCustomerPremisesEquipmentType(updateCustomerPremisesEquipmentTypeRequest);
  }
  
  public tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse findCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentRequest findCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    return devices.findCustomerPremisesEquipment(findCustomerPremisesEquipmentRequest);
  }
  
  public void refreshCustomerPremisesEquipmentEntitlements(tv.mirada.www.iris.core.CPE.messages.RefreshCustomerPremisesEquipmentEntitlementsRequest refreshCustomerPremisesEquipmentEntitlementsRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    devices.refreshCustomerPremisesEquipmentEntitlements(refreshCustomerPremisesEquipmentEntitlementsRequest);
  }
  
  public void activateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.ActivateCustomerPremisesEquipmentRequest activateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    devices.activateCustomerPremisesEquipment(activateCustomerPremisesEquipmentRequest);
  }
  
  public tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeResponse createCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeRequest createCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    return devices.createCustomerPremisesEquipmentType(createCustomerPremisesEquipmentTypeRequest);
  }
  
  public void updateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentRequest updateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    devices.updateCustomerPremisesEquipment(updateCustomerPremisesEquipmentRequest);
  }
  
  public void deleteCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentTypeRequest deleteCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException{
    if (devices == null)
      _initDevicesProxy();
    devices.deleteCustomerPremisesEquipmentType(deleteCustomerPremisesEquipmentTypeRequest);
  }
  
  
}