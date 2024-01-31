package hashmap;

import java.util.*;

public class HashMap04 {
	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		//Creamos la colección
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		//Introducimos datos en la colección
		m.put(924, "Amalia Núñez");
		m.put(921, "Cindy Nero");
		m.put(700, "César Vázquez");
		m.put(219, "Víctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		System.out.print("Por favor, introduzca un código: ");
		int codigoIntroducido = dato.nextInt();
		//Médodo containskey para encontrar una clave
		if (m.containsKey(codigoIntroducido)) {
			System.out.print("El código " + codigoIntroducido + " corresponde a ");
			System.out.println(m.get(codigoIntroducido));//Obtener valor con el get
		} else {
			System.out.print("El código introducido no existe.");
		}
		dato.close();
		}

}
