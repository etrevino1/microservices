package mx.izzi.admintool.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.ActivationBusiness;

public class ActivateSubscriberAction extends ActionSupport {

	static final long serialVersionUID = 741852963;

//	private String subscriber = null, node = null;
	private ActivationBusiness activationBusiness = null;


	public String execute(){
		activationBusiness.activateAccount((String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account"), (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node"));
		return SUCCESS;
	}

	public void setActivationBusiness(ActivationBusiness activationBusiness) {
		this.activationBusiness = activationBusiness;
	}

}
