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
public class ShowChar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.charAt(0)+" "+input.charAt(input.length()/2));
        sc.close();
    }
}
