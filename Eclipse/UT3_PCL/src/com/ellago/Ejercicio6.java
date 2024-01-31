package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 6.	Realiza un programa que muestre por pantalla los 50 primeros números pares.
 */

import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un número: ");
		int num = teclado.nextInt(); //pedimos un número
		int tot = 0;

		while(tot<50) {//hasta que legue a 50 
			if(num%2== 0) { //filtro que sea par
				System.out.print(num+", ");	//imprime pares
			}
			num++;
		}
		
		
	}
}
