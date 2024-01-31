package com.ellago;

public class LibroCalificaciones {
	
	private String nombreCurso;
	private int[][] calificaciones;
	
	public LibroCalificaciones(String nombreCurso, int[][] calificaciones ) {
		this.nombreCurso=nombreCurso;
		this.calificaciones=calificaciones;
	}
	
	public int obtenerMinimo() {
		
		int respuesta = 10;
		
		for (int i = 0; i < calificaciones.length; i++) {
			
			for (int j = 0; j < calificaciones[i].length; j++) {
			
				if(calificaciones[i][j]<=respuesta) respuesta = calificaciones[i][j];
					

				
			}
			
		}
		
		return respuesta;
		
	}
	
	public int obtenerMaximo() {
		
		int respuesta = 0;
		
		for (int i = 0; i < calificaciones.length; i++) {
			
			for (int j = 0; j < calificaciones[i].length; j++) {
			
				if(calificaciones[i][j]>=respuesta) respuesta = calificaciones[i][j];
					

				
			}
			
		}
		
		return respuesta;
		
	}
	
	public int encontrarMasNotas() {
		int[]pruebas = new int[10];
		int contfinal = 0;
		for (int i = 0; i < calificaciones.length; i++) {
			int contador = 0;
			for (int j = 0; j <= calificaciones[i].length; j++) {
				contador = j;
			}
			if(contador > contfinal)contfinal = contador;
		}
		return contfinal;
	}
	
	public static double obtenerPromedio(int[] alumno) {
		
		double promedio = 0;
		
		for (int i = 0; i < alumno.length; i++) {
			promedio += alumno[i];
		}
		
		promedio = promedio/alumno.length;
		
		return promedio;
	}
	
	public void mostrarCalificaciones() {
		int a = encontrarMasNotas();
		System.out.println("\nCalificaciones totales del curso "+nombreCurso+":\n");
		System.out.print("\t\t");
		for (int j = 0; j < a; j++) {
			System.out.print("Prueba "+j+"\t");		
		}
		System.out.print("Promedio");	
		for (int i = 0; i < calificaciones.length; i++) {
			int j = 0;
			System.out.println();
			System.out.print("Estudiante "+i+":\t");
			for (int k = 0; k < calificaciones[i].length; k++) {
				System.out.print(calificaciones[i][k]+"\t\t");
			}
			System.out.printf("%.2f",obtenerPromedio(calificaciones[i]));
			


		}

		System.out.println("\n\nLa calificación máxima es: "+obtenerMaximo());
		System.out.println("La calificación mínima es: "+obtenerMinimo());
	}

}
