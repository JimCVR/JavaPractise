package Tema_9.Ficheros;

import Tema_9.Excepciones.NegativoNoValidoException;

public class EntradaMayorALineasException extends Exception{
    public EntradaMayorALineasException(String mensage){super("Entrada mayor a linea de fichero"+mensage);}
}
