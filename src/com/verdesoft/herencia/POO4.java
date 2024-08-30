package com.verdesoft.herencia;

import com.verdesoft.modular.Persona;

public class POO4 {

	public static void main(String[] args) {
		// Veamos aqui el trabajo con clases abstractas e Interfaces
		
		// Trabajo con una clase abstracta
		// Creamos dos figuras que herdan de la clase abstracta FiguraRegular
		TrianguloRegular triangRegular = new TrianguloRegular(2.0);
		double perimetroTriangRegular = triangRegular.getPerimetro();
		double areaTriangRegular = triangRegular.getArea();
		double nLadosTriangRegular = triangRegular.getNumeroDeLados();
		
		CuadradoRegular cuadraRegular = new CuadradoRegular(2.0);
		double perimetroCuadraRegular = cuadraRegular.getPerimetro();
		double areaCuadraRegular = cuadraRegular.getArea();
		double nLadosCuadraRegular = cuadraRegular.getNumeroDeLados();
		
		System.out.println(  "Atributos del Objeto triangRegular"  );
		System.out.println( "Perimetro:" + perimetroTriangRegular  );
		System.out.println( "Area:" + areaTriangRegular  );
		System.out.println( "Num Lados:" + nLadosTriangRegular  );
		System.out.println(); 
				
		System.out.println(  "Atributos del Objeto cuadraRegular"  );
		System.out.println( "Perimetro:" + perimetroCuadraRegular  );
		System.out.println( "Area:" + areaCuadraRegular  );
		System.out.println( "Num Lados:" + nLadosCuadraRegular  );
		System.out.println();
		
		System.out.println("Numero de lados respectivamente:");
		System.out.println(triangRegular.getNumeroDeLados());
		System.out.println(cuadraRegular.getNumeroDeLados());
		System.out.println();
		
		
		// Trabajo con una clase que implementa una Interfaz
		Libro libro1 = new Libro(355, "J. Cortazar", "Rayuela", "Anaya", "i024l456", 10, 13.4, 23.99);
		System.out.println(libro1);
		libro1.comprarEjemplares(10);
		System.out.println(libro1);
		System.out.println();
		
		Libro libro2 = new Libro(245, "A. Huxley", "El genio y la diosa", "Blackie Books", "i035l854", 7, 10.2, 25.4);
		System.out.println(libro2);
		libro2.comprarEjemplares(5);
		System.out.println(libro2);
		System.out.println();

		System.out.println("Actualmente disponemos de " + Libro.getNumEjemplaresDiferentes() 
							+ " libros diferentes en stock.");
		System.out.println();
		
		// Trabajo con una clase que extiende una Clase e implementa una Interfaz
		Persona pepin = new Persona();
		PerroDomestico toby = new PerroDomestico("Toby", pepin, "Foxterrier", 10, 'M');
		
		toby.darLaPatita();
		toby.comer();
		System.out.println();
		
		// Trabajo con enumeraciones (caso complejo).
		Planeta tierra = Planeta.TIERRA;
		Planeta marte = Planeta.MARTE;
		
		System.out.println( "La gravedad en la superficie de la Tierra es: " + tierra.gravedadSuperficie() );
		System.out.println( "La gravedad en la superficie de Marte es: " + marte.gravedadSuperficie() );

		EstacionesAño invierno = EstacionesAño.INVIERNO;
		
		System.out.println(invierno.temperaturaMedia);
		
		// Trabajo con enumeraciones (caso típico)
		enum DiaSemana {
			LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
		}
		
		DiaSemana miDia = DiaSemana.LUNES;
		
		if (miDia == DiaSemana.SABADO) {
			System.out.println( "Disfrata del sabado!!");
		}
		
		
	}

}
