package Tema3;
import java.util.Scanner;
public class Ej_4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu primer apellido");
        String apellido1 = sc.nextLine();
        System.out.println("Introduce tu segundo apellido");
        String apellido2 = sc.nextLine();
        String usuario = nombre.charAt(0)+apellido1.substring(0,3) +apellido2.substring(0, 3);
        System.out.println("Su nombre de usuario es : "+usuario);
        sc.close();
    }
}
