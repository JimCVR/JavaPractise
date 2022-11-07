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
public class Edad {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth date");
        short input = sc.nextShort();
          System.out.println("Enter current year");
        short input2 = sc.nextShort();
        int age = (input2-input);
          System.out.println("Age: "+age );
          sc.close();
    }
}
