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
public class Matriz_2 {
    public static void main(String[]args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [10][10];
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] = r.nextInt(101)+1;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Introduce el numero a buscar");
           int numero = sc.nextInt();
        System.out.println(buscar(matriz,numero));
    }
    public static String buscar(int [][] matriz,int numero){
          for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length;j++){
                if(matriz[i][j] == numero){
                    return "fila "+i+" columna "+j; 
                }
            }
        }
        return "No se ha encontrado el numero";
    }
}
