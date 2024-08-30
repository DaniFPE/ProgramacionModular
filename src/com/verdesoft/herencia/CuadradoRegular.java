package com.verdesoft.herencia;

public class CuadradoRegular extends FiguraRegular {

	public CuadradoRegular() {
		super();
		this.setNumeroDeLados(4);
	}
	
	public CuadradoRegular(double longitudLado) {
		super(longitudLado);
		this.setNumeroDeLados(4);
		this.setPerimetro(this.calcularPerimetro());
		this.setArea(this.calcularArea());
	}

	@Override
	public double calcularArea() {
		return Math.pow(getLongitudLado(), 2);
	}

	@Override
	public double calcularPerimetro() {
		return this.getNumeroDeLados()*this.getLongitudLado();
	}

}

