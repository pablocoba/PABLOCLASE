package Ejercicio3;

public class Terminal {

	//creamos los atributos
	private static String numero;
	public  static int tiemconv;
	
	//asignamos 
	public Terminal (String numero) {
		this.numero=numero;
		this.tiemconv = 0;
	}
	
	public void llama(Terminal otra, int tiempo) {
		
		this.tiemconv += tiempo;
		otra.tiemconv+=tiempo;
	}
	
	//creamos los getters y setters
	public static void settiemconv() {
		Terminal.tiemconv=tiemconv;
	}

	public static void setNumero(String numero) {
		Terminal.numero = numero;
	}
	
	public static String getnumero() {
		return getnumero();
	}
	public static String getiemconv() {
		return getnumero();
	}


	@Override
	
	public String toString() {
		return "El numero " + getnumero() + " ha tenido una duracion de " + tiemconv + " segundos de conversacion ";
	}

	

	

	

	
	
}