package com.verdesoft.herencia;

public class Animal {
	public static final String FILO = "CORDADOS";
	private String clase;
	
	/**
	 * @param filo
	 */
	public Animal(String clase) {
		this.clase = clase;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	
	/* Resto de métodos */
	
	public void desplazarse() {
		System.out.println("El animal de desplaza...");
	}
	
}
