package Tema_8.Formas;

public class Circulo2 {
    private double radio;
    private String color;
    public Circulo2(){
        radio = 1.0;
        color = "rojo";
    }
    public Circulo2(double radio){
        this.radio = radio;
        color = "rojo";
    }
    public Circulo2(double radio, String color){
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea(){
        return radio*radio*Math.PI;
    }
}
