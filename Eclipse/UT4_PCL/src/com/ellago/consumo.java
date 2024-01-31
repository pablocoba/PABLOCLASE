package com.ellago;
import java.util.Scanner;
/**
 * @author Pablo Coba Lodín
 * 8.	Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes características:
 Atributos:
– kms. Kilómetros recorridos por el coche.
– litros. Litros de combustible consumido.
-vmed. Velocidad media.
– pgas. Precio de la gasolina.
 Métodos:
– getTiempo. Indicará el tiempo empleado en realizar el viaje.
– consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).
– consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más apropiado para cada atributo.
9.	Para la clase anterior implementa los siguientes métodos, los cuales podrán modificar los valores de los atributos de la clase:
 setKms
 setLitros
 setVmed
 setPgas

 ⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⡀⣰⡿⠛⠛⠿⢶⣦⣀⠀⢀⣀⣀⣀⣀⣠⡾⠋⠀⠀⠹⣷⣄⣤⣶⡶⠿⠿⣷⡄⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢰⣿⠁⠀⠀⠀⠀⠈⠙⠛⠛⠋⠉⠉⢹⡟⠁⠀⠀⣀⣀⠘⣿⠉⠀⠀⠀⠀⠘⣿⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠁⠀⠀⣾⡋⣽⠿⠛⠿⢶⣤⣤⣤⣤⣿⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢸⣿⡴⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣄⡀⠀⢈⣻⡏⠀⠀⠀⠀⣿⣀⠀⠈⠙⣷⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣰⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠙⢷⣄⣀⣀⣼⣏⣿⠀⠀⢀⣿⠀⠀⠀⠀
⠀⠀⠀⠀⢸⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⣿⡉⠉⠁⢀⣠⣿⡇⠀⠀⠀⠀
⠀⠀⠀⠀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠗⠾⠟⠋⢹⣷⠀⠀⠀⠀
⢀⣤⣤⣤⣿⣤⣄⠀⠀⠀⠴⠚⠲⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⡆⠀⠀⠀⠀⢀⣈⣿⣀⣀⡀⠀
⠀⠀⠀⠈⣿⣠⣾⠟⠛⢷⡄⠀⠀⠀⠀⠀⠀⠀⡤⠶⢦⡀⠀⠀⠀⠀⠹⠯⠃⠀⠀⠀⠈⠉⢩⡿⠉⠉⠉⠁
⠀⠀⣤⡶⠿⣿⣇⠀⠀⠸⣷⠀⠀⠀⠀⠀⠀⠀⠓⠶⠞⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢤⣼⣯⣀⣀⠀⠀
⠀⢰⣯⠀⠀⠈⠻⠀⠀⠀⣿⣶⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⠁⠉⠉⠁⠀
⠀⠀⠙⣷⣄⠀⠀⠀⠀⠀⢀⣀⣀⠙⢿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣿⡿⢷⣄⡀⠀⠀⠀
⠀⠀⠀⠈⠙⣷⠀⠀⠀⣴⠟⠉⠉⠀⠀⣿⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⣾⠟⠉⠀⠀⠈⠉⠀⠀⠀
⠀⠀⠀⠀⠰⣿⠀⠀⠀⠙⢧⣤⡶⠟⢀⣿⠛⢟⡟⡯⠽⢶⡶⠾⢿⣻⣏⣹⡏⣁⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠹⣷⣄⠀⠀⠀⠀⠀⣠⣾⠏⠀⠀⠙⠛⠛⠋⠀⠀⢀⣽⠟⠛⠖⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠙⠻⠷⠶⠿⠟⠋⠹⣷⣤⣀⡀⠄⣡⣀⣠⣴⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣍⣉⣻⣏⣉⣡⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
 */
public class consumo {
	//creamos atributos
	private double km;
	private double litros;
	private double vmed;
	private double pgas;
	
	
	//creamos constructor
	public consumo (double km, double litros, double vmed, double pgas) {
		this.km=km;
		this.litros=litros;
		this.vmed=vmed;
		this.pgas=pgas;
	}
	//creamos get del tiempo que se consigue dividiendo los km entre la velocidad media
	public double getTiempo() {

		double tiempo = km / vmed;
		return tiempo;
	}
	
	//creamos metodo para hallar el consumo medio cada 100km que se consigue multiplicando litros*100 entre km
	public double consumoMedio() {

		return litros*100/km;
	}
	
	//creamos metodo para hallar el precio del consumo cada 100km, que se consigue multiplicando litros*100 entre km y todo esto entre el precio del gas
	public double consumoEuros() {

		return ((litros*100)/km)*pgas;
	}
	//metodos set para todos los atributos
	public void setKms(double km) {
		this.km=km;
	}
	public void setLitros(double litros) {
		this.litros=litros;
	}
	public void setVmed(double vmed) {
		this.vmed=vmed;
	}
	public void setPgas(double pgas) {
		this.pgas=pgas;
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce los kilómetros recorridos: ");
		double km = teclado.nextDouble();
		System.out.println("Introduce los litros de combustible: ");
		double litros = teclado.nextDouble();
		
		System.out.println("Introduce la velodidad media del recorrido: ");
		double vmed = teclado.nextDouble();
		System.out.println("Introduce el precio del gas (ej:1,668): ");
		double pgas = teclado.nextDouble();
		
		//creamos un objeto con los atributos pedidos por teclado
		consumo consumo = new consumo(km,litros,vmed,pgas);
		
		System.out.println("El consumo de litros medio es de "+consumo.consumoMedio());
		System.out.println("El precio de consumo medio es de "+consumo.consumoEuros());
		System.out.printf("El viaje duró: %.2f horas.", consumo.getTiempo());
		//probamos uno de los sets por teclado
		System.out.println("\nIntroduce nuevo valor de la gasolina: ");
		consumo.setPgas(teclado.nextDouble());
		System.out.println("El precio de consumo medio es de "+consumo.consumoEuros());
		
		
	}
}
