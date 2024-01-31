package com.ellago;

public class Principal {

	public static void main(String[] args) {
		String isbnReducido = "";
		String isbn = "1-58182-008-9";
		int isbnlength = isbn.length();
		if(isbnlength ==13) {
			for(int i = 0; i<isbnlength;i++) {
				if(isbn.charAt(i)!='-') {
					isbnReducido += isbn.charAt(i);
				}
				System.out.println(isbnReducido);
			}
		}
	}

}
