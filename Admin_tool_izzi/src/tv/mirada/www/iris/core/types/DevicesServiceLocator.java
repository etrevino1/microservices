/**
 * DevicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class DevicesServiceLocator extends org.apache.axis.client.Service implements tv.mirada.www.iris.core.types.DevicesService {

    public DevicesServiceLocator() {
    }


    public DevicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DevicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DevicesSoap11
    private java.lang.String DevicesSoap11_address = "http://172.20.183.55:8888/managetv/prov/devices/";

    public java.lang.String getDevicesSoap11Address() {
        return DevicesSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DevicesSoap11WSDDServiceName = "DevicesSoap11";

    public java.lang.String getDevicesSoap11WSDDServiceName() {
        return DevicesSoap11WSDDServiceName;
    }

    public void setDevicesSoap11WSDDServiceName(java.lang.String name) {
        DevicesSoap11WSDDServiceName = name;
    }

    public tv.mirada.www.iris.core.types.Devices getDevicesSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DevicesSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDevicesSoap11(endpoint);
    }

    public tv.mirada.www.iris.core.types.Devices getDevicesSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tv.mirada.www.iris.core.types.DevicesSoap11Stub _stub = new tv.mirada.www.iris.core.types.DevicesSoap11Stub(portAddress, this);
            _stub.setPortName(getDevicesSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDevicesSoap11EndpointAddress(java.lang.String address) {
        DevicesSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tv.mirada.www.iris.core.types.Devices.class.isAssignableFrom(serviceEndpointInterface)) {
                tv.mirada.www.iris.core.types.DevicesSoap11Stub _stub = new tv.mirada.www.iris.core.types.DevicesSoap11Stub(new java.net.URL(DevicesSoap11_address), this);
                _stub.setPortName(getDevicesSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DevicesSoap11".equals(inputPortName)) {
            return getDevicesSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DevicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DevicesSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DevicesSoap11".equals(portName)) {
            setDevicesSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
