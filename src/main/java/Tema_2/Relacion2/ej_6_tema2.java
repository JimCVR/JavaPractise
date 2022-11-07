package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_6_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de pisos");
        int pisos = sc.nextInt();
        for(int i = 0;i<pisos;i++){
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        sc.close();
    }
}
