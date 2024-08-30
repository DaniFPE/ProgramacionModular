package com.verdesoft.modular;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	
	public void saludar() {
		System.out.println("Buenos dias!!");
	}
	
	public void caminar(int pasos) {
		System.out.println("Soy " + nombre + " y hoy he caminado " + pasos + " pasos.");
	}
	
	public int getEdad() {
		return edad;
	}
}
