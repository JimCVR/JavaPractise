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
public class Ej_14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String cadena = sc.nextLine();
        cadena = cadena.replaceAll(" ", "");
        String cadenaReverse = "";
        for(int i = cadena.length()-1;i>=0;i--){
            cadenaReverse +=cadena.charAt(i);
        }
        if(cadenaReverse.equalsIgnoreCase(cadena)){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
    }    
}
