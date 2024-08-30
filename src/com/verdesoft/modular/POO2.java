package com.verdesoft.modular;

import java.util.Arrays;

public class POO2 {

	public static void main(String[] args) {
		/* Abordamos aqui la segunda parte del tema referente a POO 
		 * Veremos el funcionamiento de la sobrecarga de métodos, los
		 * métodos y atributos estáticos, el funcionamiento de paquetes,
		 * librerias y los imports y algunas clases importantes de Java */		
		System.out.println("String de entrada en formato array:");
		String[] stringEntrada = {"Esto ", "es ", "un ", "ejemplo!"};
		
		System.out.println(Arrays.toString(stringEntrada));
		System.out.println();
		

		// Ejemplo de sobrecarga sobre un constructor de la clase StringOperations
		// Vacio
		StringOperations strOperations1 = new StringOperations();
		// Por parametro
		StringOperations strOperations2 = new StringOperations("Esto es ", "un ejemplo!");
		// Con array
		StringOperations strOperations3 = new StringOperations(stringEntrada);
		
		System.out.println("Inicio vacio y asignamos con el setter el StringArray.");
		strOperations1.setStringArray(stringEntrada);
		System.out.println("Usamos el método concat:");
		System.out.println(strOperations1.concat());
		System.out.println();
		
		System.out.println("Inicio con constructor de dos strings.");
		System.out.println("Usamos el método concat:");
		System.out.println(strOperations2.concat());
		System.out.println();
		
		System.out.println("Inicio con constructor de string array.");
		System.out.println("Usamos el método concat:");
		System.out.println(strOperations3.concat());
		System.out.println();
		
		// Muchos métodos tienen sobrecarga. Por ejemplo este método funciona igual con Char que con String.
		String sEjemplo = "String de ejemplo.";
		System.out.println(sEjemplo.indexOf("d"));
		System.out.println(sEjemplo.indexOf('d'));
		System.out.println();
		
		// Otro ejmplo podemos verlo en la clase Perro donde hemos implementado un método denominado
		// cambiar que permite cambiar tres de los atributos principales del perro al ser cada uno de estos
		// de un tipo diferente.
		// Declaramos el perro:
		Perro perroCambiante = new Perro("PerroCambiante", null, "Bull Dog", 10, 'M');
		System.out.println(perroCambiante);
		
		perroCambiante.cambiar("SuperPerroCambiante");
		System.out.println(perroCambiante);
		
		perroCambiante.cambiar(4);
		System.out.println(perroCambiante);
		
		perroCambiante.cambiar('H');
		System.out.println(perroCambiante);
		
		perroCambiante.cambiar("MegaPerroCambiante", 24, '?');
		System.out.println(perroCambiante);
		System.out.println();
		
		// ATRIBUTOS Y MÉTODOS ESTÁTICOS
		int numInstanciasPunto;
		numInstanciasPunto = Punto.instanciasCreadas();
		System.out.println("Número de puntos creados:" + numInstanciasPunto);
		
		Punto punto1 = new Punto(0, 1);		
		numInstanciasPunto = Punto.instanciasCreadas();
		System.out.println("Número de puntos creados:" + numInstanciasPunto);
		
		Punto punto2 = new Punto(1, 0);
		numInstanciasPunto = Punto.instanciasCreadas();
		System.out.println("Número de puntos creados:" + numInstanciasPunto);
		
		Punto punto3 = new Punto(1, 1);
		numInstanciasPunto = Punto.instanciasCreadas();
		System.out.println("Número de puntos creados:" + numInstanciasPunto);
		System.out.println();
		
		// Valores de la constante para los puntos
		System.out.println(punto1.PI);
		System.out.println(punto2.PI);
		System.out.println(punto3.PI);
		System.out.println();
		
	}

}
