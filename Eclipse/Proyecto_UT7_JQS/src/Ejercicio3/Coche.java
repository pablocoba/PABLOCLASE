package Ejercicio3;

public class Coche {
	
	public Coche(String matricula, String marca, String modelo, int kilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		Kilometros = kilometros;
	}
	
	public Coche() {
	}
	
	public String matricula;
	public String marca;
	public String modelo;
	public int Kilometros;
	
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
	public int getKilometros() {
		return Kilometros;
	}
	public void setKilometros(int kilometros) {
		Kilometros = kilometros;
	}
}
