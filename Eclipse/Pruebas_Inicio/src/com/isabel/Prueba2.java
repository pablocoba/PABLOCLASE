package com.isabel;

import java.util.Scanner;

/* En la consola se introduce un número y por cada uno dice si es par o impar*/
/*Casos de pruebas limitados*/
/*El primer número indica los casos de pruebas*/
 
public class Prueba2 {
static Scanner in=new Scanner(System.in);
	
	public static boolean casoDePrueba() {
		int n;
		//hasNext() método booleano que se que en espera
		//para ver si hay otro token en stdin
		if (!in.hasNext())
			return false;
		n=in.nextInt();
		if ((n%2)==0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		return true;
	}
	public static void main(String args[]) {
		
		int numCasos=in.nextInt();
		for (int i=0;i<numCasos;i++) {
			casoDePrueba();
		}
		
	}

}
