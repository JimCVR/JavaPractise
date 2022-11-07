package Tema_2.Relacion2;
import java.util.Scanner;

public class ej_12_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero superior a 2");
        int numero = sc.nextInt();
        int b = 1;
        int suma = 1;
        for(int i = 2;i<numero;i++){
            System.out.print(b+" + "+suma+" = ");
            suma+=b;
         
            System.out.println(suma+" ");
            b = suma-b;
            
        }
        sc.close();
    }
}
