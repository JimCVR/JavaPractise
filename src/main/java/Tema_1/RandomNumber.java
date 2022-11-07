/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_1;

/**
 *
 * @author jaime
 */
public class RandomNumber {
    public static void main (String[]args){
    
        double number = Math.random()*100000+1;
        int hourRest = (int)number%3600;
        int hours = (int)number/3600;
        int minutes = hourRest/60;
        int seconds = hourRest%60;
        System.out.println("Horas:"+hours+" Minutos: "+minutes+" Segundos: "+seconds);
    }
}
