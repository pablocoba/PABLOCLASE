package Ejercicio4;

public class Libro extends Publicacion implements Prestable{
	
	private boolean prestado;
	
	public Libro(String ISBN, String titulo, int añoPublicacion) {
		super(ISBN, titulo, añoPublicacion);
		this.prestado 	= false;
	}
	
	public void presta() {
	    if (!prestado) {
	        prestado = true;
	    } else {
	    	System.out.println("Lo siento, ese libro ya está prestado.");
	    }
	}
	public boolean estaPrestado() {
		return prestado;
	}
	public void devuelve() {
		if (prestado) {
			prestado=false;
		} 
	}
	@Override
	public String toString() {
        String estadoPrestamo;
        if (prestado) {
            estadoPrestamo = "prestado";
        } else {
            estadoPrestamo = "no prestado";
        }

		return "ISBN: " + ISBN + ", titulo: " + titulo + ", año de publicacion: " + añoPublicacion + " estado ("+estadoPrestamo+")" ;
	}
}

