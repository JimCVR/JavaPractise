package Tema_7;

import java.util.ArrayList;
import java.util.Random;

public class Ej_2 {
    public static void main(String[]args) {
        ArrayList<Integer> a1 = new ArrayList(100);
        ArrayList<Integer> a2 = new ArrayList(100);
        ArrayList<Integer> a3 = new ArrayList();
        rellenarLista(a1);
        rellenarLista(a2);
        System.out.println("Lista 1: ");
        mostrarLista(a1);
        System.out.println("lista 2: ");
        mostrarLista(a2);
        a3.add(mayor(a1));
        a3.add(mayor(a2));
        System.out.println("Mayores de cada lista: ");
        mostrarLista(a3);
    }
    public static int mayor(ArrayList<Integer> lista) {
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            if (mayor <= lista.get(i)) {
                mayor = lista.get(i);
            }
        }
        return mayor;
    }
    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    public static void rellenarLista(ArrayList<Integer> lista) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            lista.add(r.nextInt(1000)+1);
        }
    }
}
/*
* 2. Crea una aplicación con dos listas (ArrayList) de 100 números aleatorios del 1 al 1000 y cree una tercera que en cada posición tendrá el mayor número de las dos anteriores.

 * */