package mx.izzi.admintool.dao;

import java.util.List;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;

public interface SubscriberDAO {

	public boolean newSubscriber(String account);
	public void deleteSubscriber(String account);
	public Subscriber findSubscriberRequest(String account);
	public Subscriber findSubscriberRequest(Long irisId);	
	public void activateSubscriber(String subscriber);
	public List<Subscription> findSubscriberSubscriptions(String account);
	public void findSubscriberSubscriptions(Long irisId);
	public  List<CustomerPremisesEquipment> findSubscriberCPEs(String account);
	
	
	public boolean newSubscriber(String account, String region);
	public void deleteSubscriber(String account, String region);
	public Subscriber findSubscriberRequest(Long irisId, String region);
	public Subscriber findSubscriberRequest(String account, String Region);
	public void activateSubscriber(String subscriber, String region);
	public List<Subscription> findSubscriberSubscriptions(String account, String region);
	public  List<CustomerPremisesEquipment> findSubscriberCPEs(String account, String region);
}
