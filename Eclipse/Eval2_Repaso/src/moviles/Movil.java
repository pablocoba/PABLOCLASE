package moviles;

import java.text.DecimalFormat;
public class Movil extends Terminal{
	
	private double totalTarificado;
	private String tarifa;
	//this.totalTarificado+= minutos * 0.06;

	private DecimalFormat decimalFormat = new DecimalFormat("#0,00");
	
	public Movil(String numero, String tarifa) {
		super(numero);
		this.tarifa = tarifa;
	}
	
	@Override
	public void llama(Terminal terminal, double minutos) {
		terminal.setMinutos(terminal.getMinutos()+ minutos);
		double segundos = minutos/60;
		switch(this.tarifa) {
			case "rata":
				this.totalTarificado+= segundos * 6;
				break;
			case "mono":
				this.totalTarificado+= segundos * 12;
				break;
			case "bisonte":
				this.totalTarificado+= segundos * 30;
				break;
		}

	}
	
	@Override
	public String toString() {
		return "Nº "+numero+" - "+deci.format(minutos)+"s de conversación - tarificados "+decimalFormat.format(totalTarificado);
	}
	
	
}
