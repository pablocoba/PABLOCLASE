package Ejercicio2;

public class Main {
	    public static void main(String[] args) {
	        Pila pila = new Pila(5);
	        Cola cola = new Cola(5);

	        pila.push(1);
	        pila.push(2);
	        pila.push(3);
	        System.out.println(pila);

	        cola.encolar(1);
	        cola.encolar(2);
	        cola.encolar(3);
	        System.out.println(cola);
	        pila.pop();
	        cola.desencolar();
	        System.out.println(pila);
	        System.out.println(cola);
	    }
	}
