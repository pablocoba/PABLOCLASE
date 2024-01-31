/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.netbeans1;
import java.util.Scanner;
/**
 *
 * @author Pablo Coba Lodin
 */
public class Netbeans1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        int num = teclado.nextInt();
        boolean primo = false;
        
        for(int i = 2; i<=num-1; i++){
            if(num%i!=0){
                System.out.println("Es primo!");
                primo = true;
                break;
            } 

        }
     
    }
}
