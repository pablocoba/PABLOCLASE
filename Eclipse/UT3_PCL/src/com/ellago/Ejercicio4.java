package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 4.	Se desea conocer el lucky number (número de la suerte) de cualquier persona. 
		El número de la suerte se consigue reduciendo la fecha de nacimiento a un 
		número de un solo dígito. Por ejemplo, la fecha de nacimiento de Emma es la 
		siguiente: 16-08-1973 → 16+8+1973 = 1997 → 1+9+9+7=26 → 2+6 =8. 
		El número de la suerte de Emma será el 8. 
		Realiza un programa que calcule el lucky number de cualquier persona.
		 
 */
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce tu día de nacimiento: ");
		int dia = teclado.nextInt();
		System.out.println("introduce tu mes de nacimiento numéricamente: ");
		int mes = teclado.nextInt();
		System.out.println("introduce tu año de nacimiento: ");
		int ano = teclado.nextInt();
		teclado.close(); //pedimos datos

		int suma1 = (dia+mes+ano); //sumamos todos
		int acum;
		int num = 0;
		

		
		do {
			acum=0;
			String cade=String.valueOf(suma1);
			for(int i = 0; i < cade.length();i++) {
				num = Character.getNumericValue(cade.charAt(i));
				acum = acum + num;
			}
			
			
			suma1 = acum;
			
		}while(acum > 9);
		

		
		System.out.println("Tu lucky number es el "+acum);
	
	}

}
