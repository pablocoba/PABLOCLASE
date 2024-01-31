package ellago;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca los segundos");
		int tSegundos =teclado.nextInt();
		int tMinutos = tSegundos/60;
		int tMinSegundosRestantes = tSegundos%60;
		int tHoras = tMinutos/60;
		int tHorasMinRestantes = tMinutos%60;
		System.out.println(tHoras+" horas y "+tHorasMinRestantes+" minutos " + tMinSegundosRestantes + " segundos");

	}

}
