package herencia;

//!!OJO..Pinguino subclase de la clase Ave que una subclase de Animal...
public class Pinguino extends Ave {
	//Los atributos los hereda de la superclase..
	
	//Constructores
	public Pinguino() {
		super(); //Se llama al constructor de Ave
	}
	public Pinguino(Sexo s) {
		super(s);//Se llama al constructor de Ave
	}
	/**
	* El pingüino se siente triste porque no puede volar.
	**/
	@Override //Sobreescribe el método de Ave...
	public void vuela() {
		System.out.println("No puedo volar");
	}
}
