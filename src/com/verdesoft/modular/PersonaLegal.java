package com.verdesoft.modular;

public class PersonaLegal {
	/* Atributos de instancia */
	private int años;
	private char sexo;
	private String dni;
	
	/* Atributos de clase */
	public static int mayoriaEdad = 18;
	public static boolean igualdadAnteLaLey = true;
	
	public PersonaLegal(int años, char sexo, String dni) {
		this.años = años;
		this.sexo = sexo;
		this.dni = dni;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public static int getMayoriaEdad() {
		return mayoriaEdad;
	}

	public static void setMayoriaEdad(int mayoriaEdad) {
		PersonaLegal.mayoriaEdad = mayoriaEdad;
	}

	public static boolean isIgualdadAnteLaLey() {
		return igualdadAnteLaLey;
	}

	public static void setIgualdadAnteLaLey(boolean igualdadAnteLaLey) {
		PersonaLegal.igualdadAnteLaLey = igualdadAnteLaLey;
	}

	@Override
	public String toString() {
		return "PersonaLegal [años=" + años + ", sexo=" + sexo + ", dni=" + dni + "]";
	}
	
	
	
	
	
	

}
