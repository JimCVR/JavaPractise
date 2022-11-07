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
public class Ej_12_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe algo");
        String cadena = sc.nextLine();
        System.out.println("Elige una letra a borrar");
        String letra = sc.nextLine();
        String nuevaCadena = cadena.replaceAll(letra, "");
        System.out.println(nuevaCadena);
    }
}
