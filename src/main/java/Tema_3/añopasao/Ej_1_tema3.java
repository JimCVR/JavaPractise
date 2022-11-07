/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_3;
import java.util.Scanner;
/**
 *
 * @author jaimecaro
 */
public class Ej_1_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe algo");
        String cadena = sc.nextLine();
        System.out.println("Escribe un numero");
        int numero = sc.nextInt();
        if(cadena.length()>numero){
            System.out.println(cadena.charAt(numero));
        }else{
            System.err.println("Error");
        }
    }
}
