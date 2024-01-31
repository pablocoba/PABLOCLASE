package com.ellago;

/*Si queremos generar n�meros enteros en lugar de n�meros con decimales, basta con
hacer un casting para convertir los n�meros de tipo double en n�meros de tipo int.
Recuerda que (int)x transforma x en una variable de tipo entero; si x era de tipo float
o double, perder�a todos los decimales.*/ 

public class Aleatorios3 {
	public static void main(String[] args) {
		System.out.println("20 n�meros aleatorios entre 0 y 9 (sin decimales):");
		for (int i = 1; i <= 20; i++) {
		System.out.println((int)(Math.random()*10) + " ");
		}
		System.out.println();
		}

}
