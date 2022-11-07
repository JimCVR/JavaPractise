package Tema_2.Relacion1;
import java.util.Scanner;
public class Ej_20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int a = sc.nextInt();
        System.out.println("Introduce un segundo numero");
        int b = sc.nextInt();
        System.out.println("Introduce un tercer numero");
        int c = sc.nextInt();
        System.out.println("\nMenú\n----\n1.Buscar el mayor.\n2.Buscar el menor.\n3.Comprobar si todos iguales.\n4.Calcular la suma.\n5.Mostrar cuales son pares o impares.\n0.Salir");
        int input = sc.nextInt();
        
        switch(input){
            case 0: System.out.println("Saliendo...");
            break;

            case 1: 
            
            if(a > b && a > c){
                        System.out.println(a+" es mayor");
                    }
                    else if(b > a && b > c){
                        System.out.println(b+" es mayor");
                    }
                    else{
                        System.out.println(c+" es mayor");
                    }
            break;
            
            case 2:
            
            if(a < b && a < c){
                System.out.println(a+" es menor");
            }
            else if(b < a && b < c){
                System.out.println(b+" es menor");
            }
            else{
                System.out.println(c+" es menor");
            }
            break;
            
            case 3:if(a == b && b == c){
                System.out.println("Todos los numeros son iguales");
            }
            else{
                System.out.println("Los numeros no son iguales");
            }
            break;
            
            case 4:
                int suma  = a+b+c;
                System.out.println("Suma: "+suma);
            break;
            
            case 5:
                if (a%2==0){
                    System.out.println(a+" Es par");
                }else {
                    System.out.println(a+" Es impar");
                }
                if (b%2==0){
                    System.out.println(b+" Es par");
                }else {
                    System.out.println(b+" Es impar");
                }
                if (c%2==0){
                    System.out.println(c+" Es par");
                }else {
                    System.out.println(c+" Es impar");
                }
            break;
        }
        sc.close();
    }
}
