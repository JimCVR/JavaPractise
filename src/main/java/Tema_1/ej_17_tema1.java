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
public class ej_17_tema1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena 1");
        String cadena = sc.nextLine();
        int numero = Integer.parseInt(cadena);
        System.out.println("Introduce cadena 2");
        String cadena2 = sc.nextLine();
        double numero2 = Double.parseDouble(cadena2);
        int numero3 = (int)(numero+numero2);
        String cadena3 = "0"+numero3;
        System.out.println(cadena3);
    }
}
