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
public class ej_12_tema1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce entero");
        int entero = sc.nextInt();
        System.out.println("Introduce decimal");
        double decimal = sc.nextDouble();
        System.out.println("Introduce Letra");
        sc.nextLine();
        String texto = sc.nextLine();
        System.out.println(entero+"  "+decimal+"  "+texto);
    }
}
