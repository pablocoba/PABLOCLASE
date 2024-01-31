package com.ellago;

import java.util.*;
public class ArrayUni4 {
	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		double[] nota = new double[4];
		System.out.println("Para calcular la nota media necesito saber la ");
		System.out.println("nota de cada uno de tus ex�menes.");
		for (int i = 0; i < 4; i++) {
			System.out.print("Nota del examen nº " + (i + 1) + ": ");
			nota[i] = dato.nextDouble();
		}
	    
		System.out.println("Tus notas son: ");
		double suma = 0;
		for (int i = 0; i < nota.length; i++) {
			System.out.print(nota[i] + " ");
			suma += nota[i];
		}
		dato.close();
		System.out.println("\nLa media es " + suma / 4);
		}

}
