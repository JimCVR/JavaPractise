/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_4;
import java.util.Scanner;
/**
 *
 * @author jaimecaro
 */
public class Ej_2_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena");
        String cadena = sc.nextLine();
        
        for(int i = 0;i < cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }
    }
}
