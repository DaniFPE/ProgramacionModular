package com.verdesoft.herencia;

public enum EstacionesAño {
	
	PRIMAVERA(22, 119),
	VERANO(30, 121),
	OTOÑO(19, 122),
	INVIERNO(10, 40);
	
	double temperaturaMedia;
	int numeroDeDias;
	
	private EstacionesAño(double temperaturaMedia, int numeroDeDias) {
		this.temperaturaMedia = temperaturaMedia;
		this.numeroDeDias = numeroDeDias;
	}
	
	
	

}
