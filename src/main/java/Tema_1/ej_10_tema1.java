package Tema_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaimecaro
 */
public class ej_10_tema1 {
    public static void main(String[]args){
        int i = -3;
        byte b = 5;
        float f = 1e-10f;
        double d = 3.14;
        boolean b1 = i > i;
        boolean b2 = i < b;
        boolean b3 = b <= f;
        boolean b4 = f >= d;
        boolean b5 = d != 0;
        boolean b6 = 1 == f;
        System.out.println( b1);// false
        System.out.println( b2);// true
        System.out.println(b3); // false
        System.out.println( b4);// false
        System.out.println( b5);// true
        System.out.println( b6);// false
    }
}
