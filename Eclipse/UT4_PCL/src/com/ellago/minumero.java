package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 2.Realiza una clase minumero que proporcione el doble, triple y cuádruple de un número 
 * proporcionado en su constructor (realiza un método para doble, otro para triple y otro para cuádruple). 
 * Haz que la clase tenga un método main y comprueba los distintos métodos.
 
       _ _,---._
   ,-','       `-.___
  /-;'               `._
 /\/          ._   _,'o \
( /\       _,--'\,','"`. )
 |\      ,'o     \'    //\
 |      \        /   ,--'""`-.
 :       \_    _/ ,-'         `-._
  \        `--'  /                )
   `.  \`._    ,'     ________,','
     .--`     ,'  ,--` __\___,;'
      \`.,-- ,' ,`_)--'  /`.,'
       \( ;  | | )      (`-/
         `--'| |)       |-/
           | | |        | |
           | | |,.,-.   | |_
           | `./ /   )---`  )
          _|  /    ,',   ,-'
 -hrr-   ,'|_(    /-<._,' |--,
         |    `--'---.     \/ \
         |          / \    /\  \
       ,-^---._     |  \  /  \  \
    ,-'        \----'   \/    \--`.
   /            \              \   \
 */


import java.util.Scanner;

public class minumero {
	//creamos atributo num
	public int num;
	//creamos constructor que rellena el valor de num por teclado
	minumero(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num = teclado.nextInt();
		this.num = num;
	}
	//metodo para duplicar num
	public int doble(){
		return num*=2;
	}
	//metodo para triplicar num
	public int triple(){
		return num*=3;
	}
	//metodo para cuadruplicar num
	public int cuadruple(){
		return num*=4;
	}
	//creo un metodo show por conveniencia para el bucle que voy a crear
	public void showNum() {
		System.out.println("\nEl número es: "+num);
	}
	
	public static void main(String[] args) {
		boolean salir=false; //para el futuro bucle
		//creamos objeto
		minumero entero = new minumero();
		Scanner key = new Scanner(System.in);
		int n;
		//creo bucle do while para que siga funcionando hasta que el bool "salir" sea true
		do {
			entero.showNum();
			System.out.println("\nElige una opción:\n0- duplicar\n1- triplicar\n2- cuadruplicar\n3- salir");
			n = key.nextInt();
			switch(n) {//switch para seleccionar si duplicar, triplicar, cuadruplicar o salir
			case 0:
				System.out.println(entero.num +"*2 = "+entero.doble());
				break;
			case 1:
				System.out.println(entero.num +"*3 = "+entero.triple());
				break;
			case 2:
				System.out.println(entero.num +"*4 = "+entero.cuadruple());
				break;
			case 3: 
				salir=true;
				
			}
		}
		while(salir==false);
		
		key.close();
	}

}
