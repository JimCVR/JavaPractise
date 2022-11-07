package Tema_7.Bingo2;
import java.util.*;
public class Bingo2 {
    private Set <Integer> numerosSacados;
    public Bingo2(){
        Random r = new Random();
        numerosSacados = new LinkedHashSet<>();
        while(numerosSacados.size()<25){
            numerosSacados.add(r.nextInt(25)+1);
        }
    }

    public Set<Integer> getNumerosSacados() {
        return numerosSacados;
    }

    public Integer sacarNumero(){
        Integer num = 0;
        for(Integer n : numerosSacados) {
            num = n;
            numerosSacados.remove(n);
            return num;
        }
        return num;
    }
}
/*
        * Crea un proyecto para jugar al bingo utilizando conjuntos (sin línea) .
        * Tendremos una clase bingo con un conjunto numerosSacados del total para que no salgan
        *  números repetidos y dos jugadores.
        * En la clase  jugador tendrémos un conjunto numerosPendientesdeSalir
        *  y otro conjunto numerosSacadosdelJugador, al crear al jugador  numerosPendientesdeSalir tendrá 15 números sin
        *  repeticiones y numerosSacadosdelJugador->Cartón que han salido vacío.
        *
        * El jugador ganará cuando numerosPendientesdeSalir→Cartón sea vacío.

        *
        * */