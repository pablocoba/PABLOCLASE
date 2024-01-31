package com.ellago;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;
    private char sexo;

    // Constructor
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getters y setters
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Método toString para imprimir el objeto de manera legible
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                '}';
    }

    // Método compareTo para la interfaz Comparable
    @Override
    public int compareTo(Persona otraPersona) {
        // Comparación por edad
        int resultado = Integer.compare(this.edad, otraPersona.edad);

        // Si las edades son iguales, comparar por nombre
        if (resultado == 0) {
            resultado = this.nombre.compareTo(otraPersona.nombre);
        }

        return resultado;
    }
}

