package listas.Biblioteca;

import java.util.ArrayList;


public class Biblioteca{
	
	private static ArrayList<Libro> listaLibro = new ArrayList<Libro>();
	private static ArrayList<Revista> listaRevista = new ArrayList<Revista>();
	
	public static void cargarPublicaciones() {
		Libro l1 = new Libro("123456","La Ruta Prohibida",2007);
		Libro l2 = new Libro("112233","Los Otros",2016);
		Libro l3 = new Libro("456789","La rosa del mundo",1995);
		Revista r1 = new Revista("444555","Año Cero",2019,344);
		Revista r2 = new Revista("002244","National Geographic",2003,255);
		
		listaLibro.add(l1);
		listaLibro.add(l2);
		listaLibro.add(l3);
		listaRevista.add(r1);
		listaRevista.add(r2);
	}
	public static void main(String[] args) {
		
		
		
	}

	

}
