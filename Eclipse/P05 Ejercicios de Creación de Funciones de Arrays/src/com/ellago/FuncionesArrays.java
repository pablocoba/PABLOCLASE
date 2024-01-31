package com.ellago;
import java.util.Arrays;
import java.util.Random;

/** @author Enzo
 * 
 * A continuación, se solicita crear las siguientes funciones con Arrays:
1.
CrearArrayInt: creará un array con números aleatorios enteros, pasándole como parámetro la longitud del array.
2.
CrearArrayString: creará un array con String que contendrá "Dato"+un número aleatorio, pasándole como parámetro la longitud del array.
3.
MostrarArrayInt: mostrará el contenido de un array pasado como parámetro.
4.
MostrarArrayString: mostrará el contenido de un array pasado como parámetro.
5.
BuscarArrayInt: buscará un entero dentro de un array, devolverá true si lo encuentra y false si no. El array y el entero serán pasados como parámetros.
6.
BuscarArrayString: buscará un String dentro de un array de String y devolverá true si o encuentra y false en caso contrario. Tanto el array como el String serán lpasados por parámetros.
7.
LocalizaPosInt: localizará la primera posición del entero en el array y la devolverá; en caso contrario, devolverá -1. Tanto el array como el valor serán pasados por parámetros.
8.
LocalizaPosString: localizará la primera posición del String en el array. Si no se encuentra, devolverá -1. Tanto el array como el valor serán pasados por parámetros.
9.
VecesIntArray: devolverá el número de veces que aparece el entero en el array. Tanto el array como el entero se pasarán como parámetros.
10.
VecesStringArray: devolverá el número de veces que aparece el String en el array. Tanto el array como el String serán pasados por parámetros.
11.
UnirArraysInt: devolverá un array con la unión de dos arrays pasado como parámetros...
12.
SustituirIntArray: cambiará los enteros encontrados en el array por el segundo entero y devolverá el número de veces que se ha cambiado. Si no se ha cambiado ninguna vez, devolverá -1. Parámetros a pasar: el array de enteros, el número buscado, el número a sustituir.
13.
SustituirStringArray: cambiará los String encontrados en el array por el segundo String pasado como parámetro. Devolverá el número de veces que se ha cambiado dicho string; en caso contrario, devolverá -1. Parámetros a pasar: array de String, String buscado, String a sustituiir.
14.
Ordenación de array de enteros (Método de la burbuja). Realizar una función que ordene un array por el método de la burbuja (mirar documento de algoritmos de búsquedas y ordenación)
15.
Ordenación de array de String (Métod de la burbuja). Realizar una función que ordene un array por el método de la burbuja (mirar documento de algoritmos de búsquedas y ordenación)
16.
Realizar la búsqueda dicotómica de un entero en un array ordenado. (mirar documento de algoritmos de ordenación)
17.
Realizar la búsqueda dicotómica de un String en un array ordenado. (mirar documento de algoritmos de ordenación)
18.
Consultar la clase Arrays en la API de Java y concretamente el método sort(). Crear un array de tipo entero y otro de tipo String y ordenarlo con este método. ¿Has visto qué tipo de algoritmo de ordenación usa?
19.
CrearArrayPersona: creará un array que contendrá valores el tipo de dato Persona que será una clase con las siguientes características:
1.
Dos atributos: nombre de tipo String y edad de tipo entero.
2.
Tendrá sus getters y setters por cada atributo.
3.
Al crear el array, el nombre de cada Persona será generado con una letra mayúscula generada aleatoriamente (mirar tabla ASCII) seguido de un número del 1 al 200 generados también aleatoriamente. La edad también se generará aleatoriamente del 1 al 120.
20.
MostrarArrayPersona: mostrará los valores de los atributos de las Personas de un Array.(sobreescribir método toString() de un objeto)
21.
OrdenarArrayPersona: ordenará el array de Personas según su edad (utilizad el método sort() de la clase Arrays. Para poder comparar objetos, la clase Persona deberá implementar el interfaz Comparable y sobreescribir el método compareTo.
22.
CrearMatrizInt: creará una matriz de enteros aleatorios de n filas y m columnas que serán pasados por parámetros. Los números aleatorios generados serán entre 20 y 120.
23.
CrearMatrizString: creará una matriz de String de n filas y m columnas pasadas como parámetros. El valor de cada String será formado por una letra mayúsculas generada aleatoriamente seguido de un número entre 1 y 101 generados también aleatoriamente.
24.
MostrarMatrizInt: mostrará una matriz de enteros pasada como parámetro.
25.
MostrarMatrizString: mostrará una matriz de String pasada como parámetro.
 *
 */

