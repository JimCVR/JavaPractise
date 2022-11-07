/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_3;
import java.util.Scanner;
/**
 *
 * @author jaimecaro
 */
public class Ej_3_tema3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        String pass = sc.nextLine();
        System.out.println("Confirma la contraseña");
        String repass = sc.nextLine();
        while(!(pass.equals(repass))){
            System.out.println("Introduce la contraseña");
            pass = sc.nextLine();
            System.out.println("Confirma la contraseña");
            repass = sc.nextLine();
        }
             
    }   
}
