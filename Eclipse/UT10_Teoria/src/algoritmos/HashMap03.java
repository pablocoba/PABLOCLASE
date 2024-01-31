package algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMap03 {
	
	public static void main(String[] args) {
		//Creamos la colecci�n
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		//A�adimos datos a la colecci�n
		m.put(924, "Amalia N��ez");
		m.put(921, "Cindy Nero");
		m.put(700, "C�sar V�zquez");
		m.put(219, "V�ctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		System.out.println("C�digo\tNombre\n------\t-------------");
		//Mostramos todos los datos con getKey() y getValue()
		for (Entry<Integer, String> pareja: m.entrySet()) {
			System.out.print(pareja.getKey() + "\t");
			System.out.println(pareja.getValue());
		}
		//Algoritmos de ordenaci�n
		//Creamos una lista para guardar las claves del HashMap
		ArrayList<Integer> lm=new ArrayList<Integer>(m.keySet());
		//Ordenamos la lista
		Collections.sort(lm);
		System.out.println("La lista de las claves ordenada es:");
		System.out.println(lm);
		//Ordenamos las claves a la inversa
		Collections.reverse(lm);
		System.out.println("La lista de las claves ordenada es:");
		System.out.println(lm);
		//Otra forma de imprimir la lista con un for
		System.out.println("la lista de claves cada una en una l�nea");
		for (Integer i:lm) {
			System.out.println(i);
		}
		//Ahora vamos a crear una lista para los valores!!ojo!!lo obtengo del
		//HashMap m
		ArrayList<String> dm=new ArrayList<String>(m.values());
		//Ordenamos la lista
		Collections.sort(dm);
		System.out.println("la lista de valores cada una en una l�nea");
		for (String s:dm) {
			System.out.println(s);
		}
		//Ahora vamos a ordenar TODO el HashMap con la clase TreeMap por clave
		Map< Integer,String> sortedMap = new TreeMap<>(m);
		//Imprimir el HashMap
		sortedMap.entrySet().forEach(System.out::println);
		
		//Otra forma de imprimir la lista 
		System.out.println("C�digo\tNombre\n------\t-------------");
		//Mostramos todos los datos con getKey() y getValue()
		for (Entry<Integer, String> pareja: sortedMap.entrySet()) {
			System.out.print(pareja.getKey() + "\t");
			System.out.println(pareja.getValue());
		}
		
		}

}
