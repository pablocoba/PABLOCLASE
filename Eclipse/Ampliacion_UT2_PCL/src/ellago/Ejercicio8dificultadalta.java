package ellago;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8dificultadalta {


	public static void main(String[] args) {
		String abecedario = "abcdefghijklmnopqrstuvwxyz";
		boolean salir = false;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Pulsa 1 para imprimir número, pulsa 0 para salir");
			int switchoption = teclado.nextInt();
			switch(switchoption) {
			case 0: salir=true;
			
			case 1: Random random = new Random();
			 		char randomchar = abecedario.charAt(random.nextInt(26));

			 		if(randomchar == 'a'||randomchar == 'e'||randomchar == 'i'||randomchar == 'o'||randomchar == 'u') {
				 		System.out.println("\n"+randomchar+" (vocal)\n");
			 		}
			 		else {
				 		System.out.println("\n"+randomchar+" (consonante)");
			 		}

		}
		}while(salir==false);

		teclado.close();
		
		
		}

}
