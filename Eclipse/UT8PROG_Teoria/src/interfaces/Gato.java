package interfaces;

//Gato es una subclase de Animal(extends) y es una implementaci�n de la interfaz
//Mascota
public class Gato extends Animal implements Mascota {
	//Atributo
	private String codigo;
	
	//Constructor
	public Gato (Sexo s, String c) {
		super(s); //llama al constructor de su superclase Animal
		this.codigo = c;
	}
	
	//M�todos
	@Override //Sobrescribe el m�todo de la interfaz
	public String getCodigo() {
		return this.codigo;
	}
	/**
	* Hace que el gato emita sonidos.
	*/
	@Override //Sobrescribe el m�todo de la interfaz
	public void hazRuido() {
		this.maulla();
		this.ronronea();
	}
	/**
	* Hace que el gato maulle.
	*/
	public void maulla() {
		System.out.println("Miauuuu");
	}
	/**
	* Hace que el gato ronronee
	*/
	public void ronronea() {
		System.out.println("mrrrrrr");
	}
	/**
	* Hace que el gato coma.
	* A los gatos les gusta el pescado, si le damos otra comida
	* la rechazar�.
	*
	* @param comida la comida que se le ofrece al gato
	*/
	@Override
	public void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Hmmmm, gracias");
		} else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}
	/**
	* Pone a pelear al gato contra otro animal.
	* Solo se van a pelear dos machos entre s�.
	*
	* @param contrincante es el animal contra el que pelear
	*/
	@Override
	public void peleaCon(Animal contrincante) {
		if (this.getSexo() == Sexo.HEMBRA) {
			System.out.println("no me gusta pelear");
		} else {
			if (contrincante.getSexo() == Sexo.HEMBRA) {
				System.out.println("no peleo contra hembras");
			} else {
				System.out.println("ven aqu� que te vas a enterar");
			}
		}
	}
}
