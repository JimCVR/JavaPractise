package Tema_7.Bingo2;

import java.util.Scanner;

public class PartidaBingo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Bingo2 b = new Bingo2();
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        String ganador = "";
        int ronda = 0;
        System.out.println("Jugador 1");
        j1.mostrarCarton();
        System.out.println();
        System.out.println("Jugador 2");
        j2.mostrarCarton();
        System.out.println();

        while (j1.bingo() == false && j2.bingo() == false) {
            ronda++;
            System.out.println("Pulse enter para sacar numero");
            sc.nextLine();
            int num = b.sacarNumero();
            //Si la bola a salido,se vuelve a buscar otra
            System.out.println("El numero obtenido es : "+num);
            j1.comprobarNumero(num);
            j2.comprobarNumero(num);
            System.out.println("Jugador 1");
            j1.mostrarCarton();
            System.out.println();
            System.out.println("Jugador 2");
            j2.mostrarCarton();
            System.out.println();
            if (j1.bingo()) {
                System.out.println("El jugador 1 ha conseguido Bingo!");
                ganador = "Jugador 1";
            }else if (j2.bingo()) {
                System.out.println("El jugador 2 ha conseguido Bingo!");
                ganador = "Jugador 2";
            }
        }
        System.out.println("----Estadisticas----");
        System.out.println("Ganador : "+ ganador);
        System.out.println("Numero de rondas: "+ronda);
    }
}
