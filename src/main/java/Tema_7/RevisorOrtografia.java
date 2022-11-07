package Tema_7;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaimecaro
 */
public class RevisorOrtografia {
    private Set <String> diccionario;
    private Set <String> pUsuario;
    public RevisorOrtografia(){
        diccionario = new HashSet();
        pUsuario = new HashSet();
        diccionario.add("silla");
        diccionario.add("mesa");
        diccionario.add("ventana");
        diccionario.add("puerta");
    }
    public RevisorOrtografia(Set <String> listaPalabras){
        this.diccionario = listaPalabras;
    }
    public void fraseAConjunto(String frase){
        pUsuario = new HashSet(Arrays.asList(frase.split("\\s+")));
        Scanner sc = new Scanner(System.in);
    }
    public void comprobarPalabras(){
        System.out.println("Potenciales errores ortograficos");
        for(String p : pUsuario) {
            if (!diccionario.contains(p)) {
                System.out.print(p+" ");
            }
        }
    }
    public void llenarDiccionario(){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int salir = -1;
        while(salir != 0 ){
            cont++;
            diccionario.add(sc.nextLine());
            if(cont%10 == 0){
                System.out.println("Introduce 0 si deseas salir");
                salir= sc.nextInt();
                sc.nextLine();
            }

        }

    }
    public void llenarDiccionario(String [] palabras){
        for(int i = 0;i < palabras.length;i++){
            diccionario.add(palabras[i]);
        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        RevisorOrtografia r = new RevisorOrtografia();
        String [] palabras = {"flor", "fruta", "semilla"," árbol", "hoja" ,"raíz" ,"tallo", "hongo", "ciruela","pino", "animal", "perro", "gato", "vaca", "cerdo", "casa", "revista", "cuadro", "grabado", "electricidad"};
        r.llenarDiccionario(palabras);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        r.fraseAConjunto(frase);
        r.comprobarPalabras();

    }
}
