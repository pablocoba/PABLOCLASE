package hashMap;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
public class ejercicio11 {

	public static void main(String[] args) {
		HashMap<String,String> diccionario = new HashMap<String,String>();
		crearDicc(diccionario);
		Scanner teclado = new Scanner(System.in);
		//buscarPalabra(diccionario, teclado);
		Random rng = new Random();

		System.out.println(diccionario.values());
		System.out.println(diccionario.keySet());
		int rnd; 
		Object[] lastNum = new Object[]{
			"xd","xd","xd","xd","xd"
		};
		Object randomValue;
		System.out.println("Introduce la traducción al español de las palabras de una en una.");
		for (int i = 0; i < 5; i++) {
			Object[] values= (diccionario.values().toArray());
			do {
				randomValue = values[rng.nextInt(values.length)];
				rnd = rng.nextInt(diccionario.size());
			
			}while(randomValue == lastNum[0] | randomValue == lastNum[1] | randomValue == lastNum[2] | randomValue == lastNum[3] | randomValue == lastNum[4]);
			System.out.println(randomValue);
			lastNum[i] = randomValue;
		}
		
		Object[] respuestas = new Object[] {
			0,0,0,0,0	
		};
		String[] objs = new String[] {
				"x","x","x","x","x"
		}
		;
		for (int i = 0; i < respuestas.length; i++) {
			objs[i] = (String) lastNum[i];
		}
		for (int i = 0; i < respuestas.length; i++) {

			respuestas[i]=teclado.nextLine();
			
		}

		
		for (int i = 0; i < respuestas.length; i++) {
			if(diccionario.get(objs[i]).equals(respuestas[i])) {
				System.out.println(respuestas[i] + ": Correcto.");
			}
			else System.out.println(respuestas[i] + ": Incorrecto.");
		}
		
		teclado.close();
		
	}

	private static void buscarPalabra(HashMap<String, String> diccionario, Scanner teclado) {
		boolean salir = false;
		String respuesta;

		do {
			System.out.println("Introduce una palabra en español. Pulsa 1 para salir.");
			respuesta = teclado.nextLine();
			
				if(respuesta.equals("1") | diccionario.containsKey(respuesta)) {
					if(respuesta.equals("1")) {
						salir = true;
					}
					else System.out.println(respuesta+": "+diccionario.get(respuesta));

				}
				else System.out.println("La palabra introducida no se encuentra en el diccionario");


		}while(salir ==false);
	}

	private static void crearDicc(HashMap<String, String> diccionario) {
		diccionario.put("Cero", "Zero");
		diccionario.put("Uno", "One");
		diccionario.put("Dos", "Two");
		diccionario.put("Tres", "Three");
		diccionario.put("Cuatro", "Four");
		diccionario.put("Cinco", "Five");
		diccionario.put("Seis", "Six");
		diccionario.put("Siete", "Seven");
		diccionario.put("Ocho", "Eight");
		diccionario.put("Rojo", "Red");
		diccionario.put("Azul", "Blue");
		diccionario.put("Amarillo", "Yellow");
		diccionario.put("Negro", "Black");
		diccionario.put("Blanco", "White");
		diccionario.put("Verde", "Green");
		diccionario.put("Morado", "Purple");
		diccionario.put("Naranja", "Orange");
		diccionario.put("Rosa", "Pink");
		diccionario.put("Marrón", "Brown");
	}

}
