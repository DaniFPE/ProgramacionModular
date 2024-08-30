package com.verdesoft.herencia;

public class Esfera extends Circulo{
	private static final double PI = 3.14;
	
	Esfera(double radio) {
		super(radio);
	}

	@Override
	public double calculateSuperficie() {
		double superficieCirculo = super.calculateSuperficie(); // S_esfera = 4*pi*r^2
		return 4 * superficieCirculo;
	}
	
	public static void showDiferenceBetweenPI() {
		double PICirculo = Circulo.PI;
		double PIEsfera = Esfera.PI;
		System.out.println("PI Circulo: " + PICirculo + "; PI Esfera: " + PIEsfera);
	}

}
