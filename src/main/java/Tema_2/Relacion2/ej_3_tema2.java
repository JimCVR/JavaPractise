package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_3_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero");
        int a = sc.nextInt();
        System.out.println();
        for(int i = a;i >= 0 ;i--){
            System.out.println(i);
        }
        sc.close();
    }
}
