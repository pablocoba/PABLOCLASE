package ejercicio2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Pila pila = new Pila(5);
		Cola cola = new Cola(5);
		//metemos
		pila.Push(3);
		pila.Push(2);
		pila.Push(5);
		pila.Push(9);
		pila.Push(1);
		
		//aquí ya va a estar llena, por lo que te pone el mensaje de error
		pila.Push(3);
		System.out.println(pila);
		//sacamos
		pila.Pop();
		pila.Pop();
		System.out.println(pila);
		

		//metemos
		cola.Encolar(3);
		cola.Encolar(2);
		cola.Encolar(5);
		cola.Encolar(9);
		cola.Encolar(1);
		
		//aqui va a estar ya llena, el siguiente dará error.
		cola.Encolar(3);
		System.out.println(cola);
		//sacamos
		cola.Desencolar();
		cola.Desencolar();
		System.out.println(cola);
	}

}
