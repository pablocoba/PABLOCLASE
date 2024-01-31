package hashmap;

import java.util.HashMap;
public class HashMap011 {
	public static void main(String[] args) {
		//Creamos la colección m
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		//Añadimos datos a la colección
		m.put(924, "Amalia Núñez");
		m.put(921, "Cindy Nero");
		m.put(700, "César Vázquez");
		m.put(219, "Víctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		//Mostramos algunos datos con el método get con su clave.
		System.out.println(m.get(921));
		System.out.println(m.get(605));
		System.out.println(m.get(888));
		}
}
