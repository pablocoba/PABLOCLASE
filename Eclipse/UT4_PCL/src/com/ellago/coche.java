package com.ellago;
/**
 * @author Pablo Coba Lodín
 * 7.	Crea la clase coche con dos constructores. 
 * Uno no toma parámetros y el otro sí. Los dos constructores inicializarán los atributos marca y modelo de la clase. 
 * Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
 * 
                                _________
                          _.--""'-----,   `"--.._
                       .-''   _/_      ; .'"----,`-,
                     .'      :___:     ; :      ;;`.`.
                    .      _.- _.-    .' :      ::  `..
                 __;..----------------' :: ___  ::   ;;
            .--"". '           ___.....`:=(___)-' :--'`.
          .'   .'         .--''__       :       ==:    ;
      .--/    /        .'.''     ``-,   :         :   '`-.
   ."', :    /       .'-`\\       .--.\ :         :  ,   _\
  ;   ; |   ;       /:'  ;;      /__  \\:         :  :  /_\\
  |\_/  |   |      / \__//      /"--\\ \:         :  : ;|`\|    
  : "  /\__/\____//   """      /     \\ :         :  : :|'||
["""""""""--------........._  /      || ;      __.:--' :|//|
 "------....______         ].'|      // |--"""'__...-'`\ \//
   `| WVE230L |__;_...--'": :  \    //  |---"""      \__\_/
     """""""""'            \ \  \_.//  /
       `---'                \ \_     _'
                             `--`---'  dp

 */

public class coche {
	//creamos variables
	private String marca;
	private String clase;
	//primer constuctor
	public coche(String marca, String clase) {
		this.marca = marca;
		this.clase = clase;
	}
	//segundo constructor vacío
	public coche() {}
	
	public static void main(String[] args) {
		//creamos un objeto con cada constructor
		coche rx7 = new coche("mazda","deportivo");
		coche gtr = new coche();
		
		//se ve que los constructores funcionan (el segundo debe no tener nada)
		System.out.println("coche 1: "+rx7.marca+ " "+rx7.clase + " || coche 2 (no hay datos): "+gtr);
	}

}
