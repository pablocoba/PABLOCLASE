package com.ellago;

/**
 * @author Pablo Coba Lodin
 */


public class FRecursivas {

	
	/**
	 * Devuelve el factorial de un numero mediante una funcion recursiva
	 * @param num numero del que queremos su factorial
	 * @return factorial de un numero
	 */
	public static int factorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		else {

			return num*(factorial(num-1));
			
		}
		
	}
	
	/**
	 * Devuelve la el numero de fibonacci de una posicion pasada por parametro, mediante recursividad
	 * @param num Posicion deseada
	 * @return el numero de la posicion pedida (ej: posicion = 6, returns 5)
	 */
	public static int fibonacci(int num){

		if(num == 1) {
			return 0;
		}
		if(num == 2) {
			return 1;
		}
		else {
			if(num>1) {
				return fibonacci(num-1)+fibonacci(num-2);
			}
			return 0;
		}
		
	}
	
	/**
	 * Devuelve la potencia proporcionandole la base y exponente en funcion recursiva
	 * @param base base del numero
	 * @param exponente exponente del numero
	 * @return resultado de la potencia
	 */
	
	public static int potencia (int base, int exponente) {
		//base 5, exponente 2
		if(exponente == 0) {
			return 1;
		}
		if(exponente == 1) {
			return base;
		}
		else {
			return base * potencia(base, exponente-1);
		}

	}
	
	/**
	 * Devuelve la suma de los digitos de un numero mediante recursividad
	 * @param num numero cuyos digitos sumaremos
	 * @return suma de los digitos
	 */
	
	public static int sumarDig (int num) {
		
		if(num == 0) {
			return 0;
		}
		
		else return (num%10+ sumarDig(num/10));
	}
	
}

