package ellago;

import java.util.Scanner;

public class joven {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca edad");
		int edad = teclado.nextInt();
		
		System.out.println("Introduzca nivel de estudios (del 1 al 5)");
		int nivelDeEstudios = teclado.nextInt();

		System.out.println("Introduzca ingresos");
		double ingresos = teclado.nextDouble();

		boolean jasp = false;
		
		if((edad <=28 & nivelDeEstudios > 3 ) || (edad<30 & ingresos > 28000) ) {
			jasp = true;
		}
		
		System.out.println(jasp);
		
		

	}

}
