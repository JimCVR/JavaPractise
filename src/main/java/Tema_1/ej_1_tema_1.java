package Tema_1;
import java.util.Scanner;
public class ej_1_tema_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double a = sc.nextDouble();
        System.out.println("Introduce un segundo numero");
        double b = sc.nextDouble();
        System.out.println("Media: "+ (a+b)/2);
        sc.close();
    }
}
