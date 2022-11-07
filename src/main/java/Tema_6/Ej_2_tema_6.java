package Tema_6;

import java.util.Scanner;

public class Ej_2_tema_6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos numeros con decimales quieres?");
        int num = sc.nextInt();
        double [] vector = new double [num];
        for(int i = 0;i < vector.length;i++){
            System.out.println("Introduce valor para la posicion "+i);
            vector[i] = sc.nextDouble();
            System.out.println("Posicion "+i+" : "+vector[i]);
        }
    }
}
