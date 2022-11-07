/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2;
import java.util.Scanner;
/**
 *
 * @author jaimecaro
 */
public class ej_12_ejemplo_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra");
        String letra = sc.nextLine();
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        
        for(int i = 0;i<numero;i++){
            System.out.println(letra);
        }
        
        
        
        
        
      
    }
}
