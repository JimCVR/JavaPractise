package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_13_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce pisos");
        int pisos = sc.nextInt();
        System.out.println("Introduce ancho");
        int ancho = sc.nextInt();
        for(int i = 0 ;i<pisos;i++){
            for(int j = 0;j<pisos-i;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<i*2+ancho;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
