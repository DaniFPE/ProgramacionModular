package com.verdesoft.herencia;

import com.verdesoft.modular.Perro;
import com.verdesoft.modular.Persona;

public class PerroDomestico extends Perro implements Domesticable {

	public PerroDomestico(String nombre, Persona dueño, String raza, int edad, char sexo) {
		super(nombre, dueño, raza, edad, sexo);
	}

	@Override
	public void ovedecer() {
		System.out.println("El perro obedece fielmente a su dueño.");

	}

	@Override
	public void comer() {
		System.out.println("El perro come la comida que le da su dueño.");
	}

	@Override
	public void criar() {
		System.out.println("El perro esta castrado y no puede criar.");
	}

}
