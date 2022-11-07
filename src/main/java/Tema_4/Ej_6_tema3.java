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
public class Ej_6_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String cadena = sc.nextLine();
        System.out.println("Introduce nombre");
        String cadena2 = sc.nextLine();
        if(cadena.compareToIgnoreCase(cadena2)!=0){
            System.out.println("Primero: "+cadena +"\nSegundo: "+cadena2);
        }
    }
}
