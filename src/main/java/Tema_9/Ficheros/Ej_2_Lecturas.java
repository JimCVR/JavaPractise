package Tema_9.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej_2_Lecturas {
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de caracteres");
        int numero = sc.nextInt();
        File f = new File("C:\\Users\\jaime\\Documents\\colegio\\NetBeansProjects\\JavaPractise\\src\\main\\java\\Tema_9\\Ficheros\\prueba.txt");
        FileReader fr =(new FileReader(f));
        String texto ="";
        while(numero > 0){
            texto += (char) fr.read();
            numero--;
        }
        System.out.println(texto);
    }
}
