package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * Realiza un programa que muestre por pantalla los números del 1 al 100 sin 
 * mostrar aquellos números múltiplos de 5.
 */
public class Ejercicio7 {

	public static void main(String[] args) {


		System.out.println("Números del 1 al 100 sin multiplos de 5");
		for(int i=1;i<=100;i++) { //bucle para sacar números del 1 al 100
			if(i%5!=0) { //filtramos los números de 5
				System.out.print(i+", ");
			}
		}
	}

}
