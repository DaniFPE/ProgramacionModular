package com.verdesoft.herencia;

public enum Planeta {
	
	MERCURIO(3.303e+23, 2.4397e6), 
	VENUS(4.869e+24, 6.0518e6), 
	TIERRA(5.976e+24, 6.37814e6), 
	MARTE(6.421e+23, 3.3972e6),
	JUPITER(1.9e+27, 7.1492e7), 
	SATURNO(5.688e+26, 6.0268e7), 
	URANO(8.686e+25, 2.5559e7), 
	NEPTUNO(1.024e+26, 2.4746e7),
	PLUTON(1.27e+22, 1.137e6);

	public static final double G = 6.67300E-11; // constante universal de gravedad
	public final double masa; // in kilogramos
	public final double radio; // in metros

	private Planeta(double mass, double radius) {
		this.masa = mass;
		this.radio = radius;
	}

	public double gravedadSuperficie() {
		return G * this.masa / (this.radio * this.radio);
	}
	
	public double pesoSuperficie(double masa) {
		return masa * this.gravedadSuperficie();
	}
	
}

