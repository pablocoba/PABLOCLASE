package com.ellago;

import java.util.Scanner;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private int isbnlength;
	
	private void reducirIsbn(){

		String isbnReducido = "";
		if(isbnlength ==13) {
			for(int i = 0; i<isbnlength;i++) {
				if(isbn.charAt(i)!='-') {
					isbnReducido += isbn.charAt(i);
				}
				System.out.println(isbnReducido);
			}
		}
		this.isbn=isbnReducido;
	}
	
	private boolean comprobarIsbn10() {
		int total = 0;

		if(isbn.charAt(10) == 'X') {
			
		}
		for(int i = 0; i<=isbnlength-1;i++) {
			total = total + isbn.charAt(i)*(i+1);
		}
		if(isbn.charAt(10)=='x' || isbn.charAt(10)=='X') {
			total +=10;
		}
		else {total+= isbn.charAt(10);}
		if(total%11==0) {
			return true;
		}
		else return false;

	}
	private boolean comprobarIsbn13(){

		int total = 0;
 		for(int i=0; i<=isbnlength-1;i++) {

			if(i<=13&i%2!=0) {
				total += isbn.charAt(i);
				i++;
			}
			else {total = total + (isbn.charAt(i)*3);}

		}
		if(isbn.charAt(13)=='x' || isbn.charAt(13)=='X') {
			total +=10;
		}
		else {total+= isbn.charAt(13);}
		if(10-(total%10)==10||10-(total%10)==isbn.charAt(13)) {
			return true;
		}
		else {return false;}
	}
	public Libro(String titulo, String autor, String isbn) {
		this.titulo=titulo;
		this.autor=autor;
		this.isbn=isbn;
		this.isbnlength = isbn.length();
		reducirIsbn();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public void setIsbn(String isbn) {
		this.isbn=isbn;
	}

	
	public static void main(String[] args) {
		
		
		Libro librito = new Libro("Harry Potter","Puta Rowling","978-8418173004");
		System.out.println(librito.comprobarIsbn13());
		
		
	}

}
