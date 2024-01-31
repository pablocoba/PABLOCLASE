package arraylist;

import java.util.*;
public class ArrayList066 {
		public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");
		System.out.println("Contenido de la lista: ");
		System.out.println(a);
		//Borramos elementos de la list  con filtro aplicando método removeIf
		a.removeIf(palabra -> palabra.contains("a"));
		System.out.println("Contenido de la lista después de borrar las palabras que contienen la letra \"a\": ");
		System.out.println(a);
		}

}
