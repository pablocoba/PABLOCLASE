package interfaces;

public interface Mascota {
	//Métodos a implementar 
	String getCodigo();
	void hazRuido();
	void come(String comida);
	void peleaCon(Animal contrincante);
}