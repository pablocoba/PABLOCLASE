package ellago;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		
		//5.- Diseña un programa Java que pida dos números por teclado, determine si el primero es múltiplo del segundo y muestre el resultado.
			
			int x,y;
			Scanner teclado =new Scanner(System.in); //ejecutamos escaner
			System.out.println("Introduce un número");
			x=teclado.nextInt();
			System.out.println("Introduce otro número");
			y=teclado.nextInt();
			
			teclado.close(); //cerramos escaner
			String multiplo=(x%y==0||y%x==0)?" es múltiplo ":" no es múltiplo "; //usamos el resto de su division entre 0 para saber si es múltiplo o no
									//el ||(or) es para que de igual el orden en el que introducimos los números
			
			System.out.printf("El número %s%sde %s",x,multiplo,y);
			
			}
	}
