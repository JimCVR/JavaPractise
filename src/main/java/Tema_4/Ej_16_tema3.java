package Tema_4;

import java.util.Scanner;

public class Ej_16_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String cadena = sc.nextLine();
        System.out.println();
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 8;j++){
                System.out.println("\033["+i+";3"+j+"m"+cadena);
            }
        }
        sc.close();
    }
}
