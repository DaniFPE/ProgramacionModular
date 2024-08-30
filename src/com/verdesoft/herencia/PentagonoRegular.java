package com.verdesoft.herencia;

public class PentagonoRegular extends FiguraRegular {

	public PentagonoRegular(double longitudLado) {
		super(longitudLado);
	}

	@Override
	public double calcularPerimetro() {
		return this.getLongitudLado()*5;
	}

	@Override
	public double calcularArea() {
		return 0;
	}

}
