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
public class Ej_3 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
