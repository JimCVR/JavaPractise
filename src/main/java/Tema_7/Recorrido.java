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
public class Recorrido {
    Stack <Movimiento> camino = new Stack();
    public Recorrido(){
        camino = new Stack();
    }
    public Recorrido(Stack <Movimiento> camino){
        this.camino = camino;
    }

    public void avanzar(int pasos, String direccion){
        switch(direccion){
                    case "arriba":
                        camino.push(new Movimiento(pasos,"abajo"));
                        break;
                    case "abajo":
                        camino.push(new Movimiento(pasos,"arriba"));
                        break;
                    case "derecha":
                        camino.push(new Movimiento(pasos,"izquierda"));
                        break;
                    case "izquierda":
                        camino.push(new Movimiento(pasos,"derecha"));
                        break;
                }
    }
    public void mostrarRecorrido(){
        while(!camino.isEmpty()){
            camino.pop().mostrarMovimiento();
        } 
    }
    
}
