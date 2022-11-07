package Tema2.Relacion3;

public class ej_8_tema2 {
    public static void main(String[]args){
        int j  = 9;
        for(int i = 10;i<=20;i+=2){
            if(i==16){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        for(int k=10;k<=20;k++){
            if(k==16){
                continue;
            }
            if(k%2==0){
                System.out.print(k+" ");
            }
        }
        System.out.println();
        while(0<10){
            
            j++;
            if(j ==16){
                continue;
            }
            if(j%2==0){
                System.out.print(j+" ");
            }
            if(j==20){
                break;
            }
            
        }
    }
}
