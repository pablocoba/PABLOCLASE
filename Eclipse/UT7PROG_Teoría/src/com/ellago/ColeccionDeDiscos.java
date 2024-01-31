package com.ellago;

import java.util.Scanner;
import java.util.Set;

public class ColeccionDeDiscos {
	
	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion; // duraci�n total en minutos
	private int numeroDiscos = 5;
    int duracionIntroducida;
    int primeraLibre;
	
	public ColeccionDeDiscos() {
		
	}
	
	public ColeccionDeDiscos(String codigo, String autor, String titulo, String genero, int duracion) {
		
	}
	public String getCodigo() {
		return codigo;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String toString(int i) {
		
		String cadena = "\n+----------------------------------------+";
		cadena += "\nCódigo: " + this.codigo;
		cadena += "\nAutor: " + this.autor;
		cadena += "\nTítulo: " + this.titulo;
		cadena += "\nGénero: " + this.genero;
		cadena += "\nDuración: " + this.duracion;
		cadena += "\n+----------------------------------------+";
		return cadena;
		
	}
	
	public void showList() {
		System.out.println("Listado:");
		System.out.println("=================");
		for (int i = 0; i < numeroDiscos; i++) {
			
			System.out.println(toString(i));
				
			}
		System.out.println("=================");
		}

	
	public void bucle() {
		
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
		    System.out.println("\n\nCOLECCIÓN DE DISCOS");
		    System.out.println("===================");
		    System.out.println("1. Listado");
		    System.out.println("2. Nuevo disco");
		    System.out.println("3. Modificar");
		    System.out.println("4. Borrar");
		    System.out.println("5. Salir");
		    System.out.print("Introduzca una opción: ");
		    opcion = teclado.nextInt();
		    
		    switch(opcion) {
		    case 1:
		    	showList();
		    case 2:
			    System.out.println("Introduce código: ");
			    String codigo = teclado.next();
			    System.out.println("Introduce autor: ");
			    String autor = teclado.next();
			    System.out.println("Introduce titulo: ");
			    String titulo = teclado.next();
			    System.out.println("Introduce genero: ");
			    String genero = teclado.next();
			    System.out.println("Introduce duracion: ");
			    String duracion = teclado.next();
			    
		    }

		    
		}while (opcion !=5);
	    
		String codigo = teclado.next();
		String autor = teclado.next();
		String titulo = teclado.next();
		String genero = teclado.next();
		int duracion = teclado.nextInt();
		
		
	}
	
}

