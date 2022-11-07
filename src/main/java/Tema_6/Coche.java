package Tema_6;

import java.util.Random;
import java.util.Scanner;

public class Coche {
    private Scanner sc = new Scanner(System.in);
    private String matricula;
    private char combustible;
    public Coche(){
        matricula = "Sin matricular";
        combustible = ' ';
    }
    public Coche(String matricula, char combustible){
        boolean validar = true;
        while((!matricula.equals("\\^w{8}d{4}$")) && (combustible!= 'g' || combustible!= 'd' ||
            combustible!= 'h' ||combustible!= 'e' )){
            System.out.println("Introduce una matricula valida");
            this.matricula = sc.nextLine();
            System.out.println("Introduce combustible valido");
            this.combustible = sc.next().charAt(0);
            validar = false;
        }if (validar){
            this.matricula = matricula;
            this.combustible = combustible;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public char getCombustible() {
        return combustible;
    }

    public void setMatricula() {
        Random r = new Random();
        char letra1 = (char)(r.nextInt(26)+65);
        char letra2 = (char)(r.nextInt(26)+65);
        char letra3 = (char)(r.nextInt(26)+65);
        char letra4 = (char)(r.nextInt(26)+65);
        char numero1 = (char)(r.nextInt(10)+48);
        char numero2 = (char)(r.nextInt(10)+48);
        char numero3 = (char)(r.nextInt(10)+48);
        char numero4 = (char)(r.nextInt(10)+48);
        matricula = ""+letra1+letra2+letra3+letra4+numero1+numero2+numero3+numero4;
    }

    public void setCombustible(char combustible) {
        boolean validar = true;
        while((combustible!= 'g' || combustible!= 'd' || combustible!= 'h' ||combustible!= 'e' )){
            System.out.println("Introduce combustible valido");
            this.combustible = sc.next().charAt(0);
            validar = false;
        }if (validar){

            this.combustible = combustible;
        }
    }
    protected void vender(){
        matricula = "Sin matricular";
        combustible = ' ';
    }
    protected boolean disponible(){
        if(matricula.equals("Sin matricular") && combustible == ' '){
            return true;
        }else{
            return false;
        }
    }
    public void infoCoche(){
        String combustibleReal = "";
        switch (combustible){
            case 'g':
                combustibleReal = "Gasolina";
                break;
            case 'd':
                combustibleReal = "Diesel";
                break;
            case 'h':
                combustibleReal = "Hibrido";
                break;
            case 'e':
                combustibleReal = "Electrico";
                break;
        }
        if(disponible() == false){
            System.out.println("No disponible");
        }else{
            System.out.println("El coche "+matricula+" utiliza: "+combustibleReal);
        }
    }
}