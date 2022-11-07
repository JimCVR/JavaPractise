/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_1;
import java.util.Scanner;
/**
 *
 * @author jaimecaro
 */
public class ej_4_tema1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce base");
        float base = sc.nextFloat();
        System.out.println("Introduce altura");
        float altura = sc.nextFloat();
        float area = (base*altura)/2;
        System.out.println(area);
    }
}
