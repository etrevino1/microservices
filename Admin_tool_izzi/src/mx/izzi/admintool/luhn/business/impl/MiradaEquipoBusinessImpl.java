package mx.izzi.admintool.luhn.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
//import org.apache.tomcat.util.buf.HexUtils;

import mx.izzi.admintool.luhn.business.MiradaEquipoBusiness;
import mx.izzi.admintool.luhn.dto.Equipment;

public class MiradaEquipoBusinessImpl implements MiradaEquipoBusiness{

	private Logger log = Logger.getLogger(this.getClass());
	
	public String getFinalCAID(String equipo){
		log.debug("en business simple");
		return calculoLuhn(equipo);
	}
	
	public List<Long> getFinalCAIDs(String inicial, String ultimo){
		log.debug("en business multiple");
		long lInicial = Long.parseLong(inicial), lUltimo = Long.parseLong(ultimo);
		List<Long> lista = new ArrayList<Long>();
		while(lInicial <= lUltimo){
			lista.add(Long.parseLong(calculoLuhn(lInicial + "")));
			lInicial++;
			log.debug(lInicial);
		}
		
		return lista;
	}
	
	public List<Equipment> getEquipmentList(String equipmentSerialNumber, String equipmentECMMac, String equipmentNDS, Integer cantidad){
		
		log.debug("en business equipo");
		List<Equipment> equipmentList = new ArrayList<Equipment>();
		long initialEquipment = Long.parseLong(equipmentNDS);
//		log.error(HexUtils.fromHexString(equipmentECMMac));
		
		for(int i = 0; i < cantidad; i++, initialEquipment++){
			
			Equipment current = new Equipment("1", "0", Long.parseLong(calculoLuhn(initialEquipment + "")));

			equipmentList.add(current);
			log.error(current);
		}
		
		
		return equipmentList;
	}
	
	
	private String calculoLuhn (String equipo){
		char[] digitos = new char[16];
		int suma = 0;
		equipo.getChars(0, 15, digitos, 0);
		
		
		for(int i = 14; i >= 0; i--){
			if(i % 2 > 0){
				suma += Integer.parseInt(digitos[i] + "");
			}else{
				
				int temporal = (Integer.parseInt(digitos[i] + "") * 2);
				if(temporal > 9){
					
					char cTemporal[] =(temporal + "").toCharArray();
					temporal = Integer.parseInt(cTemporal[0] + "") + Integer.parseInt(cTemporal[1] + "");
				}
				suma += temporal;
			}
			log.debug(suma);
		}
		
		digitos[15] = ((suma * 9 % 10) + "").charAt(0);
		log.debug(new String(digitos));
		return new String(digitos);
	}
	
}
