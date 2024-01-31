package ellago;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {

			/*8.- Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos números introducidos por teclado. Incorpora también las funciones que permitan realizar la potencia de un número y la raíz cuadrada del otro.

		Ejemplo de salida del programa para x=9, y=3:

		Introducir primer numero: 9
		Introducir segundo numero: 3
		x = 9.0 y = 3.0
		x + y = 12.0
		x - y = 6.0
		x * y = 27.0
		x / y = 3.0
		x ^ 2 = 81.0
		√ x = 3.0
			*/
			Scanner teclado= new Scanner(System.in);
	
			System.out.printf("Introduce 1 número ");
			float num1 = teclado.nextInt();
			System.out.printf("Introduce otro número ");
			float num2 = teclado.nextInt();
	
			System.out.printf("x = %s y = %s",num1,num2);
			System.out.printf("\nx + y = %s", (num1+num2));
			System.out.printf("\nx - y = %s", (num1-num2));
			System.out.printf("\nx * y = %s", (num1*num2));
			System.out.printf("\nx / y = %s", (num1/num2));
			System.out.printf("\nIntroduce 1 exponente ");
			float exp = teclado.nextInt();
			float potencia= (float) (Math.pow(num1,exp)); //meto la formula de la potencia en una variable
			teclado.close();//cerramos teclado
			System.out.printf("\nx ^ 2 = %s", potencia);
			float raiz=(float)Math.sqrt(num1);	//meto la formula de la raíz en una variable
			System.out.printf("\n√ x = %s", (raiz));
		
		
	}

}
 