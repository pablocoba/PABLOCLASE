package herencia;

import herencia.Animal.Sexo;

public class PruebaAnimal {
	public static void main(String[] args) {
		Gato garfield = new Gato(Sexo.MACHO, "romano");
		Gato tom = new Gato(Sexo.MACHO);
		Gato lisa = new Gato(Sexo.HEMBRA);
		Gato silvestre = new Gato();
		System.out.println(garfield);//Se utiliza el método toString de la clase Gato
		System.out.println(tom);
		System.out.println(lisa);
		System.out.println(silvestre);
		
		/*los objetos miLoro y pingu actúan de manera polimórfica porque
		a ambos se les aplican los métodos aseate y vuela.*/
		
		Ave miLoro = new Ave();
		miLoro.aseate();
		miLoro.vuela();
		Pinguino pingu = new Pinguino(Sexo.HEMBRA);
		pingu.aseate();
		pingu.vuela();
	}
}
