package com.ellago;

/*¿Y si en lugar de generar números enteros entre 0 y 9 queremos generar números
entre 1 y 10? Como habrás podido adivinar, simplemente habría que sumar 1 al
número generado, de esta forma se “desplazan un paso” los valores generados al
azar, de tal forma que el mínimo valor que se produce sería el 0 + 1 = 1 y el máximo
sería 9 + 1 = 10.*/

public class Aleatorios4 {
	public static void main(String[] args) {
		System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):");
		for (int i = 1; i <= 20; i++) {
		System.out.print( (int)(Math.random()*10 + 1) + " ");
		}
		System.out.println();
		}

}
