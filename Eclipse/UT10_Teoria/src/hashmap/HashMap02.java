package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
public class HashMap02 {
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
		System.out.println("Todas las entradas del diccionario extra�das con entrySet:");
		//Mostramos todas las entradas con entrySet
		System.out.println(m.entrySet());
		System.out.println("\nEntradas del diccionario extra�das una a una:");
		//pareja es para extraer de la colecci�n una entrada clave-valor
		for (Entry<Integer, String> pareja: m.entrySet()) {
			System.out.println(pareja);
		}
		}

}
