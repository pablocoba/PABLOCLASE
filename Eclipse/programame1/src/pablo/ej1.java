package pablo;

import java.util.Scanner;
import java.util.ArrayList;
public class ej1 {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		int max = in.nextInt();
		ArrayList<String> equipos = new ArrayList<String>();
		ArrayList<String> linea = new ArrayList<String>();
		
		linea.add(in.nextLine());
		
		equipos.add(linea.get(0).split(" "));
		
		equipos.add(in.nextLine());
	}

}
