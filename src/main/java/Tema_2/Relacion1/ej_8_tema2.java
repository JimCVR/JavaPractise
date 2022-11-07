package Tema_2;
import java.util.Scanner;
public class ej_8_tema2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1");
        double nota0 = sc.nextDouble();
        System.out.println("Nota 2");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 3");
        double nota2 = sc.nextDouble();
        if (nota1 >= 3 && nota0 >= 3 && nota2 >= 3){
            double media = (nota0+nota1+nota2)/3;
            System.out.println("Nota media: "+media);
        }else{
            if((nota0+nota1+nota2)/3 > 4){
                System.out.println("La nota media es 4");
            }else{
                System.out.println((nota0+nota1+nota2)/3);
            }

        }
        sc.close();
    }
}