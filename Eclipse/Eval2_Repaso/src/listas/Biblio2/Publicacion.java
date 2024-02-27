package listas.Biblio2;

import java.util.ArrayList;

public abstract class Publicacion implements Comparable<Publicacion>{
	
	protected String ISBN;
	protected String titulo;
	protected int anoPublicacion;
	
	public Publicacion(String ISBN, String titulo, int anoPublicacion) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.anoPublicacion = anoPublicacion;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	
	@Override
	public int compareTo(Publicacion o) {
		// TODO Auto-generated method stub
		
		if(this.getAnoPublicacion()>o.getAnoPublicacion()) {
			return 1;
		}
		else if(this.getAnoPublicacion()<o.getAnoPublicacion()) {
			return -1;
		}
		else return 0;
	}
	
}
