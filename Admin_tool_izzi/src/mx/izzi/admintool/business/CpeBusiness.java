package mx.izzi.admintool.business;

public interface CpeBusiness {
	public boolean deleteCPE(String irisId, String node);
	public boolean addCPE(String account, String hardwareId, String type, String node);
}
