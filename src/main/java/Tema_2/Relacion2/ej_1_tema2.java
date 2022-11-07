package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_1_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo");
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++){
            System.out.println(i);
        }
        System.out.println("Introduce un numero positivo ver 2.0");
        int b = sc.nextInt();
        int contador = 1;
        while(b+1!=contador){
            System.out.println(contador);
            contador++;
        }
        System.out.println("Introduce un numero positivo ver 3.0");
        int c = sc.nextInt();
        int count = 1;
        do{
            System.out.println(count);
            count++;
        }while(c+1!=count);
        
        sc.close();
    }
}
