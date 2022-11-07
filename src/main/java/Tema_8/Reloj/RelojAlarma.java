package Tema_8.Reloj;

public class RelojAlarma {
    private Reloj2 reloj;
    private int horaAlarma;
    private int minutoAlarma;
    public RelojAlarma(){
        reloj = new Reloj2();
    }
    public RelojAlarma(int horaAlarma, int minutoAlarma, int hora, int minuto, int segundo){
        reloj = new Reloj2(hora,minuto,segundo);
        this.horaAlarma = horaAlarma;
        this.minutoAlarma = minutoAlarma;
    }
    public void setTime(int hora,int minuto,int segundo){
        reloj.setTime(hora, minuto, segundo);
    }
    public void display(){
        reloj.display();
    }
    public void ticTac(){
        reloj.ticTac();
    }
    public void setAlarm(int hora,int minuto){
        horaAlarma = hora;
        minutoAlarma = minuto;
    }
    public void activarAlarma(){
        if(horaAlarma == reloj.getHora() && minutoAlarma == reloj.getMinuto() && reloj.getSegundo() == 0){
            System.out.println("Alarma sonando!!!");
        }
    }

}
