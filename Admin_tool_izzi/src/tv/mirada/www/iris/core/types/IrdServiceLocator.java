/**
 * IrdServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class IrdServiceLocator extends org.apache.axis.client.Service implements tv.mirada.www.iris.core.types.IrdService {

    public IrdServiceLocator() {
    }


    public IrdServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IrdServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IrdSoap11
    private java.lang.String IrdSoap11_address = "http://172.20.183.55:8888/managetv/prov/ird/";

    public java.lang.String getIrdSoap11Address() {
        return IrdSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IrdSoap11WSDDServiceName = "IrdSoap11";

    public java.lang.String getIrdSoap11WSDDServiceName() {
        return IrdSoap11WSDDServiceName;
    }

    public void setIrdSoap11WSDDServiceName(java.lang.String name) {
        IrdSoap11WSDDServiceName = name;
    }

    public tv.mirada.www.iris.core.types.Ird getIrdSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IrdSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIrdSoap11(endpoint);
    }

    public tv.mirada.www.iris.core.types.Ird getIrdSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tv.mirada.www.iris.core.types.IrdSoap11Stub _stub = new tv.mirada.www.iris.core.types.IrdSoap11Stub(portAddress, this);
            _stub.setPortName(getIrdSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIrdSoap11EndpointAddress(java.lang.String address) {
        IrdSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tv.mirada.www.iris.core.types.Ird.class.isAssignableFrom(serviceEndpointInterface)) {
                tv.mirada.www.iris.core.types.IrdSoap11Stub _stub = new tv.mirada.www.iris.core.types.IrdSoap11Stub(new java.net.URL(IrdSoap11_address), this);
                _stub.setPortName(getIrdSoap11WSDDServiceName());
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
        if ("IrdSoap11".equals(inputPortName)) {
            return getIrdSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrdService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrdSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IrdSoap11".equals(portName)) {
            setIrdSoap11EndpointAddress(address);
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
