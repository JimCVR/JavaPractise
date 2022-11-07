package Tema_6;

import java.util.Random;
import java.util.Scanner;

public class Matriz_3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        System.out.println("Introduce fila de matriz 1");
        fila = sc.nextInt();
        System.out.println("Introduce columna de matriz 1");
        columna = sc.nextInt();
        int [][] m1 = new int [fila][columna];
        System.out.println("Introduce fila de matriz 2");
        fila = sc.nextInt();
        System.out.println("Introduce columna de matriz 2");
        columna = sc.nextInt();
        int [][] m2 = new int [fila][columna];
        rellenarMatriz(m1);
        System.out.println("Matriz 1: ");
        mostrarMatriz(m1);
        rellenarMatriz(m2);
        System.out.println("Matriz 2: ");
        mostrarMatriz(m2);
        sumarMatriz(m1, m2);

    }

    public static void rellenarMatriz(int [][] matriz){
        Random r = new Random();
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] = r.nextInt(10)+1;
            }
        }
    }
    public static void mostrarMatriz(int [][] matriz){
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void sumarMatriz(int [][] matriz, int[][] matriz2){
        if((matriz.length == matriz2.length) && (matriz[0].length == matriz2[0].length)){
            for(int i = 0;i < matriz.length;i++){
                for(int j = 0;j < matriz[i].length;j++){
                    matriz[i][j] += matriz2[i][j];
                }
            }
            System.out.println("Matriz suma :");
            mostrarMatriz( matriz);
        }else{
            System.err.println("Las matrices no tienen la misma dimension");
        }
    }

}
