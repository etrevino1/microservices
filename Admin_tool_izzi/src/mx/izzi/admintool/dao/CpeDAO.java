package mx.izzi.admintool.dao;

public interface CpeDAO {
	public boolean deleteCPE(String irisId);
	public boolean addCPE(String account, String hardwareId, String type);
	
	public boolean deleteCPE(String irisId, String node);
	public boolean addCPE(String account, String hardwareId, String type, String node);
}
