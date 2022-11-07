package Tema_1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class Media {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        double number = sc.nextInt();
        System.out.println("Enter number 2");
        double number2 = sc.nextInt();
         double media = (number+number2)/2;
        System.out.println("Media: "+media);
        sc.close();
    }
}
