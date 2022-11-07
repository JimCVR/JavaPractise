/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jaimecaro
 */
public class Matriz_1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Introduce filas");
        int filas = sc.nextInt();
        System.out.println("Introduce columnas");
        int columnas = sc.nextInt();
        int [][] miMatriz = new int[filas][columnas];
        for(int i = 0;i < miMatriz.length;i++){
            for(int j = 0;j < miMatriz[i].length;j++){
                miMatriz[i][j] = r.nextInt(101)+1;
                System.out.print(miMatriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
