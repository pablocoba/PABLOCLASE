package ejercicio1;

public class Pizza {
	private enum tamaño {
		mediana, familiar 
	}
	private tamaño tamaño;
	private enum tipo{
		funghi("funghi"), 
		margarita("margarita"), 
		cuatro_quesos("cuatro quesos");
		
		private String displayName;
		
		tipo(String display){
			this.displayName = display;
		}
	}
	private tipo tipo;
	private static int pedidas = 0;
	private static int servidas = 0;
	public enum estado{
		pedida, servida
	}
	public estado estado;

	public Pizza(String tipo, String t) {
		this.tamaño = this.tamaño.valueOf(t);
		this.tipo = this.tipo.valueOf(tipo) ;
		this.pedidas = pedidas+1;
		this.estado = estado.pedida;
	}
	
	public void sirve() {
		if(this.estado == estado.servida) {
			System.out.println("Esta pizza ya se ha servido");
		}
		else {
			this.servidas = servidas+1;
			this.estado = estado.servida;
		}

	}
	
	public static int getTotalPedidas() {
		return pedidas;
	}
	public static int getTotalServidas() {
		return servidas;
	}
	
	public String toString() {
		return "Pizza " + tipo + " " + tamaño + ", " + estado;
	}
	
}
