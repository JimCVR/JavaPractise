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
public class Iva {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        double input = sc.nextDouble();
        double iva = input*0.21;
        System.out.println("Iva: "+iva);
        sc.close();
    }
}
