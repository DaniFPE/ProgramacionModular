package com.verdesoft.herencia;

public interface StockLibreria {

	public String getArticuloId();
	public int getNumDisponible();
	public double getPrecioCompra();
	public double getPrecioVenta();
	public void comprarEjemplares(int numEjemplares);
	
}
