package arraylist;

import java.util.ArrayList;
public class ArrayList05 {
	public static void main(String[] args) {
		//Creamos la lista que contiene String
		ArrayList<String> a = new ArrayList<String>();
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");
		System.out.println("Contenido del vector: ");
		System.out.println(a);
		//Modificamos el contenido de la posici�n 2 de azul a turquesa
		//con el m�todo set()
		a.set(2, "turquesa");
		System.out.println("Contenido del vector despu�s de machacar la posici�n 2: ");
		System.out.println(a);
		

	}

}
