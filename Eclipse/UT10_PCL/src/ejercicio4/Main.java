package ejercicio4;

import java.util.ArrayList;

public class Main{

	public static void main(String[] args) {
		//creamos listas
		ArrayList<Libro> listaLibro = new ArrayList<Libro>();
		ArrayList<Revista> listaRevista = new ArrayList<Revista>();
		//añadimos a las listas
		Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
		listaLibro.add(libro1);
		Libro libro2 = new Libro("112233", "Los Otros", 2016);
		listaLibro.add(libro2);
		Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);
		listaLibro.add(libro3);
		Revista revista1 = new Revista("444555", "Año Cero", 2019, 344);
		listaRevista.add(revista1);
		Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);
		listaRevista.add(revista2);
		
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		System.out.println(revista1);
		System.out.println(revista2);
		//comprueba métodos de comparable
		libro2.presta();
		if (libro2.estaPrestado()) {
		System.out.println("El libro está prestado");
		}
		libro2.presta();
		libro2.devuelve();
		if (libro2.estaPrestado()) {
		System.out.println("El libro está prestado");
		}
		libro3.presta();
		System.out.println(libro2);
		System.out.println(libro3);
		
	}

}
