package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zona principal = new Zona(1000);
		Zona compraVenta = new Zona(200);
		Zona vip = new Zona(25);
		
		boolean end = false;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("\nSelecciona una opción:\n");
			System.out.println("1- Mostrar número de entradas libres");
			System.out.println("2- Comprar entradas");
			System.out.println("3- Salir");
			int opc = teclado.nextInt();
			switch(opc) {
			case 1:
				System.out.printf("Sala principal: %d entradas", principal.getEntradasPorVender());
				System.out.printf("\nCompra-venta: %d entradas", compraVenta.getEntradasPorVender());
				System.out.printf("\nSala VIP: %d entradas", vip.getEntradasPorVender());
				break;
			case 2:
				System.out.println("Seleccione qué tipo de entradas quiere comprar.");
				System.out.println("4- Principal");
				System.out.println("5- Compra Venta");
				System.out.println("6- Sala VIP");
				System.out.println("7- Salir");
				int opc2 = teclado.nextInt();
				loop: switch(opc2) {
				case 4:
					System.out.println("¿Cuántas entradas se van a comprar?");
					int num = teclado.nextInt();
					principal.vender(num);

					break loop;
				case 5:
					System.out.println("¿Cuántas entradas se van a comprar?");
					int num2 = teclado.nextInt();
					principal.vender(num2);
					break loop;
				case 6:
					System.out.println("¿Cuántas entradas se van a comprar?");
					int num3 = teclado.nextInt();
					principal.vender(num3);
					break loop;
				case 7:
					end = true;
					break loop;
				}
			break;
			case 3:
				end=true;
				break;
			}


		}while(end == false);
	}

}
