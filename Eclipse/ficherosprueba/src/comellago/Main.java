package comellago;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fichero = new File("fich.txt");
		FileReader reader = new FileReader(fichero);
		BufferedReader buffer = new BufferedReader(reader);
		 if (fichero.exists()) {
			 System.out.println("Nombre del archivo "+ fichero.getName());
			 System.out.println("Ruta "+ fichero.getPath());
			 System.out.println("Ruta absoluta "+ fichero.getAbsolutePath());
			 System.out.println("Se puede escribir "+fichero.canRead());
			 System.out.println("Se puede leer "+fichero.canWrite());
			 System.out.println("Tamaño "+fichero.length());
			 buffer.readLine();
			 } 
		
	}

}
