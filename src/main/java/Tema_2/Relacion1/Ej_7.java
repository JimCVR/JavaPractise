package Tema_2.Relacion1;
import java.util.Scanner;

public class Ej_7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark");
        double input = sc.nextDouble();

        if(input < 5){
            System.out.println("Suspenso");
        } else if (input >= 5 && input < 6){
            System.out.println("Aprobado");
        }else if (input >= 6 && input < 7){
            System.out.println("Bien");
        }else if (input >=7 && input <= 8){
            System.out.println("Notable");
        }else if (input > 8){
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
}