package Tema_7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Ej_4 {
    public static void main(String[]args) {
        LinkedList<String> a1 = new LinkedList<String>();
        LinkedList<String> a2 = new LinkedList<String>();
        a2.add("a");
        a2.add("b");
        a2.add("c");
        rellenarLista(a1, 3);
        System.out.print(a1+" ");
        cambiarElementos(a1, 0, 2);
        System.out.println(a1+" ");
        System.out.print(a2+" ");
        cambiarElementos(a2, "b","c" );
        System.out.print(a2+" ");
    }
    public static void rellenarLista(LinkedList <String> lista,int numeroCadenas){
        Random r = new Random();

        for(int i = 0;i < numeroCadenas;i++){
            int nLetras = r.nextInt(10)+2;
            String letras = "";
            for(int j = 0;j < nLetras;j++){
                letras += (char)(r.nextInt(26)+97)+"";

            }
            lista.add(letras);
        }
    }
    public static void cambiarElementos(LinkedList <String> lista,int posicion1, int posicion2){
        String pivote = lista.get(posicion1);
        lista.set(posicion1, lista.get(posicion2));
        lista.set(posicion2, pivote);
    }
    public static void cambiarElementos(LinkedList <String> lista,String valor1,String valor2){
        Iterator<String> it = lista.iterator();

        int pos1 = 0;
        int pos2 = 0;
        for(int i = 0;i < lista.size();i++) {
            if (lista.get(i).equals(valor1)) {
                pos1 = i;
            } else if (lista.get(i).equals(valor2)) {
                pos2 = i;
            }

        }
        String pivote = lista.get(pos1);
        lista.set(pos1, lista.get(pos2));
        lista.set(pos2, pivote);
    }
}
/*
* 4 Crea un programa de intercambio de dos elementos String, en una lista enlazada según su índice y por su valor.
* */