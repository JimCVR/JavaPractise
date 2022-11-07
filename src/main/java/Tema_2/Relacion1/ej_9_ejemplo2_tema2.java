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
public class ej_9_ejemplo2_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Introduce tu año de nacimiento");
        int anho = sc.nextInt();
        while(anho!=1996){
            System.out.println("Error: Introduce tu año de nacimiento");
            anho = sc.nextInt();
            i++;
        }
        System.out.println("Correcto!\nNumero de intentos: "+i);
    }
}
