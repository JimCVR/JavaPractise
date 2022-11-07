package Tema_2.Relacion1;
import java.util.Scanner;
public class Ej_10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int b = sc.nextInt();
        System.out.println("Calculadora v1.1\n----------\n\n1.Sumar\n\n2.Restar\n\n3.Multiplicar\n\n4.Dividir\n\n0.Salir");
        System.out.println();
        int input = sc.nextInt();
        switch(input){
            case 0: System.out.println("Saliendo...");
            break;
            case 1: System.out.println(a+"+"+b+" = "+(a+b));
            break;
            case 2:System.out.println(a+"-"+b+" = "+(a-b));
            break;
            case 3:System.out.println(a+"x"+b+" = "+(a*b));
            break;
            case 4:System.out.println(a+"/"+b+" = "+(a/b));
            break;
        }
        sc.close();
    }
}
