package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda{
	//atributo
	private ArrayList listaProductos;
	//constructor
	public Tienda(ArrayList listaProductos) {
		this.listaProductos = listaProductos;
	}
	//metodo que crea y agrega un producto a la lista
	public void agregarProducto(String descripcion, int codigo, int stock) {
		Producto producto = new Producto(descripcion, codigo, stock);
		listaProductos.add(producto);
	}
	//metodo que comprueba si queda stock y si es así vende.
	public void venderProducto(Producto producto) {
		
		if(producto.getStock()<=0) {
			System.out.println("No queda stock de " + producto.getDescripcion());
		}
		else{
			producto.setStock(producto.getStock()-1);
			System.out.println("Se ha vendido " + producto.getDescripcion());
		}

		
	}
	
	public void simularVentaOnline() {
		System.out.println("Llegan las ventas online");
		venderProducto((Producto)listaProductos.get(0));
		venderProducto((Producto) listaProductos.get(2));
		venderProducto((Producto) listaProductos.get(2));
		venderProducto((Producto) listaProductos.get(3));
		venderProducto((Producto) listaProductos.get(3));
		venderProducto((Producto) listaProductos.get(3));
		venderProducto((Producto) listaProductos.get(0));
		venderProducto((Producto) listaProductos.get(2));
		venderProducto((Producto) listaProductos.get(0));
		venderProducto((Producto) listaProductos.get(1));
	}
	
	public String toString() {
		return "Tienda: "+ listaProductos;
	}
	//método que pide un código de producto para venderlo
	public void venderEnTienda(int codigo) {
		for (int i = 0; i < listaProductos.size(); i++) {
			if(((Producto) listaProductos.get(i)).getCodigo() == codigo) {
				venderProducto((Producto) listaProductos.get(i));
			}
		}
		
	}
	//pide código de producto y lo busca y devuelve
	private Producto buscaProducto(int codigo) {
		for (int i = 0; i < listaProductos.size(); i++) {
			if(((Producto) listaProductos.get(i)).getCodigo() == codigo) {
				return ((Producto) listaProductos.get(i));
			}
		}
		return null;
	}

}
