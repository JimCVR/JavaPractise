package Tema2.Relacion3;

public class ej_10_tema2 {
    public static void main(String[]args){
        for(int i = 0;i<10;i++){
            
            for(int j = 0;j<10;j++){
                for(int k = 0;k<10;k++){
                    for(int l = 0;l<10;l++){
                        for(int z = 0;z<10;z++){
                            if(i==3){
                                System.out.println("E"+" "+j+" "+k+" "+l+" "+z);
                            }
                            if(j==3){
                                System.out.println(i+" "+"E"+" "+k+" "+l+" "+z);
                            }
                            if(k==3){
                                System.out.println(i+" "+j+" "+"E"+" "+l+" "+z);
                            }
                            if(l==3){
                                System.out.println(i+" "+j+" "+k+" "+"E"+" "+z);
                            }
                            if(z==3){
                                System.out.println(i+" "+j+" "+k+" "+l+" "+"E");
                            }
                            System.out.println(i+" "+j+" "+k+" "+l+" "+z);
                        }
                    }
                }
            }
        }

    }
}
