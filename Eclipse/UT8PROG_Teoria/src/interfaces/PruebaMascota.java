package interfaces;

import interfaces.Animal.Sexo;

public class PruebaMascota {
	public static void main(String[] args) {
		
		//Observa que los tipos interface Mascota se crean con los constructores
		//de la clase..NO PUEDES HACER un new Mascota!!!!
		
		Mascota garfield = new Gato(Sexo.MACHO, "34569");
		Mascota lisa = new Gato(Sexo.HEMBRA, "96059");
		Mascota kuki = new Perro(Sexo.HEMBRA, "234678");
		Mascota ayo = new Perro(Sexo.MACHO, "778950");
		System.out.println(garfield.getCodigo());
		System.out.println(lisa.getCodigo());
		System.out.println(kuki.getCodigo());
		System.out.println(ayo.getCodigo());
	}
}