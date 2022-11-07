package Tema_5.juegos;

import java.util.Scanner;

public class Mano {
    Scanner sc = new Scanner(System.in);
    private int tamanho;
    private Carta [] cartas;
    public Mano(){
        tamanho = 3;
        cartas = new Carta[tamanho];
    }
    public Mano(int tamanho){
        this.tamanho = tamanho;
        cartas = new Carta[tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }

    public Carta getCarta(int posicion) {
        return cartas[posicion];
    }
    public void mostrarCarta(int posicion){
        cartas[posicion].mostrarCarta();
    }
    public void setCarta(int posicion) {
        cartas[posicion].setNumero();
        cartas[posicion].setPalo();
    }
    public void modificarCarta(int posicion){
        setCarta(posicion);
    }
    public void manoGanadora(Mano otraMano){
        int victoria = 0;
        int derrota = 0;
        for(int i =0;i < cartas.length;i++){
            if(cartas[i].cartaGanadora(otraMano.getCarta(i))){
                victoria++;
            }else{
                derrota++;
            }
        }
        if(victoria>derrota){
            System.out.println("Mano 1 Gana");
        }else{
            System.out.println("Mano 2 Gana");
        }
    }
    public static void main(String[]args){
        Mano m1 = new Mano();
        Mano m2 = new Mano();
        for(int i = 0;i < m1.cartas.length;i++){
            m1.cartas[i] = new Carta();
            m2.cartas[i] = new Carta();
            System.out.println("Mano 1 Carta "+(i+1));
            m1.setCarta(i);
            System.out.println("Mano 2 Carta "+(i+1));
            m2.setCarta(i);
        }
        m1.manoGanadora(m2);
    }
}
