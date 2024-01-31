package com.ellago;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main { 
	
	// Método para esperar tecla del usuario
    private static void esperarTecla(Scanner reader) {
        System.out.println("\nPresiona Enter para continuar...");
        reader.nextLine();
    }
    
    public static void main(String[] args) {
    	Scanner reader = new Scanner(System.in);
    	
    	//Funciones Arrays
    	System.out.println("Probando Funciones Arrays:");
    	esperarTecla(reader);
    	
        // Crear y mostrar array de enteros
        int[] arrayEnteros = FuncionesArrays.crearArrayInt(5);
        System.out.println("Array de enteros:");
        FuncionesArrays.mostrarArrayInt(arrayEnteros);
        esperarTecla(reader);

        // Crear y mostrar array de Strings
        String[] arrayStrings = FuncionesArrays.crearArrayString(5);
        System.out.println("Array de Strings:");
        FuncionesArrays.mostrarArrayString(arrayStrings);
        esperarTecla(reader);

        // Buscar un entero en el array de enteros
        boolean encontradoInt = FuncionesArrays.buscarArrayInt(arrayEnteros, 3);
        System.out.println("¿El entero 3 está en el array de enteros? " + encontradoInt);
        esperarTecla(reader);

        // Buscar un String en el array de Strings
        boolean encontradoString = FuncionesArrays.buscarArrayString(arrayStrings, "Dato2");
        System.out.println("¿El String 'Dato2' está en el array de Strings? " + encontradoString);
        esperarTecla(reader);

        // Localizar la posición del entero en el array de enteros
        int posicionInt = FuncionesArrays.localizaPosInt(arrayEnteros, 3);
        System.out.println("Posición del entero 3 en el array de enteros: " + posicionInt);
        esperarTecla(reader);

        // Localizar la posición del String en el array de Strings
        int posicionString = FuncionesArrays.localizaPosString(arrayStrings, "Dato2");
        System.out.println("Posición del String 'Dato2' en el array de Strings: " + posicionString);
        esperarTecla(reader);

        // Contar el número de veces que aparece el entero en el array de enteros
        int vecesRepetidoInt = FuncionesArrays.vecesIntArray(arrayEnteros, 3);
        System.out.println("El entero 3 aparece " + vecesRepetidoInt + " veces en el array de enteros");
        esperarTecla(reader);

        // Contar el número de veces que aparece el String en el array de Strings
        int vecesRepetidoString = FuncionesArrays.vecesStringArray(arrayStrings, "Dato2");
        System.out.println("El String 'Dato2' aparece " + vecesRepetidoString + " veces en el array de Strings");
        esperarTecla(reader);

        // Unir dos arrays de enteros
        int[] arrayUnion = FuncionesArrays.unirArraysInt(arrayEnteros, new int[]{1, 2, 3});
        System.out.println("Unión de dos arrays de enteros:");
        FuncionesArrays.mostrarArrayInt(arrayUnion);
        esperarTecla(reader);

        // Sustituir los enteros en el array y contar cuántas veces se sustituyeron
        int vecesSustituidoInt = FuncionesArrays.sustituirIntArray(arrayEnteros, 3, 99);
        System.out.println("Se ha sustituido el entero 3 " + vecesSustituidoInt + " veces");
        esperarTecla(reader);

        // Sustituir los Strings en el array y contar cuántas veces se sustituyeron
        int vecesSustituidoString = FuncionesArrays.sustituirStringArray(arrayStrings, "Dato2", "NuevoDato");
        System.out.println("Se ha sustituido el String 'Dato2' " + vecesSustituidoString + " veces");
        esperarTecla(reader);

        // Ordenar el array de enteros utilizando el método de la burbuja
        System.out.println("Array de enteros ordenado:");
        FuncionesArrays.ordenarArrayIntBurbuja(arrayEnteros);
        FuncionesArrays.mostrarArrayInt(arrayEnteros);
        esperarTecla(reader);

        // Ordenar el array de Strings utilizando el método de la burbuja
        System.out.println("Array de Strings ordenado:");
        FuncionesArrays.ordenarArrayStringBurbuja(arrayStrings);
        FuncionesArrays.mostrarArrayString(arrayStrings);
        esperarTecla(reader);

        // Búsqueda dicotómica de un entero en el array ordenado
        int[] arrayOrdenado = Arrays.copyOf(arrayEnteros, arrayEnteros.length);
        Arrays.sort(arrayOrdenado);
        boolean encontradoDicotomicaInt = FuncionesArrays.busquedaDicotomicaInt(arrayOrdenado, 99);
        System.out.println("¿El entero 99 está en el array ordenado? " + encontradoDicotomicaInt);
        esperarTecla(reader);

        // Búsqueda dicotómica de un String en el array ordenado
        String[] arrayStringsOrdenado = Arrays.copyOf(arrayStrings, arrayStrings.length);
        Arrays.sort(arrayStringsOrdenado);
        boolean encontradoDicotomicaString = FuncionesArrays.busquedaDicotomicaString(arrayStringsOrdenado, "NuevoDato");
        System.out.println("¿El String 'NuevoDato' está en el array ordenado? " + encontradoDicotomicaString);
        esperarTecla(reader);

        // Crear y mostrar array de Personas
        FuncionesArrays.Persona[] arrayPersonas = new FuncionesArrays.Persona[5];
        arrayPersonas[0] = new FuncionesArrays.Persona("Ana", 25);
        arrayPersonas[1] = new FuncionesArrays.Persona("Bella", 30);
        arrayPersonas[2] = new FuncionesArrays.Persona("Clara", 22);
        arrayPersonas[3] = new FuncionesArrays.Persona("Dalia", 20);
        arrayPersonas[4] = new FuncionesArrays.Persona("Eva María", 36);

        System.out.println("Array de Personas:");
        FuncionesArrays.mostrarArrayPersona(arrayPersonas);
        esperarTecla(reader);

        // Ordenar array de Personas por edad utilizando Arrays.sort
        System.out.println("Array de Personas ordenado por edad:");
        Arrays.sort(arrayPersonas);
        FuncionesArrays.mostrarArrayPersona(arrayPersonas);
        esperarTecla(reader);

        // Crear y mostrar matriz de enteros
        int[][] matrizEnteros = FuncionesArrays.crearMatrizInt(3, 3);
        System.out.println("Matriz de enteros:");
        FuncionesArrays.mostrarMatrizInt(matrizEnteros);
        esperarTecla(reader);

        // Crear y mostrar matriz de Strings
        String[][] matrizStrings = FuncionesArrays.crearMatrizString(3, 3);
        System.out.println("Matriz de Strings:");
        FuncionesArrays.mostrarMatrizString(matrizStrings);
        esperarTecla(reader);
        
        
        
        // Funciones Recursivas
        System.out.println("\n\nProbando las funciones recursivas:");
        esperarTecla(reader);
        
        // Factorial
        int factorialResult = FuncionesRecursivas.factorial(5);
        System.out.println("Factorial de 5: " + factorialResult);
        esperarTecla(reader);

        // Fibonacci
        int fibonacciResult = FuncionesRecursivas.fibonacci(7);
        System.out.println("Fibonacci en la posición 7: " + fibonacciResult);
        esperarTecla(reader);

        // Potencia
        double potenciaResult = FuncionesRecursivas.potencia(2.0, 3);
        System.out.println("2^3: " + potenciaResult);
        esperarTecla(reader);

        // Suma de dígitos
        int sumaDigitosResult = FuncionesRecursivas.sumarDigitos(12345);
        System.out.println("Suma de dígitos de 12345: " + sumaDigitosResult);
        esperarTecla(reader);
        
        
        
        // Clase Persona
        System.out.println("\n\nProbando la clase Persona comparable:");
        esperarTecla(reader);
        
        // Array tipo String de nombres
        String[] nombres = {"Jordan", "Taylor", "Alex", "Casey", "Riley", "Jamie", "Jordan"};

        // Crea una lista de personas
        List<Persona> personas = new ArrayList<>();

        // Genera 7 personas con edades aleatorias y sexo aleatorio
        for (String nombre : nombres) {
            char sexo = (new Random().nextBoolean()) ? 'M' : 'F'; // Sexo random M o F
            int edad = new Random().nextInt(50) + 20; // Edades random entre 20 y 69
            personas.add(new Persona(nombre, edad, sexo));
        }

        // Muestra la lista antes de ordenar
        System.out.println("Lista de personas antes de ordenar:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordena la lista de personas (usando el compareTo en Persona)
        Collections.sort(personas);

        // Muestra la lista después de ordenar
        System.out.println("\nLista de personas después de ordenar:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
        reader.close();
    }
    
}