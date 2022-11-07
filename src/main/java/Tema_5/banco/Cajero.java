/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_5.banco;
import java.util.Scanner;
/**
 *
 * @author jaimecaro
 */
public class Cajero {
        public static void main(String []args){
        Cliente cliente1 = new Cliente(98765432,1200,15000);
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do{
            System.out.println("CAJERO AUTOMATICO");
            System.out.println("------------------");
            System.out.println("1.consultar/Modificar Datos personales");
            System.out.println("2.Ingresar Nomina");
            System.out.println("3.Consultar Datos Bancarios");
            System.out.println("4.Sacar Dinero");
            System.out.println("5.Modificar contraseña");
            System.out.println("6.Salir");
            numero = sc.nextInt();
            switch(numero){
                case 1:
                    char respuesta = ' ';
                    int nuevoValor = 0;
                    //System.out.println("DNI : "+cliente1.getDni()+"\nSueldo :"+cliente1.getSueldo());
                    cliente1.getDatosPersonales();
                    System.out.println("¿Quieres modificarlos? s/n");
                    respuesta = sc.next().charAt(0);
                    if(respuesta == 's'){
                        System.out.println("Introduce el nuevo DNI");
                        nuevoValor = sc.nextInt();
                        cliente1.setDni(nuevoValor);
                        System.out.println("Introduce el nuevo sueldo");
                        nuevoValor = sc.nextInt();
                        cliente1.setSueldo(nuevoValor);
                        cliente1.getDatosPersonales();
                    }
                    break;
                case 2:
                    cliente1.ingresarNomina();
                    System.out.println("Sueldo ingresado satisfactoriamente\nsaldo actual: "+cliente1.getC1().getSaldo());
                    break;
                case 3:
                     nuevoValor = 0;
                    System.out.println("Introduce la contraseña");
                        nuevoValor = sc.nextInt();
                    cliente1.getC1().mostrarDatos(nuevoValor);
                    break;
                case 4:
                       nuevoValor = 0;
                    System.out.println("Introduce cantidad de dinero a retirar");
                        nuevoValor = sc.nextInt();
                        cliente1.sacarDinero(cliente1.getDni(), nuevoValor);
                    break;
                case 5:
                    nuevoValor = 0;
                    System.out.println("Introduce contraseña actual");
                    nuevoValor = sc.nextInt();
                    cliente1.getC1().modificarContraseña(nuevoValor);
                    break;
            }
        }while(numero !=6);     
        
    }
}
