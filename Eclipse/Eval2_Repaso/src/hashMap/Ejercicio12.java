package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Ejercicio12 {

	public static void main(String[] args) {
		ArrayList<Cartas> cartas = generarBaraja();
		
		HashMap<String, Integer> baraja = generarCartas(cartas);
		System.out.println(baraja);
		System.out.println(cartas);
		Collections.sort(cartas);
		System.out.println(cartas);
		jugar(baraja, cartas);
		
	}
	
	public static ArrayList<Cartas> generarBaraja(){
		
		ArrayList<Cartas> cartas = new ArrayList<Cartas>();
		
		for (int i = 0; i < 4; i++) {
			
			Cartas as = new Cartas("as",1);
			Cartas dos = new Cartas("dos",2);
			Cartas tres = new Cartas("tres",3);
			Cartas cuatro = new Cartas("cuatro",4);
			Cartas cinco = new Cartas("cinco",5);
			Cartas seis = new Cartas("seis",6);
			Cartas siete = new Cartas("siete",7);
			Cartas sota = new Cartas("sota",10);
			Cartas caballo = new Cartas("caballo",11);
			Cartas rey = new Cartas("rey",12);
			
			cartas.add(as);
			cartas.add(dos);
			cartas.add(tres);
			cartas.add(cuatro);
			cartas.add(cinco);
			cartas.add(seis);
			cartas.add(siete);
			cartas.add(sota);
			cartas.add(caballo);
			cartas.add(rey);
			
		}

		return cartas;
	}
	
	public static HashMap<String, Integer> generarCartas(ArrayList<Cartas> cartas){
		
		HashMap<String, Integer> baraja = new HashMap<String,Integer>();

		baraja.put(cartas.get(0).getFigura(), 11);
		baraja.put(cartas.get(1).getFigura(), 10);
		baraja.put(cartas.get(2).getFigura(), 10);
		baraja.put(cartas.get(3).getFigura(),0);
		baraja.put(cartas.get(4).getFigura(), 0);
		baraja.put(cartas.get(5).getFigura(), 0);
		baraja.put(cartas.get(6).getFigura(), 0);
		baraja.put(cartas.get(7).getFigura(), 2);
		baraja.put(cartas.get(8).getFigura(), 3);
		baraja.put(cartas.get(9).getFigura(), 4);
		
		return baraja;
		
	}
	
	public static void jugar(HashMap<String,Integer> baraja, ArrayList<Cartas> cartas) {
		
		Random rnd = new Random();
		//cartas que se seleccionarán
		int a = rnd.nextInt(40);
		int b = rnd.nextInt(40);
		int c = rnd.nextInt(40);
		int d = rnd.nextInt(40);
		int e = rnd.nextInt(40);
		
		System.out.println(cartas.get(a));
		System.out.println(cartas.get(b));
		System.out.println(cartas.get(c));
		System.out.println(cartas.get(d));
		System.out.println(cartas.get(e));
		int contador = 0;
		if(cartas.get(a).equals(baraja.get(cartas.get(a).getFigura()))) {
			contador+=baraja.get(cartas.get(a).getFigura());
		}
		if(cartas.get(b).equals(baraja.get(cartas.get(b).getFigura()))) {
			contador+=baraja.get(cartas.get(b).getFigura());
		}
		if(cartas.get(c).equals(baraja.get(cartas.get(c).getFigura()))) {
			contador+=baraja.get(cartas.get(c).getFigura());
		}
		if(cartas.get(d).equals(baraja.get(cartas.get(d).getFigura()))) {
			contador+=baraja.get(cartas.get(d).getFigura());
		}
		if(cartas.get(e).equals(baraja.get(cartas.get(e).getFigura()))) {
			contador+=baraja.get(cartas.get(e).getFigura());
		}
		
		System.out.println(contador);
	}
}
