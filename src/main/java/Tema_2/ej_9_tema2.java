package Tema2.Relacion3;
import java.util.Scanner;
public class ej_9_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        if(numero < 0){
            System.out.println("Se ha introducido un numero negativo, procediendo a cambiarlo a positivo...");
            numero = -numero;
        }
        while(numero%10!=0){
            i++;
            numero = numero/10;
        }
        System.out.println("Digitos: "+i);
        sc.close();
    }
}
