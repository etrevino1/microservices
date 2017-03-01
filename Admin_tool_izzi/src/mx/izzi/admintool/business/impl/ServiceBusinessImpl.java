package mx.izzi.admintool.business.impl;

import org.apache.log4j.Logger;

import tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse;
import mx.izzi.admintool.business.ServiceBusiness;
import mx.izzi.admintool.dao.ServiceDAO;

public class ServiceBusinessImpl implements ServiceBusiness {

	private ServiceDAO serviceDAO;
	

	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public boolean deletePackage(String irisId, String node) {
		this.serviceDAO.deletePackage(irisId, node);
		return false;
	}
	
	@Override
	public SubscribeToPackageResponse addPackage(String account, String irisPackage, String node){
		return this.serviceDAO.addPackage(account, irisPackage, node);
	}

	public void setServiceDAO(ServiceDAO serviceDAO) {
		this.serviceDAO = serviceDAO;
	}
}
