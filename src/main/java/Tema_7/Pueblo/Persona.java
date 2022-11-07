package Tema_7.Pueblo;

import java.util.Random;

public class Persona {
    private String id;
    private String nombre;
    private int edad;
    public Persona(){
        setId();
        setNombre();
        setEdad();
    }
    public Persona(String id,String nombre, int edad){
        this.id= id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setId() {
        Random r = new Random();
        int numeros = r.nextInt(4)+1;
        for(int i = 0;i< numeros;i++){
            id += ""+ r.nextInt(10);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre() {
        Random r = new Random();
        int letras = r.nextInt(5)+5;
        for(int i = 0;i< letras;i++){
            nombre += ""+(char) r.nextInt(26)+97;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEdad() {
        Random r = new Random();
        edad = r.nextInt(55)+5;
    }
}
