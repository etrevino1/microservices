/**
 * Services.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public interface Services extends java.rmi.Remote {
    public void removeServiceFromPackage(tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequest removeServiceFromPackageRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.service.messages.CreateServiceResponse createService(tv.mirada.www.iris.core.service.messages.CreateServiceRequest createServiceRequest) throws java.rmi.RemoteException;
    public void activateService(tv.mirada.www.iris.core.service.messages.ActivateServiceRequest activateServiceRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.service.messages.FindServiceResponse findService(tv.mirada.www.iris.core.service.messages.FindServiceRequest findServiceRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.service.messages.FindServicesInPackageResponse findServicesInPackage(tv.mirada.www.iris.core.service.messages.FindServicesInPackageRequest findServicesInPackageRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse subscribeToPackage(tv.mirada.www.iris.core.service.messages.SubscribeToPackageRequest subscribeToPackageRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.service.messages.FindPackageResponse findPackage(tv.mirada.www.iris.core.service.messages.FindPackageRequest findPackageRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceResponse findPackagesContainingService(tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceRequest findPackagesContainingServiceRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.service.messages.CreatePackageResponse createPackage(tv.mirada.www.iris.core.service.messages.CreatePackageRequest createPackageRequest) throws java.rmi.RemoteException;
    public void deletePackage(tv.mirada.www.iris.core.service.messages.DeletePackageRequest deletePackageRequest) throws java.rmi.RemoteException;
    public void addServiceToPackage(tv.mirada.www.iris.core.service.messages.AddServiceToPackageRequest addServiceToPackageRequest) throws java.rmi.RemoteException;
    public void deleteService(tv.mirada.www.iris.core.service.messages.DeleteServiceRequest deleteServiceRequest) throws java.rmi.RemoteException;
    public void unsubscribeFromAllPackages(tv.mirada.www.iris.core.service.messages.UnsubscribeFromAllPackagesRequest unsubscribeFromAllPackagesRequest) throws java.rmi.RemoteException;
    public void activatePackage(tv.mirada.www.iris.core.service.messages.ActivatePackageRequest activatePackageRequest) throws java.rmi.RemoteException;
    public void updatePackage(tv.mirada.www.iris.core.service.messages.UpdatePackageRequest updatePackageRequest) throws java.rmi.RemoteException;
    public void deactivatePackage(tv.mirada.www.iris.core.service.messages.DeactivatePackageRequest deactivatePackageRequest) throws java.rmi.RemoteException;
    public void deactivateService(tv.mirada.www.iris.core.service.messages.DeactivateServiceRequest deactivateServiceRequest) throws java.rmi.RemoteException;
    public void unsubscribeFromPackage(tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequest unsubscribeFromPackageRequest) throws java.rmi.RemoteException;
    public void updateService(tv.mirada.www.iris.core.service.messages.UpdateServiceRequest updateServiceRequest) throws java.rmi.RemoteException;
}
