package Ejercicio3;

public class Main {
	public static void main(String[] args) {
		PruebaCoche pruebaCoche = new PruebaCoche();
		for (int i = 0; i < 1; i++) {
            pruebaCoche.agregarCoche();
        }

        pruebaCoche.mostrarCoches();
        pruebaCoche.mostrarPorMarca();
        pruebaCoche.mostrarPorKm();
	}
}
