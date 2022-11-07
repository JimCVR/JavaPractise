/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_1;

import java.util.Scanner;

/**
 *
 * @author jaimecaro
 */
public class ej_14_tema1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String cadena1 = sc.nextLine();
        System.out.println("Introduce cadena 2");
        String cadena2 = sc.nextLine();
        if(cadena1.compareToIgnoreCase(cadena2)==-1){
            System.out.println(cadena1+" "+cadena2);
        }else{
            System.out.println(cadena2+" "+cadena1);
        }
    }
}
