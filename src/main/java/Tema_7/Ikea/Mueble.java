package Tema_7.Ikea;

import java.util.*;

public class Mueble {
    private String nombre;
    private int precio;
    private String marca;
    public Mueble(){
        nombre = "Silla";
        precio = 50;
        marca = "Ikea";
    }
    public Mueble(Mueble nMueble){
        nombre = nMueble.getNombre();
        precio = nMueble.getPrecio();
        marca = nMueble.getMarca();
    }
    public Mueble(String nombre, int precio, String marca){
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
/*
* 5 Crea una lista de tipo ArrayList (creado a partir de su interfaz superior) que el que se inserten mobiliarios de oficina,
*   donde se almacenen el nombre, precio y marca. Mostrar el siguiente menú (utilizar métodos para cada opción):
1. Insertar Mobiliario.
2. Eliminar elemento de Mobiliario. Mostrar primero los elementos con foreach, y  preguntar por el nombre del elemento que se quiera borrar.
3. Mostrar mobiliario. Preguntar si lo desea en orden ascendente o descendente.
4. Salir.

Clas mueble de cocina descripción y precio

*
* */