package Ejercicio4;

public class Publicacion implements Prestable {
	protected String ISBN;
	protected String titulo;
	protected int añoPublicacion;
	
	public Publicacion(String iSBN, String titulo, int añoPublicacion) {
		this.ISBN=iSBN;
		this.titulo=titulo;
		this.añoPublicacion=añoPublicacion;
		
	}
}
