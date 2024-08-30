package com.verdesoft.relaciones;

public class ClaseA {
	
	public String cabeceraMensaje;
	public String cuerpoMensaje;
	
	public String crearMensaje() {
		
		return String.format("%s\n%s", this.cabeceraMensaje, this.cuerpoMensaje);
	}

}
