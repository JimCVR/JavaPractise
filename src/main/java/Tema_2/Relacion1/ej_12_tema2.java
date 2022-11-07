package Tema_2;
import java.util.Scanner;
public class ej_12_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dia");
        int inputDia = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce mes");
        String mes = sc.nextLine();
        int diaLimite = 0;

        if (mes.equals("febrero")){
            diaLimite = 28;
        } else if(mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            diaLimite = 30;
        } else if(mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || mes.equals("julio") || mes.equals("agosto")) {
            diaLimite = 31;
        }
        if (diaLimite < inputDia){
            System.out.println("Fecha no valida");
        }
        System.out.println("Fecha Válida: " +inputDia+" de "+mes);
        sc.close();
    }
}
