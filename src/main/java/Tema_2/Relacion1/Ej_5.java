/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2.Relacion1;

import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class Ej_5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        float D = sc.nextFloat();
        float d = sc.nextFloat();
        if (d==0){
            System.err.println("No se puede dividir entre 0");
        } else{
            float res = D/d;
            System.out.println("Resultado: "+res);
        }
        sc.close();
    }
}
