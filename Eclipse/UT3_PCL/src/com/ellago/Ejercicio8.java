package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 	8.	Realiza el control de acceso a una caja fuerte. La combinación será un número de 
	4 cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos, 
	se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos 
	se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
	Tendremos cuatro oportunidades para abrir la caja fuerte.
		
 */
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {

		int combi=1234; //combinación default
		Scanner teclado = new Scanner(System.in);
		
		int numint = 3;
		boolean x =true; //boolean para terminar el while
		
		//Esto es parecido pero con un for, no prestar atención
		
		/*do {//bucle de arranque
			for(numint = 3;numint>=0 & x;numint--) { //bucle para introducir contraseña
				System.out.println("INTRODUCE LA CONTRASEÑA:\n");
				int intento = teclado.nextInt();
				
				if(intento==combi) {
					System.out.println("\nCONTRASEÑA CORRECTA");
					x=false; //finaliza el bucle
				}
				else {
					System.out.println("\nCONTRASEÑA INCORRECTA, "+numint+" INTENTOS RESTANTES\n"); //lo de los intentos restantes sé que no hacía falta
				}
			}
			if(numint<=0) {
				System.err.print("NO SE ABRIRÁ LA CAJA"); 
				x=false;//finaliza el bucle
				}
		}while(x);*/
		
		do {
			System.out.println("INTRODUCE LA CONTRASEÑA:\n");
			int intento = teclado.nextInt();
			if(intento==combi) { //si el intento es igual que la combinación se acaba el bucle
				System.out.println("\nCONTRASEÑA CORRECTA");
				x=false; //finaliza el bucle
			}
			else {
				//si el intento es diferente a la combinación,
				//sigue el bucle
				System.out.println("\nCONTRASEÑA INCORRECTA, "+numint+" INTENTOS RESTANTES\n"); //lo de los intentos restantes sé que no hacía falta
			}
			if(numint<=0) {
				System.err.print("NO SE ABRIRÁ LA CAJA"); 
				x=false;//finaliza el bucle
				}
			numint--;//baja el contador para cada vuelta del bucle
			
		}while(x & numint>=0);
		
		
		teclado.close();//COMENTAR ESTO SI QUIERE QUE FUNCIONE LA SIGUIENTE PARTE 
		
		//los switches molan
		///////////////////////////////////////
		///////////////////////////////////////
		//todo esto es for fun
		/*
		System.out.println("\nDESEA CAMBIAR LA CONTRASEÑA?");
		System.out.println("INTRODUZCA 1 PARA SÍ");
		System.out.println("INTRODUZCA 0 PARA NO\n");
		int opcion = teclado.nextInt();
		
		switch(opcion) {
		case 1: 
			System.out.println("\nINTRODUZCA CONTRASEÑA DE 4 DÍGITOS:\n");
			int nuevapass = teclado.nextInt();
			
			combi=nuevapass; //pasamos la nueva contraseña a la combinación real
			System.out.println("\nSU NUEVA CONTRASEÑA ES "+combi);
			for(numint = 3;numint>=0;numint--) { //mismo bucle que antes
				System.out.println("\nINTRODUCE LA CONTRASEÑA:\n");
				int intento2 = teclado.nextInt();
				
				if(intento2==combi) {
					System.out.println("\nCONTRASEÑA CORRECTA");
					break;
				}
				else {
					System.out.println("\nCONTRASEÑA INCORRECTA, "+numint+" INTENTOS RESTANTES\n");
					
				}
			}
			teclado.close();//cerramos teclado
			break;
			
			
			
		case 2:
			
			System.exit(1);
			teclado.close(); //cerramos teclado
			break;
			
		}*/
		
	}

}
