package arraylistobjetos;

/*
 * Una clase que implementa la interfaz Comparable significa que la clase 
 * admite la clasificaci�n
 * La lista o matriz de objetos de la clase que implementa la interfaz
 *  Comparable se puede ordenar autom�ticamente a trav�s de Collections.sort 
 *  o Arrays.sort.A
 */
/*En la definici�n de la clase Gato hay que indicar de alguna manera c�mo se
debe realizar la ordenaci�n, ya que Java no sabe de antemano si los gatos se ordenan
seg�n el color, el nombre, el peso, etc.
Lo primero que hay que hacer es indicar que los objetos de la clase Gato se pueden
comparar unos con otros. Para ello, cambiamos la siguiente l�nea:
public class Gato
por esta otra:
public class Gato implements Comparable<Gato>
Lo siguiente y no menos importante es definir el m�todo compareTo. Este m�todo debe
devolver un 0 si los elementos que se comparan son iguales, un n�mero negativo si
el primer elemento que se compara es menor que el segundo y un n�mero positivo
en caso contrario. Afortunadamente, las clases String, Integer, Double, etc. ya tienen
implementado su propio m�todo compareTo as� que tenemos hecho lo m�s dif�cil. Lo
�nico que deberemos escribir en nuestro c�digo es un compareTo con los atributos que
queremos comparar.
En el caso que nos ocupa, si queremos ordenar los gatos por nombre, tendremos que
implementar el compareTo de la clase Gato de tal forma que nos devuelva el resultado
del compareTo de los nombres de los gatos que estamos comparando, 
*/
public class Gato implements Comparable<Gato> {
	private String nombre;
	private String color;
	private String raza;
	public Gato(String nombre, String color, String raza) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}
	public String toString() {
		return "Nombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
	}
	//implementaci�n del m�todo compareTo para comparar dos Gatos por nombre
	public int compareTo(Gato g) {
		return (this.nombre).compareTo(g.getNombre());
	}
	public boolean equals(Gato g) {
		return (this.nombre).equals(g.getNombre());
		}
}