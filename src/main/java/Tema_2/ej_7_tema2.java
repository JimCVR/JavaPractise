package Tema2.Relacion3;

public class ej_7_tema2 {
    public static void main(String[]args){
        int i = 2;
        
        do {
            int j = 0;
            do{
                System.out.println(i+" x "+j+" = "+i*j); 
                j++;
            }while(j<=10);
            System.out.println("----------");
            i++;
        }while(i<=6);
    }
}
