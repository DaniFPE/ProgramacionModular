package com.verdesoft.modular;

public class Punto {
	
	public static final double PI = 3.1415; // Ejemplo para declarar una constante
	private static int numeroInstancias; // Ejemplo para una variable de clase
	
	private int x, y;
	
	static { // Ejemplo de bloque de código estático para inciar variables de clase.
		// Todas las variable estáticas podrían iniciarse aquí
		Punto.numeroInstancias = 0;
	}
	
	// Contructores: Deben incrementar el atributo numeroInstancias para llevar cuenta de ellas.
	/**
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
		Punto.numeroInstancias++;
	}
	
	public static int instanciasCreadas() {
		return Punto.numeroInstancias; // Acceso a la variable de clase a través del nombre de la clase
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
