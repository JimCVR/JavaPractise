package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_15_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;
        System.out.println("Introduce un numero");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero");
        int b = sc.nextInt();
        if(a<b){
            System.out.println(a+" es menor que "+b+" entre ellos hay "+(b-a-1)+" numeros\nSon los siguientes: ");
            menor = a;
            mayor = b;
        }else{
            System.out.println(b+" es menor que "+a+" entre ellos hay "+(a-b-1)+" numeros\nSon los siguientes: ");
            menor = b;
            mayor = a;
        }     
        for(int i = menor+1;i<mayor;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
/*Desarrolla una aplicación que pida 2 números enteros. La aplicación determinará cuál es el
menor de ellos y mostrará todos los números que hay entre ellos y cuantos hay.*/