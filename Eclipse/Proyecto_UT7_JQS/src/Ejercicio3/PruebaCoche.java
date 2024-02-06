package Ejercicio3;
import java.util.Scanner;
import java.util.ArrayList;

public class PruebaCoche extends Coche {
	Scanner teclado = new Scanner (System.in);
	private ArrayList<Coche> listaCoches;

	public PruebaCoche() {
		this.listaCoches = new ArrayList<>();
		this.teclado = new Scanner(System.in);
	}
	public ArrayList<Coche> mostrarCoches() {
		return listaCoches;
	}
	public void agregarCoche() {
        System.out.println("Ingrese la información del coche:");
        System.out.print("Matrícula: ");
        String matricula = teclado.next();
        System.out.print("Marca: ");
        String marca = teclado.next();
        System.out.print("Modelo: ");
        String modelo = teclado.next();
        System.out.print("Kilometros: ");
        int kilometros = teclado.nextInt();

        Coche coche = new Coche(matricula, marca, modelo, kilometros);
        listaCoches.add(coche);
    }
	public void mostrarPorMarca() {
        System.out.println("¿Qué marca quieres buscar?");
        String respuestaMarca = teclado.next();
        boolean marcaEstado= false;
        System.out.println("Coches de la marca " + respuestaMarca + ":");
        for (Coche coche : listaCoches) {
            if (coche.getMarca().equals(respuestaMarca)) {
                System.out.println("Matrícula: " + coche.getMatricula());
                System.out.println("Modelo: " + coche.getModelo());
                System.out.println("Kilómetros: " + coche.getKilometros());
                System.out.println("---------------------");
                marcaEstado= true;
            } else if(!marcaEstado) {
            	System.out.println("No hay coches de esa marca");
            }
        }
    }
	 public void mostrarPorKm() {
	        System.out.println("¿Hasta qué kilometraje quieres buscar?");
	        int kilometraje = teclado.nextInt();
	        System.out.println("Coches por debajo de " + kilometraje + " kilómetros(incluidos):");
	        for (Coche coche : listaCoches) {
	            if (coche.getKilometros() <= kilometraje) {
	                System.out.println("Matrícula: " + coche.getMatricula());
	                System.out.println("Marca: " + coche.getMarca());
	                System.out.println("Modelo: " + coche.getModelo());
	                System.out.println("---------------------");
	            } else if(kilometraje<coche.getKilometros()) {
	            	System.out.println("No hay ningun coche que cumpla el kilometraje pedido");
	            }
	        }
	    }
	}
