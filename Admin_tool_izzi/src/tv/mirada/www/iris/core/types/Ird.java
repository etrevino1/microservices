/**
 * Ird.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public interface Ird extends java.rmi.Remote {
    public void showOSDMessage(tv.mirada.www.iris.core.ird.messages.ShowOSDMessageRequest showOSDMessageRequest) throws java.rmi.RemoteException;
    public void enableSTB(tv.mirada.www.iris.core.ird.messages.EnableSTBRequest enableSTBRequest) throws java.rmi.RemoteException;
    public void disableSTB(tv.mirada.www.iris.core.ird.messages.DisableSTBRequest disableSTBRequest) throws java.rmi.RemoteException;
    public void triggerSSU(tv.mirada.www.iris.core.ird.messages.TriggerSSURequest triggerSSURequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.core.ird.messages.RequestHealthCheckResponse requestHealthCheck(tv.mirada.www.iris.core.ird.messages.RequestHealthCheckRequest requestHealthCheckRequest) throws java.rmi.RemoteException;
    public void rebootSTB(tv.mirada.www.iris.core.ird.messages.RebootSTBRequest rebootSTBRequest) throws java.rmi.RemoteException;
    public void resetPIN(tv.mirada.www.iris.core.ird.messages.ResetPINRequest resetPINRequest) throws java.rmi.RemoteException;
    public void hideOSDMessage(tv.mirada.www.iris.core.ird.messages.HideOSDMessageRequest hideOSDMessageRequest) throws java.rmi.RemoteException;
    public void restoreSTB(tv.mirada.www.iris.core.ird.messages.RestoreSTBRequest restoreSTBRequest) throws java.rmi.RemoteException;
}
