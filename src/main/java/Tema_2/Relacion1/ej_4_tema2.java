/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2;

import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class ej_4_tema2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n>m){
            System.out.println( n+" es mayor");
        } else{
            System.out.println(m+" es mayor");
        }
        sc.close();
    }
}
