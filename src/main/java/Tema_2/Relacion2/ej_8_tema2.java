package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_8_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int a;
        int b = 0;
        int c = 0;
        System.out.println("Introduce numeros a sumar");
        for(int i = 0;i<10;i++){
            
            a = sc.nextInt();
            c++;
            if(a<0){
                break;
            }
            b = b+a;
        }
        System.out.println("Numeros introducidos: "+c+"\nSuma: "+b);
        sc.close();
    }
}
