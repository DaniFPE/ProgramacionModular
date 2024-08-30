package com.verdesoft.modular;

public class ClaseConConstructor {
	// Estos son los atributos
	int alumno;
	String atributo1;
	boolean flag;
	int cuadrado;
	
	public ClaseConConstructor(int alumno, String atributo1) {
		this.alumno = alumno;
		this.atributo1 = atributo1;
		this.flag = true;
		this.cuadrado = this.alumno * this.alumno;
	}
	
	
	public void metodo1() {
		
	}
	
	public int metodo2() {
		return 1;
	}
	

}
