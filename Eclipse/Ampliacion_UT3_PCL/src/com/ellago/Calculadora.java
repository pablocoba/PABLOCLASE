package com.ellago;

import java.util.Scanner;

public class Calculadora {

	public static double suma(double a, double b) {
		return a+b;
	}
	public static double resta(double a, double b) {
		return a-b;
	}
	public static double producto(double a, double b) {
		return a*b;
	}
	public static double resto(double a, double b) {
		return a/b;
	}
	public static double potencia(double a, double b) {
		return Math.pow(a, b);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Elige una opción\n1.- Operaciones básicas.\n2.- Operaciones complejas.\n3.-Salir.");
		Scanner teclado = new Scanner(System.in);
		int tecla = teclado.nextInt();
		char tecla2;
		double a,b;
		switch(tecla) {
		case 1:
			System.out.println("Elige una opción\na) Suma.\nb) Resta.\nc) Producto.\nd) Division");
			tecla2 = teclado.next().charAt(0);
			switch(tecla2) {
			case 97 | 65:
				System.out.println("Introduce el primer valor a sumar");
				a = teclado.nextDouble();
				System.out.println("Introduce el segundo valor a sumar");
				b = teclado.nextDouble();
				System.out.println(suma(a,b));
				break;
			case 98 | 66:
				System.out.println("Introduce el primer valor");
				a = teclado.nextDouble();
				System.out.println("Introduce el valor a restar");
				b = teclado.nextDouble();
				System.out.println(resta(a,b));
				break;
			case 99 | 67:
				System.out.println("Introduce el primer valor");
				a = teclado.nextDouble();
				System.out.println("Introduce el valor a multiplicar");
				b = teclado.nextDouble();
				System.out.println(producto(a,b));
				break;

			case 100 | 68:
				System.out.println("Introduce el dividendo");
				a = teclado.nextDouble();
				System.out.println("Introduce el divisor");
				b = teclado.nextDouble();
				System.out.println(resto(a,b));
				break;
			default:
				System.err.println("Dato no válido");
				break;
			}
			break;
		case 2:
			System.out.println("Elige una opción\na) Potencia.\nb) Raíz Cuadrada.");
			tecla2 = teclado.next().charAt(0);
			switch(tecla2) {
			case 97 | 65:
				System.out.println("Introduce la base");
				a = teclado.nextDouble();
				System.out.println("Introduce el exponente");
				b = teclado.nextDouble();
				System.out.println(potencia(a,b));
				break;
				
			case 98 | 66:
				System.out.println("Introduce la base");
				a = teclado.nextDouble();

				System.out.println(Math.sqrt(a));
				break;
				
			default:
				System.err.println("Dato no válido");
				break;
			
			}
		case 3:
			break;
		default:
			System.err.println("Dato no válido");
			break;
		}

	}

}
