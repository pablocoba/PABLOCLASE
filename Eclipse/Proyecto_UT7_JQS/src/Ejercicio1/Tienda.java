package Ejercicio1;

import java.util.ArrayList;

public class Tienda extends Producto{
	
	private ArrayList<Producto> stock;
	
	public Tienda (int stock) {
		this.stock= new ArrayList<>();
	}
	public void agregarProducto(int codigo, int stock, String descripcion) {
		Producto producto = new Producto(codigo,stock,descripcion);
		this.stock.add(producto);
	}
	public void simularVentaOnline() {
		for (int i = 0; i < 10; i++) {
            int randomCodigo = (int) (Math.random() * 4) + 1;
            venderEnTienda(randomCodigo);
        }
	}
	public void venderEnTienda(int codigo) {
		Producto producto=buscaProducto(codigo);
		
		if(producto!=null && hayStock(producto)) {
			venderProducto(producto);
            System.out.println("Venta realizada: " + producto.getDescripcion());
		} else {
            System.out.println("No hay stock disponible para el producto con código " + codigo);
        }
	}
	private boolean hayStock(Producto producto){
		return producto.getStock()>0;
	}
	private void venderProducto(Producto producto) {
		producto.setStock(producto.getStock()-1);
	}
	private Producto buscaProducto(int codigo) {
		for (Producto producto : stock) {
			if (producto.getCodigo()==codigo) {
				return producto;
			}
		} return null;
	}
	public String toString() {
		 return "Tienda{" +
	                "stock=" + stock +
	                '}';
	    }
	}
