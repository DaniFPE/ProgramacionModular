package com.verdesoft.herencia;

import java.time.LocalDate;

public class POO3 {

	public static void main(String[] args) {
		/* Tratamos ahora con la herencia y el polimorfimso en Java una
		 * de las características mñas importantes de la POO.*/
		
		// Instanciamos dos Objetos que son Vehiculos.
		// Atributos comunes:
		String matriculaCoche = "000000B";
		String marcaCoche = "Seat";
		String modeloCoche = "Ibiza";
		float potenciaCoche = 112.0f;
		int kilometrosCoche = 300000;
		int numPuertas = 4;

		String matriculaMoto = "000000J";
		String marcaMoto = "Yamaha";
		String modeloMoto = "P234";
		float potenciaMoto = 50.0f;
		int kilometrosMoto = 3000;
		boolean carenado = true;
		
		// Si se accede a cada una de las clases veremos que ambos heredan de Vehiculo
		Coche cocheEjemplo = new Coche(matriculaCoche, 
									   marcaCoche, 
									   modeloCoche, 
									   potenciaCoche, 
									   kilometrosCoche, 
									   numPuertas);
		
		Moto motoEjemplo = new Moto(matriculaMoto, marcaMoto, modeloMoto, potenciaMoto, kilometrosMoto, carenado);

		cocheEjemplo.arrancarMotor();
		motoEjemplo.arrancarMotor();
		
		cocheEjemplo.repostar(20);
		motoEjemplo.repostar(2);
		
		System.out.println("Ultima revisión en " + motoEjemplo.getUltimaRevision());
		System.out.println("Acceso a NUM_RUEDAS variable estática:");
		System.out.println("Coche: " + Coche.NUM_RUEDAS);
		System.out.println("Moto: " + Moto.NUM_RUEDAS);
		System.out.println();
		
		
		// Redefinición de métodos u Override
		Animal molusco = new Animal("Mollusca");
		Mamifero mamifero = new Mamifero();
		Pajaro pajaro = new Pajaro();
		Murcielago murcielgo = new Murcielago();
		
		molusco.desplazarse();
		mamifero.desplazarse();
		pajaro.desplazarse();
		murcielgo.desplazarse();
		System.out.println();
		
		// Ejemplo donde el Override extienda la funcionalidad de algo
		Circulo circuloPequeño = new Circulo(4.5);
		Esfera esferaPequeña = new Esfera(4.5);

		System.out.println("Superficies de el circulo y la esfera de radio 4.5:");
		System.out.println(String.format("%.2f", circuloPequeño.calculateSuperficie()));
		System.out.println(String.format("%.2f", esferaPequeña.calculateSuperficie()));
		System.out.println();
		
		// Podemos tener atributos estáticos con mismo nombre y diferentes valores en la clase
		// padre y la clase hija. Por ejemplo:
		esferaPequeña.showDiferenceBetweenPI();
		System.out.println();
		
		// Uso de la clase Object y POLIMORFISMO
		// Gracias al polimorfismo podemos declarar un Array de elementos genéricos
		Object[] arrayObjetos = {cocheEjemplo, motoEjemplo, molusco, mamifero, pajaro, murcielgo, circuloPequeño, esferaPequeña};
		imprimirArray(arrayObjetos);
		System.out.println();
		
		
	}
	/**
	 * Esta función recorre un array e imprime elemento a elemento.
	 * @param array
	 */
	private static void imprimirArray(Object[] array) {
		String imprimir;
		for (Object object : array) {
			imprimir = object.toString();
			System.out.println(imprimir);
		}
		
	}

}
