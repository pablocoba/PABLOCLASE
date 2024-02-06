package com.ellago;

public class Frecursivas {
	
	//1.factorial: función recursiva que devolverá el factorial de un número pasado como parámetro.
		public static int factorial(int n) {
			if(n==0||n==1) {
				return 1;
			}else {
				return n*factorial(n-1);
			}
		}
		
	//2.fibonacci: función recursiva que devolverá el número fibonacci de una posición pasada como parámetro.
		public static int fibonacci(int n) {
			if(n==0) {
				return 0;
			}else if(n==1) {
				return 1;
			}else {
				return fibonacci(n-1)+fibonacci(n-2);
			}
		}
		
	//3.potencia: función recursiva que devolverá la potencia de un número, pasándole como parámetros la base y el exponente.
		public static int potencia(int base, int exponente) {
			if(exponente==0) {
				return 1;
			}else {
				return base*potencia(base, exponente-1);
			}
		}
		
	//4.sumardig: función recursiva que devolverá la suma de los dígitos de un número, pasándole como parámetro el número.
		public static int sumardig(int n) {
			if(n==0) {
				return 0;
			}else {
				return n%10+sumardig(n/10);
			}
		}
	    

}
