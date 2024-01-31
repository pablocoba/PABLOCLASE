package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

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
		
		}

}
