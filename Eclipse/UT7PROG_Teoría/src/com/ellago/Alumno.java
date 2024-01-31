package com.ellago;

import java.util.*;

public class Alumno {
		/**
		* Alumno.java
		* Definici�n de la clase Alumno
		
		*/
			
		//Atributos
		private String nombre;
		private double notaMedia = 0.0;
		
		//M�todos setters y getters
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getNotaMedia() {
			return notaMedia;
		}
		public void setNotaMedia(double notaMedia) {
			this.notaMedia = notaMedia;
		}
		//M�todo principal
		public static void main(String[] args) {
			Scanner dato=new Scanner(System.in);
			// Define la estructura, un array de 5 alumnos
			// pero no crea los objetos
			Alumno[] alum = new Alumno[5];
			// Pide los datos de los alumnos /////
			System.out.println("A continuacion debera introducir el nombre "
					+ "y la nota media de 5 alumnos.");
			String nombreIntroducido;
			double notaIntroducida;
			for(int i = 0; i < 5; i++) {
				alum[i] = new Alumno();//Creo alumno a alumno con el constructor por defecto
				System.out.println("Alumno " + i);
				System.out.print("Nombre: ");
				nombreIntroducido = dato.next();//Leo con el m�todo next() para no tener problemas
				(alum[i]).setNombre(nombreIntroducido);//Asigno el nombre al alumno
				System.out.print("Nota media: ");
				notaIntroducida = dato.nextDouble();
				alum[i].setNotaMedia(notaIntroducida);
			} // for 
			// Muestra los datos de los alumnos /////////////////////////////////
			System.out.println("Los datos introducidos son los siguientes:");
			double sumaDeMedias = 0;
			for(int i = 0; i < 5; i++) {
				System.out.println("Alumno " + i);
				System.out.println("Nombre: " + alum[i].getNombre());
				System.out.println("Nota media: " + alum[i].getNotaMedia());
				System.out.println("----------------------------");
				sumaDeMedias += alum[i].getNotaMedia();
		}
			System.out.println("La nota media de los alumnos es: "+sumaDeMedias/alum.length);
			dato.close();
		}
}
