package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 3.	Realiza una clase número que almacene un número entero y tenga las siguientes características:
 * Constructor por defecto que inicializa a 0 el número interno.
 * Constructor que inicializa el número interno.
 * Método aniade que permite sumarle un número al valor interno.
 * Método resta que resta un número al valor interno.
 * Método getValor. Devuelve el valor interno.
 * Método getDoble. Devuelve el doble del valor interno.
 * Método getTriple. Devuelve el triple del valor interno.
 * Método setNumero. Inicializa de nuevo el valor interno.

                             ...,?77??!~~~~!???77?<~.... 
                        ..?7`                           `7!.. 
                    .,=`          ..~7^`   I                  ?1. 
       ........  ..^            ?`  ..?7!1 .               ...??7 
      .        .7`        .,777.. .I.    . .!          .,7! 
      ..     .?         .^      .l   ?i. . .`       .,^ 
       b    .!        .= .?7???7~.     .>r .      .= 
       .,.?4         , .^         1        `     4... 
        J   ^         ,            5       `         ?<. 
       .%.7;         .`     .,     .;                   .=. 
       .+^ .,       .%      MML     F       .,             ?, 
        P   ,,      J      .MMN     F        6               4. 
        l    d,    ,       .MMM!   .t        ..               ,, 
        ,    JMa..`         MMM`   .         .!                .; 
         r   .M#            .M#   .%  .      .~                 ., 
       dMMMNJ..!                 .P7!  .>    .         .         ,, 
       .WMMMMMm  ?^..       ..,?! ..    ..   ,  Z7`        `?^..  ,, 
          ?THB3       ?77?!        .Yr  .   .!   ?,              ?^C 
            ?,                   .,^.` .%  .^      5. 
              7,          .....?7     .^  ,`        ?. 
                `<.                 .= .`'           1 
                ....dn... ... ...,7..J=!7,           ., 
             ..=     G.,7  ..,o..  .?    J.           F 
           .J.  .^ ,,,t  ,^        ?^.  .^  `?~.      F 
          r %J. $    5r J             ,r.1      .=.  .% 
          r .77=?4.    ``,     l ., 1  .. <.       4., 
          .$..    .X..   .n..  ., J. r .`  J.       `' 
        .?`  .5        `` .%   .% .' L.'    t 
        ,. ..1JL          .,   J .$.?`      . 
                1.          .=` ` .J7??7<.. .; 
                 JS..    ..^      L        7.: 
                   `> ..       J.  4. 
                    +   r `t   r ~=..G. 
                    =   $  ,.  J 
                    2   r   t  .; 
              .,7!  r   t`7~..  j.. 
              j   7~L...$=.?7r   r ;?1. 
               8.      .=    j ..,^   .. 
              r        G              . 
            .,7,        j,           .>=. 
         .J??,  `T....... %             .. 
      ..^     <.  ~.    ,.             .D 
    .?`        1   L     .7.........?Ti..l 
   ,`           L  .    .%    .`!       `j, 
 .^             .  ..   .`   .^  .?7!?7+. 1 
.`              .  .`..`7.  .^  ,`      .i.; 
.7<..........~<<3?7!`    4. r  `          G% 
                          J.` .!           % 
                            JiJ           .` 
                              .1.         J 
                                 ?1.     .'         
                                     7<..%
 */
import java.util.Scanner;
public class numero {
	//creamos variable n
	private int n;
	
	///creamos constructor
	public numero() {n = 0;}
	
	//creamos get de n basicamente
	public void shown() {
		System.out.println("El valor de n es; " + n);
	}
	
	//creamos metodo de suma
	public void addn(int anadido) {
		n+=anadido;
	}
	//creamos metodo de resta
	public void resn(int anadido) {
		n-=anadido;
	}
	//craemos gets
	public int getValor() {
		return n;
	}
	//metodo para duplicar y almacenar el nuevo valor de n
	public int getDoble() {
		n=n*2;
		return (n);
	}
	//metodo para triplicar y almacenar el nuevo valor de n
	public int getTriple() {
		n=n*3;
		return (n);
	}
	
	//metodo para introducir un nuevo valor para n y enseñarlo por pantalla
	public void setNumero() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce nuevo valor: ");
		n = teclado.nextInt();
		System.out.println("Valor del numero: "+n);
	}
	public static void main(String[] args) {
		//creamos objeto
		numero n = new numero();
		//probamos metodo set por teclado
		n.setNumero();
		
		Scanner teclado = new Scanner(System.in);
		//probamos metodo add por teclado
		System.out.println("Introduce nuevo valor para sumar: ");
		int suma = teclado.nextInt();
		n.addn(suma);
		
		System.out.println("Valor del numero tras la suma: "+n.getValor());
		
		//probamos metodo resta por teclado
		System.out.println("Introduce nuevo valor para restar: ");
		int resta = teclado.nextInt();
		teclado.close();
		n.resn(resta);
		
		System.out.println("Valor del numero tras la resta: "+n.getValor());
		System.out.println("Valor del numero duplicado: "+n.getDoble());
		//aquí se va a triplicar el número ya duplicado
		System.out.println("Valor del numero triplicado: "+n.getTriple());
		
		teclado.close();
	}

}
