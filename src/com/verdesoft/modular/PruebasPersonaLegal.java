package com.verdesoft.modular;

public class PruebasPersonaLegal {

	public static void main(String[] args) {
		
		PersonaLegal dani = new PersonaLegal(23, 'm', "932478342B");
		PersonaLegal david = new PersonaLegal(55, 'm', "123974342B");
		
		System.out.println(dani);
		System.out.println(david);
		
		System.out.println(dani.mayoriaEdad);
		System.out.println(david.mayoriaEdad);

		PersonaLegal.mayoriaEdad = 21;
		
		System.out.println(dani.mayoriaEdad);
		System.out.println(david.mayoriaEdad);
		
		dani.mayoriaEdad = 18;
		
		System.out.println(dani.mayoriaEdad);
		System.out.println(david.mayoriaEdad);
		
	}

}
