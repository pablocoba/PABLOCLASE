package hashmap;
//necesitamos importar la clase
import java.util.HashMap;
public class HashMap01 {
	public static void main(String[] args) {
		//Creamos el objeto HashMap cuyo valor es de tipo String
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		//A�adimos elementos a la colecci�n con clave y el valor
		m.put(924, "Amalia N��ez");
		m.put(921, "Cindy Nero");
		m.put(700, "C�sar V�zquez");
		m.put(219, "V�ctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		//Mostramos todos los datos de la colecci�n
		System.out.println("Los elementos de m son: \n" + m);
		}
}


