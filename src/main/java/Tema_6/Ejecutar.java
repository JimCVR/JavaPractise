/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_6;

/**
 *
 * @author jaimecaro
 */

import java.util.Random;

public class Ejecutar {
    public static void main(String [] args ){
        Random r = new Random();
        OpMatriz m1 = new OpMatriz();
        OpMatriz m2 = new OpMatriz(3,3);
        int valor = 0;
        for(int i = 0;i < m1.getMatriz().length;i++){
            for(int j = 0; j < m1.getMatriz()[i].length;j++){
                valor = r.nextInt(10)+1;
                m1.modificar(i, j, valor);
            }
        }
        System.out.println("Matriz 1");
        m1.mostrarMatriz();
        System.out.println("Matriz 2");
        m2.mostrarMatriz();
        System.out.println("Matriz 1 + Matriz 2");
        m1.sumarMatriz(m2.getMatriz());
        System.out.println("Matriz 1 - Matriz 2");
        m1.restarMatriz(m2.getMatriz());
    }
}