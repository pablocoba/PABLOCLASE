package hashmap;

import java.util.HashMap;
public class HashMap011 {
	public static void main(String[] args) {
		//Creamos la colecci�n m
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		//A�adimos datos a la colecci�n
		m.put(924, "Amalia N��ez");
		m.put(921, "Cindy Nero");
		m.put(700, "C�sar V�zquez");
		m.put(219, "V�ctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		//Mostramos algunos datos con el m�todo get con su clave.
		System.out.println(m.get(921));
		System.out.println(m.get(605));
		System.out.println(m.get(888));
		}
}
