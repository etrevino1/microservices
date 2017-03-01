package tv.mirada.www.iris.core.types;

public class IrdProxy implements tv.mirada.www.iris.core.types.Ird {
  private String _endpoint = null;
  private tv.mirada.www.iris.core.types.Ird ird = null;
  
  public IrdProxy() {
    _initIrdProxy();
  }
  
  public IrdProxy(String endpoint) {
    _endpoint = endpoint;
    _initIrdProxy();
  }
  
  private void _initIrdProxy() {
    try {
      ird = (new tv.mirada.www.iris.core.types.IrdServiceLocator()).getIrdSoap11();
      if (ird != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ird)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ird)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ird != null)
      ((javax.xml.rpc.Stub)ird)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tv.mirada.www.iris.core.types.Ird getIrd() {
    if (ird == null)
      _initIrdProxy();
    return ird;
  }
  
  public void showOSDMessage(tv.mirada.www.iris.core.ird.messages.ShowOSDMessageRequest showOSDMessageRequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    ird.showOSDMessage(showOSDMessageRequest);
  }
  
  public void enableSTB(tv.mirada.www.iris.core.ird.messages.EnableSTBRequest enableSTBRequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    ird.enableSTB(enableSTBRequest);
  }
  
  public void disableSTB(tv.mirada.www.iris.core.ird.messages.DisableSTBRequest disableSTBRequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    ird.disableSTB(disableSTBRequest);
  }
  
  public void triggerSSU(tv.mirada.www.iris.core.ird.messages.TriggerSSURequest triggerSSURequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    ird.triggerSSU(triggerSSURequest);
  }
  
  public tv.mirada.www.iris.core.ird.messages.RequestHealthCheckResponse requestHealthCheck(tv.mirada.www.iris.core.ird.messages.RequestHealthCheckRequest requestHealthCheckRequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    return ird.requestHealthCheck(requestHealthCheckRequest);
  }
  
  public void rebootSTB(tv.mirada.www.iris.core.ird.messages.RebootSTBRequest rebootSTBRequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    ird.rebootSTB(rebootSTBRequest);
  }
  
  public void resetPIN(tv.mirada.www.iris.core.ird.messages.ResetPINRequest resetPINRequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    ird.resetPIN(resetPINRequest);
  }
  
  public void hideOSDMessage(tv.mirada.www.iris.core.ird.messages.HideOSDMessageRequest hideOSDMessageRequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    ird.hideOSDMessage(hideOSDMessageRequest);
  }
  
  public void restoreSTB(tv.mirada.www.iris.core.ird.messages.RestoreSTBRequest restoreSTBRequest) throws java.rmi.RemoteException{
    if (ird == null)
      _initIrdProxy();
    ird.restoreSTB(restoreSTBRequest);
  }
  
  
}