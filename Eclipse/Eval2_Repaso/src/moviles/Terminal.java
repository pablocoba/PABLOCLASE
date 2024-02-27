package moviles;

import java.text.DecimalFormat;

public class Terminal {
	
	protected String numero;
	protected double minutos;
	
	public Terminal(String numero) {
		this.numero = numero;
	}
	protected DecimalFormat deci = new DecimalFormat("#0");

	public void llama(Terminal terminal, double seg) {
		
		terminal.setMinutos(terminal.getMinutos()+ seg);
		this.minutos = this.minutos + seg;
		
	}
	
	public String toString()
	{
		return "Nº "+ numero + " - " + deci.format(minutos) + "s de conversación";
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getMinutos() {
		return minutos;
	}
	public void setMinutos(double minutos) {
		this.minutos = minutos;
	}
	
}
