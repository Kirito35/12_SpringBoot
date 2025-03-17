package it.esercizio.SpringBoot.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import it.esercizio.SpringBoot.model.MacchinaImpl;

@Component("repmacchina")
public class MacchinaRepository {

	private Map<Integer, MacchinaImpl> tabMacchina = new HashMap<Integer, MacchinaImpl>();
	private static Integer id;
	
	
	public MacchinaRepository() {
		
		id = 0;
		
	}
	
	public void insert(MacchinaImpl m) {
		
		tabMacchina.put(id, m);
		id++;
		
	}
	
	public MacchinaImpl selectId(Integer id) {
		
		return tabMacchina.get(id);
		
	}
	
	public Map<Integer, MacchinaImpl> selectAll() {
		
		return tabMacchina;
		
	}
	
	public boolean updateModello(Integer i, String newModello) {
		
		if(!tabMacchina.isEmpty() && tabMacchina.containsKey(i)) {
			
			tabMacchina.get(i).setModello(newModello);
			
			return true;
			
		}
		
		return false;
		
	}

	public boolean updateCilindrata(Integer i, float newCilindrata) {
		
		if(!tabMacchina.isEmpty() && tabMacchina.containsKey(i)) {
			
			tabMacchina.get(i).setCilindrata(newCilindrata);
			
			return true;
			
		}

		return false;
		
	}
	
	public boolean update(Integer i, String newModello, float newCilindrata) {
		
		if(!tabMacchina.isEmpty() && tabMacchina.containsKey(i)) {
			
			tabMacchina.get(i).setModello(newModello);
			tabMacchina.get(i).setCilindrata(newCilindrata);
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean deleteId(Integer i) {
		
		if(!tabMacchina.isEmpty() && tabMacchina.containsKey(i)) {
			
			tabMacchina.remove(i);
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean deleteAll() {
		
		if(!tabMacchina.isEmpty()) {
			
//			tabPersona.forEach((Integer, PersonaImpl) -> {
//				
//				tabPersona.remove(tabPersona.val);
//				
//			});
			
			for(Integer key : tabMacchina.keySet()) {
				
				tabMacchina.remove(key);
				
			}
			
			return true;
			
		}
		
		return false;
		
	}
	
}
