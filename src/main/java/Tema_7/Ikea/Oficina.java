package Tema_7.Ikea;

import java.util.*;

public class Oficina {
    private Scanner sc = new Scanner(System.in);
    private List <Mueble> mobiliario;
    public Oficina(){
        mobiliario = new ArrayList<Mueble>();
        mobiliario.add(new Mueble());
    }
    public Oficina(String nombre ,int precio, String marca){
        mobiliario = new ArrayList<Mueble>();
        mobiliario.add(new Mueble(nombre,precio,marca));

    }
    public void insertarMueble(String nombre , String marca,int precio){
        mobiliario.add(new Mueble(nombre,precio,marca));
        System.out.println("¡El elemento ha sido insertado!");
        System.out.println("-------------------------------------------");
    }
    public void eliminarMueble(){
        boolean existe = false;

       mostrarMobiliario();
        System.out.println("¿Que elemento quieres borrar?");
        String elemento = sc.nextLine();
        for(int i = 0;i < mobiliario.size();i++) {
            if (mobiliario.get(i).getNombre().equals(elemento)) {
                mobiliario.remove(mobiliario.get(i));
                existe = true;
            }
        }
        if(existe) {
            System.out.println("¡El elemento '" + elemento + "' ha sido borrado!");
        }else{
            System.out.println("¡El elemento '" + elemento + "' no existe!");
        }
        System.out.println("-------------------------------------------");
    }
    private void mostrarMobiliario(){
        for(Mueble i : mobiliario) {
            System.out.println("Nombre: "+i.getNombre());
            System.out.println("Marca: "+i.getMarca());
            System.out.println("Precio: "+i.getPrecio());
            System.out.println("-------------------------------------------");
        }
    }
    private void mostrarMobiliario(List<Mueble>otroMobiliario){
        for(Mueble i : otroMobiliario) {
            System.out.println("Nombre: "+i.getNombre());
            System.out.println("Marca: "+i.getMarca());
            System.out.println("Precio: "+i.getPrecio());
            System.out.println("-------------------------------------------");
        }
    }
    public void mostrarAscendente(){
        List <Mueble> ascendente = new ArrayList<Mueble>();
        for(Mueble i : mobiliario){
            ascendente.add(i);
        }

        for (int i = 0;i < ascendente.size()-1;i++) {
            for(int j = 0;j < ascendente.size()-i-1;j++){
                if(ascendente.get(j+1).getPrecio() < ascendente.get(j).getPrecio()){
                    Mueble pivote = new Mueble(ascendente.get(j+1));
                    ascendente.set(j+1, ascendente.get(j));
                    ascendente.set(j,pivote);
                }
            }
        }
        mostrarMobiliario(ascendente);
    }
    public void mostrarDescendente(){
        ArrayList <Mueble> descendente = new ArrayList<Mueble>();
        for(Mueble i : mobiliario){
            descendente.add(i);
        }

        for (int i = 0;i < descendente.size()-1;i++) {
            for(int j = 0;j < descendente.size()-i-1;j++){
                if(descendente.get(j+1).getPrecio() > descendente.get(j).getPrecio()){
                    Mueble pivote = new Mueble(descendente.get(j+1));
                    descendente.set(j+1, descendente.get(j));
                    descendente.set(j,pivote);
                }
            }
        }
        mostrarMobiliario(descendente);
    }

    public void menu() {
        int eleccion = -1;
        while (eleccion != 0) {
            System.out.println("---------------MENU PRINCIPAL--------------");
            System.out.println("1.Insertar Mueble");
            System.out.println("2.Eliminar Mueble");
            System.out.println("3.Mostrar Mobiliario");
            System.out.println("0.Salir");
            System.out.println("-------------------------------------------");
            eleccion = sc.nextInt();
            sc.nextLine();
            switch (eleccion) {
                case 0:

                    break;
                case 1:
                    System.out.println("Introduce nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce marca");
                    String marca = sc.nextLine();
                    System.out.println("Introduce precio");
                    int precio = sc.nextInt();
                    sc.nextLine();
                    insertarMueble(nombre, marca, precio);
                    break;
                case 2:
                    eliminarMueble();
                    break;
                case 3:
                    System.out.println("¿Mostrar de forma ascendente o descendente? a/d");
                    char orden = sc.next().charAt(0);
                    if(orden == 'a'){
                        mostrarAscendente();
                    }else if(orden == 'd'){
                        mostrarDescendente();
                    }else{
                        System.err.println("Error : valor Introducido invalido");
                    }
                        break;

            }
        }
    }
}
