package Tema_8.Reloj;
import java.time.*;
public class Reloj2 {
    private int hora;
    private int minuto;
    private int segundo;
    public Reloj2(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
    public Reloj2(int hora,int minuto,int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
      /*  while(hora >= 24) {
            hora = hora - 24;
        }*/
        if(hora >= 0){
            this.hora= hora;
            if(hora >=24){
                this.hora = hora%24;
            }
        }else{
            System.err.println("Error: Hora introducida no valida");
        }
    }

    public void setMinuto(int minuto) {
        if(minuto >= 60){
            hora += minuto/60;
            minuto = minuto%60;
        }
        if(minuto >=0){
            this.minuto = minuto;
        }else{
            System.err.println("Error: Minuto introducido no valido");
        }
    }

    public void setSegundo(int segundo) {
        if(segundo >= 0){
            if(segundo >= 60){
                setMinuto(minuto+segundo/60);
                segundo = segundo%60;
                this.segundo = segundo;
            }else{
                this.segundo = segundo;
            }
        }else{
            System.err.println("Error: Segundo introducido no valido");
        }
    }
    public void setTime(int hora,int minuto,int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    public void setTime(){
        LocalTime horaActual = LocalTime.now();
        hora = horaActual.getHour();
        minuto = horaActual.getMinute();
        segundo = horaActual.getSecond();
    }
    public void display(){
        String dHora =""+hora+":";
        String dMinuto =""+minuto+":";
        String dSegundo =""+segundo;
        System.out.println("------------");

        if(hora < 10){
            dHora = "0"+hora+":";
        }
        if(minuto < 10){
            dMinuto = "0"+minuto +":";
        }
        if(segundo < 10){
            dSegundo = "0"+segundo;
        }
        System.out.println("| "+dHora+dMinuto+dSegundo+" |");
        System.out.println("------------");
    }
    public void ticTac(){
        setSegundo(segundo+1);
    }
}
