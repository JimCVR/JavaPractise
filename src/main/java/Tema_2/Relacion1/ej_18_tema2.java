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
public class ej_18_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int unidades = numero%10;
        int decenas = numero-unidades;
        //int decenas2=numero/10;      
        
        switch(decenas){
            case 10:  System.out.print("dieci");
            break;
            case 20: System.out.print("veinti");
            break;
            case 30: System.out.print("treintai");
            break;
            case 40: System.out.print("cuarentai");
            break;
            case 50: System.out.print("cincuentai");
            break;
            case 60: System.out.print("sesentai");
            break;
            case 70: System.out.print("setentai");
            break;
            case 80: System.out.print("ochentai");
            break;
            case 90: System.out.print("noventai");
            break;
            
            
        }
          switch(unidades){
            case 0:System.out.println("cero");
            break;
            case 1:System.out.println("uno");
            break;
            case 2:System.out.println("dos");
            break;
            case 3:System.out.println("tres");
            break;
            case 4:System.out.println("cuatro");
            break;
            case 5:System.out.println("cinco");
            break;
            case 6:System.out.println("seis");
            break;
            case 7:System.out.println("siete");
            break;
            case 8:System.out.println("ocho");
            break;
            case 9:System.out.println("nueve");
            break;                      
        }
        
    }
}
