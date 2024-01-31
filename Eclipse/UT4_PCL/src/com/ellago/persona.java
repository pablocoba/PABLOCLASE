package com.ellago;

import java.time.LocalDate;
import java.util.Scanner;
/**
 * @author Pablo Coba Lodín
 * 5.	Se realizará una clase nombrada Persona con las siguientes especificaciones:
•	Dos atributos (nombre y fecha_nacimiento) con visibilidad privada de tipo String.
•	Dos constructores (visibilidad pública):
•	Uno que sólo recibirá el nombre que inicializará el atributo nombre.
•	Otro que recibirá dos parámetros nombre y fecha_nacimiento para incializar los atributos.
•	Métodos (visibilidad pública) getters y setters para cada atributo.
•	Un método (visibilidad pública) que devolverá la edad(un entero) de la Persona basándose en su fecha de nacimiento nombrada como getEdad(). 
•	Se tendrá en cuenta si la persona ha o no cumplido ya los años. 
•	Si la fecha_nacimiento es null, el método devolverá un -1
Se podrá obtener la fecha actual a partir de la clase LocalDate aplicando el método now(). Ejemplo LocalDate fecha_actual=LocalDate.now() que pertenece al paquete java.time
•	El método principal que probará la clase creada siguiendo los siguientes pasos:
•	Se pedirá por teclado un Nombre.
•	Se creará el objeto tipo Persona con ese nombre.
•	Si la fecha de nacimiento es null, se solicitará por teclado una y se actualizará el atributo del objeto.
•	Al final, se escribirá por pantalla los siguientes mensajes:
•	“La persona es:” seguido del nombre
•	“Su fecha de nacimiento es” seguido de la fecha de nacimiento “y su edad es” seguido de la edad.
•	Para el acceso a los atributos se utilizarán los métodos correspondientes.

⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀ 
⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀ 
⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀ 
⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀ 
⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀ 
⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀ 
⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀ 
⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀ 
⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀ 
⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀ 
⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀

 */

public class persona {
	//creamos atributos
	private String nombre;
	private String fechaN;
	
	public static LocalDate fecha_actual = LocalDate.now();
	//declaramos la fecha actual para luego
	
	public persona(String nombre) {//constructor solo con nombre
		this.nombre = nombre;
	}
	
	public persona(String nombre, String fechaN) {//constructor con ambos fecha y nombre
		this.nombre = nombre;
		this.fechaN = fechaN;
	}


	public String getNombre() { //respectivos gets y sets
		return nombre;
	}
	public String getFechaN() {
		
		
		return fechaN;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFechaN(String fechaN) { //debe ser introducida en formato YYYY-MM-DD
		this.fechaN = fechaN;
	}
	public int getEdad() {
		int ano, mes,dia;
		
		//recogemos la fecha de nacimiento en Strings y las pasamos a ints(sin incluir los guiones)
		ano = Integer.parseInt(fechaN.substring(0,4));
		mes = Integer.parseInt(fechaN.substring(5,7));
		dia = Integer.parseInt(fechaN.substring(8,10));
		
		
		if(ano == 0 ||mes == 0||dia == 0) {
			return -1;
		}
		else { //estos ifs comprueban si los años, meses y días son mayores o no a la actual, lo que determina si tienes una edad mayor o menor
			int edadano = fecha_actual.getYear() - ano;
			
			if(mes>=fecha_actual.getMonthValue()) { 

				if(dia<=fecha_actual.getDayOfMonth()) {
					return edadano;
				}
				else {
					return edadano-1;
				}
			}
			else {
				return edadano;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		//pedimos datos
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = teclado.next();
		System.out.println("Introduce tu fecha de nacimiento en formato \"YYYY-MM-DD\" con guiones incluidos");
		String fechaN = teclado.next();
		
		//inicializamos objeto nuevo
		persona persona = new persona(nombre, fechaN);
	
		
		/**
		 * 
		 * ------------------ALTERNATIVA CON CHARATS-------------------
		char l0 =  persona.fechaN.charAt(0);
		char l1 =  persona.fechaN.charAt(1);
		char l2 =  persona.fechaN.charAt(2);
		char l3 =  persona.fechaN.charAt(3);
		char l5 =  persona.fechaN.charAt(5);
		char l6 =  persona.fechaN.charAt(6);
		char l8 =  persona.fechaN.charAt(8);
		char l9 =  persona.fechaN.charAt(9);

		//pasamos los caracteres a un string
		String nuevaF=""+l0+l1+l2+l3+l5+l6+l8+l9;
		
		//y del string a un entero
		int c = Integer.parseInt(nuevaF);
		
		//dividimos para sacar los datos año fecha y mes
		int ano = c/10000;
		int mes = (c/100)%100;
		int dia = c%100;
		---------------------------------------------------------------
		*/


		//imprimimos lo que queremos
		System.out.println("La persona es "+persona.nombre+", su fecha de nacimiento es "+persona.fechaN+", tiene "+persona.getEdad()+" años.");
		teclado.close();
		
	}

}
