package com.ellago;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {
	
	public static double nota;
	public static boolean terminar=false;
	public static int aprobados=0;
	public static int suspensos=0;
	public static double notamedia=0;
	public static double totalnotas=0;
	public static ArrayList<Double> notas = new ArrayList<Double>();
	public static double notaMedia(ArrayList<Double> notas) {
	double totalnotas = 0;
	for(int i = 0; i<notas.size();i++) {

		totalnotas+= notas.get(i);
		}
		return totalnotas/notas.size();
	}
	
	public static void introducirNota(Scanner teclado) {
		for(int i = 0; terminar==false; i++) {
			System.out.println("Escriba la nota. Introduce  \"-1\" para finalizar.");
			nota = teclado.nextDouble();
			if(nota==-1.0) {
				terminar=true;
				teclado.close();
			}
			else {
				
				notas.add(nota);
				if(nota>=5) {
					aprobados++;
				}
				else {suspensos++;}
			}
			
		}
	}
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		introducirNota(teclado);
		System.out.println();

		for(int i = 0; i<notas.size();i++) {
			System.out.println("Nota "+(i+1)+": "+notas.get(i));
		}
		System.out.printf("\nLa nota media es: %.2f\n", notaMedia(notas));
		
		teclado.close();
		
		
		
	}

}
