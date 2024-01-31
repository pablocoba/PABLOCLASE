package ellago;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {

		//7.- Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x), suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
		
		//"C1x + C2 = 0" es la ecuación

		float num1;
		float num2;
		float result;
		Scanner teclado =new Scanner(System.in);
		System.out.println("Introduce un número");
		num1=teclado.nextInt();
		System.out.println("Introduce un número");
		num2=teclado.nextInt();
		
		teclado.close(); //cerar escaner
		
		System.out.printf("Se calculará la ecuación %sx + %s = 0",num1,num2);
		num2=-num2;//convierto la variable en su negativo
		System.out.printf("\n%sx = %s",num1,num2);
		System.out.printf("\nx = %s / %s",num2,num1);
		result=num1/num2;							//he decidido meter todos los cambios en variables en vez de hacerlos en el texto
													//para poder hacer cambios en el texto fácilmente y mantener el valor de las variables
		System.out.printf("\nx = %s",result);
		

	}

}
