package interfaces;

public interface Mascota {
	//M�todos a implementar 
	String getCodigo();
	void hazRuido();
	void come(String comida);
	void peleaCon(Animal contrincante);
}