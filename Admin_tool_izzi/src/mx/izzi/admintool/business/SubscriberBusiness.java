package mx.izzi.admintool.business;

import java.util.List;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;

public interface SubscriberBusiness {
	public Subscriber findSubscriber(Long irisId, String region);
	public Subscriber findSubscriber(String account, String region);
	
	public List<Subscription> getSubscriptions(String account, String region);
	
	public List<CustomerPremisesEquipment> getCPEs(String account, String region);
	
	public void activateSubscriber(String subscriber, String region);
	
	public boolean newSubscriber(String account, String region);
	public void deleteSubscriber(String account, String region);
}
