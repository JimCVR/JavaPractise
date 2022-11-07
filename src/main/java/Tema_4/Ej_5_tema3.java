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
public class Ej_5_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe una frase");
        String cadena = sc.nextLine();
        System.out.println("Cuantas veces quieres mostrarla?");
        int iteraciones = sc.nextInt();
        for(int i = 0;i<iteraciones;i++){
            if(i%2==0){
                System.out.println(cadena.toUpperCase());
            }else{
                System.out.println(cadena.toLowerCase());
            }
        }
    }
}
