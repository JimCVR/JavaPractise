package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_11_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        int contador = 0;
        boolean bandera = false;
        for(int i = 0;i<10 && bandera == false;i++){
            System.out.println("Introduce nota");
            nota = sc.nextInt();
            if (nota == -1){
                bandera =true;
            }
            if (nota == 10){
                contador++;
            }
        }
        System.out.println("Numero de dieces: "+contador);
        sc.close();
    }
}
