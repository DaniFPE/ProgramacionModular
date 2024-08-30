package com.verdesoft.herencia;

public class Moto extends Vehiculo {
	public static final int NUM_RUEDAS = 2;
	private boolean carenado;
	
	public Moto(String matricula, String marca, String modelo, float potencia, int kilometros, boolean carenado) {
		super(matricula, marca, modelo, potencia, kilometros); // Atención, podemos tener acceso al construtor por el hecho de ser público.
		this.carenado = carenado;
	}
	
}
