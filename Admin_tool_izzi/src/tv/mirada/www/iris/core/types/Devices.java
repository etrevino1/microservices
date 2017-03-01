/**
 * Devices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public interface Devices extends java.rmi.Remote {
    public void deleteCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentRequest deleteCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentResponse createCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentRequest createCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException;
    public void deactivateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.DeactivateCustomerPremisesEquipmentRequest deactivateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeResponse findCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeRequest findCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException;
    public void updateCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentTypeRequest updateCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse findCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentRequest findCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException;
    public void refreshCustomerPremisesEquipmentEntitlements(tv.mirada.www.iris.core.CPE.messages.RefreshCustomerPremisesEquipmentEntitlementsRequest refreshCustomerPremisesEquipmentEntitlementsRequest) throws java.rmi.RemoteException;
    public void activateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.ActivateCustomerPremisesEquipmentRequest activateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeResponse createCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeRequest createCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException;
    public void updateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentRequest updateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException;
    public void deleteCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentTypeRequest deleteCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException;
}
