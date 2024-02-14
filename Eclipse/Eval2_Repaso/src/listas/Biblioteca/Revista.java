package listas.Biblioteca;

public class Revista extends Publicacion{
	private int numero;
	
	public Revista(String ISBN, String titulo, int anoPublicacion, int numero) {
		super(ISBN, titulo, anoPublicacion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString(){
		return "ISBN: "+getISBN() + ", título: " + getTitulo() + ", año de publicación: 1995, número: " + numero; 
	}
}
