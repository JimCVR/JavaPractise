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
public class ej_1_ejemplo_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edad");
        int edad = sc.nextInt();
        if(edad<18){
            System.out.println("Usted es menor de edad");
        }else{
            System.out.println("Usted es mayor de edad");
        }
        sc.close();
        System.out.println("Fin");
    }
}
