package Tema_6;
import java.util.Scanner;
public class ArrayEjemplo {
    private String nombre;
    private double nota;
    public ArrayEjemplo(){
        nombre="";
        nota=0.0;

    }

    public double getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }
    public void pedirDatos(){
        Scanner tec = new Scanner (System.in);
        do{
            System.out.println("Dime el nombre el alumno ");
            nombre = tec.nextLine();
        }while(nombre.equals(""));
        do{
            System.out.println("Dime la nota del alumno ");
            nota= tec.nextDouble();
        }while(nota<0 || nota >10);
    }

    public static void main(String []args){
        int numAlumnos = 5;
        double mediaNotas = 6.0;
        Scanner tec = new Scanner(System.in);
        ArrayEjemplo [] arrayAlumnos;
        System.out.println("Cuantos alumnos hay en clase: ");

        //creacion del array
        arrayAlumnos = new ArrayEjemplo[numAlumnos];

        for(int i = 0;i < arrayAlumnos.length;i++){
            arrayAlumnos[i] = new ArrayEjemplo();
        }

        System.out.println("Datos de los "+numAlumnos+" alumnos: ");
        for(int i = 0; i < arrayAlumnos.length;i++){
            System.out.println("Deme los datos del alumno "+(i+1)+": ");
            arrayAlumnos[i].pedirDatos();
        }
        System.out.println("La nota media de la clase es: ");
        for(int i = 0; i< arrayAlumnos.length;i++){
            mediaNotas= mediaNotas/arrayAlumnos[i].getNota();
        }
        mediaNotas = mediaNotas/arrayAlumnos.length;
        System.out.println(mediaNotas);
        //Mayor Nota
        int posicionMayor=0;
        double mayor = 0;
        for(int i = 0; i< arrayAlumnos.length;i++){
            if(arrayAlumnos[i].getNota()>=mayor){
                mayor = arrayAlumnos[i].getNota();
                posicionMayor = i;
            }
        }
        System.out.println("La nota mayor es: "+mayor);
    }
}
