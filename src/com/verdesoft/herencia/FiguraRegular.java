package com.verdesoft.herencia;

public abstract class FiguraRegular {
	
	private int numeroDeLados;
	private double area;
	private double perimetro;
	private double longitudLado;
	
	/**
	 * @param longitudLado
	 */
	public FiguraRegular(double longitudLado) {
		this.longitudLado = longitudLado;
	}

	public FiguraRegular() {
		
	}
	
	protected int getNumeroDeLados() {
		return this.numeroDeLados;
	}

	protected void setNumeroDeLados(int numeroDeLados) {
		this.numeroDeLados = numeroDeLados;
	}

	public double getArea() {
		return area;
	}

	protected void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	protected void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
	}
	
	// Métodos abstractos por implementar
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	

}
