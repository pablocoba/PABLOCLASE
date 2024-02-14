package listas.Biblioteca;

public abstract class Publicacion implements Comparable<Publicacion>{
	private String ISBN;
	private String titulo;
	private int anoPublicacion;
	
	public Publicacion(String ISBN, String titulo, int anoPublicacion) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.anoPublicacion = anoPublicacion;
	}
	public Publicacion() {}
	
	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	public String getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public int compareTo(Publicacion o) {
		return this.getAnoPublicacion()-o.getAnoPublicacion();
	}
	@Override
	public String toString() {
		return "ISBN: "+ISBN+", título: " + "año de publicación: "+anoPublicacion;
	}
}
