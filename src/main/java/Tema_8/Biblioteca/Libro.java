package Tema_8.Biblioteca;

import java.util.List;

public class Libro {
    private String nombre;
    private Autor autor;
    private double precio;
    private int cantidad;
    private List<Autor> listaAutores;
    public Libro(String nombre,Autor autor,double precio,int cantidad){
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Libro(String nombre,List<Autor>autores,double precio,int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        listaAutores = autores;
    }

    public List<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(List<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public void setListaAutores(String nombre, String email, char genero) {
        listaAutores.add(new Autor(nombre,email,genero));
    }
    public void añadirAutor(Autor nAutor){
        listaAutores.add(nAutor);
    }
    public void borrarAutor(Autor borrarAutor){
        listaAutores.remove(borrarAutor);
    }
    public void mostrarAutores(){
        for(Autor a : listaAutores){
            System.out.println(a);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "'"+nombre+"' de " + autor;
    }
}
