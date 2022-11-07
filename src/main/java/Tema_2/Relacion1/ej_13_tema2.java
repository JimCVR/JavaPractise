package Tema_2;
import java.util.Scanner;
public class ej_13_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dia");
        int dia = sc.nextInt();
        System.out.println("Introduce mes");
        int mes = sc.nextInt();
        System.out.println("Introduce anho");
        int anho = sc.nextInt();
        if (dia > 30){
            dia-= 30;
            mes++; 
        }
        if (mes > 12){
            mes-=12;
            anho++;
        }
        System.out.println("Fecha: "+dia+" / "+mes+" / "+anho);
        sc.close();
    }
}
