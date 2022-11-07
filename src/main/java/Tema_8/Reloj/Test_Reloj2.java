package Tema_8.Reloj;

public class Test_Reloj2 {
    public static void main(String[]args){
        //Prueba Reloj
        /*Reloj2 reloj = new Reloj2();
        reloj.setTime(18,35,23);
        reloj.display();
        for(int i = 0;i<1000;i++) {
            reloj.ticTac();
            reloj.display();
        }
*/
        //Prueba Alarma composicion
        /*
        RelojAlarma alarma = new RelojAlarma();
        alarma.setTime(18,35,23);
        alarma.setAlarm(18, 52);
        alarma.display();
        for(int i = 0;i<1000;i++) {
            alarma.ticTac();
            alarma.display();
            alarma.activarAlarma();
        }
        */
        //Prueba Alarma Herencia
        RelojAlarma alarma2 = new RelojAlarma();
        alarma2.setTime(18,35,23);
        alarma2.setAlarm(18, 52);
        alarma2.display();
        for(int i = 0;i<1000;i++) {
            alarma2.ticTac();
            alarma2.display();
            alarma2.activarAlarma();
        }
    }
}
