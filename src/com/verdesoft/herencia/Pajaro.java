package com.verdesoft.herencia;

public class Pajaro extends Animal {

	
	public Pajaro() {
		super("Aves");
	}
	
	@Override
	public void desplazarse() {
		System.out.println("El pajaro vuela...");
		
	}
	

}
