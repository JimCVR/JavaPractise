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
public class ej_9_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota");
        int nota = sc.nextInt();
        switch(nota){
            
            case 0: 
            case 1:               
            case 2:               
            case 3:  
            case 4: System.out.println("Suspenso");
                break;
            case 5: System.out.println("Aprobado");
                break;
            case 6: System.out.println("Bien");
                break;
            case 7:               
            case 8: System.out.println("Notable");
                break;
            case 9:               
            case 10: System.out.println("Sobresaliente");
                break;
            
            default: System.out.println("Introduce un numero del 0 al 10");
                break;
        }
    }
}
