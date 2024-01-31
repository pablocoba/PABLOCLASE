package com.ellago;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Pablo Coba Lodín
 */

public class Array {

	/**
	 * Crea un array con numeros enteros aleatorios del 1 al 10
	 * @param longitud longitud del array
	 * @return Array de numeros aleatorios
	 */
	
	public static int[] crearArrayInt(int longitud) {
		
		int[] arrayInt = new int[longitud];
		
		for(int i=0;i<longitud;i++) {
			arrayInt[i]= (int) (Math.random()*10);
		}
			
		return arrayInt;
		
	}
	
	
	/**
	 * Crea un array con datos aleatorios del 1 al 10
	 * @param longitud longitud del array
	 * @return Array de datos aleatorios
	 */
	
	public static String[] crearArrayString(int longitud) {
		
		String[] arrayString = new String[longitud];

		for(int i = 0; i<longitud; i++) {
			
			arrayString[i]= "Dato" + (int)(Math.random()*10);
			
		}
		
		return arrayString;
		
	}
	
	/**
	 * Muestra el array de numeros enteros
	 * @param arrayInt Array de enteros
	 * @return Syso del array
	 */
	
	public static void mostrarArrayInt(int[] arrayInt) {
		
		for(int i = 0; i<arrayInt.length;i++) {
			System.out.print(arrayInt[i]+" ");

		}
		System.out.println();

		
	}
	
	/**
	 * Muestra el array de datos
	 * @param arrayString Array de datos
	 * @return Syso del array
	 */
	
	public static void mostrarArrayString(String[] arrayString) {
		
		for(int i = 0; i<arrayString.length;i++) {
			System.out.print(arrayString[i]+" ");}

		System.out.println();
	}
	
	/**
	 * Busca un número en un array de enteros
	 * @param arrayInt array en el que buscar
	 * @param num número que checkear
	 * @return true o false dependiendo de si lo encuentra o no
	 */
	
	public static boolean buscarArrayInt(int[] arrayInt, int num) {
		
		for(int i = 0; i<arrayInt.length;i++) {
			
			if(arrayInt[i]==num) {
				return true;
			}
			
		}
		return false;

	}
	
	/**
	 * Busca un dato en un array de Strings
	 * @param arrayString array en el que buscar
	 * @param dato dato que checkear
	 * @return true o false dependiendo de si lo encuentra o no
	 */
	
	public static boolean buscarArrayString(String[] arrayString, String dato) {
		
		for(int i = 0; i<arrayString.length;i++) {
			
			if(arrayString[i].equals(dato)) {
				return true;
			}
			
		}
		
		return false;

	}
	
	/**
	 * Busca la posicicion de un entero en un array de ints, y si no devuelve -1
	 * @param arrayInt array en el que buscar
	 * @param num numero que checkear
	 * @return la posicion en la que se encuentra, si no lo encuentra, devuelve -1
	 */
	
	public static int localizaPosInt(int[] arrayInt, int num) {
		
		for (int i = 0; i < arrayInt.length; i++) {
			
			if(arrayInt[i]==num) {;
				
				return i;
			}
		}
		return -1;
		
	}
	
	/**
	 * Busca la posicicion dato en un array de Strings, y si no devuelve -1
	 * @param arrayString array en el que buscar
	 * @param dato dato que checkear
	 * @return el numero de la posicion en el array
	 */
	
	public static int localizaPosString(String[] arrayString, String dato) {
		
		for (int i = 0; i < arrayString.length; i++) {
			
			if(arrayString[i].equals(dato)) {;
				
				return i;
			}
		}
		return -1;
		
	}
	
	/**
	 * Devuelve el numero de veces que se repite el numero.
	 * @param arrayInt array en el que buscar
	 * @param num dato que checkear
	 * @return numero de veces que se repite.
	 */
	
	public static int vecesIntArray(int[] arrayInt, int num) {
		
		int contador = 0;
		
		for (int i = 0; i < arrayInt.length; i++) {
			
			if(arrayInt[i]==num) {;
				
				contador++;
			}
			
		}
		
		return contador;
		
	}
	
