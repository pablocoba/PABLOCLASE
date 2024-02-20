package com.isabel;
/*
 * Todos los problemas utilizan el mismo esquema: dado un caso de entrada hay que escribir
algo sobre el.
Para que se pueda probar con certeza que el programa funciona, este tendra que ser
probado con numerosos casos de entrada, y dar la respuesta correcta para todos ellos.
Para hacerlo, hay tres alternativas o \estilos de entrada":
1. Al principio de la ejecucion, el programa recibe el numero de casos de prueba que
se utilizan.
2. El programa va leyendo casos de prueba hasta que se encuentra con un caso de
prueba especial.
3. El programa va leyendo casos de prueba hasta que se alcanza el final de la entrada
(no quedan mas datos).
Dependiendo de si es una u otra alternativa el esquema general del programa sera
distinto. Como consejo recomendamos que se utilice una funcion/metodo que se encargue
de resolver un caso de prueba y que sea llamado desde el programa principal tantas veces
como sea necesario.
 */
import java.util.Scanner;
/* En la consola se introduce un número y por cada uno dice si es par o impar*/
/*Casos de pruebas ilimitados*/
public class Prueba1 {
	static Scanner in=new Scanner(System.in);
	
	public static boolean casoDePrueba() {
		int n;
		if (!in.hasNext())
			return false;
		n=in.nextInt();
		if ((n%2)==0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		return true;
	}
	public static void main(String args[]) {
		while (casoDePrueba()) {
			
		}
	}
}
