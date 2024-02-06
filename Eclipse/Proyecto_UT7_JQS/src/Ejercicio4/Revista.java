package Ejercicio4;

public class Revista extends Publicacion {
	
	private int numero;
	
	public Revista(String ISBN, String titulo, int añoPublicacion, int numero) {
		super(ISBN, titulo, añoPublicacion);
		this.numero=numero;
		
	}
	@Override
    public String toString() {
        return "ISBN: " + ISBN + ", título: " + titulo + ", año de publicación: " + añoPublicacion + ", número: " + numero;
    }
}
