package com.ellago;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "La casa de pablo es roja";
		System.out.println("El string es: ");
		System.out.println(cadena);
		System.out.println();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce cuántos caracteres cambiar.");
		System.out.println("");
		int opcion = teclado.nextInt();
		switch(opcion) {
		
		}
		System.out.println("Introduce un número de caracteres");

		int numeroCaracteres = teclado.nextInt();
		
		

		
		System.out.println("Introduce el caracter que quieres quitar");
		String oldChar = teclado.next();
		
		System.out.println("Introduce el caracter que quieres poner");
		String newChar = teclado.next();
		
		String charX = cadena;
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			
			
			if(cadena.charAt(i) == oldChar.charAt(0)) {
				if(i == 0) {
					charX = newChar + charX.substring(1);
				}
				else {
					charX = charX.substring(0,i)+newChar+charX.substring(i+1);
				}
			}	
		}
		System.out.println(charX);
	}

}
