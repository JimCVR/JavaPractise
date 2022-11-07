package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_14_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int pares = 0;
        boolean bandera = false;
        for (int i = 0;i<10 && bandera == false;i++){
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
            if(numero < 0){
                bandera = true;
            }else{
            contador++;
                if(numero%2==0){
                    pares++;
                }
            }
        }
        System.out.println("Numeros introducidos: "+contador+"\nNumeros pares: "+pares+"\nNumeros impares: "+(contador-pares));
        sc.close();
    }
}
