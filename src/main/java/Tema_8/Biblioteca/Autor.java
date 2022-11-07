package Tema_8.Biblioteca;

public class Autor {
    private String nombre,email;
    private char genero;
    public Autor(){
        nombre="";
        email="";
        genero= 'm';
    }
    public Autor(String nombre,String email,char genero){
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }
    public String getNombre(){
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return nombre +" ("+ genero+") at "+email;
    }
}
