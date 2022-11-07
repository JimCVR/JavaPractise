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
public class Equations {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ax²");
        int a = sc.nextInt();
        
        System.out.println("Enter bx");  
        int b = sc.nextInt();
      
        System.out.println("Enter c");
        int c = sc.nextInt();
        double solution1 =-b+Math.sqrt(b*b-4*a*c)/2*a;
        double solution2 =-b-Math.sqrt(b*b-4*a*c)/2*a;
        System.out.println("Solution 1 : "+solution1+"\nSolution 2 : "+solution2);
        sc.close();
    }
}
