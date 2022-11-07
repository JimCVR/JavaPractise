package Tema_2.Relacion1;
import java.util.Scanner;
public class Ej_9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark");
        int mark = sc.nextInt();

        switch(mark){
            case 0: System.out.println("Suspenso");
            break;
            
            case 1:System.out.println("Suspenso");
            break;
            
            case 2:System.out.println("Suspenso");
            break;
            
            case 3:System.out.println("Suspenso");
            break;
            
            case 4:System.out.println("Suspenso");
            break;
            
            case 5:System.out.println("Aprobado");
            break;
            
            case 6:System.out.println("Bien");
            break;
            
            case 7:System.out.println("Notable");
            break;
            
            case 8:System.out.println("Notable");
            break;
            
            case 9:System.out.println("Sobresaliente");
            break;

            case 10:System.out.println("Sobresaliente");
            break;
            
            default:System.out.println("Nota no valida");
            break;
        }
        sc.close();
    }
}
