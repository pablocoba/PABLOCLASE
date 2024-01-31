package arraylist;

import java.util.*;
public class ArrayList067 {
	public static void main(String[] args) {
		//Creamos la lista de enteros
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(20);
		a.add(7);
		a.add(14);
		a.add(32);
		a.add(3);
		System.out.println("Contenido de la lista: ");
		System.out.println(a);
		//Borramo elementos con un filtro
		a.removeIf(numero -> numero < 10);
		System.out.println("Contenido de la lista despu�s de borrar los menores de 10: ");
		System.out.println(a);
		//Algoritmos de ordenaci�n
		Collections.sort(a);
		System.out.println("Contenido de la lista ordenada: ");
		System.out.println(a);
		//Ordenamos en orden inverso
		Collections.reverse(a);
		System.out.println("Contenido de la lista ordenada al rev�s: ");
		System.out.println(a);
		
		
		}

}
