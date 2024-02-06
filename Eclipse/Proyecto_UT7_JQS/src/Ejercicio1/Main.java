package Ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Tienda tienda = new Tienda(0);

	        tienda.agregarProducto(1, 3, "Mesa");
	        tienda.agregarProducto(2, 2, "Silla");
	        tienda.agregarProducto(3, 5, "Sofá");
	        tienda.agregarProducto(4, 4, "Cama");

	        System.out.println("Stock Inicial:");
	        System.out.println(tienda);

	        tienda.simularVentaOnline();

	        System.out.println("Stock después de la venta online:");
	        System.out.println(tienda);
	        
	        System.out.println("\nMete codigo!!!!!!!!!!!!:");
	        Scanner scanner=new Scanner(System.in);
	        int codigo=scanner.nextInt();
	        scanner.close();
	        tienda.venderEnTienda(codigo);
	        //😋😋😋😋😋😋
	    }
	}
