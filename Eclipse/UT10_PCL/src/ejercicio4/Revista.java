package ejercicio4;

public class Revista extends Publicacion{
	//atributo
	private int numero;
	//constructores
	public Revista() {
		super();
	}
	
	public Revista(String ISBN, String titulo, int anoPublicacion, int numero) {
		super(ISBN, titulo, anoPublicacion);
		this.numero = numero;
	}
	
	@Override
	public String toString(){
		return "ISBN: "+ISBN+", título: "+titulo+", año de publicación: "+ anoPublicacion + ". Nº de revista: "+numero;

	}
	
}
