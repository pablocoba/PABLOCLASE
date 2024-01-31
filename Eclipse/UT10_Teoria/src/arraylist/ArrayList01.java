package arraylist;

//Necesitamos importar la clase
import java.util.ArrayList;

public class ArrayList01 {
	public static void main(String[] args) {
		//Creamos el ArrayList indicando el tipo de dato que contiene
		ArrayList<String> lista = new ArrayList<String>();
		//Consultamos el n�mero de elementos que tiene con el m�todo size()
		System.out.println("N� de elementos: " + lista.size());
		//A�adimos elementos con el m�todo add()
		lista.add("rojo");
		lista.add("verde");
		lista.add("azul");
		System.out.println("N� de elementos: " + lista.size());
		lista.add("blanco");
		System.out.println("N� de elementos: " + lista.size());
		//Miramos el contenido de elementos en una posici�n con el m�todo get()
		System.out.println("El elemento que hay en la posici�n 0 es " + lista.get(0));
		System.out.println("El elemento que hay en la posici�n 3 es " + lista.get(3));
	}
}