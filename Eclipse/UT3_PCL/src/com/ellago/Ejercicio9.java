package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 		9.	Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
		El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula 
		sumando los dos anteriores, por lo que tendríamos que los términos son 
		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir por teclado.
 */
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = teclado.nextInt();
		teclado.close();//cerrar teclado!
		int fib = 0;
		int temp1 = 0;
		int temp2 = 1;
		
		for(int i=0;i<=(n-1);i++) {
			System.out.print(fib+" "); //empezamos todo imprimiendo para que salga el 0 inicial.
			fib=temp1+temp2; //sumamos las temporales y luego ya las cambiamos.
			temp2=temp1; //trasladamos el ultimo num de fibonacci a una variable temporal para quedarnos con ella para la siguiente suma
			temp1=fib;	//lo mismo con la otra variable temporal.
				
		}

	}

}
