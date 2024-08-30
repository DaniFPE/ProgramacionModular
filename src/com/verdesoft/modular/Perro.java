package com.verdesoft.modular;

public class Perro {

	/* Atributos o variables de instancia*/
	private String nombre;
	private Persona dueño;
	private String raza;
	private int edad;
	private char sexo;
	
	/**
	 * Constructor de la clase perro con parámetros.
	 * @param nombre
	 * @param dueño
	 * @param raza
	 * @param edad
	 * @param sexo
	 */
	public Perro(String nombre, Persona dueño, String raza, int edad, char sexo) {
		this.nombre = nombre;
		this.dueño = dueño;
		this.raza = raza;
		this.edad = edad;
		this.sexo = sexo;
	}

	/* Getters y Setters de los atributos necesarios*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	/* Otros métodos */
	public void cumplirAños() {
		edad++;
	}
	
	public void darLaPatita() {
		System.out.println("El perro da la patita...");
	}
	
	public void hacerseElMuerto() {
		System.out.println("El perro se hace el muerto...");
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", dueño=" + dueño + ", raza=" + raza + ", edad=" + edad + ", sexo=" + sexo
				+ "]";
	}

	/* Ejemplos de sobrecarga de métodos */
	public void cambiar(String nombre)
    {
        this.nombre = nombre;
    }

    public void cambiar(int edad)
    {
        this.edad = edad;
    }
    
    public void cambiar(char sexo)
    {
        this.sexo = sexo;
    }


    public void cambiar(String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
	
	
}
