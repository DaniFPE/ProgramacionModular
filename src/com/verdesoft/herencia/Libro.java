package com.verdesoft.herencia;

public class Libro implements StockLibreria {
	
	private static int numEjemplaresDiferentes=0;
	private int numPaginas;
	private String autor;
	private String titulo;
	private String editorial;
	private String articuloId;
	private int numDisponible;
	private double precioCompra;
	private double  precioVenta;
	
	/**
	 * @param numPaginas
	 * @param autor
	 * @param titulo
	 * @param editorial
	 * @param articuloId
	 * @param numDisponible
	 * @param precioCompra
	 * @param precioVenta
	 */
	public Libro(int numPaginas, String autor, String titulo, String editorial, String articuloId, int numDisponible,
			double precioCompra, double precioVenta) {
		this.numPaginas = numPaginas;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
		this.articuloId = articuloId;
		this.numDisponible = numDisponible;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		Libro.numEjemplaresDiferentes++;
	}

	public Libro() {
		// El constructor vacio
		Libro.numEjemplaresDiferentes++;
	}

	@Override
	public String getArticuloId() {
		return this.articuloId;
	}

	@Override
	public int getNumDisponible() {
		// TODO Auto-generated method stub
		return this.numDisponible;
	}

	@Override
	public double getPrecioCompra() {
		// TODO Auto-generated method stub
		return this.precioCompra;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.precioVenta;
	}

	@Override
	public void comprarEjemplares(int numEjemplares) {
		this.numDisponible += numEjemplares;
		System.out.println("Hemos realizado el pedido de " + numEjemplares + " nuevos ejemplares.");

	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public static int getNumEjemplaresDiferentes() {
		return numEjemplaresDiferentes;
	}

	public void setArticuloId(String articuloId) {
		this.articuloId = articuloId;
	}

	public void setNumDisponible(int numDisponible) {
		this.numDisponible = numDisponible;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Libro [numPaginas=" + numPaginas + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
				+ editorial + ", articuloId=" + articuloId + ", numDisponible=" + numDisponible + ", precioCompra="
				+ precioCompra + ", precioVenta=" + precioVenta + "]";
	}
	
	
}
