package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 3.Realiza un programa utilizando bucles que muestre la siguiente figura por pantalla:
		   *
		  ***
		 *****
		*******
		 *****
		  ***
		   *
		o una pirámide introduciendo la altura y el carácter con el que se muestre.
 */
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("pon un numero impar de filas: ");
		int lindeseadas = teclado.nextInt(); //pedimos filas
		if(lindeseadas % 2 != 0) { //este bucle es para que sólo funcione si el número introducido es impar, ya que no puede ser par si queremos que salga rombo
			int lin= (lindeseadas/2)+1;//esto es para que traduzca las líneas que se piden con los valores q necesitarán los bucles
			System.out.println("pon un símbolo o dígito: ");
			String sim = teclado.next();//pedimos el tipo de caracter
			teclado.close();//cerramos teclado
			
			
			int esp=lin-1; //ajustamos número de espacios (líneas menos 1)
			int ast=1;
			
			for(int i=1; i<=lin;i++) {  //bucle para hacer la pirámide
				for(int k = 0; k<esp;k++) {//bucle para espacios
					System.out.print(" ");
				}
				for(int j = 0; j<ast;j++) { //bucle para simbolos
					System.out.print(sim);
				}
				System.out.println();
				esp=esp-1;
				ast=ast+2;
		
			}
			ast=ast-4;
			esp=esp+2; //ajustar los valores para que la pirámide invertida se vea correctamente
			for(int x = 1; x<=lin;x++) { //bucle para la pirámide invertida q forma el rombo
				
				for(int z = 0; z<esp; z++) {
					System.out.print(" ");
				}
				for(int y = 0; y<ast;y++) {
					System.out.print(sim);
				}

				System.out.println();
				esp=esp+1;
				ast=ast-2;
			}
		}
		else {System.err.print("pon un número impar merluzo");} //el mensaje de error
		
		


		
	}

}
