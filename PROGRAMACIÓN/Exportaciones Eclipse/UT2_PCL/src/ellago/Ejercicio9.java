package ellago;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		/*9.- Diseña un programa Java que solicite un número de 5 dígitos del teclado, separe el número en sus dígitos individuales y los muestre por pantalla. Por ejemplo, si el número es 53123 que muestre:

			5 3 1 2 3*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número de 5 cifras");
		int numero = teclado.nextInt();
		
		String cinco= String.valueOf(numero);
		
		teclado.close();
		int b=0;
		
		//método 1 con un bucle (prohibido!!!)
		
		for(int a=0; a<cinco.length();a++) {
			
			System.out.print(cinco.charAt(a) + " ");
		}
		
		//método 2 usando la fuerza bruta
		
		System.out.print(cinco.charAt(b) + " ");
		b++;
		System.out.print(cinco.charAt(b) + " ");
		b++;
		System.out.print(cinco.charAt(b) + " ");
		b++;
		System.out.print(cinco.charAt(b) + " ");
		b++;
		System.out.print(cinco.charAt(b) + " ");
		b++;
		
		//método 3 usando las MATEMÁTICAS!!!!!
		
		int nuevo,nuevo1,nuevo2,nuevo3;
		nuevo=numero%10000;
		nuevo=nuevo/1000;
		nuevo1=numero%1000;
		nuevo1=nuevo1/100;
		nuevo2=numero%100;
		nuevo2=nuevo2/10;
		nuevo3=numero%10;
		System.out.print((numero/10000) + " " + nuevo + " " + nuevo1  + " " + nuevo2 + " "  + nuevo3);

	}

}
