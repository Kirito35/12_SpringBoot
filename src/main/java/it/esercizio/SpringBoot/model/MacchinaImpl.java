package it.esercizio.SpringBoot.model;

import org.springframework.stereotype.Component;

@Component("macchina")
public class MacchinaImpl implements Macchina {

	private String modello;
	private float cilindrata;
	//private int id;
	
	public MacchinaImpl(String modello, float cilindrata) {
		super();
		this.modello = modello;
		this.cilindrata = cilindrata;
		//this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public float getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	@Override
	public String toString() {
		return "MacchinaImpl [modello: " + modello + ", cilindrata: " + cilindrata + "]";
	}
	
	
	
}
