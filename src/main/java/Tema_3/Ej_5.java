package Tema3;
import java.util.Scanner;
public class Ej_5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe algo");
        String cadena = sc.nextLine();
        System.out.println("¿Cuantas veces quieres mostrarlo?");
        int iteraciones = sc.nextInt();
        sc.close();
        for(int i = 0;i< iteraciones;i++){
            if(i%2==0){
                System.out.println(cadena.toLowerCase());
            }else{
                System.out.println(cadena.toUpperCase());
            }
        }
    }    
}
