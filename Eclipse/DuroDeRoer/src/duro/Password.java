package duro;

import java.util.Random;
import java.util.Scanner;

public class Password {
	private int longitud = 8;
	private String contrasenia = "";
	
	public Password(){};
	
	public Password(int longitud) {
		generarPassword(longitud);
		esFuerte();
	}
	
	public boolean esFuerte() {
		
		int cuentaMayus = 0;
		int cuentaMinus = 0;
		int cuentaNum = 0;
		for(int i = 0; i<longitud; i++) {
			 
			 int mayusOMinus=(int) contrasenia.charAt(i);
			 if(mayusOMinus >= 65 & mayusOMinus <=90) {
				 cuentaMayus++;
			 }
			 else if(mayusOMinus >= 97 & mayusOMinus <=122) {
				 cuentaMinus++;
			 }
			 else if(mayusOMinus >= 48 & mayusOMinus <=57) {
				 cuentaNum++;
			 }		 

		}
		 if(cuentaMayus >= 2 & cuentaMinus >=1 & cuentaNum >= 5) {
			 return true;
		 }
		 else {return false;}
	}
	
	
	
	public void generarPassword(int longitud) {
		this.longitud = longitud;
		for(int i =0;i<=longitud;i++) {
			int numero = (int)(Math.random()*10+0);
			char minus = (char)((int)(Math.random()*26 + 97));
			char mayus = (char)((int)(Math.random()*26 + 65));
			Random rd  = new Random();
			Random letra = new Random();
			if(rd.nextBoolean()==true) {
				contrasenia = contrasenia + numero;
			}
			else {
				if(letra.nextBoolean()==true) {
					contrasenia=contrasenia+minus;
				}
				else {
					contrasenia=contrasenia+mayus;
				}
			}
		}
		this.contrasenia=contrasenia;

	}
	
	public String getContrasenia(){
		return contrasenia;
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud=longitud;
	}
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce longitud de la contraseña: ");
		int longitud = teclado.nextInt();
		Password passwords[] = new Password[10];
		boolean fortaleza[] = new boolean[10];
		for(int i = 0; i<passwords.length;i++) {
			passwords[i]= new Password(longitud);
			System.out.println("\nContaseña "+ (i+1) + ": " +passwords[i].getContrasenia());
			fortaleza[i]=passwords[i].esFuerte();
			if(passwords[i].esFuerte() == true) {
				System.out.println("-Contraseña fuerte.");
			}
			else {System.out.println("-Contraseña débil.");}
		}

	}

}
	
