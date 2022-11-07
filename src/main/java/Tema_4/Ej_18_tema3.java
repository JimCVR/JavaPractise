package Tema_4;
import java.util.Scanner;
import java.util.regex.*;
public class Ej_18_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int ocurrencia = 0;
        System.out.println("Introduce cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduce palabra a buscar");
        String palabra = sc.nextLine();
        Pattern patron = Pattern.compile(palabra);
        Matcher matcher = patron.matcher(cadena); 
        
        while(matcher.find()){
            ocurrencia++;
        }
        System.out.println(ocurrencia);
        sc.close();
    }
}
