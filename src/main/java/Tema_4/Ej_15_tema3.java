/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_4;

import java.util.Scanner;

/**
 *
 * @author jaimecaro
 */
public class Ej_15_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String c1 = sc.nextLine();
        System.out.println("Introduce otra cadena");
        String c2 = sc.nextLine();
        
        if(c1.compareToIgnoreCase(c2)< 0){
            System.out.println(c2+" es mayor");
        }else {
            System.out.println(c1+" es mayor");
        }
        /*
         if(c1.compareTo(c2)< 0){
            System.out.println(c2+" es mayor");
        }else {
            System.out.println(c1+" es mayor");
        }
*/
    }
}
