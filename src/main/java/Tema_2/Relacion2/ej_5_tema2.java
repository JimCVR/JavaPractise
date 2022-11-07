package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_5_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero");
        int a = sc.nextInt();
        System.out.println("Introduce potencia");
        int b = sc.nextInt();
        int c = 1;
        for(int i = 0;i < b;i++){
            c = c*a;
        }
        System.out.println(a+"^"+b+" = "+c);
        sc.close();
    }
}
