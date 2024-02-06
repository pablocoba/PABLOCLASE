package ejercicio3;

public class Coche {
	
	//atributos
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	
	//constructores
	public Coche() {}
	public Coche(String matricula, String marca, String modelo, int km) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.km=km;
	}
	
	//getters y setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	//toString
	public String toString() {
		return marca + " " + modelo + ". Matrícula: " + matricula + ". Km: " + km;
	}
}
