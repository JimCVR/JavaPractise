/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author jaimecaro
 */
public class pruebaLinkedHashMap {
        public static void main(String[]args){
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Casillas");
        linkedHashMap.put(15,"Ramos");
        linkedHashMap.put(3,"Pique");
        linkedHashMap.put(5,"Puyol");
        linkedHashMap.put(11,"Capdevila");
        linkedHashMap.put(14,"Xabi Alonso");
        linkedHashMap.put(16,"Busquets");
        linkedHashMap.put(8,"Xavi Hernandez");
        linkedHashMap.put(18,"Pedrito");
        linkedHashMap.put(6,"Iniesta");
        linkedHashMap.put(7,"Villa");
        
        //Imprimimos el Map con un Iterador
        Iterator it = linkedHashMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" --> Valor: "+linkedHashMap.get(key));
        }
    }
}
