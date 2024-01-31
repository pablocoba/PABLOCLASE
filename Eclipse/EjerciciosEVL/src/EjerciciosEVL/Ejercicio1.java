package EjerciciosEVL;

import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {

        
        int[] miArray = Array1(5);

        
        System.out.println("Array de enteros:");
        for (int numero : miArray) {
            System.out.println(numero);
        }

       
        String[] miArrayString = Array2(5);

       
        System.out.println("\nArray de cadenas de texto:");
        for (String dato : miArrayString) {
            System.out.println(dato);
        }
    }

    
    public static int[] Array1(int longitud) {
        int[] array = new int[longitud];
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    
    public static String[] Array2(int longitud) {
        String[] array = new String[longitud];
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int numeroAleatorio = random.nextInt(100);
            array[i] = "Dato" + numeroAleatorio;
        }

        return array;
    }
    
    
    
}

	