	/**
	 * Devuelve el numero de veces que se repite el dato.
	 * @param arrayString array en el que buscar
	 * @param dato dato que checkear
	 * @return número de veces que se repite.
	 */
	
	public static int vecesStringArray(String[] arrayString, String dato) {
		
		int contador = 0;
		
		for (int i = 0; i < arrayString.length; i++) {
			
			if(arrayString[i].equals(dato)) {;
				
				contador++;
			}
			
		}
		
		return contador;
		
	}

	/**
	 * Devuelve la suma de dos arrays
	 * @param arrayInt1 sumando 1
	 * @param arrayInt2 sumando 2
	 * @return el nuevo Array
	 */
	
	public static int[] unirArraysInt(int[] arrayInt1, int[] arrayInt2) {
		
		int longitud = arrayInt1.length + arrayInt2.length;
		
		int[] nuevo = new int[longitud];
		
		for (int i = 0; i < arrayInt1.length; i++) {
			
			nuevo[i] = arrayInt1[i];
			
		}
		for(int i = 0; i<arrayInt2.length;i++) {
			nuevo[i+arrayInt1.length]=arrayInt2[i];
		}				
		
		return nuevo;
		
	}
	
	/**
	 * Cambia los valores de la posicion de un array que coincidan con el numero introducido
	 * y lo sustituye por el otro numero introducido
	 * @param arrayInt array del que se desea cambiar
	 * @param numBuscado numero que se desea cambiar
	 * @param numSustituto numero que quedara
	 * @return contador de las veces que se cambio
	 */
	
	public static int sustituirIntArray(int[] arrayInt, int numBuscado, int numSustituto) {
		
		int contador=0;
		
		for (int i = 0; i < arrayInt.length; i++) {
			if(numBuscado==arrayInt[i]) {
				arrayInt[i]=numSustituto;
				contador++;
			}

		}
		
		if(contador>0) {
			return contador;
		}
		return -1;
		
	}
	
	/**
	 * Cambia los valores de la posicion de un array que coincidan con el dato introducido
	 * y lo sustituye por el otro dato introducido
	 * @param arrayString array del que se desea cambiar
	 * @param buscado numero que se desea cambiar
	 * @param sustituto numero que quedara
	 * @return contador de las veces que se cambio
	 */
	
	public static int sustituirStringArray(String[] arrayString, String buscado, String sustituto) {
		
		int contador=0;
		
		for (int i = 0; i < arrayString.length; i++) {
			if(arrayString[i].equals(buscado)) {
				arrayString[i]=sustituto;
				contador++;
			}

		}
		if(contador>0) {
			return contador;
		}
		return -1;
		
	}
	
	/**
	 * Ordena de menor a mayor un array de ints (burbuja propio)
	 * @param arrayInt array del que se desea cambiar
	 * @return array ordenado
	 */
	
	public static int[] ordenarIntArray(int[] arrayInt) {
		int temporal = 0;

		//primer bucle para recorrer todo el array menos 1
		for(int i = 0; i<arrayInt.length-1;i++) {
				//segundo bucle para recorrer el array menos 1
				//del primero menos 1
			for(int j=0;j<arrayInt.length-1;j++) {
				
				if(arrayInt[j+1] < arrayInt[j]) {
					//asignamos a la temporal el siguiente valor
					temporal = arrayInt[j+1];
					//al siguiente valor le asignamos el actual, que es mayor
					arrayInt[j+1]=arrayInt[j];
					//al actual valor le asignamos el temporal, que es el siguiente valor
					arrayInt[j]=temporal;
					//así se intercambian
				}
			
			}			
			
		}
		
		return arrayInt;
		}
	
	/**
	 * Ordena de menor a mayor un array de ints (burbuja apuntes)
	 * @param datos array del que se desea cambiar
	 * @return array ordenado
	 */
	
