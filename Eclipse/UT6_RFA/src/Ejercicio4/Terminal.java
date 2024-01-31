package Ejercicio4;

public class Terminal {

	//asignamos los atributos
	private static String numero;
	public static int tiemconv;

	public Terminal(String numero) {
		this.setNumero(numero);
		this.tiemconv = 0;
	}

	public void llama(Terminal otra, int tiempo) {

		this.tiemconv += tiempo;
		otra.tiemconv += tiempo;
	}

	//creamos los getters y setters para los atributos 
	public void settiemconv() {
		Terminal.tiemconv = tiemconv;
	}

	public void setNumero(String numero) {
		Terminal.numero = numero;
	}

	public String getnumero() {
		return this.numero;
	}

	public int getiemconv() {
		return this.tiemconv;
	}

	@Override

	
	
	public String toString() {
		return "El numero " + this.numero + " ha tenido una duracion de " + this.tiemconv + " segundos de conversacion ";
	}

}