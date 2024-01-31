package ejercicio5;

public class Libro extends Publicacion implements Prestable{
	
	private boolean prestado = false;
	
	public Libro() {
		super();
	}
	
	public Libro(String ISBN, String titulo, int anoPublicacion ) {
		super(ISBN, titulo, anoPublicacion);
	}

	@Override
	public void presta() {

		if(prestado == true) {
			System.out.println("Lo siento, este libro ya está prestado.");
		}
		else prestado = true;
	}

	@Override
	public void devuelve() {

		prestado = false;
	}

	@Override
	public boolean estaPrestado() {
		return prestado;
		
	}
	
	@Override
	public String toString() {
		
		String p;
		if(prestado == true) {
			p = "(prestado)";
		}
		else p = "(no prestado)";
		
		return "ISBN: "+ISBN+", título: "+titulo+", año de publicación: "+ anoPublicacion + " "+p;

	}
}
