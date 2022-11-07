package Tema_1;
import java.util.Scanner;
public class ej_3_tema1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edad");
        short edad = sc.nextShort();
        System.out.println("Introduce anho actual");
        short anho = sc.nextShort();
        System.out.println("Edad: "+(edad-anho));
        sc.close();
    }
}
