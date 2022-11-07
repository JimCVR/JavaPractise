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
public class ej_7_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Introduce nota");
        nota = sc.nextDouble();
       
        if (nota<5){
            System.out.println("Suspenso");
        }else if(nota >= 5 && nota < 6){
            System.out.println("Aprobado");
        }
        else if(nota >= 6 && nota < 7){
            System.out.println("Bien");
        }
        else if(nota <= 8){
            System.out.println("Notable");
            
        }
        else if(nota >= 8){
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
    
}
