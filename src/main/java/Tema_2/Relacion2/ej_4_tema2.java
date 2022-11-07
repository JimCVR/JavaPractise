package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_4_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int a = sc.nextInt();
        System.out.println();
        for(int i = 0;i<a;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}