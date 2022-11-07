package Tema_6;

import java.util.Scanner;

public class Alumno {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private double trimestre1;
    private double trimestre2;
    private double trimestre3;
    public Alumno(){

        System.out.println("Introduce nombre del alumno");
        nombre = sc.nextLine();
        trimestre1 = -1;
        trimestre2 = -1;
        trimestre3 = -1;
    }
    public Alumno(String nombre, double trimestre1, double trimestre2, double trimestre3){
        this.nombre = nombre;
        this.trimestre1 = trimestre1;
        this.trimestre2 = trimestre2;
        this.trimestre3 = trimestre3;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTrimestre1() {
        return trimestre1;
    }

    public double getTrimestre2() {
        return trimestre2;
    }

    public double getTrimestre3() {
        return trimestre3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTrimestre1(double trimestre1) {
        this.trimestre1 = trimestre1;
    }

    public void setTrimestre2(double trimestre2) {
        this.trimestre2 = trimestre2;
    }

    public void setTrimestre3(double trimestre3) {
        this.trimestre3 = trimestre3;
    }
    public double notaFinal(){
        double notaFinal = (trimestre1+trimestre2+trimestre3)/3;
        if(trimestre1 == -1.0 || trimestre2 == -1.0 || trimestre3 == -1.0){
            notaFinal = -1.0;
            return notaFinal;
        }
            return notaFinal;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos de la clase");
        int nAlumnos = sc.nextInt();
        Alumno [] clase = new Alumno[nAlumnos];
        double sumaNotas = 0;
        double notaMedia = 0;
        int j = 0;

        for(int i = 0;i < clase.length;i++){
            clase[i] = new Alumno();
            System.out.println("Introduce nota del primer trimestre");
            clase[i].setTrimestre1(sc.nextDouble());
            System.out.println("Introduce nota del segundo trimestre");
            clase[i].setTrimestre2(sc.nextDouble());
            System.out.println("Introduce nota del tercer trimestre");
            clase[i].setTrimestre3(sc.nextDouble());
            System.out.println("Nombre del Alumno: "+clase[i].getNombre()+"\nNota final: "+clase[i].notaFinal());

            if(clase[i].notaFinal() != -1.0) {
                sumaNotas += clase[i].notaFinal();
                j++;
            }
        }
        notaMedia = sumaNotas /j;
        System.out.println("Nota media de la clase : "+notaMedia);
    }
}
/*Implementa la clase alumno. Los atributos de un alumno serán: nombre, trimestre1,
trimestre2 y trimestre3. En nombre se guardará el nombre completo del alumno y los
otros atributos guardarán la nota del alumno (con decimales) de cada uno de los
trimestres del curso.

Además de definir los atributos anteriores habrá que implementar los siguientes
métodos:

a) Un constructor por defecto, el cual pedirá por teclado que se introduzca el
nombre del alumno e inicializará las notas a -1.
b) Un constructor que reciba el nombre y las 3 notas.
c) Los métodos get, que devuelvan el valor de los atributos.
d) Los métodos set, que reciban el nuevo valor de los atributos.
e) Un método que devuelva la nota final del alumno. Esta nota será la media de
las notas de los 3 trimestres, si alguna nota sigue valiendo -1 la nota final será
-1.

f) En el método principal de la clase (main) se creará un vector de alumnos. El
número de alumnos se pedirá por teclado al usuario. Una vez leído el número
de alumnos, se crearán todos los alumnos de la clase y se pedirán las notas de
los alumnos. Una vez creados todos los alumnos, se mostrará el nombre de
cada alumno junto con su nota final, y finalmente se calculará la media de las
notas finales de los alumnos excluyendo aquellos cuya nota final sea -1.*/