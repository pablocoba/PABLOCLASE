package Ejercicio2;

public class Zona {

	//creamos el atributo
	private int entradasPorVender;

	public Zona(int n) {
		entradasPorVender = n;
	}

	
	//utilizamos getter para saber cuantas entradas quedan por vender.
	public int getEntradasPorVender() {
		return entradasPorVender;
	}

	
	//iniciamos un bucle para vender o mostrar si quedan entradas
	public void vender(int n) {
		if (this.entradasPorVender == 0) {
			System.out.println("Lo siento, las entradas para esa zona están agotadas.");
		} else if (this.entradasPorVender < n) {
			System.out.println("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
		}
		if (this.entradasPorVender >= n) {
			entradasPorVender -= n;
			System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
		}
	}
}
