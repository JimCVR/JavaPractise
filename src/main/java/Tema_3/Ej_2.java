import java.util.Scanner;

public class Ej_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe algo");
        String cadena = sc.nextLine();
        System.out.println("Introduce numero");
        int numero = sc.nextInt();
        if(cadena.length()>numero){
            System.out.println(cadena.charAt(numero));
        }else{
            System.err.println("Error");
        }
    }
}
