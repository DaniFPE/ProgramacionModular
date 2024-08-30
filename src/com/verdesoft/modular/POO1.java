package com.verdesoft.modular;

public class POO1 {

	public static void main(String[] args) {	
		// Vamos a crear varios objetos de la clase Persona mediante isntaciación
		Persona pepin = new Persona();
		Persona paloma = new Persona();
		Persona joseLuis = new Persona();
		
		// Todos ellos son objetos de las clase persona auqnue tienen el mismo estado ya que
		// no tenemos un constructor que nos permita inicializarlos con parámetros diferentes.
		
		// Podemos modificar su estado de manera directa ya que por defecto los atributos son default
		// Es decir son accesibles tanto por la propia clase y las que pertenecen al paquete.
		// Modificando los atributos
		pepin.nombre = "Pepin";
		pepin.apellido = "Menendez Menendez";
		pepin.edad = 47;
		
		paloma.nombre = "Paloma";
		paloma.apellido = "Fernandez Fernandez";
		paloma.edad = 30;
		
		joseLuis.nombre = "Jose Luis";
		joseLuis.apellido = "Vazquez Vazquez";
		joseLuis.edad = 58;
		
		// Accediendo
		System.out.println(pepin.nombre);
		System.out.println(pepin.edad);
		
		System.out.println(paloma.nombre);
		System.out.println(paloma.edad);
		
		System.out.println(joseLuis.nombre);
		System.out.println(joseLuis.edad);
		
		System.out.println();
		
		// Las clases tambien pueden tener métodos
		pepin.saludar();

		// Estos métodos pueden recibir parametros externos y también emplear 
		// sus propias atributos dentro de los métodos-
		pepin.caminar(300);
		
		
		// Además los métodos no tienen porque ser void, pueden devolver valores
		int edadPepin = pepin.getEdad();
		System.out.println("Pepin tiene " + edadPepin + " años.");
		
		System.out.println();
		
		// Veamos como se realizaría una clase con un constructor que permita
		// instanciar objetos con diferentes estados.
		Alumno manuel = new Alumno("Manuel", 13, 2, 7.8);
		Alumno macarena = new Alumno("Macarena", 17, 1, 8.9);

		System.out.println(manuel.nombre);
		System.out.println(manuel.notaMedia);

		System.out.println(macarena.nombre);
		System.out.println(macarena.notaMedia);
		
		System.out.println();
		
		// Podemos tener un constructor que asocie ciertos atributos a ciertos parametros
		// y el resto de parametros los inicialice por defecto siempre igual.
		Coche seatIbiza = new Coche("Seat Ibiza", "amarillo", 100000, "Pepin");

		System.out.println(seatIbiza.color);
		System.out.println(seatIbiza.propietario);
		System.out.println(seatIbiza.itvOK);
		System.out.println(seatIbiza.numeroRuedas);

		System.out.println();
		
		// Veamos que ocurre sin no asigno ningun parámetro al constructor
		Coche cocheVacio = new Coche();
		
		System.out.println(cocheVacio.color);
		System.out.println(cocheVacio.propietario);
		System.out.println(cocheVacio.itvOK);
		System.out.println(cocheVacio.numeroRuedas);

		System.out.println();
		
		// TRUCO: Desde la pestaña Source de Eclipse, navegamos a Generate Constructor using Fields...
		// Se nos abre una ventana de diálogo que nos permite automatizar la creación del constructor de la clase.
		
		// SOBRECARGA DE MÉTODOS
		
		Perro toby = new Perro("Toby", pepin, "Setter", 8, 'H');
		
		toby.darLaPatita();
		toby.hacerseElMuerto();
		
		int edadToby = toby.getEdad();
		System.out.println(edadToby);
		toby.cumplirAños();
		edadToby = toby.getEdad();
		System.out.println(edadToby);
		
		toby.setDueño(joseLuis);
		toby.setNombre("Pancho");
		System.out.println(toby.getNombre());
		
		System.out.println();
		
		// Finalmente veamos como funciona una clase en la que tenemos atributos y métodos que interactuan
		// entre si y dependen unos de los otros.
		Cilindro cilindroPequeño = new Cilindro(4.2, 0.8);
		
		double volumen = cilindroPequeño.getVolumen();
		double superficie = cilindroPequeño.getSuperficie();
		
		System.out.println("Para los valores originales del cilindro:");
		System.out.println(volumen);
		System.out.println(superficie);
		
		cilindroPequeño.setAltura(8.4);
		
		volumen = cilindroPequeño.getVolumen();
		superficie = cilindroPequeño.getSuperficie();
		
		System.out.println("Para los valores nuevos:");
		System.out.println(volumen);
		System.out.println(superficie);
		
		
		// ATRIBUTOS Y MÉTODOS ESTÁTICOS
		ConexionBBDD conBD1 = new ConexionBBDD("Dani V", "unodostrescuatro", "myAwesomeBBDD");
		ConexionBBDD conBD2 = new ConexionBBDD("Pepin M", "1234", "myAwesomeBBDD");
		ConexionBBDD conBD3 = new ConexionBBDD("Paloma F", "1dos3cuatro", "myAwesomeBBDD");
		
		System.out.println(conBD1);
		System.out.println(conBD2);
		System.out.println(conBD3);
		
		System.out.println("Se ha caido la BBDD activando respaldo...");
		ConexionBBDD.activarRespaldo();
		
		System.out.println(conBD1);
		System.out.println(conBD2);
		System.out.println(conBD3);
		
		
	}
	

}
