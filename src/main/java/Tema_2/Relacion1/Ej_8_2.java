package Tema_2.Relacion1;
import java.util.Scanner;

public class Ej_8_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Enter third number");
        double c = sc.nextDouble();
        double mayor = 0;
        
        if (a > b && a > c){
            mayor = a;
        }else if(b > a && b > c){
            mayor = b;
        }else if (c > a && c > b){
            mayor = c;
        }
        System.out.println("Mayor: "+mayor);
        sc.close();
    }
}
