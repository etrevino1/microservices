package mx.izzi.admintool.business.impl;

import java.util.List;

import mx.izzi.admintool.business.ActivationBusiness;
import mx.izzi.admintool.business.SubscriberBusiness;
import mx.izzi.admintool.dao.IRDCommandsDAO;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class ActivationBusinessImpl implements ActivationBusiness {

	private SubscriberBusiness subscriberBusiness = null;

	private IRDCommandsDAO iRDCommandsDAO = null;

	@Override
	public void activateAccount(String subscriber, String node) {
		//getEquipments
		List<CustomerPremisesEquipment> equipos = subscriberBusiness.getCPEs(subscriber, node);
		//activateSubscriber
		subscriberBusiness.activateSubscriber(subscriber, node);
		//ActivateCPEs & RebootCPEs
		for(CustomerPremisesEquipment equipo :equipos){
			if(equipo.getHardwareId().length() == 16){
				iRDCommandsDAO.enableSTB(equipo.getHardwareId());
				iRDCommandsDAO.rebootSTB(equipo.getHardwareId());
			}
		}
	}

	public void setSubscriberBusiness(SubscriberBusiness subscriberBusiness) {
		this.subscriberBusiness = subscriberBusiness;
	}

	public void setiRDCommandsDAO(IRDCommandsDAO iRDCommandsDAO) {
		this.iRDCommandsDAO = iRDCommandsDAO;
	}
}
