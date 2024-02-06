package Ejercicio1;

public class Producto {
	public int codigo;
	public int stock;
	public String descripcion;
	
	public Producto(int codigo, int stock, String descripcion) {
		this.codigo= codigo;
		this.stock=stock;
		this.descripcion=descripcion;
	}
	public Producto() {
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
	    return "Producto{" +
                "codigo=" + codigo +
                ", stock=" + stock +
                ", descripcion='" + descripcion + '\'' +
                '}';
	}
	
}
