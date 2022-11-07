/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_1;

/**
 *
 * @author jaimecaro
 */
public class ej_16_tema1 {
    public static void main(String[]args){
        double aleatorio = Math.floor((Math.random()*100000)+1);
        int numeroRandom = (int)aleatorio; 
        int horas =  numeroRandom/3600 ;
        int minutos = (numeroRandom%3600)/60;
        int segundos = (numeroRandom%3600)%60;
        System.out.println(numeroRandom +" segundos son : "+ horas+" horas "+minutos+" minutos "+segundos+" segundos");
        
    }
}
