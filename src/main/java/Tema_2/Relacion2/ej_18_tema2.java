/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2.Relacion2;
import java.util.Scanner;
/**
 *
 * @author jaimecaro
 */
public class ej_18_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        int m2 = 0;
        int m1 = 0;
        String respuesta = " ";
        boolean flag = false;
        do{
            System.out.println("Introduzca un importe");
            int importe = sc.nextInt();
            b20 = importe/20;
            b10 = importe%20/10;
            b5 = importe%20%10/5;
            m2 = importe%20%10%5/2;
            m1 = importe%20%10%5%2;
            sc.nextLine();
            System.out.println("Billetes de 20: "+b20+"\nBilletes de 10: "+b10+"\nBilletes de 5: "+b5+"\nMonedas de 2: "+m2+"\nMonedas de 1: "+m1);
            System.out.println("¿Quieres introducir otro importe?(s/n)");
            respuesta = sc.nextLine();
            do{
                if(respuesta.equals("s")){
                    flag = false;
                }else if(respuesta.equals("n")){
                    flag = true;
                }else{
                    System.out.println("Error: Introduce (s/n)");
                    respuesta = sc.nextLine();
                }
            }while(!(respuesta.equals("n") || respuesta.equals("s")));
        }while(flag==false);   
        System.out.println("Saliendo...");
    }
}
