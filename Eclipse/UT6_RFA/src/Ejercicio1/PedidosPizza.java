package Ejercicio1;

public class PedidosPizza {
	public static void main(String[] args) {
		//mostramos las pizzas y sus estados.
		Pizza p1 = new Pizza("margarita", "mediana");
		Pizza p2 = new Pizza("funghi", "familiar");
		
		p2.sirve();
		
		Pizza p3 = new Pizza("cuatro quesos", "mediana");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p2.sirve();
		
		System.out.println("pedidas: " + Pizza.gettotalpedidas());
		System.out.println("servidas: " + Pizza.gettotalservidas());
	}
}
