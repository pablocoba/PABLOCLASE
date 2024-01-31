package com.ellago;

public class Asignaturas {

	private String nombre;
	private double horasFaltas;
	private double horasTotal;
	private double horasSemana;
	private int horasAFaltar;
	private double porcentajeHorasAsistidas;
	private double porcentajeHorasFaltas;
	
	public Asignaturas(String nombre, double horasSemana) {
		this.nombre = nombre;
		this.horasSemana = horasSemana;
	}
	
	public Asignaturas(String nombre, double horasTotal, double horasFaltas) {
		this.nombre = nombre;
		this.horasTotal = horasTotal;
		this.horasFaltas = horasFaltas;
	}

	public void calcularPorcentajes() {
		porcentajeHorasFaltas =  horasFaltas/horasTotal*100;
		porcentajeHorasAsistidas= 100-porcentajeHorasFaltas;
	}
	
	public void calcularHorasAFaltar() {
		
		setHorasAFaltar(((15-(int)porcentajeHorasFaltas)*(int)horasTotal)/100);
		
	}
	
	public double getHorasAFaltar() {
		return horasAFaltar;
	}
	
	public double getPorcentajeHorasFaltas() {
		return porcentajeHorasFaltas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public double getHorasFaltas() {
		return horasFaltas;
	}
	public double getHorasTotal() {
		return horasTotal;
	}
	public double getHorasSemana() {
		return horasSemana;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setHorasTotal(double horasTotal) {
		this.horasTotal = horasTotal;
	}
	public void setHorasFaltas(double horasFaltas) {
		this.horasFaltas = horasFaltas;
	}
	public void setHorasAFaltar(int horasAFaltar) {
		this.horasAFaltar=horasAFaltar;
	}
	
	public void calcularHoras() {
		
		
		
	}
	
	public void showData() {
		
			System.out.println("\n"+nombre+":\nHoras Totales: "+horasTotal+"\nHoras Faltadas: "+horasFaltas);
			System.out.printf("\n%% Horas Assist: %.2f%%\n%% Horas Faltadas: %.2f%%\n",porcentajeHorasAsistidas,porcentajeHorasFaltas);
			System.out.println("Horas a faltar: "+horasAFaltar+"\n");
		

	}
}
