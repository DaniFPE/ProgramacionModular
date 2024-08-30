package com.verdesoft.herencia;

public class Coche extends Vehiculo {
	public static final int NUM_RUEDAS = 4;
	private int numPuertas;
	
	public Coche(String matricula, String marca, String modelo, float potencia, int kilometros, int numPuertas) {
		super(matricula, marca, modelo, potencia, kilometros);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

}
