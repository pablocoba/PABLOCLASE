package arraylist;

import java.util.ArrayList;
public class ArrayList06 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");
		System.out.println("Contenido de la lista: ");
		System.out.println(a);
		//Insertamos en la posici�n 1 yla lista se reestructura...
		a.add(1, "turquesa");
		System.out.println("Contenido de la lista despu�s de insertar en la posici�n 1: ");
		System.out.println(a);
		}

}
