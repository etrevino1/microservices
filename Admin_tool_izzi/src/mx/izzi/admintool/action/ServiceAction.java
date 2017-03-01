package mx.izzi.admintool.action;

import mx.izzi.admintool.business.ServiceBusiness;

import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServiceAction extends ActionSupport {
	static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());
	
	private ServiceBusiness serviceBusiness;
	
	private String irisId = null, account = null, irisPackage = null, node = null;
	
	public String execute(){
		log.debug("Service iris Id" + irisId);
		this.serviceBusiness.deletePackage(irisId, node);
		irisId=null;
		return SUCCESS;
	}
	
	public String addPackage(){
		log.debug("Service irisPackage:" + irisPackage);
		log.debug("Service account:" + account);
		this.serviceBusiness.addPackage(account, irisPackage, node);
		return SUCCESS;
	}
	
	public void validate(){
		account = (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account");
		node = (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node");
	}
	
	public void setIrisPackage(String irisPackage) {
		this.irisPackage = irisPackage;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	public void setIrisId(String irisId) {
		this.irisId = irisId;
	}
	
	public void setServiceBusiness(ServiceBusiness serviceBusiness) {
		this.serviceBusiness = serviceBusiness;
	}
}
