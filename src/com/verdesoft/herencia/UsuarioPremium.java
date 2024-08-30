package com.verdesoft.herencia;

public class UsuarioPremium extends Usuario {
	boolean accesoPremium;
	double cuota;
	
	public UsuarioPremium(String userName, String pass, String email, boolean suscrito, boolean accesoPremium,
			double cuota) {
		super(userName, pass, email, suscrito);
		this.accesoPremium = accesoPremium;
		this.cuota = cuota;
	}
	
	public void conexionPremium() {
		System.out.println("Conexion Premium!!");
	}

	@Override
	public void metodoDemostracion() {
		super.metodoDemostracion();
		System.out.println("Desde la clase hija");
	}
	
	
	
	
	
	
	
}
