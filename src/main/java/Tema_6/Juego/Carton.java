/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_6.Juego;

import java.util.Random;

/**
 *
 * @author jaimecaro
 */
public class Carton {
    private int[][] numeros;
    private int [] bolasdeBingo;
    public Carton() {
        Random r = new Random();
        bolasdeBingo = new int[20];
        numeros = new int[3][4];
        for(int i = 0;i < bolasdeBingo.length;i++) {
            bolasdeBingo[i] = i+1;
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int posicionBola = r.nextInt(20);
                while(bolasdeBingo[posicionBola] == -1){
                    posicionBola = r.nextInt(20);
                }
                numeros[i][j] = bolasdeBingo[posicionBola]; //r.nextInt(20) + 1;
                bolasdeBingo[posicionBola] = -1;
            }
        }
    }

    public void borrarNumero(int ocurrencia) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (ocurrencia == numeros[i][j]) {
                    numeros[i][j] = 0;
                }
            }
        }
    }

    public void mostrarCarton() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == 0) {
                    System.out.print("\033[0;31m" + "X ");
                    System.out.print("\033[0m");
                } else {
                    System.out.print(numeros[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean bingo() {
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == 0) {
                    contador++;
                }
            }
        }
        if (contador == numeros.length * numeros[0].length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean linea() {
        int linea1 = 0;
        int linea2 = 0;
        int linea3 = 0;
        for (int i = 0; i < numeros[0].length; i++) {
            if (numeros[0][i] == 0) {
                linea1++;
            }
            if (numeros[1][i] == 0) {
                linea2++;
            }
            if (numeros[2][i] == 0) {
                linea3++;
            }
        }
        if (linea1 == numeros[0].length || linea2 == numeros[0].length || linea3 == numeros[0].length) {
            return true;
        } else {
            return false;
        }
    }
  /* public int generarNumeros(){
        Random r = new Random();

        int bolaFinal = bolasdeBingo[posicionBola];

        return bolaFinal;
    }*/
}


