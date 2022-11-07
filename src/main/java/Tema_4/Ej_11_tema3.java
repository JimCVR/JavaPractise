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
public class Ej_11_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        
        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();
        for(int indice = 0 ;indice<cadena.length();indice++){
            switch (cadena.charAt(indice)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
                }
            }
            System.out.println("Recuento de vocales:\na: "+a+"\ne: "+e+"\ni: "+i+"\no: "+o+"\nu: "+u);
        sc.close();
    }
}
