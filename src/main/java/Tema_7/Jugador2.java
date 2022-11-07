/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7;

/**
 *
 * @author jaimecaro
 */
public class Jugador2 implements Comparable<Jugador2>{
    private String nombre;
    private int posicion;
    private int goles;
    
    public static final int PORTERO = 0;
    public static final int DEFENSA = 1;
    public static final int CENTROCAMPISTA = 2;
    public static final int DELANTERO = 3;
    
    private String[] posiciones = new String[]{"Portero","Defensa","Centrocampista","Delantero"};
    
    public Jugador2(String nombre, int posicion,int goles){
        this.nombre = nombre;
        this.posicion=posicion;
        this.goles=goles;
    }
    public String toString(){
        return nombre+": "+this.posiciones[posicion]+" ha marcado "+goles+" goles";
    }
    public int compareTo(Jugador2 j){
        if(this.posicion==j.posicion)
            return j.nombre.compareTo(this.nombre);
        else
            return this.posicion=j.posicion;
    }
    public int getPosicion(){
        return this.posicion;
    }
    public String getNombre(){
        return this.nombre;
    }
}
