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
public class ImplicitConversion {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        int number = sc.nextInt();
        byte sum = (byte) (number + n);
        System.out.println(sum);
    sc.close();
    }
}
