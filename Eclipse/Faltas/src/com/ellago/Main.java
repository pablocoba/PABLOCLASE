package com.ellago;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Sistemas.showData();
		//horario.showHorario();
		
		///*bbdd*/6, 
		///*prog*/10, 
		///*ingl*/2, 
		///*entorn*/0, 
		///*marcas*/7, 
		///*sistemas*/3, 
		///*fol*/6);
		Scanner teclado = new Scanner(System.in);
		Horario horario = new Horario();
		Horario horarioSegunda = new Horario();

		int bbdd = 0;
		int prog = 0;
		int ing = 0;
		int ent = 0;
		int mar = 0;
		int sis = 0;
		int fol = 0;
		int bbdd2 = 0;
		int prog2 = 0;
		int ing2 = 0;
		int ent2 = 0;
		int mar2 = 0;
		int sis2 = 0;
		int fol2 = 0;
		int opcion = 0;
		


		boolean salir = false;
		do{
			System.out.println("Seleccione una opción:");
			System.out.println("1. Año");
			System.out.println("3. Salir");
			int notaSeleccion = 0;
			opcion = teclado.nextInt();
			switch(opcion) {

				case 1:
					horario.festivosTotal();

					System.out.println("A continuación debes introducir tus faltas totales.");
					System.out.println("Ten en cuenta que hay horas dobles: debes contarlas individualmente.\n(Si el lunes hay 2 horas de bases de datos, introduce 2 si faltaste a toda la clase).\n");
					if(bbdd == 0) {
						System.out.println("Introduce tus faltas en base de datos:");
						bbdd = teclado.nextInt();
					}
					if(prog == 0) {
						System.out.println("Introduce tus faltas en programación.");
						prog = teclado.nextInt();
					}
					if(ing == 0) {
						System.out.println("Introduce tus faltas en inglés.");
						ing = teclado.nextInt();
					}
					if(ent == 0) {
						System.out.println("Introduce tus faltas en entornos.");
						ent = teclado.nextInt();
					}
					if(mar == 0) {
						System.out.println("Introduce tus faltas en lenguaje de marcas.");
						mar = teclado.nextInt();
					}
					if(sis == 0) {
						System.out.println("Introduce tus faltas en sistemas.");
						sis = teclado.nextInt();
					}
					if(fol == 0) {
						System.out.println("Introduce tus faltas en FOL.");
						fol = teclado.nextInt();
					}
					
					horario.setHorasFaltas(bbdd, prog, ing, ent, mar, sis, fol);
					horario.calcularHorasTotales();
					Horario.calcularPorcentajesTodo();
					
					System.out.println("\nIntroduce qué faltas deseas consultar.");
					System.out.println("1. Todas");
					System.out.println("2. BBDD");
					System.out.println("3. PROGRAMACION");
					System.out.println("4. INGLES");
					System.out.println("5. ENTORNOS");
					System.out.println("6. LENGUAJE DE MARCAS");
					System.out.println("7. SISTEMAS");
					System.out.println("8. FOL");
					System.out.println("9. Salir");
					
					notaSeleccion = teclado.nextInt();

					switch(notaSeleccion){
					case 1:
						Horario.bases.showData();
						Horario.programacion.showData();
						Horario.ingles.showData();
						Horario.entornos.showData();
						Horario.marcas.showData();
						Horario.sistemas.showData();
						Horario.fol.showData();
						horario.showFaltasTot();
						System.out.println();
						break;
					case 2:
						Horario.bases.showData();
						horario.showFaltasTot();
						System.out.println();
						break;
					case 3:
						Horario.programacion.showData();
						horario.showFaltasTot();
						System.out.println();
						break;
					case 4:
						Horario.ingles.showData();
						horario.showFaltasTot();
						System.out.println();
						break;
					case 5:
						Horario.entornos.showData();
						horario.showFaltasTot();
						System.out.println();
						break;
					case 6:
						Horario.marcas.showData();
						horario.showFaltasTot();
						System.out.println();
						break;
					case 7:
						Horario.sistemas.showData();
						horario.showFaltasTot();
						System.out.println();
						break;
					case 8:
						Horario.fol.showData();
						horario.showFaltasTot();
						System.out.println();
						break;
					case 9:
						salir = true;
					}

					break;

				case 3:
				salir = true;
			}
			
		}while(salir == false);
		//horario.showHorasTotales();

//		horario.setHorasFaltas(
//				/*bbdd*/12, 
//				/*prog*/16, 
//				/*ingl*/4, 
//				/*entorn*/0, 
//				/*marcas*/7, 
//				/*sistemas*/4, 
//				/*fol*/6);

	}

}
