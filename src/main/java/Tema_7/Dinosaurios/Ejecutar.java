/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_7.Dinosaurios;

import java.util.*;

/**
 *
 * @author jaimecaro
 */
public class Ejecutar {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        Dino [] dinos1 = new Dino[3];
        
        dinos1[0] = new Dino();
        dinos1[1] = new Dino("Triceratops",8000,64);
        dinos1[2] = new Dino("Estegosaurio",2300,65);
        LinkedList <Dino> ListaDinos = new LinkedList(Arrays.asList(dinos1));
        String nombre = "" ;
        double peso = 0 ;
        int edad = 0;
        mostrarDinos(ListaDinos);
        for(int i = 0;i < 3;i++){
            apilarDino(ListaDinos);
        }
        mostrarDinos(ListaDinos);
        for(int i = 0;i < 3;i++){
            ListaDinos.remove(ListaDinos.size()-1);
        }
        System.out.println("Eliminando los 3 ultimos elementos...");
        System.out.println();
        mostrarDinos(ListaDinos);
    }

    public static void mostrarDinos(List<Dino> lista){
        for(Dino d : lista){
            d.mostrarDino();
        }
    }

    public static void apilarDino(List <Dino> lista){
        Scanner sc = new Scanner(System.in);
        String nombre;
        double peso;
        int edad;
        System.out.println("Introduce nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce peso");
        peso = sc.nextDouble();
        System.out.println("Introduce antigüedad");
        edad = sc.nextInt();
        sc.nextLine();
        lista.add(0,new Dino(nombre,peso,edad));
    }
}
/*
* Crea una lista de tipo LinkedList, donde se
• Inserte un Array con el método Arrays.asList de 5 objetos de la clase Dino. La clase
Dino tendrá los atributos privados nombre, peso y millones de años desde que
existieron.
• Mostrar contenido.
• Crea un bucle que añada 3 elementos más a la lista por el principio, pidiendo sus
valores desde teclado.
• Mostrar contenido
• Elimina los 3 últimos objetos de la lista.
• Mostrar contenido

*
* */