package ejercicio2;

import java.util.ArrayList;

public class Pila {
	//atributos
	private ArrayList<Integer> list;
	private int size;
	//constructor
	public Pila (int size) {
		list = new ArrayList<Integer>();
		this.size = size;
	}
	
	//saca el primero que se ha metido, si hay 5 saca el quinto
	public void Pop() {
		list.remove(list.size()-1);
	}
	
	//mete y se pone al principio, comprobando que no esté llena.
	public void Push(int num) {
		if(list.size() >= size) {
			System.out.println("Pila Llena");
		}
		else list.add(0, num);
		
	}
	
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
