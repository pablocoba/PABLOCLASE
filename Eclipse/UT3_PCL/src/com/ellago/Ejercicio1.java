package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 1.	Realiza un programa con tres variables de tipo entero a, b y c. El programa deberá mostrar por pantalla el valor menor y mayor.
 */
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); //pedimos los numeritos
		System.out.println("Introduce un número");
		int a=teclado.nextInt();
		System.out.println("Introduce otro número");
		int b=teclado.nextInt();
		System.out.println("Introduce otro número");
		int c=teclado.nextInt();
		teclado.close();//cerrar teclado
		if(a>b&a>c) { //este if es en el caso de que el primero sea el mayor
			if(b>c) {
				System.out.println(a + " es el mayor y " + c + " es el menor");
			}
			else {
				System.out.println(a + " es el mayor " + b + " es el menor ");
			}	
		}
		else if(b>a&b>c) {	//este if es en el caso de que el segundo sea el mayor
			if(a>c) {
				System.out.println(b + " es el mayor y " + c + " es el menor");
			}
			else {
				System.out.println(b + " es el mayor " + a + " es el menor ");
			}
		}
		else if(c>a&c>b){	//este if es en el caso de que el tercero sea el mayor
			if(b>a) {
				System.out.println(c + " es el mayor y " + a + " es el menor");
			}
			else {
				System.out.println(c + " es el mayor " + b + " es el menor ");
			}
				
		}
		
		
	}
}


