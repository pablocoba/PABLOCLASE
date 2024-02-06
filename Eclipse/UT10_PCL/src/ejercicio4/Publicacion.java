package ejercicio4;

import java.util.ArrayList;

public class Publicacion implements Comparable<Publicacion>{
	//constructor 
	public Publicacion() {
		
	}
	
	public Publicacion(String ISBN, String titulo, int anoPublicacion) {
		this.ISBN = ISBN;
		this.anoPublicacion = anoPublicacion;
		this.titulo = titulo;
	}
	//atributos
	protected String ISBN;
	protected String titulo;
	protected int anoPublicacion;
	
	//toString y getaño
	public String toString() {
		return "ISBN: "+ISBN+", título: "+titulo+", año de publicación: "+ anoPublicacion;
	}
	
	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	@Override
	public int compareTo(Publicacion o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
