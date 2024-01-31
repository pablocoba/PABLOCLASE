package ejercicio5;

public class Revista extends Publicacion{
	
	private int numero;
	
	public Revista() {
		super();
	}
	
	public Revista(String ISBN, String titulo, int anoPublicacion, int numero) {
		super(ISBN, titulo, anoPublicacion);
		this.numero = numero;
	}
	
}