public class FuncionesArrays {

    /**
     * Crea un array de números aleatorios enteros.
     *
     * @param longitud Longitud del array.
     * @return Array de números aleatorios enteros.
     */
    public static int[] crearArrayInt(int longitud) {
        Random random = new Random();
        int[] arrayInt = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arrayInt[i] = random.nextInt();
        }
        return arrayInt;
    }

    /**
     * Crea un array de Strings con elementos "Dato" + número aleatorio.
     *
     * @param longitud Longitud del array.
     * @return Array de Strings.
     */
    public static String[] crearArrayString(int longitud) {
        Random random = new Random();
        String[] arrayString = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            arrayString[i] = "Dato" + random.nextInt();
        }
        return arrayString;
    }

    /**
     * Muestra el contenido de un array de enteros.
     *
     * @param array Array de enteros.
     */
    public static void mostrarArrayInt(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Muestra el contenido de un array de Strings.
     *
     * @param array Array de Strings.
     */
    public static void mostrarArrayString(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Busca un entero dentro de un array.
     *
     * @param array Array de enteros.
     * @param entero Entero a buscar.
     * @return true si se encuentra, false si no.
     */
    public static boolean buscarArrayInt(int[] array, int entero) {
        for (int elemento : array) {
            if (elemento == entero) {
                return true;
            }
        }
        return false;
    }
    /**
     * Busca un String dentro de un array de Strings.
     *
     * @param array Array de Strings.
     * @param cadena String a buscar.
     * @return true si se encuentra, false si no.
     */
    public static boolean buscarArrayString(String[] array, String cadena) {
        for (String elemento : array) {
            if (elemento.equals(cadena)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Localiza la primera posición del entero en el array.
     *
     * @param array Array de enteros.
     * @param valor Valor a localizar.
     * @return Posición del valor o -1 si no se encuentra.
     */
    public static int localizaPosInt(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Localiza la primera posición del String en el array.
     *
     * @param array Array de Strings.
     * @param valor Valor a localizar.
     * @return Posición del valor o -1 si no se encuentra.
     */
    public static int localizaPosString(String[] array, String valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Devuelve el número de veces que aparece el entero en el array.
     *
     * @param array Array de enteros.
     * @param entero Entero a contar.
     * @return Número de veces que aparece el entero.
     */
    public static int vecesIntArray(int[] array, int entero) {
        int contador = 0;
        for (int elemento : array) {
            if (elemento == entero) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Devuelve el número de veces que aparece el String en el array.
     *
     * @param array Array de Strings.
     * @param cadena String a contar.
     * @return Número de veces que aparece el String.
     */
    public static int vecesStringArray(String[] array, String cadena) {
        int contador = 0;
        for (String elemento : array) {
            if (elemento.equals(cadena)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Devuelve un array con la unión de dos arrays pasados como parámetros.
     *
     * @param array1 Primer array de enteros.
     * @param array2 Segundo array de enteros.
     * @return Array con la unión de los dos arrays.
     */
    public static int[] unirArraysInt(int[] array1, int[] array2) {
        int longitudTotal = array1.length + array2.length;
        int[] resultado = new int[longitudTotal];

        // Copiar elementos del primer array
        System.arraycopy(array1, 0, resultado, 0, array1.length);

        // Copiar elementos del segundo array
        System.arraycopy(array2, 0, resultado, array1.length, array2.length);

        return resultado;
    }

    /**
     * Cambia los enteros encontrados en el array por el segundo entero.
     * Devuelve el número de veces que se ha cambiado.
     *
     * @param array Array de enteros.
     * @param buscar Número a buscar.
     * @param sustituir Número con el que se reemplazan los encontrados.
     * @return Número de veces que se ha cambiado o -1 si no se cambió ninguno.
     */
    public static int sustituirIntArray(int[] array, int buscar, int sustituir) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscar) {
                array[i] = sustituir;
                contador++;
            }
        }
        return (contador > 0) ? contador : -1;
    }

    /**
     * Cambia los Strings encontrados en el array por el segundo String.
     * Devuelve el número de veces que se ha cambiado.
     *
     * @param array Array de Strings.
     * @param buscar String a buscar.
     * @param sustituir String con el que se reemplazan los encontrados.
     * @return Número de veces que se ha cambiado o -1 si no se cambió ninguno.
     */
    public static int sustituirStringArray(String[] array, String buscar, String sustituir) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(buscar)) {
                array[i] = sustituir;
                contador++;
            }
        }
        return (contador > 0) ? contador : -1;
    }


    /**
     * Ordena un array de enteros utilizando el método de la burbuja.
     *
     * @param array Array de enteros a ordenar.
     */
    public static void ordenarArrayIntBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    /**
     * Ordena un array de Strings utilizando el método de la burbuja.
     *
     * @param array Array de Strings a ordenar.
     */
    public static void ordenarArrayStringBurbuja(String[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    // Intercambiar elementos si están en el orden incorrecto
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    /**
     * Realiza la búsqueda dicotómica de un entero en un array ordenado.
     *
     * @param array Array de enteros ordenado.
     * @param valor Valor a buscar.
     * @return true si se encuentra, false si no.
     */
    public static boolean busquedaDicotomicaInt(int[] array, int valor) {
        int izquierda = 0, derecha = array.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (array[medio] == valor) {
                return true;
            }
            if (array[medio] < valor) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return false;
    }

    /**
     * Realiza la búsqueda dicotómica de un String en un array ordenado.
     *
     * @param array Array de Strings ordenado.
     * @param valor String a buscar.
     * @return true si se encuentra, false si no.
     */
    public static boolean busquedaDicotomicaString(String[] array, String valor) {
        int izquierda = 0, derecha = array.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (array[medio].equals(valor)) {
                return true;
            }
            if (array[medio].compareTo(valor) < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return false;
    }

    // Clase Persona

    public static class Persona implements Comparable<Persona> {
        private String nombre;
        private int edad;

        // Constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        // Método compareTo para la interfaz Comparable
        @Override
        public int compareTo(Persona otraPersona) {
            return Integer.compare(this.edad, otraPersona.edad);
        }

        // Método toString para imprimir el objeto de manera legible
        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }
    
    /**
     * Muestra los valores de los atributos de las Personas en un Array.
     *
     * @param personas Array de Personas.
     */
    public static void mostrarArrayPersona(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    /**
     * Ordena el array de Personas según su edad utilizando el método sort() de la clase Arrays.
     *
     * @param personas Array de Personas a ordenar.
     */
    public static void ordenarArrayPersona(Persona[] personas) {
        Arrays.sort(personas);
    }

    /**
     * Crea una matriz de enteros aleatorios de n filas y m columnas.
     *
     * @param filas    Número de filas.
     * @param columnas Número de columnas.
     * @return Matriz de enteros aleatorios.
     */
    public static int[][] crearMatrizInt(int filas, int columnas) {
        Random random = new Random();
        int[][] matrizInt = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInt[i][j] = random.nextInt(101) + 20;
            }
        }
        return matrizInt;
    }

    /**
     * Crea una matriz de Strings de n filas y m columnas.
     *
     * @param filas    Número de filas.
     * @param columnas Número de columnas.
     * @return Matriz de Strings aleatorios.
     */
    public static String[][] crearMatrizString(int filas, int columnas) {
        Random random = new Random();
        String[][] matrizString = new String[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char letra = (char) (random.nextInt(26) + 'A');
                int numero = random.nextInt(100) + 1;
                matrizString[i][j] = String.valueOf(letra) + numero;
            }
        }
        return matrizString;
    }

    /**
     * Muestra una matriz de enteros.
     *
     * @param matriz Matriz de enteros.
     */
    public static void mostrarMatrizInt(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    /**
     * Muestra una matriz de Strings.
     *
     * @param matriz Matriz de Strings.
     */
    public static void mostrarMatrizString(String[][] matriz) {
        for (String[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
    
}