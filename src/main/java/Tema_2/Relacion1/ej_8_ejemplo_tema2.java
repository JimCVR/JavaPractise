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
public class ej_8_ejemplo_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        while(i<=numero){
            System.out.println(i++);
        }
    }
}
