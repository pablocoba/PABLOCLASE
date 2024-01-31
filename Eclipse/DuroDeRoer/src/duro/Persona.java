package duro;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Persona {
	private String nombre = "Carlos";
	private int edad = 17;
	private String dni = "000000000A";
	private char sexo = 'H';
	private double peso = 68; //kg
	private double altura = 1.80; //m
	
	public Persona() {}
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo=sexo;
	}
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni = dni;
		this.sexo=sexo;
		this.peso = peso;
		this.altura=altura;
	}
	public double calcularIMC(){
		
		double result = peso/(Math.pow(altura, 2));
		
		if(result>25) {
			return 1;
		}
		else if(result<20) {
			return -1;
		}
		else{
			return 0;
		}
	}
	
	public boolean esMayorDeEdad() {
		if(edad>=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void switchIMC(int imc, Persona persona) {
		switch(imc) {
		case 0: System.out.println(persona.nombre + " está en su peso ideal\n");
				break;
		case -1: System.out.println(persona.nombre+" está por debajo de su peso ideal\n");
				break;
		case 1: System.out.println(persona.nombre + " está por encima de su peso ideal\n");
				break;
		}
	}
	
	private char comprobarSexo(char sexo) {
		if(sexo==this.sexo) {
			return sexo;
		}
		else {
			return 'H';
		}
	}
	
	public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "\nInformacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
 

	
	 private void generarDni() {
	        final int divisor = 23;
	 
	        //Generamos un número de 8 digitos
	        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
	        int res = numDNI - (numDNI / divisor * divisor);
	 
	        //Calculamos la letra del DNI
	        char letraDNI = generaLetraDNI(res);
	 
	        //Pasamos el DNI a String
	        dni = Integer.toString(numDNI) + letraDNI;
	    }
	 
	    private char generaLetraDNI(int res) {
	        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
	            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
	            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	 
	        return letras[res];
	    }
	    
	    public void setNombre(String nombre) {
	    	this.nombre=nombre;
	    }
	    public void setEdad(int edad) {
	    	this.edad=edad;
	    }
	    public void setSexo(char sexo) {
	    	this.sexo=sexo;
	    }
	    public void setAltura(double altura) {
	    	this.altura=altura;
	    }
	    public void setPeso(double peso) {
	    	this.peso=peso;
	    }
	    
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre=teclado.next();
		System.out.println("Introduzca su edad: ");
		int edad=teclado.nextInt();
		System.out.println("Introduzca su peso: ");
		double peso=teclado.nextDouble();
		System.out.println("Introduzca su altura en metros: ");
		double altura=teclado.nextDouble();
		System.out.println("Introduzca su sexo (H/M): ");
		char sexo=teclado.next().charAt(0);
		String dni = null;
		Persona primero = new Persona(nombre, edad, dni, sexo, peso, altura);
		Persona segundo = new Persona(nombre, edad, sexo);
		Persona tercero = new Persona();
		
		primero.generarDni();
		segundo.generarDni();
		tercero.generarDni();
		
		int IMC = (int)primero.calcularIMC();
		primero.switchIMC(IMC, primero);
		
		IMC = (int)segundo.calcularIMC();
		segundo.switchIMC(IMC, segundo);
		
		IMC = (int)tercero.calcularIMC();
		tercero.switchIMC(IMC, tercero);
		
		if(primero.esMayorDeEdad()==true) {
			System.out.println("\nEsta (1) persona es mayor de edad");
		}
		else {
			System.out.println("\nEsta (1) persona es menor de edad");
		}
		
		if(segundo.esMayorDeEdad()==true) {
			System.out.println("\nEsta (2) persona es mayor de edad");
		}
		else {
			System.out.println("\nEsta (2) persona es menor de edad");
		}
		if(tercero.esMayorDeEdad()==true) {
			System.out.println("\nEsta (3) persona es mayor de edad");
		}
		else {
			System.out.println("\nEsta (3) persona es menor de edad");
		}
		
			System.out.println(primero.toString());
			System.out.println(segundo.toString());
			System.out.println(tercero.toString());
			teclado.close();
	}

}
