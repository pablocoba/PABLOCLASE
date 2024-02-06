package Ejercicio2;

import java.util.ArrayList;

public class Pila {
	private ArrayList<Integer> pila;
	private int tamañoPila;
	
	public Pila (int tamañoPila) {
		this.pila = new ArrayList<>();
		this.tamañoPila = tamañoPila;
	}
	public void push(int elemento) {
		if (pila.size()<tamañoPila) {
			pila.add(elemento);
            System.out.println("Push: " + elemento);
		}else {
            System.out.println("La pila está llena. No se puede agregar más elementos.");
		}
	}
	 public void pop() {
	        if (!pila.isEmpty()) {
	            int elementoEliminado = pila.remove(pila.size() - 1);
	            System.out.println("Pop: "
	            + elementoEliminado);
	        } else {
	            System.out.println("La pila está vacía. No se puede realizar pop.");
	        }
	 }
	 
	 public String toString() {
		 return "" + pila;
	 }
}