	public static void ordenarIntArray2(int[] datos) {
		 for (int i = 1; i < datos.length; i++) {
			 boolean ordenado=true;
			 for (int j = 0; j < datos.length-i; j++) {
				 if (datos[j + 1] < datos[j]) {
					 // Intercambio (swapping)
					 int aux = datos[j + 1];
					 datos[j + 1] = datos[j];
					 datos[j] = aux;
					 ordenado=false;
				 	}
				 }
				 if (ordenado) return;
			 }
		}

	/**
	 * (propio) Ordena de menor a mayor un array de strings mediante el método de la burbuja 
	 * @param arrayString array del que se desea cambiar
	 * @return array ordenado
	 */
	
	public static String[] ordenarStringArray(String[] arrayString) {
		String temporal = "";
		for(int i = 0; i < arrayString.length-1; i++) {
				
			for(int j=0; j < arrayString.length-1; j++) {

				if(arrayString[j+1].charAt(4) < arrayString[j].charAt(4)) {
					temporal = arrayString[j+1];
					arrayString[j+1] = arrayString[j];
					arrayString[j] = temporal;
				}
				
			}			
			
		}
		
		return arrayString;

	}
	
	/**
	 *  (apuntes) Ordena de menor a mayor un array de strings mediante el método de la burbuja
	 * @param datos array del que se desea cambiar
	 * @return array ordenado
	 */
	
	public static void ordenarStringArray2(String[] datos) {
		 for (int i = 1; i < datos.length; i++) {
			 boolean ordenado=true;
			 for (int j = 0; j < datos.length-i; j++) {
				 if (datos[j + 1].charAt(4) < datos[j].charAt(4)) {
					 // Intercambio (swapping)
					 String aux = datos[j + 1];
					 datos[j + 1] = datos[j];
					 datos[j] = aux;
					 ordenado=false;
				 	}
				 }
				 if (ordenado) return;
			 }
		}
	
	/**
	 * Busca un entero en un array de Ints mediante busqueda dicotómica
	 * @param arrayInt array en el que se busca
	 * @param buscado numero buscado
	 * @return la posicion del array en la que se encuentra
	 */
	
	public static int buscarInt(int[] arrayInt, int buscado) {
		
		int inicio = 0;
		int fin = arrayInt.length -1;
		
		while(inicio<=fin) {
			int centro = (inicio+fin)/2;
			if(arrayInt[centro]<buscado) {
				inicio = centro + 1;
			}
			else if (arrayInt[centro]>buscado) {
				fin = centro-1;
			}
			else {
				return centro;
			}
			
		}
		return -1;
	}
	
	/**
	 * Busca un String en un array de Strings mediante busqueda dicotómica
	 * @param arrayString array en el que se busca
	 * @param buscado numero buscado
	 * @return la posicion del array en la que se encuentra
	 */
	
	public static int buscarString(String[] arrayString, String buscado) {
		
		int inicio = 0;
		int fin = arrayString.length -1;
		
		while(inicio<=fin) {
			int centro = (inicio+fin)/2;
			if(arrayString[centro].compareTo(buscado)<0) {
				inicio = centro + 1;
			}
			else if (arrayString[centro].compareTo(buscado)>0) {
				fin = centro-1;
			}
			else {
				return centro;
			}
			
		}
		return -1;
	}
	
	/**
	 * Crea un array de Personas
	 * @param longitud será la cantidad de personas que creará
	 * @return Array de Personas
	 */
	
	
	public static Persona[] crearArrayPersona(int longitud) {
		
		Persona[] arrayPersona = new Persona[longitud];			
		
		for(int i = 0; i < longitud; i++) {
			char rndchar = (char)((int)Math.floor(Math.random()*(90-65+1)+65));
			int rndint = (int) (Math.random()*(200-1)+1);
			
			int edad = (int) (Math.random()*(95-18) + 18);
			String nombre = rndchar + String.valueOf(rndint);
			arrayPersona[i] = new Persona(nombre, edad);
		}
		
		return arrayPersona;
		
	}
	
