package Tema_4;
import java.util.Scanner;
public class Ej_20_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();
        System.out.println("¿En cuantas partes quieres dividir la cadena?");
        int divisor = sc.nextInt();
        int numeroCaracteres = (cadena.length()/divisor);
        String nuevaCadena = "";
        sc.close();
        for(int i = 0;i<cadena.length();i+=numeroCaracteres){
            if(cadena.length()%divisor==0){
                nuevaCadena += cadena.substring(i,numeroCaracteres+i)+" ";
                
            }else{
                System.err.println("Error : no se puede dividir la cadena en: "+divisor+" partes iguales");
                break;
            }
        }
        System.out.println(nuevaCadena);
    }
}
