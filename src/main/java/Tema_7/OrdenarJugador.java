/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7;
import java.util.*;
/**
 *
 * @author jaimecaro
 */
public class OrdenarJugador {
    public static void main(String[]args){
        List<Jugador2> lista = new ArrayList<>();
        
        lista.add(new Jugador2("Iker Casillas",Jugador2.PORTERO,3));
        lista.add(new Jugador2("Jesus Navas",Jugador2.DELANTERO,10));
        lista.add(new Jugador2("Xabi Alonso",Jugador2.CENTROCAMPISTA,4));
        lista.add(new Jugador2("Sergio Ramos",Jugador2.DEFENSA,2));
        lista.add(new Jugador2("Álvaro Arbeloa",Jugador2.DEFENSA,1));
        lista.add(new Jugador2("Andrés Iniesta",Jugador2.CENTROCAMPISTA,12));
        lista.add(new Jugador2("David Villa",Jugador2.DELANTERO,15));
        lista.add(new Jugador2("Fernando Torres",Jugador2.DELANTERO,2));
        lista.add(new Jugador2("José Manuel Reina",Jugador2.DELANTERO,1));
        lista.add(new Jugador2("Roberto Soldado",Jugador2.DELANTERO,12));
        lista.add(new Jugador2("Santiago Cazorla",Jugador2.CENTROCAMPISTA,5));
        lista.add(new Jugador2("Jordi Alba",Jugador2.DEFENSA,2));
        lista.add(new Jugador2("Cesc Fábregas",Jugador2.CENTROCAMPISTA,4));
        Collections.sort(lista);
        lista.forEach((n) -> System.out.println(n));
    
    }
    
}
