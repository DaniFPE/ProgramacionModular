package com.verdesoft.herencia;

public class Circulo {
	private double radio;
	public static final double PI = 3.1416;
	
	Circulo(double radio){
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calculateSuperficie(){
		return Circulo.PI * Math.pow(this.radio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
}
