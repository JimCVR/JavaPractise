package Tema_2.Relacion2;
import java.util.Scanner;
public class ej_17_tema2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int articulos = 0;
        int totalArticulos = 0;
        int producto = 0;
        double precio = 0;
        double precioArticulos = 0;
        double precioFinal = 0;
        double descuentoArticulos = 0;
        double descuentoPrecio = 0;
        String respuesta = " ";
        boolean salir = false;
        
        do{
            System.out.println("Introduzca el numero de articulos del producto "+(producto+1));
            articulos = sc.nextInt();
            System.out.println("Introduzca el precio sin IVA del producto "+(producto+1));
            precio = sc.nextDouble();
            sc.nextLine();
            precioArticulos+=  precio*articulos;
            precioFinal = precioArticulos *1.21;
            totalArticulos += articulos; 
            producto++;
            do{
                System.out.println("Quieres introducir otro producto?(s/n)");
                respuesta = sc.nextLine();
                if(respuesta.equals("s")){
                    salir = false;
                }else if(respuesta.equals("n")){
                    salir = true;
                }else{
                    System.out.println("Error: Introduce (s/n)");
                }
            }while(!(respuesta.equals("n") || respuesta.equals("s")));
        }while(salir==false);

        System.out.println("Total de articulos: "+totalArticulos+"\nPrecio sin IVA(21%): "+precioArticulos);
        if(precioFinal >=50){
            descuentoPrecio = precioFinal*0.05;
            precioFinal = precioFinal*0.95;
            System.out.println("Descuento por importe mayor de 50€(5%): "+descuentoPrecio+"€");

        }else{
            System.out.println("Descuento por importe mayor de 50€(5%): no alcanzado");
        }
        if(totalArticulos>=20){
            descuentoArticulos = precioFinal*0.05;
            precioFinal = precioFinal*0.95;
            System.out.println("Descuento por compra mayor de 20 articulos(5%): "+descuentoArticulos+"€");
        }else{
            System.out.println("Descuento por compra mayor de 20 articulos(5%): no alcanzado");
        }
        
        System.out.println("Importe de la compra: "+precioFinal);
        sc.close();
    }
}
