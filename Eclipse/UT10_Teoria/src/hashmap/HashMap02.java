package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
public class HashMap02 {
	public static void main(String[] args) {
		//Creamos la colección
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		//Añadimos datos a la colección
		m.put(924, "Amalia Núñez");
		m.put(921, "Cindy Nero");
		m.put(700, "César Vázquez");
		m.put(219, "Víctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
		//Mostramos todas las entradas con entrySet
		System.out.println(m.entrySet());
		System.out.println("\nEntradas del diccionario extraídas una a una:");
		//pareja es para extraer de la colección una entrada clave-valor
		for (Entry<Integer, String> pareja: m.entrySet()) {
			System.out.println(pareja);
		}
		}

}
