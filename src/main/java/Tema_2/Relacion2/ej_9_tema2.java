package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_9_tema2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Hasta que numero se va a contar?");
        int numero = sc.nextInt();
        System.out.println("¿De cuanto en cuanto se va a contar?");
        int contador = sc.nextInt();
        for(int i = 0;i<=numero;i+=contador){
            System.out.println(i);
        }
        sc.close();
    }
}