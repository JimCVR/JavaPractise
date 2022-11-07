/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7;

import java.util.Stack;

/**
 *
 * @author jaimecaro
 */
public class EjemploPila {
    public static void main(String[]args){
        Stack<Integer> pila = new Stack<>();
        System.out.println();
        pila.push(10);
        pila.push(15);
        pila.push(80);
        System.out.println("Stack: "+ pila);
        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
}
