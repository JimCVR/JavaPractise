package Tema_2;
import java.util.Scanner;
public class ej_15_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sueldoTotal = 0;
        System.out.println("Introduce horas trabajadas");
        int horas = sc.nextInt();
        if (horas>40){
            sueldoTotal = (40*16) + ((horas-40) *20);
        }else{
            sueldoTotal = horas*16;
        }
        System.out.println("Trabajando "+horas+" horas "+" el sueldo total es: "+sueldoTotal);
        sc.close();
    }
}
