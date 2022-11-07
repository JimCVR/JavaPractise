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
public class ej_9_ejemplo_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año actual");
        int anho = sc.nextInt();
        while(anho!=2021){
            System.out.println("Error: Introduce el año actual");
            anho = sc.nextInt();
        }
    }
}
