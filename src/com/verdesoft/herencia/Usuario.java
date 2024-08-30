package com.verdesoft.herencia;

public class Usuario {
	private String userName;
	private String pass;
	private String email;
	private boolean suscrito;
	
	public Usuario() {
		
	}
	
	public Usuario(String userName, String pass, String email, boolean suscrito) {
		this.userName = userName;
		this.pass = pass;
		this.email = email;
		this.suscrito = suscrito;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isSuscrito() {
		return suscrito;
	}

	public void setSuscrito(boolean suscrito) {
		this.suscrito = suscrito;
	}

	public String getUserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "Usuario [userName=" + userName + ", pass=" + pass + ", email=" + email + ", suscrito=" + suscrito + "]";
	}
	
	public void metodoDemostracion() {
		System.out.println("Demostracion");
	}
	
	
	
	
	
	

}
