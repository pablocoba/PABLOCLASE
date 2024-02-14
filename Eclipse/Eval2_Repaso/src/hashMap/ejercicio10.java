package hashMap;
import java.util.HashMap;
import java.util.Scanner;

/*
 * @Author Pablo Coba Lodín
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.
 */
public class ejercicio10 {

	public static void main(String[] args) {
		HashMap<String,String> diccionario = new HashMap<String,String>();
		diccionario.put("Zero", "Cero");
		diccionario.put("One", "Uno");
		diccionario.put("Two", "Dos");
		diccionario.put("Three", "Tres");
		diccionario.put("Four", "Cuatro");
		diccionario.put("Five", "Cinco");
		diccionario.put("Six", "Seis");
		diccionario.put("Seven", "Siete");
		diccionario.put("Eight", "Ocho");
		diccionario.put("Red", "Rojo");
		diccionario.put("Blue", "Azul");
		diccionario.put("Yellow", "Amarillo");
		diccionario.put("Black", "Negro");
		diccionario.put("White", "Blanco");
		diccionario.put("Green", "Verde");
		diccionario.put("Purple", "Morado");
		diccionario.put("Orange", "Naranja");
		diccionario.put("Pink", "Rosa");
		diccionario.put("Brown", "Marrón");
		
		boolean salir = false;
		String respuesta;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce una palabra en inglés. Pulsa 1 para salir.");
			respuesta = teclado.nextLine();
			
				if(respuesta.equals("1") | diccionario.containsKey(respuesta)) {
					if(respuesta.equals("1")) {
						salir = true;
					}
					else System.out.println(respuesta+": "+diccionario.get(respuesta));

				}
				else System.out.println("La palabra introducida no se encuentra en el diccionario");


		}while(salir ==false);

		teclado.close();
		
	}

}
