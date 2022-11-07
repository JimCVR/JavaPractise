/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_2.Relacion1;
import java.util.Scanner;
/**
 *
 * @author jaime
 */
public class Ej_2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        float money = sc.nextFloat();
        float cost = sc.nextFloat();
        float balance = money-cost;
        if (balance >=0){
            System.out.println("Account balance: "+balance);
        } else{
            System.out.println("Account balance: "+balance+ "\nyou got debts");
        }
        sc.close();
    }
}
