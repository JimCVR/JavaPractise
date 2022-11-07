package Tema_9.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ej_5_Lecturas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero");
        String fichero = sc.nextLine();
        System.out.println("Introduce el numero de lineas");
        int lineas = sc.nextInt();
        sc.nextLine();
        File f = new File(fichero);

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            if(lineas > f.length()) throw new EntradaMayorALineasException("");
        }catch(FileNotFoundException e){
            System.err.println("File not Found");
        }
        catch(EntradaMayorALineasException u){
            
        }



    }
}
