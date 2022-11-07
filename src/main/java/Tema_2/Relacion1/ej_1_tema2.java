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
public class ej_1_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nota");
        int nota = sc.nextInt();
        if(nota<5){
            System.out.println("Suspenso");
        }else{
            System.out.println("Aprobado");
        }
        sc.close();
    }
}
