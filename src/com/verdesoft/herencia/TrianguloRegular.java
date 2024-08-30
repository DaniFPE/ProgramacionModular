package com.verdesoft.herencia;

public class TrianguloRegular extends FiguraRegular {

	public TrianguloRegular() {
		super();
		this.setNumeroDeLados(3);
	}
	
	public TrianguloRegular(double longitudLado) {
		super(longitudLado);
		this.setNumeroDeLados(3);
		this.setPerimetro(this.calcularPerimetro());
		this.setArea(this.calcularArea());
	}

	@Override
	public double calcularArea() {
		return (Math.sqrt(3)/4) * getLongitudLado();
	}

	@Override
	public double calcularPerimetro() {
		return this.getNumeroDeLados()*this.getLongitudLado();
	}

}
