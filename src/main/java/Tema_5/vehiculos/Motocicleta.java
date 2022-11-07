package Tema_5.vehiculos;

public class Motocicleta {
    private int cv;
    private int velocidadMax;
    private String letraMatricula;
    private String numeroMatricula;
    public Motocicleta(){
        cv = 0;
        velocidadMax = 0;
        letraMatricula = "";
        numeroMatricula = "";
    }
    public Motocicleta(int cv, int velocidadMax, String letraMatricula, String numeroMatricula){
        this.cv = cv;
        this.velocidadMax = velocidadMax;
        this.letraMatricula = letraMatricula;
        this.numeroMatricula = numeroMatricula;
    }

    public int getCv() {
        return cv;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public String getLetraMatricula() {
        return letraMatricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void setLetraMatricula(String letraMatricula) {
        this.letraMatricula = letraMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public void mostrarMatricula(){
        System.out.println(numeroMatricula+letraMatricula);
    }
    public static void main(String[]args){
        Motocicleta m1 = new Motocicleta();
        Motocicleta m2 = new Motocicleta(125,200,"4523","AJH");
        m1.setCv(150);
        m1.setVelocidadMax(250);
        m1.setLetraMatricula("6512");
        m1.setNumeroMatricula("LKM");
        m1.mostrarMatricula();
        m2.mostrarMatricula();
    }
}
