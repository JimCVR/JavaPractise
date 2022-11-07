package Tema_9.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lectura {
    private static Scanner sc = new Scanner(System.in);
    public static String leerString2(){
        String leer = "";
        try{
            leer = sc.nextLine();
            return leer;
        }
        catch (InputMismatchException e){
            System.err.println("Valor introducido No Valido");
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
        return "";
    }

    public static int leerInt2(){
        int  num = 0;
        String leer = "";
        try{
           // num = (int) sc.nextDouble();
           leer = sc.nextLine();
           num = Integer.parseInt(leer);
            sc.nextLine();
            if(num <0)
                throw new NegativoNoValidoException("el numero debe ser positivo");
            return num;
        }
        catch (NegativoNoValidoException a){
            System.err.println(leer+" no es un número válido");
            System.out.println(a.getMessage());
            a.printStackTrace();
            return -1*num;
        }
        catch (NumberFormatException e){
            System.err.println(leer+" no es un número válido");
            System.out.println(e.getMessage());
            e.printStackTrace();
            leer=leer.replace(',', '.');

            double numD=Double.parseDouble(leer);
            return (int)numD;
        }

    }
    public static void main(String[]args){
        System.out.println(Lectura.leerInt2());
    }

}

