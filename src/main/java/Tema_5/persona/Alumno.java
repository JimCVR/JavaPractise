package Tema_5.persona;

public class Alumno {
    private String dni;
    private int edad;
    private int nota1;
    private int nota2;
    private int nota3;
    public Alumno() {
        dni = "";
        edad = 0;
        nota1 = -1;
        nota2 = -1;
        nota3 = -1;
    }
    public Alumno(String dni,int edad, int nota1,int nota2, int nota3){
        this.dni = dni;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    protected int notaMedia(){
      int media = -1;
        if(!(nota1 ==-1 || nota2 ==-1 || nota3==-1)) {
          media = (nota1 + nota2 + nota3) / 3;
          return media;
      }else {
            return media;
        }
    }
    public void informeAlumno(){
        System.out.println("DNI: "+dni+" \nEdad: "+edad+"\nNota Primer Trimestre: "+nota1+"\nNota Segundo Trimestre: "+nota2+"\nNota Tercer Trimestre: "+nota3+"\nNota media: "+notaMedia());
    }
    public static void main(String[]args){
        Alumno jaime = new Alumno();
        Alumno pepe = new Alumno("49562142N",18,5,7,4);
        jaime.setDni("45261528H");
        jaime.setEdad(25);
        jaime.setNota1(7);
        jaime.setNota2(3);
        jaime.setNota3(9);
        jaime.informeAlumno();
        pepe.informeAlumno();
    }
}
