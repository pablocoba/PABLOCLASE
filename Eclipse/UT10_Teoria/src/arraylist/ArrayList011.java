package arraylist;
import java.util.ArrayList;
public class ArrayList011 {

	public static void main(String[] args) {
		//Crea la lista que contendrá datos de tipo entero
		ArrayList<Integer> a = new ArrayList<Integer>();
		//Añade elementos a la lista
		a.add(18);
		a.add(22);
		a.add(-30);
		//Consulta el número de elementos de la lista con el método size()
		System.out.println("Nº de elementos: " + a.size());
		//Consulta el entero que está en la posición 1 de la lista con el método get()
		System.out.println("El elemento que hay en la posición 1 es " + a.get(1));
		}
}
