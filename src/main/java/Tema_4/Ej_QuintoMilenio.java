package Tema_4;

import java.util.Scanner;

public class Ej_QuintoMilenio{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean contiene = false;
        int pruebas = sc.nextInt();
        for(int k = 0;k<pruebas;k++){
            String frase = sc.nextLine().toLowerCase();
            String cadena = sc.nextLine().toLowerCase();
            cadena = cadena.replaceAll(" ","");
            int contador = 0;
            
            for(int i = 0 ;i < cadena.length();i++){
                for(int j = i;j<frase.length();j++){
                    if(cadena.charAt(i) == frase.charAt(j)){
                        contador++;
                        cadena = cadena.replace(cadena.charAt(i),'%');
                        if(contador == cadena.length()){
                            contiene = true;
                            break;
                        }
                    }
                }         
            }
        System.out.println(contiene);
    }
        sc.close();
    }
}