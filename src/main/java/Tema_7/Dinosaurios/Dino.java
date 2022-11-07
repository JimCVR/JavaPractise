/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7.Dinosaurios;

/**
 *
 * @author jaimecaro
 */
public class Dino {
    private String nombre;
    private double peso;
    private int mAnhos;
    
    public Dino(){
        nombre = "T-Rex";
        peso = 7000;
        mAnhos = 65;
    }
    public Dino(String nombre,double peso, int mAnhos){
        this.nombre = nombre;
        this.peso = peso;
        this.mAnhos = mAnhos;
    }
    public void mostrarDino(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Peso en Kg: "+peso);
        System.out.println("Antigüedad: "+mAnhos+" millones de anhos");
        System.out.println("------------------");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getmAnhos() {
        return mAnhos;
    }

    public void setmAnhos(int mAnhos) {
        this.mAnhos = mAnhos;
    }
    
    
    
}
