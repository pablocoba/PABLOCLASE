package ejercicio1;
import java.util.*;
import java.util.ArrayList;

/*
 * @author Pablo Coba Lodín
 */
public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto("Mesa", 1, 3);
		Producto p2 = new Producto("Silla", 2, 2);
		Producto p3 = new Producto("Sofá", 3, 5);
		Producto p4 = new Producto("Cama", 4, 4);
		
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
		Tienda tienda = new Tienda(listaProductos);
		System.out.println(tienda);
		tienda.simularVentaOnline();
        System.out.println(tienda);
        System.out.println("Introduce el codigo de lo que deseas comprar");
        Scanner scanner=new Scanner(System.in);
        int codigo=scanner.nextInt();
        scanner.close();
        tienda.venderEnTienda(codigo);


		
	}

}
