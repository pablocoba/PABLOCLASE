package hashMap;
import java.util.HashMap;
import java.util.Scanner;
/*
 * @Author Pablo Coba Lodín
 * 
 * Implementa el control de acceso al área restringida de un programa. Se debe
pedir un nombre de usuario y una contraseña. Si el usuario introduce los
datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
de usuario con sus correspondientes contraseñas deben estar almacenados en
una estructura de la clase HashMap.

 */
public class ejercicio6 {
	public static void main(String[] args) {
		HashMap<String,String> log = new HashMap<String,String>();
		
		log.put("Pablo","caca");
		log.put("Admin", "123");
		log.put("Ayoub", "elmejo");
		
		Scanner teclado = new Scanner(System.in);
		
		String user;
		String password;

		
		boolean entrar = false;
		int i = 0;
		do {
			System.out.println("Introduce un usuario");
			user = teclado.nextLine();
			System.out.println("Introduce una contraseña");
			password = teclado.nextLine();
			
			if(log.containsKey(user)) {
				if(log.get(user).equals(password)) {
					System.out.println("Acceso permitido.");
					entrar = true;
				}
				else System.out.println("Contraseña incorrecta");

			}
			else System.out.println("Usuario incorrecto");
			i++;
		}while(entrar == false & i < 3);
		teclado.close();
	}

}
