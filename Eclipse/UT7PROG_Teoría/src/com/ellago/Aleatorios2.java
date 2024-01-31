package com.ellago;

/*Si queremos generar valores aleatorios entre 0 y 10 (incluyendo el 0 y
sin llegar a 10) simplemente tendremos que correr la coma un lugar o, lo que es lo
mismo, multiplicar por 10.*/

public class Aleatorios2 {
	public static void main(String[] args) {
		System.out.println("20 n�meros aleatorios entre 0 y 10");
		System.out.println(" sin llegar a 10 (con decimales):");
		for (int i = 1; i <= 20; i++) {
		System.out.println((int) (Math.random()*10) + " ");
		System.out.printf( "%.2f",Math.random()*10);
		System.out.println();
		}
		}

}
