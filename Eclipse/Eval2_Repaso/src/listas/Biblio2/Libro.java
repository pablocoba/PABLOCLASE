package listas.Biblio2;

public class Libro extends Publicacion implements Prestable{
	
	private boolean prestado;
	public Libro(String ISBN, String titulo, int anoPublicacion) {
		super(ISBN, titulo, anoPublicacion);
		this.prestado = false;
	}
	
	public void presta() {
		
	}

	public void devuelve() {

	}

	public void estaPrestado() {
		
	}
	
	public String toString() {
		String prestado = "(prestado)";
		String noPrestado = "(no prestado)";
		if(!this.prestado) {
			return "ISBN: "+ISBN+", título: " + titulo + ", año de publicacion: "+ anoPublicacion + ", prestado: "  + noPrestado+"\n";

		}
		else return "ISBN: "+ISBN+", título: " + titulo + ", año de publicacion: "+ anoPublicacion + ", prestado: "  + prestado+"\n";
	}
}
