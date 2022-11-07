/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_1;

import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class temperatura {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature");
        int input = sc.nextInt();
        int fahrenheit = (9*input/5+32);
        System.out.println("Temperature in Fahrenheit:"+ fahrenheit);
        sc.close();
    }
}
