package Tema_2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaimecaro
 */
public class ej_3_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero");
        int numero = sc.nextInt();
        if(numero%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        sc.close();
    }
}
