/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jaimecaro
 */
public class EjemploCola {
    public static void main(String[] args){
        Queue <String> cola = new LinkedList<>();
        
        cola.offer("One");
        cola.offer("Two");
        cola.offer("Three");
        cola.offer("Four");
        cola.offer("Five");
        System.out.println("queue: "+cola);
        
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
        
        
    
    
    }
}
