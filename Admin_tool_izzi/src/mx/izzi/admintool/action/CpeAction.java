package mx.izzi.admintool.action;

import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.CpeBusiness;

public class CpeAction extends ActionSupport {
	static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());
	
	private String irisId = null, account = null, hardwareId = null, type = null, node = null;
	
	private CpeBusiness cpeBusiness;
	
	public String execute(){
		log.debug("CPE iris Id" + irisId);
		this.cpeBusiness.deleteCPE(irisId, node);
		irisId=null;
		return SUCCESS;
	}
	
	public String addCPE(){
		log.debug("CPE HardwareId " + hardwareId);
		log.debug("CPE Type " + type);
		
		this.cpeBusiness.addCPE(account, hardwareId, type, node);
		
		return SUCCESS;
	}
	
	public void validate(){
		account = (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account");
		node = (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node");
	}
	
	
	
	public void setCpeBusiness(CpeBusiness cpeBusiness) {
		this.cpeBusiness = cpeBusiness;
	}

	public String getIrisId() {
		return irisId;
	}

	public void setIrisId(String irisId) {
		this.irisId = irisId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
