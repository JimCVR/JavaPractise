/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_5.banco;

/**
 *
 * @author jaimecaro
 */
public class Cliente {
    private int dni;
    private int sueldo;
    private Cuenta c1;
    public Cliente(){
        dni = 0;
        sueldo = 0;
        c1 = new Cuenta();
    }
    public Cliente(int dni,int sueldo,int saldo){
        this.dni = dni;
        this.sueldo = sueldo;
        
        c1 = new Cuenta(dni,saldo,dni);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        if(dni < 100000000 && dni >=10000000){
            this.dni = dni;
            System.out.println("DNI introducido satisfactoriamente");
        }else{
            System.err.println("Error al introducir DNI");
        }
    }

    public Cuenta getC1() {
        return c1;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        if(sueldo >= 0){
            this.sueldo = sueldo;
            System.out.println("Sueldo introducido satisfactoriamente");
        }else{
            System.err.println("Error al introducir sueldo");
        }
    }
    public void ingresarNomina(){
         c1.modificarSaldo("ingresar", sueldo);
    }
    public void sacarDinero(int dni,int password){
        if(c1.validarContraseña(password)){
            c1.modificarSaldo("retirar", sueldo);
        }
    }
    public void getDatosPersonales(){
        System.out.println("DNI: "+dni);
        System.out.println("Sueldo: "+sueldo);
    }

    
}
