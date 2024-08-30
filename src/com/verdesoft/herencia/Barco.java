package com.verdesoft.herencia;

public class Barco extends Vehiculo {
	
	private int numeroAnclas;
	private int eslora;
	private String tipoTimon;

	public Barco(String matricula, String marca, String modelo, float potencia, int kilometros, int numeroAnclas,
			int eslora, String tipoTimon) {
		super(matricula, marca, modelo, potencia, kilometros);
		this.numeroAnclas = numeroAnclas;
		this.eslora = eslora;
		this.tipoTimon = tipoTimon;
	}

	public int getNumeroAnclas() {
		return numeroAnclas;
	}

	public void setNumeroAnclas(int numeroAnclas) {
		this.numeroAnclas = numeroAnclas;
	}

	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public String getTipoTimon() {
		return tipoTimon;
	}

	public void setTipoTimon(String tipoTimon) {
		this.tipoTimon = tipoTimon;
	}
	
	public void navegar(int km) {
		System.out.println("Navega tantos kilometros:" + km);
	}

	@Override
	public void apagarMotor() {
		// TODO Auto-generated method stub
		super.apagarMotor();
		System.out.println("Nos hundimos!!");
	}
	
	
	
	
	
	
	
	

}
