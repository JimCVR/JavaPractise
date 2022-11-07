/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2;

import java.util.Scanner;

/**
 *
 * @author jaimecaro
 */
public class ej_10_ejemplo_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
      
        int numero = 0;
        int media = 0;
        int i =-1;
        int sumatorio= 0;
        do{
            System.out.println("Introduce numero");
            numero = sc.nextInt();
            sumatorio += numero;
            i++;        
        }while(numero!=0);
        System.out.println("Media: "+sumatorio/i+"\nNumeros introducidos: "+i);
    }
}
