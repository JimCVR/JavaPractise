/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2;

import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class ej_6_tema2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int plantaActual = (int)(Math.random()*10);
        System.out.println("Estas en el piso "+plantaActual);
        System.out.println("Subir o bajar? (s/b)");
        String input = sc.nextLine();
        
        System.out.println("¿Cuantos pisos?");
        int pisosSeleccionados = sc.nextInt();
        
        if (pisosSeleccionados==0){
            System.out.println("Sigues en la misma planta");
        }
        
        if(input.equals("s")&& pisosSeleccionados!=0){
            if(plantaActual+pisosSeleccionados>10){
                System.out.println("Subiendo al piso 10...");
            }else{
                System.out.println("Subiendo al piso "+(plantaActual+pisosSeleccionados));
            }
        }
        if(input.equals("b") && pisosSeleccionados!=0){
            if(plantaActual-pisosSeleccionados<0){
                System.out.println("Bajando al piso 0...");
            }else{
                System.out.println("Bajando al piso "+(plantaActual-pisosSeleccionados));
            }
        }
        sc.close();
    }
}
