import java.util.*;
//import matematicas.*;
/**
* Prueba varias funciones
*
* 
*/
public class PruebaFunciones {
	public static void main(String[] args) {
		Scanner dato=new Scanner (System.in);
		int n;
		
		// Prueba esPrimo()
		System.out.print("Introduzca un número entero positivo: ");
		n = dato.nextInt();
		//Acceso a la función con paquete.clase.función
		if (matematicas.Varias.esPrimo(n)) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + " no es primo.");
		}
		
		//Prueba digitos()
		System.out.print("Introduzca un número entero positivo: ");
		n = dato.nextInt();
		System.out.println(n + " tiene " + matematicas.Varias.digitos(n) + " dígitos.");
		
		//Prueba volumenCilindro()
		double r, h;
		System.out.println("Cálculo del volumen de un cilindro");
		System.out.print("Introduzca el radio en metros: ");
		r = dato.nextDouble();
		System.out.print("Introduzca la altura en metros: ");
		h = dato.nextDouble();
		System.out.println("El volumen del cilindro es " + 
				matematicas.Geometria.volumenCilindro(r, h) + " m3");
		dato.close();
	}
}
