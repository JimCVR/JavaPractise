package Tema_7.Pueblo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CineQueue {
    private List<Persona> colaCine;
    public CineQueue(){

        colaCine = new ArrayList<Persona>();
        setColaCine();
    }
    public CineQueue(ArrayList <Persona> colaCine){
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
