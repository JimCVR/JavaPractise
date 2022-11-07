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
public class Round {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        double rounded = Math.ceil(input/2);
        System.out.println("Rounded number: "+rounded);
        sc.close();
    }
}