	/**
	 * Muestra un array de Personas
	 * @param arrayPersona el array de Personas que queremos mostrar
	 * @return un Syso del array
	 */
	
	
	public static void mostrarArrayPersona(Persona[] arrayPersona) {
		
		for(int i = 0; i<arrayPersona.length; i++) {
			System.out.println("Persona "+ i + ":\nNombre: " + arrayPersona[i].getNombre() + "\nEdad: " + arrayPersona[i].getEdad());
			System.out.println();
		}
		
	}
	
	//MAL HECHO
	
	/**
	 * MAL HECHO (sin usar la interfaz comparable) Muestra un array de Personas
	 * @param arrayPersona el array de Personas que queremos ordenar
	 * @return el array ordenado
	 */
	
	public static Persona[] ordenarArrayPersona(Persona[] arrayPersona) {
		int temporal = 0;
		for(int i = 0; i < arrayPersona.length-1; i++) {
				
			for(int j=0; j < arrayPersona.length-1; j++) {

				if(arrayPersona[j+1].getEdad() < arrayPersona[j].getEdad()) {
					temporal = arrayPersona[j+1].getEdad();
					arrayPersona[j+1].setEdad(arrayPersona[j].getEdad()) ;
					arrayPersona[j].setEdad(temporal);
				}
				
			}			
			
		}
		
		return arrayPersona;
	}
	
	/**
	 * Bien hecho (usando la interfaz comparable) Ordena un array de Personas
	 * @param arrayPersona el array de Personas que queremos mostrar
	 * @return el array ordenado
	 */
	
	public static Persona[] ordenarArrayPersona2(Persona[] arrayPersona) {
		int temporal = 0;
		for(int i = 0; i < arrayPersona.length-1; i++) {
			
			for(int j=0; j < arrayPersona.length-1; j++) {

					Arrays.sort(arrayPersona);		
				
			}		
		}
	
		return arrayPersona;
	}
	
        /**
	 * crea una matriz de enteros
	 * @param x Filas
     * @param y Columnas
	 * @return matriz de enteros
	 */
        
	public static int[][] crearMatrizInt(int x, int y){
		
		int[][] matrizInt = new int[x][y];
		
		for(int i = 0; i < x; i++) {
			
			for(int j = 0; j < y; j++) {
				
				matrizInt[i][j] = (int)(Math.random()*(121-20)+20);
				
			}
			
		}
		
		return matrizInt;
		
	}
        
        /**
	 * crea una matriz de Strings
	 * @param x Filas
         * @param y Columnas
	 * @return matriz de Strings
	 */	
        
	public static String[][] crearMatrizString(int x, int y){
		
            String[][] matrizString = new String[x][y];
           
            

            
		for(int i = 0; i < x; i++) {

			for (int j = 0; j < y; j++) {
                            
                            int rnd = (int)(Math.random()*(102-1)+1);
                            char rndchar2 = (char)((int)(Math.random()*(91-65)+65));	
                            matrizString[i][j] = "" +  rndchar2 + rnd;
                            
			}
			
		}
		
                return matrizString;
                
	}
        
        /**
	 * muestra una matriz de enteros
	 * @param matrizInt matriz a mostrar
	 * @return Syso de la matriz
	 */	
        
        public static void mostrarMatrizInt(int[][] matrizInt) {
		
		for(int i = 0; i < matrizInt.length; i++) {
			
			for(int j = 0; j < matrizInt[i].length; j++) {
				
				System.out.print(matrizInt[i][j] + " ");
				
			}
			
		}
		
	}
        
        /**
	 * muestra una matriz de Strings
	 * @param matrizString matriz a mostrar
	 * @return Syso de la matriz
	 */	        
        
       public static void mostrarMatrizString(String[][] matrizString) {
		
		for(int i = 0; i < matrizString.length; i++) {
			
			for(int j = 0; j < matrizString.length; j++) {
				
				System.out.print(matrizString[i][j] + " ");
				
			}
			
		}
		
	}
		
	
	
}

