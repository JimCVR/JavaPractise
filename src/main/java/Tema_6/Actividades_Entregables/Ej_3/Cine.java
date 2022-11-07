package Tema_6.Actividades_Entregables.Ej_3;

import java.util.Scanner;

/**
 * @author Jaime
 */

public class Cine {
    String [][] sala;
    public Cine(){
       this.sala = new String[6][6];
       for (int i = 0;i< this.sala.length;i++){
           for(int j = 0;j< this.sala[i].length;j++){
               this.sala[i][j] = "";
           }
       }
    }

    /**
     * Muestra las butacas de la sala de cine
     * si no se asignaron asientos no se muestra nada
     */
    private void mostrarButacas(){
       for (int i = 0;i< this.sala.length;i++){
           for(int j = 0;j< this.sala[i].length;j++) {
                   System.out.print(sala[i][j] + " ");
           }
           System.out.println();
       }
    }
    /*private void mostrarButacas(){
        for (int i = 0;i< this.sala.length;i++){
            for(int j = 0;j< this.sala[i].length;j++) {
                if (sala[i][j].equals("")) {
                    System.out.print("X ");
                } else {
                    System.out.print(sala[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
*/

    /**
     * Reserva asiento en la sala de cine
     * Si el asiento esta vacío --> ("") se realiza la reserva.
     * @param fila es la fila de la matriz donde se hacer la reserva
     * @param butaca corresponde a la columna donde se realiza la reserva
     * @param nombre se refiere a la cadena de texto que se asignara a la reserva
     */
    private void reservarAsiento(int fila, int butaca, String nombre) {
        if (asientoDisponible(fila, butaca)) {
            sala[fila][butaca] = nombre;
        }
    }

    /**
     * Comprueba que un asiento esta libre -->("")
     * @param fila es la fila de la matriz donde se hacer la comprobaación
     * @param butaca corresponde a la columna donde se realiza la comprobación
     * @return devuelve true si el asiento correspondiente a la fila y butaca esta libre
     */
    private boolean asientoDisponible (int fila, int butaca){
        return sala[fila][butaca].equals("");
    }

    /**
     * Muestra por pantalla los asientos disponibles segun el numero de asientos que se desean reservar
     * @param numeroAsientos se refiere al numero de asientos que deseamos reservar
     */
    private void verDisponibilidad(int numeroAsientos) {
        int butacasConsecutivas = 0;
        int asientoFinal = 0;

        for(int i = 0;i < sala.length;i++){
            butacasConsecutivas = 0;
            for(int j = 0;j < sala[i].length;j++) {
                if (asientoDisponible(i, j)) {
                    butacasConsecutivas++;
                } else {
                    asientoFinal = 0;
                    butacasConsecutivas = 0;
                }
                if (butacasConsecutivas >= numeroAsientos ) {
                    asientoFinal = j;
                    if (numeroAsientos == 1) {
                        System.out.println("Fila " + (i + 1) + " butaca " + (asientoFinal - numeroAsientos + 2));
                    } else {
                        System.out.println("Fila " + (i + 1) + " butacas de " + (asientoFinal - numeroAsientos + 2) + " hasta " + (asientoFinal + 1));
                    }
                    asientoFinal = 0;
                }
            }
        }
    }

    /**
     * Verifica que la reserva de los asientos es posible
     * @param numeroAsientos es el numero de asientos a reservar
     * @param fila se refiere a la fila en la que comprobamos el numero de asientos disponibles
     * @param butaca es la columna a partir de la cual comprobamos el numero de asientos disponibles
     * @return devuelve true si existen el mismo o mayor numero de butacas disponibles que el numero de asientos a reservar
     */

    private boolean reservaPosible (int numeroAsientos, int fila, int butaca) {
        int butacasConsecutivas = 0;
        int i = butaca;
        while (i < sala[fila].length && butacasConsecutivas < numeroAsientos) {
            if (asientoDisponible(fila, i)) {
                butacasConsecutivas++;
            }
            else {
                butacasConsecutivas = 0;
            }
            i++;
        }
        return numeroAsientos <= butacasConsecutivas;
    }

    /**
     * Asigna asientos en la sala
     * @param numeroAsientos total de asientos que se asignan
     * @param fila fila de la sala donde se asignan los asientos
     * @param butaca columna de la sala a partir de la cual se asignan los asientos
     * @param nombre
     */
    public void hacerReserva (int numeroAsientos, int fila, int butaca, String nombre) {

        if (!asientoDisponible(fila,butaca)) {
            System.out.println("La butaca " + butaca + " no esta disponible para reserva");
            return;
        }
        if (!reservaPosible(numeroAsientos, fila, butaca)) {
            System.out.println("La reserva no se puede realizar");
            return;
        }

        int i = butaca;
        while (i < sala[fila].length && numeroAsientos > 0) {
            reservarAsiento(fila, i, nombre);
            numeroAsientos--;
            i++;
        }
        System.out.println("Reserva realizada con exito! "+"\nNombre: "+nombre+"\nNumero de asientos reservados: "+numeroAsientos);
    }

    /**
     * Muestra el menu para realizar una reserva
     */
    public void menuReserva(){
        Scanner sc = new Scanner(System.in);
        int fila;
        int asientoInicio;
        int numeroAsientos;
        String nombre;
        char salir = 'n';
        while(salir!='s') {
            System.out.println("Introduce tu nombre");
            nombre = sc.nextLine();
            System.out.println("Introduce el numero de asientos a reservar (Minimo 1)");
            numeroAsientos = sc.nextInt();
            System.out.println("Estos son los asientos disponibles");
            verDisponibilidad(numeroAsientos);
            System.out.println("Fila Elegida");
            fila = sc.nextInt() - 1;
            System.out.println("Asiento de inicio");
            asientoInicio = sc.nextInt() - 1;
            sc.nextLine();
            hacerReserva(numeroAsientos, fila, asientoInicio, nombre);
            mostrarButacas();
            System.out.println("¿Salir? s/n ");
            salir = sc.next().charAt(0);
            sc.nextLine();
        }
    }
}
/*
Implementa una miniaplicación reserva de cine.
En la aplicación tendremos una array bidemensional Sala de tamaño 6x6. En cada posición del array guardaremos el nombre de la
persona que realiza la reserva del asiento, (si una persona reserva 3 asientos aparecerá su nombre 3 veces), en caso de que el
asiento no esté reservado el valor será cadena vacía. El sistema buscará asientos consecutivos en la misma fila para reservar
y los mostrará al usuario. Posteriormente el usuario elegirá fila y asiento de comienzo (para reservarlo hay que volver a comprobar
que cabe porque el usuario podría elegir cualquiera)
        */