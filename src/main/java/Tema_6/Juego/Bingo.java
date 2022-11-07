/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_6.Juego;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jaimecaro
 */
public class Bingo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Carton c1 = new Carton();
        Carton c2 = new Carton();
        int [] bolasdeBingo = new int [20];
        boolean primeraLinea = false;
        String firstLine = "";
        String ganador = "";
        int ronda = 0;
        //Generar Las bolas para jugar al Bingo
        for(int i = 0;i < bolasdeBingo.length;i++) {
            bolasdeBingo[i] = i+1;
        }
        //Partida de bingo
        while (c1.bingo() == false && c2.bingo() == false) {
            ronda++;
            System.out.println("Pulse enter para sacar numero");
            sc.nextLine();
            //Si la bola a salido,se vuelve a buscar otra
            int posicionBola = r.nextInt(20);
            while(bolasdeBingo[posicionBola] == -1) {
                posicionBola = r.nextInt(20);
            }
            System.out.println("El numero obtenido es : " + bolasdeBingo[posicionBola]);
            c1.borrarNumero(bolasdeBingo[posicionBola]);
            c2.borrarNumero(bolasdeBingo[posicionBola]);
            bolasdeBingo[posicionBola] = -1;
            System.out.println("Jugador 1");
            c1.mostrarCarton();
            System.out.println();
            System.out.println("Jugador 2");
            c2.mostrarCarton();
            if (primeraLinea == false) {
                if (c1.linea()) {
                    System.out.println("El jugador 1 ha conseguido linea!");
                    System.out.println();
                    primeraLinea = true;
                    firstLine = "Jugador 1";
                } else if (c2.linea()) {
                    System.out.println("El jugador 2 ha conseguido linea!");
                    System.out.println();
                    primeraLinea = true;
                    firstLine = "Jugador 2";
                }
            }
            if (c1.bingo()) {
                System.out.println("El jugador 1 ha conseguido Bingo!");
                ganador = "Jugador 1";
            }else if (c2.bingo()) {
                System.out.println("El jugador 2 ha conseguido Bingo!");
                ganador = "Jugador 2";
            }
        }
        System.out.println("----Estadisticas----");
        System.out.println("Primera Linea :" +firstLine);
        System.out.println("Ganador : "+ ganador);
        System.out.println("Numero de rondas: "+ronda);
    }
}
