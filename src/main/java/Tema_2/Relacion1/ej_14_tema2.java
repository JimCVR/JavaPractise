
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaimecaro
 */
public class ej_14_tema2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a");
        int a = sc.nextInt();
        System.out.println("Introduce b");
        int b = sc.nextInt();
        System.out.println("Introduce c");
        int c = sc.nextInt();
        
        if(a < b && a < c){
            if(b<c){
                System.out.println(a+" "+b+" "+c);
            }else {
                System.out.println(a+" "+c+" "+b);
            }
        }
        else if(b<c){
            if(a<c){
                System.out.println(b+" "+a+" "+c);
            }else{
                System.out.println(b+" "+c+" "+a);
            }
        }else{
            if(a<b){
                System.out.println(c+" "+a+" "+b);
            }else{
                System.out.println(c+" "+b+" "+a);
            }
        }
    }
}
