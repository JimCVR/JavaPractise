package Tema_2.Relacion1;
import  java.util.Scanner;
public class ej_19_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int opcion = 0;
            System.out.println("Menu\n----\n1.Calcular si es multiplo de 2\n\n2.Calcular si es multiplo de 3\n\n3.Calcular si es multiplo de 5\n\n0.Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1: 
                    if (numero%2 == 0){
                            System.out.println(numero+" es multiplo de 2");
                    }else{
                        System.out.println(numero+" no es multiplo de 2");
                    }
                    break;
                case 2:
                    if ((numero%10+numero/10)%3 == 0){
                        System.out.println(numero+" es multiplo de 3");
                    }else{
                        System.out.println(numero+" no es multiplo de 3");
                    }
                    break;
                case 3:
                    if (numero%10 == 0 || numero%10==5){
                        System.out.println(numero+" es multiplo de 5");
                    }else{
                        System.out.println(numero+" no es multiplo de 5");
                    }
                    break;
                case 0:System.out.println("Saliendo...");
                    break;
            }
        sc.close();
    }
}
