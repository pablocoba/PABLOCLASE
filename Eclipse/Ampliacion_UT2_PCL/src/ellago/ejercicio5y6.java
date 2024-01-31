package ellago;

import java.util.Scanner;

public class ejercicio5y6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la circunferencia");
		double radio = teclado.nextDouble();
		double longitud = radio*2*Math.PI;
		System.out.println("Su longitud es de "+longitud);
	}

}
