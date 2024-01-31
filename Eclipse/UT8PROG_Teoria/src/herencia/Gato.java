package herencia;

//Gato es una subclase de la clase abstracta Animal
public class Gato extends Animal {
	//Atributos
	private String raza;
	//Constructores
	public Gato (Sexo s, String r) {
		super(s);//Se llama al  constructor de la superclase (Animal)
		raza = r;
	}
	public Gato (Sexo s) {
		super(s);//Se llama al  constructor de la superclase (Animal)
		raza = "siamés";
	}
	public Gato (String r) {
		super(Sexo.HEMBRA);//Se llama al  constructor de la superclase (Animal)
		raza = r;
	}
	public Gato () {
		super(Sexo.HEMBRA);//Se llama al  constructor de la superclase (Animal)
		raza = "siamés";
	}
	//Se sobreescribe el método toString
	public String toString() {
		return super.toString() //Se llama la método de la superclase
		+ "Raza: " + this.raza
		+ "\n*************************\n";
	}
	
	//Métodos
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
		* la rechazará.
		*
		* @param comida la comida que se le ofrece al gato
		*/
	public void come(String comida) {
		if (comida.equals("pescado")) {
		System.out.println("Hmmmm, gracias");
		} else {
		System.out.println("Lo siento, yo solo como pescado");
		}
	}
		/**
		* Pone a pelear dos gatos.
		* Solo se van a pelear dos machos entre sí.
		*
		* @param contrincante es el gato contra el que pelear
		*/
	public void peleaCon(Gato contrincante) {
		if (this.getSexo() == Sexo.HEMBRA) {
			System.out.println("no me gusta pelear");
		} else {
			if (contrincante.getSexo() == Sexo.HEMBRA) {
				System.out.println("no peleo contra gatitas");
			} else {
				System.out.println("ven aquí que te vas a enterar");
			}
			}
	}
}
