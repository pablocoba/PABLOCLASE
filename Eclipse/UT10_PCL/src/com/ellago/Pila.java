package com.ellago;

import java.util.ArrayList;

public class Pila {
	//atributos
	private ArrayList<String> list;
	//constructor
	public Pila () {
		list = new ArrayList<String>();
	}
	
	public void Sacar() {
		list.remove(list.size()-1);
	}
	public void Meter(String cad) {
		list.add(0, cad);
		
	}
	
	@Override
	public String toString() {
		String todo = "";
		for (int i = 0; i < list.size(); i++) {
			todo = todo + list.get(i);
			if(i <list.size()-1) {
				todo = todo + ", ";
			}

		}
		return todo;
	};
}
