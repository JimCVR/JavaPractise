package Tema_7.Pueblo;

import java.util.*;

public class Cine {
    private List <Persona> colaCine;
    public Cine(){

        colaCine = new ArrayList<Persona>();
        setColaCine();
    }
    public Cine(ArrayList <Persona> colaCine){
        this.colaCine = colaCine;
    }

    public List<Persona> getColaCine() {
        return colaCine;
    }

    public void setColaCine(List<Persona> colaCine) {
        this.colaCine = colaCine;
    }
    public void setColaCine(){
            Random r = new Random();
            int personasEnCola = r.nextInt(51);
            for(int i = 0;i< personasEnCola;i++){
                colaCine.add(new Persona());
            }
    }

    public void comprarEntrada(int posicion){
        double recaudacion = 0;
        if(colaCine.get(posicion).getEdad() <= 10 && colaCine.get(posicion).getEdad() >=5 ){
            System.out.println("Entrada para niños : 1 €");
            recaudacion += 1;
        }else if(colaCine.get(posicion).getEdad()< 18 && colaCine.get(posicion).getEdad() > 10){
            System.out.println("Entrada para adolescentes : 2.5 €");
            recaudacion += 2.5;
        }else if(colaCine.get(posicion).getEdad() >= 18){
            System.out.println("Entrada para adultos : 3.5 €");
            recaudacion += 3.5;
        }else{
            System.out.println("Usted no alcanza la edad mínima para comprar entradas");
        }
        colaCine.remove(posicion);
    }

}
/*
* Un cine de un pueblo pequeño nos propone hacer una aplicación para controlar las personas de una cola de un cine en los
*  grandes estrenos de películas. Un conjunto de personas esperaran la cola para sacar una entrada, tendremos que
*
*
* *******calcular la entrada según la edad de la persona (mínimo 5 años).

*
*
* La edad de las personas se generan aleatoriamente entre 5 y 60 años.
*
*
*
Os recomiendo realizar un método en el main para generar Personas en la cola. Al final, deberemos mostrar la cantidad total recaudada.

*
* El número de personas de la cola se elige al azar entre 0 y 50.

*
*
* Utiliza la clase Persona . Del ejercicio anterior
Te recomiendo usar un mensaje de traza para saber si la recaudación es correcta según la edad (opcional).
Recuerda que al final la lista debe quedar vacía, una vez que una persona paga su entrada ya no está en la cola.

*
Edad Precio Entre 5 y 10 años 1 €
Entre 11 y 17 años 2.5 €
Mayor de 18 años 3.5 €
*
*
*
6.3) Realiza el ejercicio anterior utilizando la clase fila  Queue

*
*
*
* */