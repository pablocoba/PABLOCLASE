package ejercicio5;

public abstract class Publicacion {
	
	public Publicacion() {
		
	}
	
	public Publicacion(String ISBN, String titulo, int anoPublicacion) {
		this.ISBN = ISBN;
		this.anoPublicacion = anoPublicacion;
		this.titulo = titulo;
	}
	
	protected String ISBN;
	protected String titulo;
	protected int anoPublicacion;
	
	public String toString() {
		return "ISBN: "+ISBN+", título: "+titulo+", año de publicación: "+ anoPublicacion;
	}
	
}
