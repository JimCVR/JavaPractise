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
public class Ej_10_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduce letra a reemplazar");
        String letra = sc.nextLine();
        System.out.println("Introduce el reemplazo");
        String letraRemplazo = sc.nextLine();
        
        String nuevaCadena = cadena.replaceAll(letra, letraRemplazo);
        System.out.println(nuevaCadena);
    }
}
