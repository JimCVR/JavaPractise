package Tema_6;

import java.util.Random;

public class Ej_3_tema_6 {
    public static boolean noRepetir(int numero, int vector[]) {
        for(int i = 0;i < vector.length;i++){
            if(numero == vector[i]){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int [] vector = new int [10];
        Random r = new Random();
        String pares = "";
        String impares = "";

        for(int i = 0;i < vector.length;i++){
            int numero = r.nextInt(10)+1;
            while(!noRepetir(numero,vector)){
                numero = r.nextInt(10)+1;
            }
            vector[i] = numero;
            if(vector[i]%2==0){
                pares += vector[i]+" ";
            } else {
                impares += vector[i]+" ";
            }
        }
        System.out.println(pares);
        System.out.println(impares);
    }
}

