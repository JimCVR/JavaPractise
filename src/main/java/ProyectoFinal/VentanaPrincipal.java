package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
   private JButton atras;
  /*  private JButton select;
    private JButton delete;
    private JButton update;
    private JLabel mensajeInicio;
    private JLabel mensajeInicio2;
*/
    private PanelPrincipal panelPrincipal;
    private PanelAñadir panelAñadir;
    private JTabbedPane pestañas;


    public VentanaPrincipal(){
        configurarVentana();
        panelPrincipal = new PanelPrincipal();
        panelAñadir = new PanelAñadir();
        pestañas = new JTabbedPane();
        pestañas.addTab("Principal", panelPrincipal);
        pestañas.addTab("Añadir", panelAñadir);
        getContentPane().add(pestañas);
        /*getContentPane().add(panelPrincipal);
        getContentPane().add(panelAñadir);*/
        setVisible(true);

    }
    public void configurarVentana(){
        setTitle("Fisherman's Horizon");
        setLocationRelativeTo(null);
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

  /*  private void configLabels(){
        mensajeInicio = new JLabel();
        mensajeInicio2 = new JLabel();
        mensajeInicio.setText("Fisherman's Horizon");

        mensajeInicio.setBounds(175,30,500,100);
        mensajeInicio.setFont(new Font("Arial", Font.PLAIN,30));

        mensajeInicio2.setText("Menu Principal");
        mensajeInicio2.setBounds(220,70,500,100);
        mensajeInicio2.setFont(new Font("Arial", Font.PLAIN,18));

        panelPrincipal.add(mensajeInicio);
        panelPrincipal.add(mensajeInicio2);

    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();


        switch(source.getText()){
            case "Atras":

                break;
        }


    }
    public static void main(String[]args){
        VentanaPrincipal v = new VentanaPrincipal();

    }
}
