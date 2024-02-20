package sanFermines;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String vel = "";
		int cont = 0;
		
		System.out.println("Introduce la velocidad de los toros.");
		vel = in.nextLine();
	
		String[] x = vel.split(" ");
		
		List<String> z =  Arrays.asList(x);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}


	}

}
