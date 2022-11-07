package Tema_6.Actividades_Entregables;

import java.util.Random;

public class EJ_1 {
    public static void main(String[]args) {
        String [][] letras = new String[10][10];
        rellenarMatriz(letras);
        System.out.println("Filas");
        mostrarFilas(letras);
        System.out.println();
        System.out.println("Columnas");
        mostrarColumnas(letras);
        System.out.println();
        System.out.println("Diagonal");
        mostrarDiagonal(letras);
        System.out.println("Diagonal Inversa");
        mostrarDiagonalInversa(letras);
    }
    public static void rellenarMatriz(String [][] letras) {
            Random r = new Random();
            char letraAleatoria = ' ';
            for (int i = 0; i < letras.length; i++) {
                for (int j = 0; j < letras[i].length; j++) {
                    letraAleatoria = (char) (r.nextInt(26) +97);
                    letras[i][j] = ""+letraAleatoria;
                }
            }
        }
    public static void mostrarFilas(String[][]letras){
        for(int i = 0;i < letras.length;i++){
            for(int j = 0;j < letras[i].length;j++){
                System.out.print(letras[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void mostrarColumnas(String[][]letras){
        for(int i = 0;i < letras.length;i++){
            for(int j = 0;j < letras[i].length;j++){
                System.out.print(letras[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void mostrarDiagonal(String[][]letras){
        for(int i = 0;i < letras.length;i++){
            for(int j = 0;j < letras[i].length;j++){
                if(i == j){
                    System.out.print(letras[i][j]+" ");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void mostrarDiagonalInversa(String[][]letras){
        for(int i = 0;i < letras.length;i++){
            for(int j = letras.length-1;j >= 0;j--){
                if(i+j== letras.length-1){
                    System.out.print(letras[i][j]+" ");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*

1 Crea una matriz de 10 X 10 de letras en minúsculas(caracteres) (con o sin la ñ como elijas),
* a continuación muestra por pantalla las cadenas formadas por sus filas, por sus columnas y por sus diagonales.
* (puedes entregar la actividad sin mostrar las diagonales).
* */
