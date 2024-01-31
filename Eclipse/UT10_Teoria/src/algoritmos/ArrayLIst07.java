package algoritmos;

import java.util.*;

public class ArrayLIst07 {
	public static void main(String[] args) {
		//Creo una lista que contiene objetos tipo Gato
		ArrayList<Gato> g = new ArrayList<Gato>();
		g.add(new Gato("Garfield", "naranja", "mestizo"));
		g.add(new Gato("Pepe", "gris", "angora"));
		g.add(new Gato("Mauri", "blanco", "manx"));
		g.add(new Gato("Ulises", "marrón", "persa"));
		System.out.println("\nDatos de los gatos:\n");
		//Creo un objeto gatoAux de tipo Gato para ir guardando cada elemento
		//de la lista y poder imprimirlo
		for (Gato gatoAux: g) {
			System.out.println(gatoAux+"\n");
		}
		//Ordenamos nuestra lista (lo hará en base al nombre del gato
		//porque el gato tiene implementado el método compareTo
		//ya que se ha implementado el interfaz Comparable
		Collections.sort(g);
		System.out.println("La lista ordenada será: \n");
		//Imprimimos lista ordenada
		for (Gato gatoAux: g) {
			System.out.println(gatoAux+"\n");
		}
		//Ordenamos nuestra lista a la inversa
		Collections.reverse(g);
		//Imprimimos la lista ordenada a la inversa
		System.out.println("La lista ordenada a la inversa será: \n");
		for (Gato gatoAux: g) {
			System.out.println(gatoAux+"\n");
		}
		}

}
