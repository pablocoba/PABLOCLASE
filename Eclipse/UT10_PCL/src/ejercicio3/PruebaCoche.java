package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaCoche {

	public static void main(String[] args) {
		ArrayList<Coche> listaCoche = new ArrayList<Coche>();
		Scanner teclado = new Scanner(System.in);
		int opc = 0;
		menu(listaCoche, teclado);
	}

	//imprime el menú para utilizar el programa.
	private static void menu(ArrayList<Coche> listaCoche, Scanner teclado) {
		int opc;
		do {
			
			System.out.println("1. Introducir coche.");
			System.out.println("2. Ver la lista completa.");
			System.out.println("3. Buscar por marca.");
			System.out.println("4. Buscar por kilometraje.");
			System.out.println("5. Salir.");
			opc = teclado.nextInt();
			switch(opc){
			case 1:
				introducirCoche(listaCoche, teclado);
				System.out.println();
				break;
			case 2:
				mostrarCoches(listaCoche);
				System.out.println();
				break;
			case 3:
				mostrarPorMarca(listaCoche, teclado);
				System.out.println();
				break;
			case 4:
				mostrarPorKm(listaCoche, teclado);
				System.out.println();
				break;
			case 5:
				break;
			default:
				System.out.println("Seleccione una opción correcta");
			}
			
		}while(opc!=5);
	}

	//permite introducir un nuevo coche
	private static Scanner introducirCoche(ArrayList<Coche> listaCoche, Scanner teclado) {

		System.out.println("Introduce marca.");
		String marca = teclado.next();
		System.out.println("Introduce modelo.");
		String modelo = teclado.next();
		System.out.println("Introduce matrícula.");
		String matricula = teclado.next();
		System.out.println("Introduce Km.");
		int km = teclado.nextInt();
		
		Coche c1 = new Coche(matricula, marca, modelo, km);

		listaCoche.add(c1);
		return teclado;
	}
	//muestra la lista completa si hay coches en ella.
	public static void mostrarCoches(ArrayList<Coche> listaCoche) {
		if(listaCoche.size()!=0) {
			System.out.println(listaCoche);
		}
		else System.out.println("No hay coches. Introduzca coches pulsando 1.\n");

	}
	//pide al usuario una marca y la busca, si la encuentra, te muestra los coches de dicha marca.
	public static void mostrarPorMarca(ArrayList<Coche> listaCoche, Scanner teclado) {
		
		System.out.println("¿Qué marca deseas buscar?");
		String marca = teclado.next();
		if(listaCoche.size()!=0) {
			for (int j = 0; j < listaCoche.size(); j++) {
				if(marca.equals(listaCoche.get(j).getMarca())) {
					System.out.println(listaCoche.get(j));
				}
				else System.out.println("Vehículo no encontrado");
			}
		}

		else System.out.println("No hay coches. Introduzca coches pulsando 1.\n");;


	}
	
	//pide un kilometraje y muestra los coches por debajo el mismo
	public static void mostrarPorKm(ArrayList<Coche> listaCoche, Scanner teclado) {
		
		System.out.println("Introduce el máximo de Km para el vehículo que buscas.");
		int km = teclado.nextInt();
		if(listaCoche.size()!= 0) {
			for (int j = 0; j < listaCoche.size(); j++) {
				if(km >= listaCoche.get(j).getKm()) {
					System.out.println(listaCoche.get(j));
				}
				else System.out.println("Lo sentimos, ninguno de nuestros vehículos tiene un kilometraje menor al número introducido.");
			}
		}
		else System.out.println("No hay coches. Introduzca coches pulsando 1.\n");;

	}

}
