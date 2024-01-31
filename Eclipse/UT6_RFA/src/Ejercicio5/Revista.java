package Ejercicio5;

public class Revista extends Publicacion{ 
	private int numero; 
	//creamos los atributos y los asignamos.
	
	public Revista (String isbn, String titulo, int anio, int numero){
	
		super( isbn, titulo, anio);
		
		this.setNumero(numero);
	}
	
	public int getNumero() {
		
		return numero;
	}
	public void setNumero(int numero) {
		
		this.numero = numero;
	}
}