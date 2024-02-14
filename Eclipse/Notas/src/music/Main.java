package music;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		int num = 20;
		Scanner teclado = new Scanner(System.in);
		Nota nota = new Nota();
		menu(teclado, nota, num);
		teclado.close();
	}

	private static void menu(Scanner teclado, Nota nota, int num) {
		int opc = 1;
		
		
		
		while(opc != 9) {
			switch (opc) {
			case 1:

				opc = bucleMain(teclado,nota,num);
				break;
			case 20:

				opc = bucleMainSilenced(teclado,nota,num);
				break;
			}

		}
		teclado.close();


	}

	private static int bucleMain(Scanner teclado, Nota nota, int num) {

		do {
			
			textMenu();
			num = teclado.nextInt();
			switch(num) {
			case 1:
				System.out.println("Se silenciará el menú, para reactivarlo, pulsa 1.");
				num = 20;
				break;
			case 2:
				nota.generarNota();
				System.out.println(nota);
				break;	
			case 3:
				nota.generarNota();
				
				nota.generarCuerda();
				System.out.println(nota.getCuerda() + " - " + nota);

				break;
			case 4:
				nota.generarNotaBemol();
				System.out.println(nota);
				break;
			case 5:
				nota.quinta();
				System.out.println(nota.getQuinta()+"<-quinta");
				String quinta = teclado.next();
				if(nota.getQuinta().equals(quinta)) {
					System.out.println("Correcto. La quinta de " + nota.getNota() + " es "+nota.getQuinta());
				}
				else System.out.println("No es correcto. La quinta de "+nota.getNota()+" es "+nota.getQuinta());
				break;
			case 6:
				casoIntervalo(teclado, nota);
			case 9:
				break;
			default:
				break;
			}
			
		}while(num != 9 && num != 20);
		
		return num;
	}


	private static int bucleMainSilenced(Scanner teclado, Nota nota, int num) {

		do {

			num = teclado.nextInt();
			switch(num) {
			case 1:
				System.out.println("Se habilitará el menú, para volver a desactivarlo, pulsa 1.");
				num = 1;
				break;
			case 2:
				nota.generarNota();
				System.out.println(nota);
				break;
			case 3:
				nota.generarNota();

				nota.generarCuerda();
				System.out.println(nota.getCuerda() + " - " + nota);

				break;
			case 4:
				nota.generarNotaBemol();
				System.out.println(nota);
				break;
			case 5:
				nota.quinta();
				System.out.println(nota.getQuinta()+"<-quinta");
				String quinta = teclado.next();
				if(nota.getQuinta().equals(quinta)) {
					System.out.println("Correcto. La quinta de " + nota.getNota() + " es "+nota.getQuinta());
				}
				else System.out.println("No es correcto. La quinta de "+nota.getNota()+" es "+nota.getQuinta());
				break;
			case 6:
				casoIntervalo(teclado, nota);
			case 9:
				break;
			default:
				break;
				
			}
			
		}while(num != 9 && num != 1);
		return num;
	}

	private static void textMenu() {
		System.out.println("Selecciona una opción: ");
		System.out.println("1. Silenciar menú");
		System.out.println("2. Nueva nota ");
		System.out.println("3. Nueva nota + cuerda");
		System.out.println("4. Nueva nota (posibilidad de b y #)");
		System.out.println("5. Hallar la quinta");
		System.out.println("6. Hallar Intervalo");
		System.out.println("9. Salir");
	}

	private static String intAstringIntervalo(Nota nota) {
		String notaIntervalo = null;
		switch(nota.getInterval()) {
		case 2:
			notaIntervalo = "segunda";
			break;
		case 3:
			notaIntervalo = "tercera";
			break;
		case 4:
			notaIntervalo = "cuarta";
			break;
		case 5:
			notaIntervalo = "quinta";
			break;
		case 6:
			notaIntervalo = "sexta";
			break;
		case 7:
			notaIntervalo = "septima";
			break;
		}
		return notaIntervalo;
	}

	private static void casoIntervalo(Scanner teclado, Nota nota) {
		nota.intervalo();
		String respuesta = teclado.next();
		String notaIntervalo = intAstringIntervalo(nota);
		switch(nota.getInterval()) {
		case 2:
			
			if(Character.toString(nota.getSegunda().charAt(nota.getSegunda().length()-1)).equals(respuesta)) {
				System.out.println("Correcto. La " + notaIntervalo + " de " + nota.getNota() + " es "+nota.getSegunda());
			}
			else System.out.println("No es correcto. La "+ notaIntervalo +" de "+nota.getNota()+" es "+Character.toString(nota.getSegunda().charAt(nota.getSegunda().length()-1)));
			break;
		case 3:
			if(nota.getTercera().equals(respuesta)) {
				System.out.println("Correcto. La " + notaIntervalo + " de " + nota.getNota() + " es "+nota.getTercera());
			}
			else System.out.println("No es correcto. La "+ notaIntervalo +" de "+nota.getNota()+" es "+nota.getTercera());
			break;
		case 4:
			if(nota.getCuarta().equals(respuesta)) {
				System.out.println("Correcto. La " + notaIntervalo + " de " + nota.getNota() + " es "+nota.getCuarta());
			}
			else System.out.println("No es correcto. La "+ notaIntervalo +" de "+nota.getNota()+" es "+nota.getCuarta());
			break;
		case 5:
			if(nota.getQuinta().equals(respuesta)) {
				System.out.println("Correcto. La " + notaIntervalo + " de " + nota.getNota() + " es "+nota.getQuinta());
			}
			else System.out.println("No es correcto. La "+ notaIntervalo +" de "+nota.getNota()+" es "+nota.getQuinta());
			break;
		case 6:
			if(nota.getSexta().equals(respuesta)) {
				System.out.println("Correcto. La " + notaIntervalo + " de " + nota.getNota() + " es "+nota.getSexta());
			}
			else System.out.println("No es correcto. La "+ notaIntervalo +" de "+nota.getNota()+" es "+nota.getSexta());
			break;
		case 7:
			if(nota.getSeptima().equals(respuesta)) {
				System.out.println("Correcto. La " + notaIntervalo + " de " + nota.getNota() + " es "+nota.getSeptima());
			}
			else System.out.println("No es correcto. La "+ notaIntervalo +" de "+nota.getNota()+" es "+nota.getSeptima());
			break;
		}
	}

}
