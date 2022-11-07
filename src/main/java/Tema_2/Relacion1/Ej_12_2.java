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
public class Ej_12_2 {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int diaLimite = 0;
        System.out.println("Introduce dia");
        int inputDia = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce mes");
        String mes = sc.nextLine();
        
        System.out.println("Introduce año");
        int anho = sc.nextInt() ;

        if (mes.equals("febrero")){
            if(anho%4==0 && (anho%100!=0 || anho%400==0)){
                diaLimite = 29;
            }else{
                diaLimite = 28;
            }
        } else if(mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            diaLimite = 30;
        } else if(mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || mes.equals("julio") || mes.equals("agosto")) {
            diaLimite = 31;
        }
        if (diaLimite < inputDia){
            System.out.println("Fecha no valida");
        } else{
            System.out.println("Fecha Válida: " +inputDia+" de "+mes+" del año "+anho);
        }
        sc.close();
    }
}
