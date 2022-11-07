package ProyectoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicio extends JFrame {

    private PanelInicio panelInicio;

    public VentanaInicio(){
        configurarVentana();
        panelInicio = new PanelInicio();
        getContentPane().add(panelInicio);
        setVisible(true);
    }

    public void configurarVentana(){
        setTitle("Fisherman's Horizon");
        setSize(800, 600);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[]args){
        VentanaInicio v = new VentanaInicio();
    }
}
