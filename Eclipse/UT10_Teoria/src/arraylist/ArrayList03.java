package arraylist;

import java.util.ArrayList;
public class ArrayList03 {
	public static void main(String[] args) {
		//Se crea la lista que contiene String
		ArrayList<String> a = new ArrayList<String>();
		//Añade elementos a la lista
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");
		System.out.println("Contenido de la lista: ");
		//Recorrido con for sin tener en cuenta los índices
		//Se define la variable color tipo String que es en la que se
		//obtendrá el dato de cada elemento de la lista a
		for(String color: a) {
			System.out.println(color);
		}
		}

}
