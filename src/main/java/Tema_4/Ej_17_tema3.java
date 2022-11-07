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
public class Ej_17_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduce una letra a buscar");
        String letra = sc.nextLine();
        System.out.println(letra+" aparece por primera vez en la posicion "+cadena.indexOf(letra));
        int contador = 0;
        for(int i = 0;i<cadena.length();i++){
            if(letra.charAt(0) == cadena.charAt(i)){
                contador++;
            }
        }
        System.out.println("Ocurrencias de "+letra+" : "+contador);
    }
}
