package Tema2.Relacion3;
import java.util.Scanner;
public class ej_11_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String password = "";
        do{
            System.out.println("Introduce nombre");
            nombre = sc.nextLine();
            System.out.println("Introduce contraseña");
            password = sc.nextLine();
        }while(!(nombre.equals("12") && password.equals("1234")));
        sc.close();
    }
}
