/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_6.Curso;

import java.util.Random;

/**
 *
 * @author jaimecaro
 */
public class Notas {
    int [][] matrizNotas;
    String [] nombreAsignaturas;
    String [] nombreAlumnos;
    public Notas(){
        matrizNotas = new int [30][6];
        nombreAsignaturas = new String[6];
        nombreAlumnos = new String[30];
    }
    public Notas(int numeroAlumnos,int numeroAsignaturas){
        matrizNotas = new int [numeroAlumnos][numeroAsignaturas];
    }

    public void setAsignatura(int posicion,String nombreAsignatura) {
        nombreAsignaturas[posicion] = nombreAsignatura;
    }

    public void setAlumno(int posicion, String nombreAlumno) {
        nombreAlumnos[posicion] = nombreAlumno;
    }
    public void setNotaAlumnoAsignatura(int posicionAlumno, int posicionAsignatura, int nuevaNota){
        matrizNotas[posicionAlumno][posicionAsignatura] = nuevaNota;
    }
    public int getNotaAlumnoAsignatura(int posicionAlumno, int posicionAsignatura){
        return matrizNotas[posicionAlumno][posicionAsignatura];
    }
    public int [] getNotasAlumno(int posicion){
        int [] notasAlumno = new int [6];
        for(int i = 0; i < 6;i++){
           notasAlumno[i] = matrizNotas[posicion][i];
        }
        return notasAlumno;
    }
    public int [] getNotasAlumno(String nombreAlumno){
        int [] notasAlumno = new int [6];
        int posicionAlumno = -1;
        for(int i = 0; i < 30;i++){
            if(nombreAlumnos[i].equals(nombreAlumno)){
                posicionAlumno = i;
            }
        }
        for(int i = 0; i < 6;i++){
           notasAlumno[i] = matrizNotas[posicionAlumno][i];
        }
        return notasAlumno;
    }
    public int [] getNotasAsignatura(int posicion){
        int [] notasAsignatura = new int [30];
        for(int i = 0;i < notasAsignatura.length;i++){
            notasAsignatura[i] = matrizNotas[i][posicion];
        }
        return notasAsignatura;
    }
    public int [] getNotasAsignatura(String nombreAsignatura){
        int [] notasAsignatura = new int [30];
        int posicionAlumno = -1;
        for(int i = 0; i < 30;i++){
            if(nombreAlumnos[i].equals(nombreAsignatura)){
                posicionAlumno = i;
            }
        }
        for(int i = 0; i < 6;i++){
           notasAsignatura[i] = matrizNotas[posicionAlumno][i];
        }
        return notasAsignatura;
    }
    public int suspensosAlumno(int posicion){
        int suspensos = 0;
        for(int i = 0;i < getNotasAlumno(posicion).length;i++){
            if(getNotasAlumno(posicion)[i] <= 5){
                suspensos++;
            }
        }
        return suspensos;
    }
    public int suspensosAsignatura(int posicion){
                int suspensos = 0;
        for(int i = 0;i < getNotasAsignatura(posicion).length;i++){
            if(getNotasAsignatura(posicion)[i] <= 5){
                suspensos++;
            }
        }
        return suspensos;
    }
    private double mediaAlumno(int posicion){
        int sumatorio = 0;
        double media = 0;
        for(int i = 0 ;i < getNotasAlumno(posicion).length;i++){
            sumatorio += getNotasAlumno(posicion)[i];
        }
        media = sumatorio/getNotasAlumno(posicion).length;
        return media;
    }
        private double mediaAsignatura(int posicion){
        int sumatorio = 0;
        double media = 0;
        for(int i = 0 ;i < getNotasAsignatura(posicion).length;i++){
            sumatorio += getNotasAsignatura(posicion)[i];
        }
        media = sumatorio/getNotasAsignatura(posicion).length;
        return media;
    }
    public void mostrarBoletinClase(){
        System.out.println("Asignaturas\n1 2 3 4 5 6");
        for(int i = 0;i < matrizNotas.length;i++){
            System.out.println(nombreAlumnos[i]);
            for(int j = 0;j < matrizNotas[i].length;j++){
                System.out.print(matrizNotas[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i < nombreAsignaturas.length;i++){
            System.out.println((i+1)+". "+nombreAsignaturas[i]);
        }
    }
    public void mostrarBoletinAlumno(int posicion){
        System.out.println(nombreAlumnos[posicion]);
        for(int i = 0; i < getNotasAlumno(posicion).length;i++){
            System.out.println(nombreAsignaturas[i]+": "+getNotasAlumno(posicion)[i]+" ");
        }
        System.out.println();
        System.out.println("Total suspensos : "+suspensosAlumno(posicion));
        System.out.println("Media del Alumno : "+mediaAlumno(posicion));
    }
    public void resumenAsignatura(int posicion){
        System.out.println(nombreAsignaturas[posicion]);
        for(int i = 0;i < nombreAlumnos.length;i++){
            System.out.println(nombreAlumnos[i]+": "+getNotasAsignatura(posicion)[i]);
        }
        System.out.println();
        System.out.println("Total suspensos : "+suspensosAsignatura(posicion));
        System.out.println("Media del Alumno : "+mediaAsignatura(posicion));
    }
    public int [][] matrizTraspuesta(){
        int [][] traspuesta = new int[6][30];
        for(int i = 0;i <matrizNotas.length ;i++){
            for(int j = 0; j < matrizNotas[i].length;j++){
                traspuesta[j][i] = matrizNotas[i][j];
            }
        }
        return traspuesta;
    }
    public static void main(String[]args){
        Random r = new Random();
        Notas clase1 = new Notas();
        for(int i = 0;i < 6;i++){
            clase1.setAsignatura(i, "Asignatura "+(i+1));
            for(int j = 0;j < 30;j++){
                clase1.setAlumno(j, "Alumno "+(j+1));
                clase1.setNotaAlumnoAsignatura(j, i, r.nextInt(10));
            }
        }
        clase1.mostrarBoletinClase();
        clase1.mostrarBoletinAlumno(1);
        clase1.resumenAsignatura(3);

        System.out.println("Matriz Notas");
        for(int i = 0;i < clase1.matrizNotas.length;i++){
            for(int j = 0;j < 6;j++){
                System.out.print(clase1.matrizNotas[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz traspuesta");
        for(int i = 0;i < clase1.matrizTraspuesta().length;i++){
            for(int j = 0;j < 30;j++){
                System.out.print(clase1.matrizTraspuesta()[i][j]+" ");
            }
            System.out.println();
        }

    }
}
