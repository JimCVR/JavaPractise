package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_7_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        boolean flag = false;
        do{
            System.out.println("Introduce un numero");
             a = sc.nextInt();
            System.out.println("Introduce el numero anterior");
             b = sc.nextInt();
             if (a == 0 || b == 0){
                 flag = true;
             }
        } while(a!=b && flag == false);
        sc.close();
    }
}
