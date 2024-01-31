package herencia;

//Ave es una subclase de Animal (hereda de la clase Animal--palabra extends)
public class Ave extends Animal {
	
	//Constructores
	public Ave(Sexo s) {
		super(s);//Se llama al constructor de la clase Animal
	}
	public Ave() {
		super();//Se llama al constructor de la clase Animal
	}
	
	//Métodos
	/**
	* Hace que el ave se limpie.
	*/
	public void aseate() {
		System.out.println("Me estoy limpiando las plumas");
	}
	/**
	* Hace que el ave levante el vuelo.
	*/
	public void vuela() {
		System.out.println("Estoy volando");
	}
}
