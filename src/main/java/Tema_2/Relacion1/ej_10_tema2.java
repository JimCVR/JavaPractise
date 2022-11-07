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
public class ej_10_tema2 {
      public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a");
        int a = sc.nextInt();
        System.out.println("Introduce b");
        int b = sc.nextInt();
        System.out.println("------\nCalculadora ver 1.1\n\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n0.Salir");
        System.out.println();
        System.out.println("Introduce una opcion");
        int opcion = sc.nextInt();
        switch(opcion){
            
            case 0: System.out.println("Saliendo...");
                break; 
            case 1: System.out.println(a+"+"+b+"="+(a+b));
                break;
            case 2: System.out.println(a+"-"+b+"="+(a-b));             
                break;
            case 3: System.out.println(a+"x"+b+"="+(a*b));  
                break;
            case 4: System.out.println(a+"/"+b+"="+(a/b));
                break;
        }
    }
}
