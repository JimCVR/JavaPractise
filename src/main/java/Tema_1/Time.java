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
public class Time {
    public static void main (String []args){
        int time = 10000;
        int week = time/(24*7);
        int days = time%(24*7)/7;
        int hours = (time%(24*7)%7)/24;
        System.out.println("Resultado: "+week+" "+days+" "+hours);
    }
}
