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
public class Ej_8_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String c1 = sc.nextLine();
        System.out.println("Introduce otra cadena");
        String c2 = sc.nextLine();
        
        if(c1.length()< c2.length()){
            System.out.println(c1 +" es menor que "+ c2+ " por "+(c2.length()- c1.length())+" caracteres");
        }else if (c1.length() == c2.length()){
                        System.out.println(c1 +" es de igual tamaño que"+ c2);
        }else{
            System.out.println(c2 +" es menor que "+ c1+ " por "+(c1.length()- c2.length())+" caracteres");
        }
    }
}
