package Tema_2;
import java.util.Scanner;
public class ej_11_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dia");
        int dia = sc.nextInt();
        System.out.println("Introduce mes");
        int mes = sc.nextInt();
        System.out.println("Introduce anho");
        int anho = sc.nextInt();

        if (dia > 0 && dia < 30 && mes < 13 && mes > 0 && anho >= 0 && anho < 2022 ){
            System.out.println("Fecha Valida");

        }else{
            System.out.println("Fecha Invalida");
        }

        sc.close();
    }
}
