package Tema_8.Reloj;

public class RelojAlarma2 extends Reloj2 {
    private int horaAlarma;
    private int minutoAlarma;
    public RelojAlarma2(){
        super();
        horaAlarma = 0;
        minutoAlarma = 0;
    }
    public RelojAlarma2(int horaAlarma, int minutoAlarma, int hora, int minuto, int segundo){
        super(hora,minuto,segundo);
        this.horaAlarma = horaAlarma;
        this.minutoAlarma = minutoAlarma;
    }
    @Override
    public void setTime(int hora,int minuto,int segundo){
        super.setTime(hora, minuto, segundo);
    }
    @Override
    public void display(){
        super.display();
    }
    @Override
    public void ticTac(){
        super.ticTac();
    }
    public void setAlarm(int hora,int minuto){
        horaAlarma = hora;
        minutoAlarma = minuto;
    }
    public void activarAlarma(){
        if(horaAlarma == super.getHora() && minutoAlarma == super.getMinuto() && super.getSegundo() == 0){
            System.out.println("Alarma sonando!!!");
        }
    }
}
