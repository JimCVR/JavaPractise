/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2;

import java.util.Scanner;

/**
 *
 * @author jaimecaro
 */
public class ej_2_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ingresos");
        float ingresos = sc.nextFloat();
        System.out.println("Introduce gastos");
        float gastos = sc.nextFloat();
        float saldo = (float)(ingresos-gastos);
        if(saldo<0){
            System.out.println("Lo siento, estas en numeros rojos");
        }else{
            System.out.println("Enhorabuena, te sobran "+saldo+"€");
        }
        sc.close();
    }
}
