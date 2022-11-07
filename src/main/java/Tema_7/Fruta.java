/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7;

import java.util.*;

/**
 *
 * @author jaimecaro
 */
public class Fruta {
    public static void main(String []args){
        List <String> frutas = new ArrayList();
        frutas.add("pera");
        frutas.add("banana");
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("banana");
        
        int i = 0;
        while(frutas.contains("banana")){
            
            frutas.remove("banana");
            i++;
        }
        System.out.println(frutas);
    }
}
