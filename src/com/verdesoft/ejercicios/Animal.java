package com.verdesoft.ejercicios;

public class Animal {
	private String especie;
	private char sexo;
	private int peso;
	
	
	/**
	 * Constructor para la clase Animal.
	 * @param sexo
	 * @param peso
	 */
	public Animal(char sexo, int peso) {
		this.sexo = sexo;
		this.peso = peso;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
		
	

}
