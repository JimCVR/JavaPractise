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
public class Ej_4_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Escribe tu primer apellido");
        String apellido1 = sc.nextLine();
        System.out.println("Escribe tu segundo apellido");
        String apellido2 = sc.nextLine();
        String usuario = nombre.charAt(0)+apellido1.substring(0,3)+apellido2.substring(0,3);
        System.out.println(usuario);
    }
}
