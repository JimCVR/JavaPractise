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
public class Ej_13 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Map <Integer,String> alumnos = new HashMap();
      
        for(int i = 0;i < 10;i++){
            alumnos.put((i+1),"alumno"+(i+1));
            
        }
        Iterator it = alumnos.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer)it.next();
            System.out.println("DNI: "+key+" || Nombre: "+alumnos.get(key)+"\n------------------------ ");
        }
        System.out.println();
        
        System.out.println("Introduce DNI");
        int dni = sc.nextInt();
        System.out.print(alumnos.get(dni)+" ");
    }
}
