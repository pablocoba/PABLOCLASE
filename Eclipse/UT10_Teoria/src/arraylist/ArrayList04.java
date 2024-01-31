package arraylist;

import java.util.ArrayList;
public class ArrayList04 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");
		a.add("blanco");
		System.out.println("Contenido de la lista: ");
		for(String color: a) {
			System.out.println(color);
		}
		if (a.contains("blanco")) {
			System.out.println("El blanco está en la lista de colores");
		}
		//Eliminamos un elemento de la lista con el método remove() indicando el valor
		a.remove("blanco");
		System.out.println("Contenido de la lista después de quitar la " +
			"primera ocurrencia del color blanco: ");
		for(String color: a) {
			System.out.println(color);
		}
		//Eliminamos un elemento de la lista con el método remove() indicando su
		//posición
		a.remove(2);
		System.out.println("Contenido de la lista después de quitar el " +
			"elemento de la posición 2: ");
		for(String color: a) {
			System.out.println(color);
		}
	}

}
