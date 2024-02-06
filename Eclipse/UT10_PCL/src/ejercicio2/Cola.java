package ejercicio2;
import java.util.*;
public class Cola {
	//atributos
	private ArrayList<Integer> list;
	private int size;
	//constructor
	public Cola (int size) {
		list = new ArrayList<Integer>();
		this.size = size;	//asignamos el numero que le damos a la variable size
		
	}
	//metodo para quitar (saca el primero)
	public void Desencolar() {
		list.remove(0);
	}
	//metodo para meter, comprueba que no esté llena y sino la mete al final
	public void Encolar(int num) {
		if(list.size() >= size) {
			System.out.println("Cola Llena");
		}
		else list.add(list.size(), num);
		
	}
	
	//override del toString
	@Override
	public String toString() {
		String todo = "";
		for (int i = 0; i < list.size(); i++) {
			todo = todo + list.get(i);
			if(i <list.size()-1) {
				todo = todo + ", ";
			}

		}
		return todo;
	};
}
