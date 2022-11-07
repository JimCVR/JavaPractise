/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_5.fabrica;
import java.util.*;
/**
 *
 * @author jaimecaro
 */
public class Producto {
    private String nombre;
    private int serie;
    private double precio;
    public Producto(){
        nombre = "producto";
        generar();
        precio = 0.0;
    }
    public Producto(String nombre,double precio){
        setNombre(nombre);
        setPrecio(precio);
        generar();
    }
    private int generar(){
        Random r = new Random();
        serie = r.nextInt(100000)+1;
        return serie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSerie() {
        return serie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
       boolean flag = true;
        do{
            if(!(nombre.equals(""))){
                this.nombre = nombre;
                flag = false;
            }else{
                System.err.println("Error al introducir nombre");
            }
        }while(flag);
    }

    public void setPrecio(double precio){
        boolean flag = true;
        do{
            if(precio >= 0){
                this.precio = precio;
                flag = false;
            }else{
                System.err.println("Error al introducir precio");
            }
        }while(flag);
    }
    public void pedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de producto");
        String nuevoNombre = sc.nextLine();
        setNombre(nuevoNombre);
    }
    public void pedirPrecio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce precio de producto");
        int nuevoPrecio = sc.nextInt();
        setPrecio(nuevoPrecio);
    }
    public void resumen(){
        System.out.println("INFORME DEL PRODUCTO");
        System.out.println("--------------------");
        System.out.println(nombre);
        System.out.println(serie);
        System.out.println(precio);
        System.out.println();
    }
    public boolean iguales(Producto nuevoProducto){
        if(nombre.equals(nuevoProducto.getNombre())){
            if(serie == nuevoProducto.getSerie()){
                return true;
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}