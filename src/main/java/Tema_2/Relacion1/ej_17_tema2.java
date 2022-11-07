package Tema_2;

public class ej_17_tema2 {
    public static void main(String[]args){
        int random = (int) (Math.random()*10000 -1);
        
        String cadenaRandom = ""+random;
        System.out.println(random +" tiene "+(cadenaRandom.length())+" cifras");
        
        /*
        if(random <10){
            System.out.println(random+" Tiene 1 cifra");
        }else if(random <100){
            System.out.println(random+" Tiene 2 cifras");
        }else if(random <1000){
            System.out.println(random+" Tiene 3 cifras");
        }else if(random <10000){
            System.out.println(random+" Tiene 4 cifras");
        }
        */
    
    }
}
