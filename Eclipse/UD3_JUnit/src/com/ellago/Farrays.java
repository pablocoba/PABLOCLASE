package com.ellago;

public class Farrays {
	
	//1.buscarArrayInt: buscará un  entero dentro de un array, devolverá true si lo encuentra y false si no. El array y el entero serán pasados como parámetros.
	public static boolean buscarArrayInt(int[]arrayInt, int myInt) {
    	boolean result=false;  	 
    	for (int i=0; i<arrayInt.length; i++) {
        	System.out.print(arrayInt[i]+" ");
			if(arrayInt[i] == myInt) {
				result=true;	
			}		
		}
    	return result;
    }
	
	
	//2.buscarArrayString: buscará un String dentro de un array de String y devolverá true si o encuentra y false en caso contrario. Tanto el array como el String serán lpasados por parámetros.
	public static boolean buscarArrayString(String[]arrayString, String myString) {    	
    	boolean result=false;
    	for (int i=0; i<arrayString.length; i++) {
			System.out.print(arrayString[i]+" ");
			if(arrayString[i].equals(myString)) {
				result=true;	
			}	
		}  	
    	return result;
    }
	
	//3.localizaPosInt: localizará la primera posición del entero en el array y la devolverá; en caso contrario, devolverá -1. Tanto el array como el valor serán pasados por parámetros.
	public static int localizaPosInt(int[]arrayInt, int myInt) {
    	for (int i=0; i<arrayInt.length; i++) {
    		if(arrayInt[i]==myInt) {
    			return i;
    		}
    	} return -1;
    }
	
	//4.localizaPosString: localizará la primera posición del String en el array. Si no se encuentra, devolverá -1. Tanto el array como el valor serán pasados por parámetros.
	public static int localizaPosString (String[]arrayString, String myString) {
    	for (int i=0; i<arrayString.length; i++) {
			if(arrayString[i].equals(myString)) {
				return i;
			}
		} return -1; 
    	
    }
	
	//5.vecesIntArray: devolverá el número de veces que aparece el entero en el array. Tanto el array como el entero se pasarán como parámetros.
	public static int vecesIntArray(int[]arrayInt, int myInt) {
	  int veces=0;
	  for (int i=0; i<arrayInt.length; i++) {
	    if(arrayInt[i]==myInt) {
		  veces++;
		 }
		}  return veces;
	}
	
	//6.vecesStringArray: devolverá el número de veces que aparece el String en el array. Tanto el array como el String serán pasados por parámetros.
	public static int vecesStringArray(String[]arrayString, String mystring) {
    	int veces=0;
    	for (int i=0; i<arrayString.length; i++) {
			if(arrayString[i].equals(mystring)) {
				veces++;
			}
    } return veces;
}
	
	//7.sustituirIntArray: cambiará los enteros encontrados en el array por el segundo entero y devolverá el número de veces que se ha cambiado. Si no se ha cambiado ninguna vez, devolverá  -1. Parámetros a pasar: el array de enteros, el número buscado, el número a sustituir.
	public static int sustituirIntArray(int[]arrayInt, int enteroABuscar, int enteroASustituir) {
		int veces=0;
		for (int i=0; i<arrayInt.length; i++) {
			if (arrayInt[i]==enteroABuscar) {
				arrayInt[i]=enteroASustituir;
				veces++;
			}
		}
		if(veces==0) {
			veces=-1;
		}
		return veces;
	}
	
	//8.sustituirStringArray: cambiará los String encontrados en el array por el segundo String pasado como parámetro. Devolverá el número de veces que se ha cambiado dicho string; en caso contrario, devolverá -1. Parámetros a pasar: array de String, String buscado, String a sustituiir
	public static int sustituirStringArray(String[]arrayString, String stringABuscar, String stringASustituir) {
		int veces=0;
		for(int i=0; i<arrayString.length; i++) {
			if(arrayString[i].equals(stringABuscar)) {
				arrayString[i]=stringASustituir;
				veces++;
			}
		}
		if(veces==0) {
			veces=-1;
		}
		return veces;
	}
	
	//9.busquedaDicotomicaInt:Realizar la búsqueda dicotómica de un entero en un array ordenado. Devolverá la posición si lo encuentra y -1 en caso contrario (mirar documento de algoritmos de ordenación) 
	public static int busquedaDictomicaInt(int[]arrayIntOrdenado, int enteroABuscar) {
		int inicio=0;
		int fin=arrayIntOrdenado.length-1;
		int resultado=-1;
		while(inicio<=fin) {
			int centro = (inicio+fin)/2;
			if(arrayIntOrdenado[centro]<enteroABuscar) {
				inicio = centro+1;
			} else if(arrayIntOrdenado[centro]>enteroABuscar) {
				fin = centro-1;
			}else {
				resultado = centro;
				fin = centro-1;
			}
		}
		return resultado;
	}
	
	//10.busquedaDicotomicaString: Realizar la búsqueda dicotómica de un String en un array ordenado. Devolverá la posición si lo encuentra y -1 en caso contrario (mirar documento de algoritmos de ordenación) 
	public static int busquedaDictomiaString(String[]arrayStringOrdenado, String stringABuscar) {
		int inicio=0;
		int fin=arrayStringOrdenado.length-1;
		int resultado=-1;
		while(inicio<=fin) {
			int centro=(inicio+fin)/2;
			if(arrayStringOrdenado[centro].compareTo(stringABuscar)<0) {
				inicio=centro+1;
			}else if (arrayStringOrdenado[centro].compareTo(stringABuscar)>0) {
				fin=centro-1;
			}else {
				resultado=centro;
				fin=centro+1;
			}
		}
		return resultado;
	}		
	

}
