package com.isabel;

import java.util.Scanner;

/*
 * La entrada consistira en un numero indeterminado de casos de prueba. Cada caso de
prueba consistira en un numero entero. Los casos de prueba terminaran con el numero
-1, que marcara el nal de la entrada y que no sera procesado.
 */
public class Prueba3 {
	static Scanner in=new Scanner(System.in);
	
	public static boolean casoDePrueba() {
		int n;
		n=in.nextInt() ;
		//la finalización de los casos de prueba lo indica
		//el valor -1
		if (n==-1)
				return false;
		if ((n%2)==0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		return true;
	}
	public static void main(String args[]) {
		
		while (casoDePrueba()) {
			
			}

		}
}
