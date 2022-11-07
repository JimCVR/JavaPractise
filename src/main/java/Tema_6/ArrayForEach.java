/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_6;

/**
 *
 * @author jaimecaro
 */
public class ArrayForEach {
    public static void main(String []args){
        double [] nota = new double[4];
        System.out.println("Para calcular la nota media necesito saber la nota de cada uno de tus examenes");
        for(int i = 0;i < 4;i++){
            System.out.println("Nota del examen nº "+ (i+1)+ ": ");
            nota[i] = Double.parseDouble(System.console().readLine());
        }
        System.out.println("Tus notas son:");
        double suma = 0;
        for(double n : nota){//for al estilo foreach
            System.out.println(n+ " ");
            suma += n;
        }
        System.out.println("\nLa media es "+ suma/4);
    }
}
