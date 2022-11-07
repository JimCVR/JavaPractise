/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2.Relacion1;
import java.util.Scanner;
/**
 *
 * @author jaime
 */
public class Ej_1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark >=5){
            System.out.println("Pass");
        } else {
            System.out.println("No pass");
        }
        sc.close();
    }
}
