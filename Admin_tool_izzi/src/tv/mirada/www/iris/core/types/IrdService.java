/**
 * IrdService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public interface IrdService extends javax.xml.rpc.Service {
    public java.lang.String getIrdSoap11Address();

    public tv.mirada.www.iris.core.types.Ird getIrdSoap11() throws javax.xml.rpc.ServiceException;

    public tv.mirada.www.iris.core.types.Ird getIrdSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
