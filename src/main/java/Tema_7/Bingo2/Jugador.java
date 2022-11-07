package Tema_7.Bingo2;


import java.util.*;

public class  Jugador{
    private Set <Integer> numerosPendientesDeSalir;
    private Set <Integer> numerosSacadosDelJugador;
    public Jugador() {
        Random r = new Random();
        numerosPendientesDeSalir = new HashSet<>();
        numerosSacadosDelJugador = new HashSet<>();
        while(numerosPendientesDeSalir.size()<15){
            numerosPendientesDeSalir.add(r.nextInt(25)+1);
        }
    }

    public Set<Integer> getNumerosPendientesDeSalir() {
        return numerosPendientesDeSalir;
    }

    public Set<Integer> getNumerosSacadosDelJugador() {
        return numerosSacadosDelJugador;
    }
    public void comprobarNumero(Integer numero){
        if(numerosPendientesDeSalir.contains(numero)){
            numerosSacadosDelJugador.add(numero);
            numerosPendientesDeSalir.remove(numero);
        }
    }
    public boolean bingo(){
        if(numerosPendientesDeSalir.size()==0){
            return true;
        }
        return false;
    }
    public void mostrarCarton(){
        int cont =0;
        for(Integer n: numerosPendientesDeSalir){
            if (cont==5){
                System.out.println();
                cont = 0;
            }
            System.out.print(n+" ");
            cont++;
        }
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