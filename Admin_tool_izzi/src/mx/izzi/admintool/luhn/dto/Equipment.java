package mx.izzi.admintool.luhn.dto;

public class Equipment {
	private String equipmentSerialNumber;
	private String equipmentECMMac;
	private Long equipmentNDS;
	
	public Equipment(String equipmentSerialNumber, String equipmentECMMac, Long equipmentNDS){
		super();
		this.equipmentSerialNumber = equipmentSerialNumber;
		this.equipmentECMMac = equipmentECMMac;
		this.equipmentNDS = equipmentNDS;
	}
	
	@Override
	public String toString(){
		return "Equipment={ " + equipmentSerialNumber + ", " + equipmentNDS + ", "+ equipmentECMMac + "}";
	}
}
