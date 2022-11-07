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
public class ej_7_ejemplo_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        int i = 1;
        int tabla = 0;
        while(numero>9 || numero<0){ 
        System.out.println("Introduce un numero del 0 al 9");
        numero = sc.nextInt();
        if(numero>0 && numero<10){
            while(i<= 10){
                tabla = numero*i;
                System.out.println(tabla);
                        i++;
            }    
        }else{
            System.out.println("Introduce un numero valido");
            }
        }
    }
}
