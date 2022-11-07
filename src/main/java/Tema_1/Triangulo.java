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
public class Triangulo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        double base = sc.nextDouble();
        System.out.println("Enter height");
        double height= sc.nextDouble();
        double area = (base*height)/2;
        System.out.println("Area: "+area);
        sc.close();
    }
}
