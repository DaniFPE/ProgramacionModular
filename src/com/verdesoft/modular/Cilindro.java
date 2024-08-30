package com.verdesoft.modular;

public class Cilindro {
	private double altura;
	private double radio;
	private double areaBase;
	private double areaLateral;
	private double superficie;
	private double volumen;
	
	/**
	 * @param altura
	 * @param radio
	 */
	public Cilindro(double altura, double radio) {
		super();
		this.altura = altura;
		this.radio = radio;
		this.areaBase = this.calculateAreaBase();
		this.areaLateral = this.calculateAreaLateral();
		this.superficie = this.calculateSuperficie();
		this.volumen = this.calculateVolumen();
	}
	
	public double calculateAreaBase() {
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	public double calculateAreaLateral() {
		return 2 * Math.PI * this.radio * this.altura;
	}

	public double calculateSuperficie() {
		return 2 * this.areaBase + this.areaLateral;
	}
	
	public double calculateVolumen() {
		return this.areaBase * this.altura;
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		this.areaLateral = calculateAreaLateral();
		this.superficie = calculateSuperficie();
		this.volumen = calculateVolumen();
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
		this.areaLateral = calculateAreaLateral();
		this.areaBase = calculateAreaBase();
		this.superficie = calculateSuperficie();
		this.volumen = calculateVolumen();
	}

	public double getAreaBase() {
		return areaBase;
	}

	public double getAreaLateral() {
		return areaLateral;
	}

	public double getSuperficie() {
		return superficie;
	}

	public double getVolumen() {
		return volumen;
	}
	
}
