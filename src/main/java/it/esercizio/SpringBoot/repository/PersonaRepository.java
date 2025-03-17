package it.esercizio.SpringBoot.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import it.esercizio.SpringBoot.model.PersonaImpl;

@Component("reppersona")
public class PersonaRepository {

	private Map<Integer, PersonaImpl> tabPersona = new HashMap<Integer, PersonaImpl>();
	private static Integer id;
	
	
	public PersonaRepository() {
		
		id = 0;
		
	}
	
	public void insert(PersonaImpl p) {
		
		tabPersona.put(id, p);
		id++;
		
	}
	
	public PersonaImpl selectId(Integer id) {
		
		return tabPersona.get(id);
		
	}
	
	public Map<Integer, PersonaImpl> selectAll() {
		
		return tabPersona;
		
	}
	
	public boolean updateNome(Integer i, String newNome) {
		
		if(!tabPersona.isEmpty() && tabPersona.containsKey(i)) {
			
			tabPersona.get(i).setNome(newNome);
			
			return true;
			
		}
		
		return false;
		
	}

	public boolean updateCilindrata(Integer i, String newCognome) {
		
		if(!tabPersona.isEmpty() && tabPersona.containsKey(i)) {
			
			tabPersona.get(i).setCognome(newCognome);
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean update(Integer i, String newNome, String newCognome) {
		
		if(!tabPersona.isEmpty() && tabPersona.containsKey(i)) {
			
			tabPersona.get(i).setNome(newNome);
			tabPersona.get(i).setCognome(newCognome);
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean deleteId(Integer i) {
		
		if(!tabPersona.isEmpty() && tabPersona.containsKey(i)) {
			
			tabPersona.remove(i);
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean deleteAll() {
		
		if(!tabPersona.isEmpty()) {
			
//			tabPersona.forEach((Integer, PersonaImpl) -> {
//				
//				tabPersona.remove(tabPersona.val);
//				
//			});
			
			for(Integer key : tabPersona.keySet()) {
				
				tabPersona.remove(key);
				
			}
			
			return true;
			
		}
		
		return false;
		
	}
	
}
