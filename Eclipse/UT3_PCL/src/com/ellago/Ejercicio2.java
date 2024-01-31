package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 2.Realiza un programa utilizando bucles que muestre la siguiente figura por pantalla: 
		 *
		 ** 
		 ***
		 ****
		 *****
		 */

import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int x = teclado.nextInt(); //pedimos el numero de líneas
		teclado.close(); //cerramos teclado
			System.out.print("\n");
			for(int b=1;b<=x;b++) { //bucle para nº de líneas
				for(int j=1;j<=b;j++) {	//bucle para imprimir *
					System.out.print("*");
					
				}
				System.out.print("\n"); //bucle para imprimir saltos de linea

			}
		
	}

}
