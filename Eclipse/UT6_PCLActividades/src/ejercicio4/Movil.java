package ejercicio4;

import java.text.DecimalFormat;
import ejercicio3.Terminal;

public class Movil extends Terminal{
	
	private double costePorMin = 0;
	private String tarifa;
	public DecimalFormat formateador = new DecimalFormat("#.########");

	//TODO entender como cóño funcionan los enums
	public Movil(String tlf, String tarifa) {
		super(tlf);
		switch(tarifa) {
		case "rata":
			costePorMin = costePorMin + (segundos/60*6/100);
			this.tarifa = "rata";
			break;
		case "mono":
			costePorMin = costePorMin + (segundos/60*12/100);
			this.tarifa = "mono";
			break;
		case "bisonte":
			costePorMin = costePorMin + (segundos/60*30/100);
			this.tarifa = "bisonte";
			break;
		}

	}
	@Override
	public void llama(Terminal t, int segundos) {
		super.llama(t, segundos);
		switch(this.tarifa) {
		case "rata":
			costePorMin = costePorMin + ((double)segundos/60*6/100);

			break;
		
		case "mono":
			costePorMin = costePorMin + ((double)segundos/60*12/100);

			break;
		
		case "bisonte":
			costePorMin = costePorMin + ((double)segundos/60*30/100);

			break;
		}
		
		

	}
	@Override
	public String toString() {
		return "Nº "+tlf +" - "+segundos+"s de conversación - tarificados " + formateador.format(costePorMin) + " euros";
		
	}
	

}
