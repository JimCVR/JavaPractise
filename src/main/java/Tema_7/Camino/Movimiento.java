/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7.Camino;

/**
 *
 * @author jaimecaro
 */
public class Movimiento {
    int pasos;
    String direccion;
    public Movimiento(){
        pasos = 0;
        direccion = "";
    }
    public Movimiento(int pasos, String direccion){
        this.pasos = pasos;
        this.direccion = direccion;
                
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void mostrarMovimiento(){
        System.out.println("Pasos: "+" "+pasos);
        System.out.println("Direccion: "+" " +direccion);
    }
}
