package arraylist;
import java.util.ArrayList;
public class ArrayList02 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");
		System.out.println("Contenido de la lista: ");
		//Recorre todas las posiciciones
		for(int i=0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		}

}
