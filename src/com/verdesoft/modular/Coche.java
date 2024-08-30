package com.verdesoft.modular;

public class Coche {
	int numeroRuedas = 4; // Ambas formas de inicializar por defecto son válidas, pero tienen efectos diferentes ante sobrecarga de métodos
	String modelo;
	String color;
	int km;
	String propietario;
	boolean itvOK; 

	/**
	 * @param color
	 * @param km
	 * @param propietario
	 */
	public Coche(String modelo, String color, int km, String propietario) {
		this.modelo = modelo;
		this.color = color;
		this.km = km;
		this.propietario = propietario;
		itvOK = true; // Ambas formas de inicializar por defecto son válidas, pero tienen efectos diferentes ante sobrecarga de métodos
		
	}
	
	public Coche() { // Como puede verse el constructor de esta clase se encuentra sobrecargado.
			
		}

}
