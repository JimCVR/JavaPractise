import java.util.Scanner;

public class Ej_1_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe algo");
        String cadena = sc.nextLine();
        for(int i = 0 ;i<cadena.length();i++){
            System.out.print(cadena.charAt(i));
            if(cadena.charAt(i)==' ') {
                System.out.println();
            }
        }
    }
}
