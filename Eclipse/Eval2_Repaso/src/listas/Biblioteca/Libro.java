package listas.Biblioteca;

public class Libro extends Publicacion implements Prestable{
	private boolean prestado;
	public Libro(String ISBN, String titulo, int anoPublicacion) {
		super(ISBN, titulo, anoPublicacion);
		this.prestado = false;
	}
	@Override
	public void presta() {
		if(!prestado) {
			prestado = true;
			System.out.println("Prestando libro...");
		}
		else {
			System.out.println("Libro ya prestado");
		}
	}
	@Override
	public void devuelve() {
		if(prestado == false) {
			System.out.println("El libro no estaba prestado");
		}
		else {
			prestado = false;
			System.out.println("Devolviendo libro...");
			
		}
		
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public boolean getPrestado(){
		return prestado;
	}
	@Override
	public boolean estaPrestado() {
		if(prestado == true) {
			return true;
			
		}else return false;
		
	}
	
	public String toString(){
		return "ISBN: "+getISBN() + ", título: " + getTitulo() + ", año de publicación: 1995, prestado: " + estaPrestado(); 
	}

}
