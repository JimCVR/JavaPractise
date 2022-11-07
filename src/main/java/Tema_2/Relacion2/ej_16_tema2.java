package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_16_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String continuar = " ";
        int numero = 0;
        int menor = 0;
        int contador = 0;
        do{
            System.out.println("Introduce un numero");
            numero = sc.nextInt();  
            if (contador<1){
                menor = numero;
                contador++;
            }else if(numero <= menor){
                menor = numero;
            }
            sc.nextLine();
            System.out.println("Desea introducir más numeros?(s/n)");
            continuar = sc.nextLine();
        }while(continuar.equals("s"));
        System.out.println("El menor es : "+menor);
        sc.close();
    }
}
