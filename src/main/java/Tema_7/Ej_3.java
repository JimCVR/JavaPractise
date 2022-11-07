/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jaimecaro
 */
public class Ej_3 {
        public static void main(String[]args) {
        ArrayList<Integer> a1 = new ArrayList(20);
        ArrayList<Integer> a2 = new ArrayList(20);
        ArrayList<Integer> a3 = new ArrayList();
        ArrayList<Integer> a4 = new ArrayList();
        rellenarLista(a1);
        rellenarLista(a2);
        System.out.println("Lista 1: ");
        mostrarLista(a1);
        System.out.println("lista 2: ");
        mostrarLista(a2);
        //Interseccion
        for(int i = 0;i < a2.size();i++){
            if(existe(a1,a2.get(i))){
                a3.add(a2.get(i));
            }else{
                a4.add(a1.get(i));
                a4.add(a2.get(i));
            }
            
        }
        System.out.println("Intersseccion");
       
        mostrarLista(a3);
        //Union
        System.out.println("Union");
        mostrarLista(a4);
    }
    public static boolean existe(ArrayList<Integer> lista, int numero) {
        for(int i = 0;i < lista.size();i++){
            if (lista.get(i) == numero){
                return true;
            }
        }
            return false;
    }
    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    public static void rellenarLista(ArrayList<Integer> lista) {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            lista.add(r.nextInt(100)+1);
        }
    }
}
