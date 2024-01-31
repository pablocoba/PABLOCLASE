package com.ellago;

public class ArrayMulti2 {
	public static void main(String[] args) {
			
		int fila, columna;
		int[][]n = {{20, 4}, {67, 33}, {0,7}};
		//array invertido del base n
		int[][]u = new int[n[0].length][n.length];
		for(fila = 0; fila<n.length; fila++) {
			
			System.out.println("Fila: " + fila);
			for(columna = 0; columna<n[0].length; columna++) {
				System.out.printf("%10d ", n[fila][columna]);
			}
			System.out.println();
			
		}
		System.out.println();
		//bucle para invertirlo
		for (fila = 0; fila < u.length; fila++) {
			
			System.out.println("Fila: " + fila);
			for (columna = 0; columna < u[fila].length; columna++) {
				//invertimientacion
				u[fila][columna]=n[columna][fila];
				System.out.print(u[fila][columna] + "     ");
			}
			System.out.println();
		}
		}

}
