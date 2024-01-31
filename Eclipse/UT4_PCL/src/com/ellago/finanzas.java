package com.ellago;
/**
 * @author Pablo Coba Lodín
 * 1.	Realiza una clase finanzas que convierta dólares a euros y viceversa. 
 * 		Codifica los métodos dolaresToEuros y eurosToDolares. 
 * 		Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares.
		La clase tiene que tener:
		 Un constructor finanzas() por defecto, el cual establecerá el cambio Dólar-Euro en 1.36.
		 Un constructor finanzas(double), el cual permitirá configurar el cambio dólar-euro.

             _.oood"""""""booo._
         _.o""      _____    * ""o._
       oP"  _.ooo""""   """"o|o*_* "Yo
     o8   oP                 | |"._* `8o
    d'  o8'_.--._            | |/  ,\* `b
   d'  d'.' __   ".          | |: (( `\
  8'  d'/,-"  `.   :         | |  ||\_/* `8
 8   8'|/      :   :    |)   _ |  || |`|   8
,8  8          :  :   /)| \ || |\_|| | |8  8.
8' ,8         /  :    " /_) |`:' | | | |8. `8
8  8'        /  /       _ _='  \ ' __   __  8
8  8        /  /        \|__ |  | |  | | 8| 8
8  8.      /  /         ||   |  | |-:' | 8| 8
8. `8    ,' ,'       __/ |__ |__| |  \ |__|,8
`8  8  ,' ,'      _ /     __ . . . . . .8LL8'
 8   8"   `------'/(    ,'  `.`. | | ,-|8  8
  8.(_________dd_/  \__/ '  0|`.`: |: (8 ,8
   Y.  Y.                    | :/| |,\|* .P
    Y.  "8.          .,o     | | |,|"*  ,P
     "8.  "Yo_               | |p|"* ,8"
       "Y_   `"ooo.__   __.oo|"* * _P"
         `'"oo_     """""    * _oo""'
              `"""boooooood"""'
 */
import java.util.Scanner;



public class finanzas { //creamos la clase pública finanzas 
	//inicializamos variable cambio
	private double cambio;
	
	//establecemos el método del cambio
	public finanzas() {cambio = 1.36;}
	
	//método para cambiar el valor de cambio
	public finanzas(double c) {this.cambio = c;}
	
	//métodos de cambio de divisa
	public double eurosToDol(double eur) {
		return eur*cambio;
	}
	public double dolToEur(double dol) {
		return dol/cambio;
	}
	
	public static void main(String[] args) {

		//bool para cerrar el bucle 
		boolean encendido = true;
		Scanner teclado = new Scanner(System.in);
		
		//bucle para que se repita cuantas veces sean
		while(encendido=true) {
			//nuevo objeto
			finanzas f1 = new finanzas();

			//pedimos número
			System.out.println("\nIntroduce un número para cambiar: ");
			double num = (double)teclado.nextInt();
			System.out.println("\nSeleccione si es un cambio euro-dol o dol-euro: ");
			System.out.println("\nPulse 0: euro-dolar.\nPulse 1: dol-euro\nPulse 2: salir");
			int a = teclado.nextInt();
			
			//el switch es para elegir la opción solamente
			switch(a) {
			case 0:
				//imprimimos la función euros a dolares
				System.out.println(num +"€ = " + f1.eurosToDol(num)+"$");
				
				//preguntamos si se quiere cambiar el cambio de moneda
				System.out.println("\n¿Deseas cambiar el cambio de la moneda?\nPulse 0: No.\nPulse 1: Sí\n");
				int b = teclado.nextInt();
				//nuevo switch para la respuesta a la pregunta anterior
				switch(b) {
				case 0:
					//se cumple la condición del while y acaba el bucle
					encendido = false;
					break;
					
				case 1:
					System.out.println("\nIntroduce el nuevo cambio (Ex: Introducir \"2\" significaría que un euro vale dos dólares): ");
					double cnuevo = (double)teclado.nextInt();
					finanzas f2 = new finanzas(cnuevo);
					
					System.out.println(num+"€ = "+f2.eurosToDol(num)+"$");
					
					break;
					
				}
				
				break;
			case 1:
				//imprimimos la función dolares a euros
				System.out.println(num +"$ = " + f1.dolToEur(num)+"€");
				//preguntamos si se quiere cambiar el cambio de moneda
				System.out.println("\n¿Deseas cambiar el cambio de la moneda?\nPulse 0: No.\nPulse 1: Sí\n");
				int x = teclado.nextInt();
				//nuevo switch para la respuesta a la pregunta anterior
				switch(x) {
				case 0:
					//se cumple la condición del while y acaba el bucle
					encendido = false;
					
				case 1:
					System.out.println("\nIntroduce el nuevo cambio: ");
					double cnuevo = (double)teclado.nextInt();
					//creamos nuevo objeto con el cambio introducido 
					finanzas f2 = new finanzas(cnuevo);
					//imprimimos el nuevo resultado
					System.out.println(num+"$ = "+f2.dolToEur(num)+"€");
					break;
					
				}
				
				
				
				break;
			case 2:
				//se cumple la condición del while y acaba el bucle
				encendido = false;
			}
		}
		teclado.close();
		}


	}


