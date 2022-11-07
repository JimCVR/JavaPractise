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
public class Orden {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.println("String 1");
        String chain = sc.nextLine();
         System.out.println("String 2");
        String chain2 = sc.nextLine();
            if (chain.compareToIgnoreCase(chain2)==-1){
                System.out.println("True");
            } else{
                   System.out.println("False");
                }
            sc.close();
        }
    }