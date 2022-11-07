/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_5.banco;
import java.util.Random;
/**
 *
 * @author jaimecaro
 */
public class Cuenta {
    private int numeroCuenta;
    private int saldo;
    private int password;
    public Cuenta(){
        numeroCuenta = 0;
        saldo = 0;
        password = 0;
    }
    public Cuenta(int numeroCuenta,int saldo,int password){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.password = password;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getPassword() {
        return password;
    }
    public void modificarSaldo(String accion,int cantidad){
        switch(accion){
            case "ingresar":
                saldo+= cantidad;
                break;
            case "retirar":
                if(saldo >= cantidad ){
                    saldo-= cantidad;
                }else{
                        System.err.println("Error: no se puede retirar la cantidad indicada");
                       
                }
                break;
        }
    }
    public int generarContraseña(){
        Random r = new Random();
        password = r.nextInt(9999)+1000;
        return password;
    }
    public void modificarContraseña(int password){
        if(this.password == password){
            Random r = new Random();
            this.password = r.nextInt(9999)+1000;
        }else{
            System.err.println("contraseña erronea");
        }
    }
    public boolean validarContraseña(int password){
        if(this.password == password){
           return true;
        }else{
           return false;
        }
    }
    public void mostrarDatos(int password){
        
        if(validarContraseña(password)){
            System.out.println(numeroCuenta);
            System.out.println(saldo);
        }
    }
}
