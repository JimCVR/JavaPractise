/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7;

import java.util.Scanner;

/**
 *
 * @author jaimecaro
 */
public class Ejecutar_Camino {
    public static void main(String[]args){
        Recorrido rec = new Recorrido();
               Scanner sc = new Scanner(System.in);
        int pasos = 0;
        char parar = 'n';
        String direccion = "";
        while(parar != 's'){
            System.out.println("Introduce pasos");
            pasos = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce direccion : arriba , abajo, derecha, izquierda");
            direccion = sc.nextLine(); 
            rec.avanzar(pasos, direccion);
            System.out.println("¿Parar? s/n");
            parar = sc.next().charAt(0);
            sc.nextLine();
        }      
        rec.mostrarRecorrido();
    }
}
