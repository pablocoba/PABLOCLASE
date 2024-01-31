package music;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		Scanner teclado = new Scanner(System.in);
		Nota nota = new Nota();
		menu(teclado, nota, num);
	}

	private static void menu(Scanner teclado, Nota nota, int num) {
		int opc = 2;
		while(opc != 3) {
			switch (opc) {
			case 2:

				opc = bucleMain(teclado,nota,num);
				break;
			case 20:

				opc = bucleMainSilenced(teclado,nota,num);
				break;
			}

		}



	}

	private static int bucleMain(Scanner teclado, Nota nota, int num) {

		do {
			
			textMenu();
			num = teclado.nextInt();
			switch(num) {
			case 1:
				nota.generarNota();
				System.out.println(nota);
				break;
			case 2:
				System.out.println("Se silenciará el menú, para reactivarlo, pulsa 2.");
				num = 20;
				break;
			case 3:
				break;
			}
			
		}while(num != 3 && num != 20);
		
		return num;
	}
	private static int bucleMainSilenced(Scanner teclado, Nota nota, int num) {

		do {

			num = teclado.nextInt();
			switch(num) {
			case 1:
				nota.generarNota();
				System.out.println(nota);
				break;
			case 2:
				System.out.println("Se habilitará el menú, para volver a desactivarlo, pulsa 2.");
				num = 2;
				break;
			case 3:
				break;
			}
			
		}while(num != 3 && num != 2);
		return num;
	}

	private static void textMenu() {
		System.out.println("Selecciona una opción: ");
		System.out.println("1. Nueva nota ");
		System.out.println("2. Silenciar menú");
		System.out.println("3. Salir");
	}

	private static void hideMenu() {
		
	}

}
