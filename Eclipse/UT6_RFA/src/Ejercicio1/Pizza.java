package Ejercicio1;

public class Pizza {

	//creamos los atributos
	private String tipo;
	private String tamaño;
	private String Estado;
	private static int totalpedidas=0;
	private static int totalservidas=0;
	
	
	//asignamos los atributos.
	public Pizza (String tipo , String tamaño) {
		
		this.tipo=tipo;
		this.tamaño=tamaño;
		this.Estado="pedida";
		totalpedidas++;
	}
	
	//creamos un metodo para saber si las pizzas ya se han servido.
	public void sirve() {
		if(Estado.equals("pedida")) {
			Estado = "servida";
			totalservidas++;
		}else {
			System.out.println("La pizza ya se ha servido.");
		}
	}
	
	
		//creamos getters para saber el total de pizzas que se han servido y vendido.
		public static int gettotalpedidas() {
			return totalpedidas;
		}
		
		public static int gettotalservidas() {
			return totalservidas;
		}
		
		@Override
		
		public String toString() {
			return "Pizza " + tipo + " " + tamaño + ", " + Estado;
		}
		
		
		
}
