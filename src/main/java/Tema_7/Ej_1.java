package Tema_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        char respuesta = ' ';
        boolean salida = true;
        System.out.println("Inserta un numero");
        lista.add(sc.nextInt());
        while (salida) {
            System.out.println("¿Quieres insertar otro numero? s/n");
            respuesta = sc.next().charAt(0);
            if (respuesta == 'n') {
                salida = false;
            }else{
                System.out.println("Inserta un numero");
                lista.add(sc.nextInt());
            }
        }
        int eleccion = -1;
        while (eleccion != 0) {
            System.out.println("Elige una accion");
            System.out.println("1.Mostrar lista");
            System.out.println("2.Mostrar mayor, menor y media");
            System.out.println("3.Eliminar elemento de una posicion");
            System.out.println("4.Eliminar elemento por su valor");
            System.out.println("5.Añadir elemento al final");
            System.out.println("6.Modificar elemento por su posicion");
            System.out.println("7.Modificar elemento por su valor");
            System.out.println("0. Salir");
            System.out.println();
            eleccion = sc.nextInt();
            sc.nextLine();
            switch (eleccion) {
                case 0:
                    break;
                case 1:
                    mostrarLista(lista);
                    break;
                case 2:
                    System.out.println("Mayor: "+mayor(lista)+"\nMenor: "+menor(lista)+"\nMedia: "+media(lista));
                    break;
                case 3:
                    System.out.println("Introduce posicion");
                    int posicion = sc.nextInt();
                    lista.remove(posicion);
                    break;
                case 4:
                    System.out.println("Introduzca elemento a borrar");
                    int elemento = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Si desea borrar todas las ocurrencias del elemento introduzca t");
                    char todos = sc.next().charAt(0);
                    if(todos == 't') {
                        eliminarTodos(lista, elemento);
                    }else{
                        lista.remove(elemento);
                    }
                    break;
                case 5:
                    System.out.println("Introduzca elemento");
                    elemento = sc.nextInt();
                    lista.add(elemento);
                    break;
                case 6:
                    System.out.println("Introduzca posicion");
                    posicion = sc.nextInt();
                    System.out.println("Introduzca elemento nuevo");
                    elemento = sc.nextInt();
                    lista.set(posicion,elemento);
                    break;
                case 7:
                    System.out.println("Introduzca elemento a modificar");
                    elemento = sc.nextInt();
                    System.out.println("Introduzca nuevo elemento");
                    int nuevoElemento = sc.nextInt();
                    modificarTodos(lista, elemento,nuevoElemento);
                    break;

            }
        }
    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
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
    public static int menor(ArrayList<Integer> lista) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            if (menor >= lista.get(i)) {
                menor = lista.get(i);
            }
        }
        return menor;
    }
    public static double media(ArrayList<Integer> lista) {
        double media = 0;
        int sumatorio = 0;
        for (int i = 0; i < lista.size(); i++) {
            sumatorio+= lista.get(i);
        }
        media = sumatorio/lista.size();
        return media;
    }
    public static void eliminarTodos(ArrayList<Integer> lista,int elemento) {
        for (int i = 0; i < lista.size(); i++) {
            lista.remove(elemento);
        }
    }
    public static void modificarTodos(ArrayList<Integer> lista,int elemento,int nuevoElemento) {
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i)==elemento){
                lista.set(i,nuevoElemento);
            }
        }
    }
}
