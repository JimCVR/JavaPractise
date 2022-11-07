package Tema_8.Formas;

public class Cilindro extends Circulo2{
    private double altura;
    public Cilindro(){
        super();
        altura = 1.0;
    }
    public Cilindro(double altura){
        super();
        this.altura = altura;
    }
    public Cilindro(double altura,double radio){
        super(radio);
        this.altura = altura;
    }
    public Cilindro(double altura,double radio, String color){
        super(radio,color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getVolume(){
        return getArea()*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}';
    }
}
