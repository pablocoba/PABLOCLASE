package ejercicio1;

public class Producto {
	
	//atributos
	protected String descripcion;
	protected int codigo;
	protected int stock;
	//constructores
	public Producto(String descripcion, int codigo, int stock) {
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.stock = stock;
	}
	
	public Producto() {};
	
	//metodos tostring, getters, setters
	public String toString() {
		return "Producto {"+ codigo +": " + descripcion + " - Stock: " + stock+"}, ";
	}
	public int getCodigo() {
		return codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

}
