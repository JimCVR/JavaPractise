package ProyectoFinal;

import javax.swing.*;

public class VentanaPez extends JFrame {

    private PanelSelectPez panelSelectPez;
    private PanelAñadirPez panelAñadirPez;
    private PanelDeletePez panelDeletePez;
    private PanelUpdatePez panelUpdatePez;
    private JTabbedPane pestañas;


    public VentanaPez(){
        configurarVentana();
        configTabs();
    }
    public void configTabs(){
        panelAñadirPez = new PanelAñadirPez();
        panelSelectPez = new PanelSelectPez();
        panelDeletePez = new PanelDeletePez();
        panelUpdatePez = new PanelUpdatePez();
        pestañas = new JTabbedPane();
        pestañas.addTab("Añadir", panelAñadirPez);
        pestañas.addTab("Buscar", panelSelectPez);
        pestañas.addTab("Borrar", panelDeletePez);
        pestañas.addTab("Modificar", panelUpdatePez);
        getContentPane().add(pestañas);
    }
    public void configurarVentana(){
        setTitle("Fisherman's Horizon");
        setSize(800, 600);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


}
