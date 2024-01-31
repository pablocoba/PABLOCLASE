package com.ellago;

public class Persona implements Comparable<Persona>{
	
	String nombre;
	int edad;
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.edad, o.getEdad());
	}
}
