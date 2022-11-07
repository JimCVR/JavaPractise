package Tema_4;

import java.util.Scanner;

public class Ej_AburridoAutopista {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            int pruebas = sc.nextInt();
            String matricula = "";
            String matriculaPropia = "";
            int nuevo = 0;
            int viejo = 0;
            sc.nextLine();
            for(int i = 0;i<pruebas;i++){
                viejo = 0;
                nuevo = 0;
                matriculaPropia = sc.nextLine().toUpperCase();
                do{
                    matricula = sc.nextLine().toUpperCase();

                    if(!matricula.equals("0")){
                        if(matricula.substring(4).compareTo(matriculaPropia.substring(4)) < 0){
                            viejo++;
                        }else if(matricula.substring(0,3).compareTo(matriculaPropia.substring(0,3)) < 0){
                            viejo++;
                        }else{
                            nuevo++;
                        }
                    }
                }while(!matricula.equals("0"));
                System.out.println(viejo + " "+nuevo);
            }
        sc.close();
    }
}
