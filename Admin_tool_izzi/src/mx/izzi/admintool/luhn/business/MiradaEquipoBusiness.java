package mx.izzi.admintool.luhn.business;

import java.util.List;

import mx.izzi.admintool.luhn.dto.Equipment;

public interface MiradaEquipoBusiness {
	public String getFinalCAID(String equipo);
	public List<Long> getFinalCAIDs(String inicial, String ultimo);
	public List<Equipment> getEquipmentList(String equipmentSerialNumber, String equipmentECMMac, String equipmentNDS, Integer cantidad);
}

