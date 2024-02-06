package Ejercicio2;

import java.util.ArrayList;

public class Cola {
	private ArrayList<Integer> cola;
	private int tamañoCola;
	
	public Cola (int tamañoCola) {
		this.cola = new ArrayList<>();
		this.tamañoCola = tamañoCola;
	}
	public void encolar(int elemento) {
		if (cola.size()<tamañoCola) {
			cola.add(elemento);
            System.out.println("Push: " + elemento);
		}else {
            System.out.println("La cola está llena. No se puede agregar más elementos.");
		}
	}
	 public void desencolar() {
	        if (!cola.isEmpty()) {
	            int elementoEliminado = cola.remove(cola.size() - 1);
	            System.out.println("Pop: "
	            + elementoEliminado);
	        } else {
	            System.out.println("La cola está vacía. No se puede realizar desencolar.");
	        }
	 }
	 
	 public String toString() {
		 return "" + cola;
	 }
}
