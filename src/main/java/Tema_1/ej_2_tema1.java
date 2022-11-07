package Tema_1;
import java.util.Scanner;
public class ej_2_tema1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce temperatura");
        float input = sc.nextFloat();
        float farenheit = 9*input/5+32;
        System.out.println("Farenheit: "+farenheit);
        sc.close();
    }
}
