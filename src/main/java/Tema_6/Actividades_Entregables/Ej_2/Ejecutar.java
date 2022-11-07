package Tema_6.Actividades_Entregables.Ej_2;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ListaDePalabras l1 = new ListaDePalabras();
        l1.mostrarPalabras();
        l1.setPalabra(0, " El perro");
        l1.mostrarPalabras();
        l1.eliminarCadena(2);
        l1.setPalabra(1, "come");
        l1.eliminarCadena("Mundo");
        l1.mostrarPalabras();
        l1.setPalabra(2, "pienso");
        l1.mostrarPalabras();
        int eleccion = -1;
        while(eleccion != 0){
            System.out.println("Elige una accion");
            System.out.println("1.Mostrar Cadenas");
            System.out.println("2.Modificar Cadena");
            System.out.println("3.Eliminar cadena por su posicion");
            System.out.println("4.Eliminar cadena por su valor");
            System.out.println("0. Salir");
            System.out.println();
            eleccion = sc.nextInt();
            sc.nextLine();
            switch(eleccion){
                case 1:
                    l1.mostrarPalabras();
                    break;
                case 2:
                    System.out.println("Introduzca posicion a modificar");
                    int posicion = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduzca cadena nueva");
                    String palabra = sc.nextLine();
                    l1.setPalabra(posicion,palabra);
                    break;
                case 3:
                    System.out.println("Introduzca posicion a eliminar");
                    posicion = sc.nextInt();
                    sc.nextLine();
                    l1.eliminarCadena(posicion);
                    break;
                case 4:
                    System.out.println("Introduzca cadena a eliminar");
                    palabra = sc.nextLine();
                    l1.eliminarCadena(palabra);
                    break;
                case 0:
                    break;
            }
        }
    }
}
