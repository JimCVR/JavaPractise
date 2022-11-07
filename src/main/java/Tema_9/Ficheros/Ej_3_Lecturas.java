package Tema_9.Ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej_3_Lecturas  {
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un fichero");
        String fichero = sc.nextLine();
        FileReader fr = new FileReader(fichero);
        System.out.println("Introduce un caracter a buscar");
        
    }
}
