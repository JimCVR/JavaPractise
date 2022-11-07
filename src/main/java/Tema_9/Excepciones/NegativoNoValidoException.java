/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_9.Excepciones;

/**
 *
 * @author alumno
 *catch (NegativoNoValidoException ne)
 * 
 * catch(Exception e)
 */
public class NegativoNoValidoException extends Exception{
    public NegativoNoValidoException(String mensage){
        super("Excepción de negativo: "+mensage);
    }
    
}
