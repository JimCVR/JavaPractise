package Tema_8.Formas;

public class Circulo {
    private double radio;
    private Punto centro;
    public Circulo(){
        radio= 1.0;
        centro = new Punto();
    }
    public Circulo(int xCentro,int yCentro,double radio){
        centro = new Punto(xCentro,yCentro);
        this.radio = radio;
    }
    public Circulo(Punto centro, double radio){
        this.centro = centro;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setCentroX(int x){
        centro.setX(x);
    }
    public int getCentroX(){
        return centro.getX();
    }
    public int getCentroY(){
        return centro.getY();
    }
    public void setCentroY(int y){
        centro.setY(y);
    }
    public int [] getCentroXY(){
        return centro.getXY();
    }
    public void setCentroXY(int x, int y){
        centro.setXY(x, y);
    }

    public String toString() {
        return "Circulo{" +"radio=" + radio +", centro=" + centro.toString() +'}';
    }
    public double getArea(){
        double area = 3.14*(radio*radio);
        return area;
    }
    public double getCircunferencia(){
        double perimetro = 2*3.14*radio;
        return perimetro;
    }
    public double distancia(Circulo otroCirculo){
        double distancia = centro.distance(otroCirculo.getCentroX(), otroCirculo.getCentroY());
        return distancia;
    }
}
