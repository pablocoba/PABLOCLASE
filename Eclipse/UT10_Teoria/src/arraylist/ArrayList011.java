package arraylist;
import java.util.ArrayList;
public class ArrayList011 {

	public static void main(String[] args) {
		//Crea la lista que contendr� datos de tipo entero
		ArrayList<Integer> a = new ArrayList<Integer>();
		//A�ade elementos a la lista
		a.add(18);
		a.add(22);
		a.add(-30);
		//Consulta el n�mero de elementos de la lista con el m�todo size()
		System.out.println("N� de elementos: " + a.size());
		//Consulta el entero que est� en la posici�n 1 de la lista con el m�todo get()
		System.out.println("El elemento que hay en la posici�n 1 es " + a.get(1));
		}
}
