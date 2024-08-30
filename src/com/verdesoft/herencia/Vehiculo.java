package com.verdesoft.herencia;
import java.time.LocalDate;

public class Vehiculo {
	public static int NUM_RUEDAS;
	private String matricula;
	private String marca;
	private String modelo;
	private float potencia;
	private int kilometros;
	private int litrosDeposito;
	private LocalDate ultimaRevision;

	/**
	 * Constructor de la clase
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param potencia
	 * @param kilometros
	 */
	public Vehiculo(String matricula, String marca, String modelo, float potencia, int kilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.kilometros = kilometros;
		this.ultimaRevision = LocalDate.now();
	}
	
	/* Getters y setters */
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public int getLitrosDeposito() {
		return litrosDeposito;
	}

	public void setLitrosDeposito(int litrosDeposito) {
		this.litrosDeposito = litrosDeposito;
	}

	public LocalDate getUltimaRevision() {
		return ultimaRevision;
	}

	public void setUltimaRevision(LocalDate ultimaRevision) {
		this.ultimaRevision = ultimaRevision;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia
				+ ", kilometros=" + kilometros + ", litrosDeposito=" + litrosDeposito + ", ultimaRevision="
				+ ultimaRevision + "]";
	}

	/* Otros métodos */
	public void arrancarMotor() {
		System.out.println("Vehiculo arranca motor...");
	}
	
	public void repostar(int nLitros) {
		System.out.println(String.format("Repostando %d litros.", nLitros));
	}
	
	public void apagarMotor() {
		System.out.println("Vehiculo apaga motor...");
	} 
	
}
