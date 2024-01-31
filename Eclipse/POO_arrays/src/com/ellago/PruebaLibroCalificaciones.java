package com.ellago;

public class PruebaLibroCalificaciones {

	public static int[][] crearCalificaciones(int filas, int columnas){		
		
		int[][] notas = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				notas[i][j]=(int) (Math.random()*101);
				
			}
			
		}
		
		return notas;
		
	}
	
	public static void main(String[] args) {
	
		
		int[][]notas = crearCalificaciones(5, 6); 
		 
		
		LibroCalificaciones alumnos = new LibroCalificaciones("Mates", notas);
		
		alumnos.mostrarCalificaciones();

	}

}
