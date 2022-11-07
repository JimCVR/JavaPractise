package Tema_6;

import java.util.Random;

public class OpMatriz {
    private int[][] matriz;

    public OpMatriz() {
        matriz = new int[3][3];
    }

    public OpMatriz(int filas, int columnas) {
        Random r = new Random();
        matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(10) + 1;
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void mostrarMatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void mostrarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void modificar(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }
    public int obtener(int fila, int columna){
        return matriz[fila][columna];
    }

    public int[] devolverArray() {
        int[] matrizUnidimensional = new int[matriz.length * matriz[0].length];
        int cont=0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
               // matrizUnidimensional[j+i*matriz[i].length] = matriz[i][j];
                 matrizUnidimensional[cont]=matriz[i][j];
                cont++;
            }
        }
        return matrizUnidimensional;
    }
    private boolean verificarDimension(int [][] matriz2){
        if((matriz.length == matriz2.length) && (matriz[0].length == matriz2[0].length)){
            return true;
        }else{
            return false;
        }
    }
    public int [][] matrizNegativa (int [][] matriz2){
        int [][] matrizInsertida=new int[matriz2.length][matriz2[0].length];
         for(int i = 0;i < matriz.length;i++){
                for(int j = 0;j < matriz[i].length;j++){
                    matrizInsertida[i][j] = -1* matriz2[i][j];
                }
         }
         return matrizInsertida;
        
    }
    public void sumarMatriz(int [][] matriz2){
        int [][] suma = new int[matriz.length][matriz[0].length];
        if(verificarDimension(matriz2)){
            for(int i = 0;i < matriz.length;i++){
                for(int j = 0;j < matriz[i].length;j++){
                    suma[i][j] = matriz[i][j]+ matriz2[i][j];
                }
            }
            System.out.println("Resultado :");
            mostrarMatriz(suma);
        }else{
            System.err.println("Las matrices no tienen la misma dimension");
        }
    }
    /*public void restarMatriz(int [][] matriz2){
        int [][] resta = new int[matriz.length][matriz[0].length];
        if(verificarDimension(matriz2)){
            for(int i = 0;i < matriz.length;i++){
                for(int j = 0;j < matriz[i].length;j++){
                    resta[i][j] = matriz[i][j] - matriz2[i][j];
                }
            }
            System.out.println("Resultado :");
            mostrarMatriz(resta);
        }else{
            System.err.println("Las matrices no tienen la misma dimension");
        }
    }*/
    public void restarMatriz(int [][] matriz2){
        sumarMatriz(matrizNegativa(matriz2));
        
    }
}
