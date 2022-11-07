package Tema_2;
import java.util.Scanner;

public class ej_8_2_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        double a = sc.nextDouble();
        System.out.println("Introduce segundo numero");
        double b = sc.nextDouble();
        System.out.println("Introduce tercer numero");
        double c = sc.nextDouble();
        double menor = 0;
        
        if (a < b && a < c){
            menor = a;
        }else if(b < c){
            menor = b;
        }else{
            menor = c;
        }
        System.out.println("Menor: "+menor);
        sc.close();
    }
}
