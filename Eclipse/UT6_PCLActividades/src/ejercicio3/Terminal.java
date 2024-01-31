package ejercicio3;

public class Terminal {
	
	protected String tlf;
	protected int segundos;
	public Terminal(String tlf) {
		this.tlf = tlf;	
	}
	
	public void llama(Terminal t, int segundos) {
		this.segundos = this.segundos + segundos;
		t.segundos = t.segundos + segundos;
	}
	
	public String toString() {
		return "Nº "+tlf +" - "+segundos+"s de conversación";
	}

}
