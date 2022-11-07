package Tema_9.Ficheros;

import java.io.*;

public class Ej_1_Lecturas {
    public static void main(String[]args) throws IOException {
        File f = new File("C:\\Users\\jaime\\Documents\\colegio\\NetBeansProjects\\JavaPractise\\src\\main\\java\\Tema_9\\Ficheros\\prueba.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String linea1 = br.readLine();
        System.out.println(linea1);
    }
}
