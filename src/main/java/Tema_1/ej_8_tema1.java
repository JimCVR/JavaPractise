/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_1;

/**
 *
 * @author jaimecaro
 */
public class ej_8_tema1 {
    public static void main(String[]args){
        int a = 1;
        int b = -6;
        int c = 2;
        
        double resultado1= -b+Math.sqrt(b*b-4*a*c)/2*a;
        double resultado2= -b-Math.sqrt(b*b-4*a*c)/2*a;
        System.out.println("Resultado 1: "+resultado1 +" Resultado 2: "+resultado2);
    }
}
