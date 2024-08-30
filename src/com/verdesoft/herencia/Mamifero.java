package com.verdesoft.herencia;

public class Mamifero extends Animal{

	public Mamifero() {
		super("Animalia");
	}
	
	@Override
	public void desplazarse() {
		System.out.println("El mamifero corre...");
	}
	

}
