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
public class ej_9_tema1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce horas");
        int input = sc.nextInt();
        int semanas = input/168;
        int dias = input%168/24;
        int horas = (input%168)%24;
        System.out.println(semanas+" "+dias+" "+horas);
    }
}
