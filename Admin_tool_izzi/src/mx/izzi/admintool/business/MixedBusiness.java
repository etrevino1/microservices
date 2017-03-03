package mx.izzi.admintool.business;

import tv.mirada.www.iris.core.types.Subscriber;

public interface MixedBusiness {
	public void activateAccount(String subscriber, String node);
	public Subscriber findCPESubscriber(String hardwareId, String node);
}
