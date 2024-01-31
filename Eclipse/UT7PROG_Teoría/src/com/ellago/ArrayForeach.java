package com.ellago;

import java.util.*;

public class ArrayForeach {
	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		double[] nota = new double[4];
		System.out.println("Para calcular la nota media necesito saber la ");
		System.out.println("nota de cada uno de tus ex�menes.");
		for (int i = 0; i < nota.length; i++) {
			System.out.print("Nota del examen n� " + (i + 1) + ": ");
			nota[i] = dato.nextDouble();
		}
		System.out.println("Tus notas son: ");
		double suma = 0;
		for (double n : nota) { // for al estilo foreach
			System.out.print(n + " ");
			suma += n;
		}
		System.out.println("\nLa media es " + suma / nota.length);
		dato.close();
		}

}
