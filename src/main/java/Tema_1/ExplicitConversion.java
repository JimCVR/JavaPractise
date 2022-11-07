/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_1;
import java.util.Scanner;
/**
 *
 * @author jaime
 */
public class ExplicitConversion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        int number = Integer.parseInt(input);
        double number2 = Double.valueOf(input2);
        double add = number + number2;
        
        System.out.println("Forma 1: "+number +" Forma 2: "+number2 +" Number+number2 = "+add);
        sc.close();
    }
}