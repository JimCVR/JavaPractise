package ProyectoFinal;

import javax.swing.*;

public class VentanaPescador extends JFrame {
   private JButton atras;
  /*  private JButton select;
    private JButton delete;
    private JButton update;
    private JLabel mensajeInicio;
    private JLabel mensajeInicio2;
*/
    private PanelSelect panelSelect;
    private PanelAñadir panelAñadir;
    private PanelDelete panelDelete;
    private PanelUpdate panelUpdate;
    private JTabbedPane pestañas;


    public VentanaPescador(){
        configurarVentana();
        configTabs();
    }
    public void configTabs(){
        panelAñadir = new PanelAñadir();
        panelSelect = new PanelSelect();
        panelDelete = new PanelDelete();
        panelUpdate = new PanelUpdate();
        pestañas = new JTabbedPane();
        pestañas.addTab("Añadir", panelAñadir);
        pestañas.addTab("Buscar", panelSelect);
        pestañas.addTab("Borrar", panelDelete);
        pestañas.addTab("Modificar", panelUpdate);
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
