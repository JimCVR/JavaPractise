package Tema2.Relacion3;

import java.util.Scanner;
public class ej_6_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = sc.nextInt();
        int primo = 0;
      for (int i = 1; i <= n; i++){ 
          int divisor = 0;		 		   		  
        for(int j =i; j>=1; j--){
	        if(i%j==0){
		        divisor++;
	        }
	    }
	    if (divisor ==2){
	        primo++;
	    }	
      }	
      System.out.println("Primos de 1 a "+n+": "+primo);
      sc.close();
    }
}
