package com.ellago;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		/*1
		ArrayList<String> compas = new ArrayList<>();
		
		compas.add("Dani");
		compas.add("Ayoub");
		compas.add("Enzo");
		compas.add("Maria");
		compas.add("Jaime");
		compas.add("Santi");
		
		for (String nombre : compas) {
			System.out.println(nombre);
		}*/
		
		ArrayList<Integer> valores = new ArrayList<>();
		RndMeter(valores);

		System.out.println(valores);
		System.out.println("suma de la lista = "+Suma(valores));
		System.out.println("media de los numeros de la lista = "+Media(valores));
		System.out.println("numero maximo de la lista = "+Maximo(valores));
		System.out.println("numero minimo de la lista = "+Minimo(valores));
		
	}
	
	public static void RndMeter(ArrayList<Integer> list) {
		Random rnd = new Random();

		int l = rnd.nextInt(9,20);
		for (int i = 0; i <= l; i++) {
			int num = rnd.nextInt(-1,100);
			list.add(num);

		}
	}
	
	public static int Suma(ArrayList<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	public static double Media(ArrayList<Integer> list) {
		double media = (double)Suma(list) / list.size();
		return media;
	}
	
	public static int Maximo(ArrayList<Integer> list) {
		Collections.sort(list);
		int max = list.get(list.size()-1);
		return max;
	}
	public static int Minimo(ArrayList<Integer> list) {
		Collections.sort(list);
		int min = list.get(0);
		return min;
	}
}
