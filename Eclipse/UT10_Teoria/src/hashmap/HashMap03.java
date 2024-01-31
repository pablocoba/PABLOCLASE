package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap03 {
	
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
		System.out.println("Código\tNombre\n------\t-------------");
		//Mostramos todos los datos con getKey() y getValue()
		for (Entry<Integer, String> pareja: m.entrySet()) {
			System.out.print(pareja.getKey() + "\t");
			System.out.println(pareja.getValue());
		}
		
		}

}
