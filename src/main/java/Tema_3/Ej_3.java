import java.util.Scanner;

public class Ej_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String cadena = " ";
        String cadena2 = " ";
        do {
            System.out.println("Escribe contraseña");
            cadena = sc.nextLine();
            System.out.println("Confirma contraseña");
            cadena2 = sc.nextLine();
        }while(!cadena.equals(cadena2));
    }
}