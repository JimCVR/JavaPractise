package Tema_4;
import java.util.Scanner;
public class Ej_19_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String cadena = sc.nextLine();
        System.out.println("Escribe cadena a comparar");
        String cadena2 = sc.nextLine();
        sc.close();
        if(cadena.endsWith(cadena2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
