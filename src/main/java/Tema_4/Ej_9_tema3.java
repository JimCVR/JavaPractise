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
public class Ej_9_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int ocurrencia = 0;
        System.out.println("Introduce cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduce una letra a buscar");
        String cadena2 = sc.nextLine();
        char letra = cadena2.charAt(0);
        for(int i = 0;i<cadena.length();i++){
            if(cadena.charAt(i)==letra){
                ocurrencia++;
            }
        }
        System.out.println("Ocurrencias de "+letra+" : "+ocurrencia);
    }
}
