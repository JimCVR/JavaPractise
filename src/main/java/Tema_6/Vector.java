package Tema_6;

import java.util.Random;

public class Vector {
    private int [] array;
    public Vector(){
        Random r = new Random();
        array = new int[50];
        for(int i =0;i < array.length;i++){
            array[i] = r.nextInt(50);
        }
    }
    public Vector(int elementos){
        array = new int[elementos];
    }
    public void mostrarVector(){
        for(int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public void mostrarAlReves(){
        for(int i = array.length-1;i >= 0 ;i++){
            System.out.println(array[i]);
        }
    }
    public int menor(){
        int menor = Integer.MAX_VALUE;
        for(int i = 0 ;i < array.length ;i++){
            if(array[i]<=menor){
                menor = array[i];
            }
        }
        return menor;
    }
    public int mayor(){
        int mayor = Integer.MIN_VALUE;
        for(int i = 0 ;i < array.length ;i++){
            if(array[i]<=mayor){
                mayor = array[i];
            }
        }
        return mayor;
    }
    public boolean comprobarNumero(int numero){
        for(int i = 0;i < array.length;i++){
            if(array[i]==numero){
                return true;
            }
        }
        return false;
    }
    public void setValor(int posicion,int valor){
        if(array.length > posicion){
            array[posicion] = valor;
        }else{
            System.err.println("La posicion introducida no existe");
        }

    }
    public void sustituirValor(int valor, int nuevoValor){
        for(int i = 0;i < array.length;i++){
            if(array[i]== valor){
                valor = nuevoValor;
            }
        }
    }
    public void intercambiarValores(int posicion1,int posicion2){
        int pivote = array[posicion1];
        array[posicion1] = array[posicion2];
        array[posicion2] = pivote;
    }
    public void Ordenar(){
        for(int i = 0;i < array.length-1;i++){
            for(int j = 0;j< array.length-1;j++) {
                if (array[j] > array[j + 1]) {
                    intercambiarValores(j,j+1);
                }
            }
        }
        mostrarVector();
    }
    public static void main(String[]args){
        Vector v = new Vector(5);
        v.setValor(0,5);
        v.setValor(1,8);
        v.setValor(2,9);
        v.setValor(3,4);
        v.setValor(4,2);
        //v.intercambiarValores(0,2);
        //v.mostrarVector();
        v.Ordenar();
    }
}
