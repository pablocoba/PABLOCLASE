package ellago;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 4.- Realiza las siguientes modificaciones en el programa anterior:

			1. Añade comentarios, entre otros:
			
			• Nombre de clase, descripción y autor
			• Comentario para la clase main y para cada una de las llaves de cierre
			
			2. Utiliza el operador de asignación para inicializar las variables a los valores que se indican en los mensajes.
			3. Utiliza la secuencia de escape correspondiente para generar un tabulador al principio de cada línea salvo de la primera
			4. Mostrar el siguiente resultado:
			
			• Usando sólo la orden println:
			----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
				El valor de la variable casado es true
				El valor de la variable MAXIMO es 999999
				El valor de la variable diasem es 1
				El valor de la variable diaanual es 300
				El valor de la variable miliseg es 1298332800000
				El valor de la variable totalfactura es 10350.678
				El valor de la variable poblacion es 6775235741
				El valor de la variable sexo es M
			
			• Usando sólo la orden printf:
			
			----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
				El valor de la variable casado es true
				El valor de la variable MAXIMO es 999999
				El valor de la variable diasem es 1
				El valor de la variable diaanual es 300
				El valor de la variable miliseg es 1298332800000
				El valor de la variable totalfactura es 10350,677734
				El valor de la variable totalfactura en notación científica es 1.035068E+04
				El valor de la variable poblacion es 6775235741
				El valor de la variable sexo es M		 
		 */
			
			final int valormax = 999999;
			boolean casado = true; 
			byte dia_semana = 1;
			short dia_anual = 300;
			char male = 'M';
			char female = 'F';
			char sexo=(male==female)?'M':'F';
			long miliseg = 1298332800000l;
			float totalfactura = 10350.678f;
			float totalfactura2 = 10350.677734f;
			long poblacion = 6775235741l;
			
			System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
			System.out.println("\tEl valor de la variable casado es " + casado);
			System.out.println("\tEl valor de la variable diasem es" + dia_semana);
			System.out.println("\tEl valor de la variable diaanual es" + dia_anual);
			System.out.println("\tEl valor de la variable miliseg es" + miliseg);
			System.out.println("\tEl valor de la variable totalfactura es" + totalfactura);
			System.out.println("\tEl valor de la variable poblacion es" + poblacion);  
			System.out.println("\tEl valor de la variable sexo es" + male);  
			
			System.out.printf("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
			System.out.printf("\n\t%s%s","El valor de la variable casado es ", casado);
			System.out.printf("\n\t%s%s","El valor de la variable diasem es", dia_semana);
			System.out.printf("\n\t%s%s","El valor de la variable diaanual es ", dia_anual);
			System.out.printf("\n\t%s%s","El valor de la variable miliseg es ", miliseg);
			System.out.printf("\n\t%s%f","El valor de la variable totalfactura es ", totalfactura2);
			System.out.printf("\n\t%s%e","El valor de la variable totalfactura en notación científica es ", totalfactura2);
			System.out.printf("\n\t%s%s","El valor de la variable poblacion es ", poblacion);  
			System.out.printf("\n\t%s%s","El valor de la variable sexo es ", male); 
	}

}
