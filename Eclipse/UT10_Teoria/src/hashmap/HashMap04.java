package hashmap;

import java.util.*;

public class HashMap04 {
	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		//Creamos la colecci�n
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		//Introducimos datos en la colecci�n
		m.put(924, "Amalia N��ez");
		m.put(921, "Cindy Nero");
		m.put(700, "C�sar V�zquez");
		m.put(219, "V�ctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		System.out.print("Por favor, introduzca un c�digo: ");
		int codigoIntroducido = dato.nextInt();
		//M�dodo containskey para encontrar una clave
		if (m.containsKey(codigoIntroducido)) {
			System.out.print("El c�digo " + codigoIntroducido + " corresponde a ");
			System.out.println(m.get(codigoIntroducido));//Obtener valor con el get
		} else {
			System.out.print("El c�digo introducido no existe.");
		}
		dato.close();
		}

}
