package Tema_8.Formas;

public class PruebaPuntos {
    public static void main(String[]args){
        //prueba Punto
        Punto p = new Punto(1,2);
        System.out.println(p);
        Punto q = new Punto();
        System.out.println(q);
        p.setX(3);
        p.setY(4);
        System.out.println(p);
        System.out.println("x is: "+p.getX());
        System.out.println("y is: "+p.getY());
        //prueba Punto3D
        Punto3D a = new Punto3D(11,12,13);
        System.out.println(p);
        Punto b = new Punto3D();
        System.out.println(q);
        a.setX(21);
        a.setY(22);
        a.setZ(23);
        System.out.println(p);
        System.out.println("x is: "+a.getX());
        System.out.println("y is: "+a.getY());
        System.out.println("z is: "+a.getZ());
    }
}
