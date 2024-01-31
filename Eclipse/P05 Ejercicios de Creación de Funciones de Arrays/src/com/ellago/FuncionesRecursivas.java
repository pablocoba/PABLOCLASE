package com.ellago;

public class FuncionesRecursivas {

    /**
     * Calcula el factorial de un número de manera recursiva.
     *
     * @param n Número para calcular el factorial.
     * @return Factorial de n.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Calcula el número Fibonacci de una posición de manera recursiva.
     *
     * @param n Posición para calcular el número Fibonacci.
     * @return Número fibonacci en la posición n.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Calcula la potencia de un número de manera recursiva.
     *
     * @param base Base de la potencia.
     * @param exponente Exponente de la potencia.
     * @return Resultado de la potencia.
     */
    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    /**
     * Calcula la suma de los dígitos de un número de manera recursiva.
     *
     * @param numero Número para calcular la suma de sus dígitos.
     * @return Suma de los dígitos del número.
     */
    public static int sumarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero % 10 + sumarDigitos(numero / 10);
        }
    }
}
