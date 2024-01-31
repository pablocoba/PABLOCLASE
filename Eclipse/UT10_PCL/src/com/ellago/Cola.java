package com.ellago;
import java.util.*;
public class Cola {
	//atributos
	private ArrayList<String> list;
	//constructor
	public Cola () {
		list = new ArrayList<String>();
	}
	
	public void Sacar() {
		list.remove(0);
	}
	public void Meter(String cad) {
		list.add(0 + list.size(), cad);
		
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
