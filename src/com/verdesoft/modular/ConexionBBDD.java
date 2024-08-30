package com.verdesoft.modular;

/*
 * Algunos ejemplos de atributos y métodos estáticos.
 */
public class ConexionBBDD {
	
	private static String host = "127.0.0.1";
	private String user;
	private String pass;
	private String databaseName;
	
	public ConexionBBDD() {
		// Constructor vacio
	}

	/**
	 * @param user
	 * @param pass
	 * @param databaseName
	 */
	public ConexionBBDD(String user, String pass, String databaseName) {
		this.user = user;
		this.pass = pass;
		this.databaseName = databaseName;
	}

	@Override
	public String toString() {
		return "ConexionBBDD (host=" + host + ") [user=" + user + ", pass=" + pass + ", databaseName=" + databaseName + "]";
	}
	
	public static void activarRespaldo() {
		ConexionBBDD.host = "127.1.1.1";
		System.out.println("Nuevo host activo...");
	}

}
