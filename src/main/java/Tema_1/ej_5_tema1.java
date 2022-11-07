/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_1;

import java.util.Scanner;

/**
 *
 * @author jaimecaro
 */
public class ej_5_tema1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double cantidad = sc.nextDouble();
        double iva = cantidad*0.21;
        System.out.println("Iva: "+iva);
    }
}
