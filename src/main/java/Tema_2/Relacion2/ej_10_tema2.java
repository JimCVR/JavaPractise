package Tema_2.Relacion2;
import java.util.Scanner;

public class ej_10_tema2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero positivo");
        int numero = sc.nextInt();
        int suma = 0;
        for(int i = 0;i<=numero;i++){
           if(i%2==0){
            System.out.print(suma+" + "+i+" = ");
            suma+=i;
            System.out.println(suma+" ");
           } 
        }
        sc.close();
    }
}
