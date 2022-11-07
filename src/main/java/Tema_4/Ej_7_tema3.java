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
public class Ej_7_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer nombre");
        String c1 = sc.nextLine();
        System.out.println("Introduce segundo nombre");
        String c2 = sc.nextLine();
        System.out.println("Introduce tercer nombre");
        String c3 = sc.nextLine();
        
        if(c1.compareToIgnoreCase(c2)< 0 && c1.compareToIgnoreCase(c3)< 0){
            System.out.println(c1);
            if(c2.compareToIgnoreCase(c3)< 0){
                System.out.println(c2);
                System.out.println(c3);
            }else{
                System.out.println(c3);
                System.out.println(c2);
            }
        }else if(c2.compareToIgnoreCase(c3)< 0){
            System.out.println(c2);
            if(c1.compareToIgnoreCase(c3)< 0){
               System.out.println(c1);
               System.out.println(c3);
            }else{
               System.out.println(c3);
               System.out.println(c1);
            }
        }else{
            System.out.println(c3);
            if(c1.compareToIgnoreCase(c2)!= 0){
                System.out.println(c1);
                System.out.println(c2);
            }else{
                System.out.println(c2);
                System.out.println(c1);
            }
        }  
   }
}
