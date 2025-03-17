package it.esercizio.SpringBoot.model;

import org.springframework.stereotype.Component;

@Component("persona")
public class PersonaImpl implements Persona{

	private String nome;
	private String cognome;
	//private int id;
	
	public PersonaImpl(String nome, String cognome) {
		
		this.nome = nome;
		this.cognome = cognome;
		//this.id = id;
		
	}

	@Override
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
//
//	@Override
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	@Override
	public String toString() {
		return "PersonaImpl [nome: " + nome + ", cognome: " + cognome + "]";
	}
	
	
	
}
