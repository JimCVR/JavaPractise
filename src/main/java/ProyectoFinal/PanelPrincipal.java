package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel {
    private JButton insert;
    private JButton select;
    private JButton delete;
    private JButton update;
    private JLabel mensajeInicio;
    private JLabel mensajeInicio2;

    public PanelPrincipal(){
        iniciarComponentes();
    }
    public PanelPrincipal(JPanel panel){

    }
    public void iniciarComponentes(){
        configPanels();
        configButtons();
        configLabels();

    }


    private void configPanels(){
        setLayout(null);
        setBackground(Color.red);
    }
    private void configButtons(){

        insert = new JButton();
        update = new JButton();
        delete = new JButton();
        select = new JButton();

        insert.setText("Añadir Ejemplar");
        insert.setBounds(200,150,200,100);
        //insert.addActionListener(this);

        update.setText("Editar Ejemplar");
        update.setBounds(200,320,200,100);
        //update.addActionListener(this);

        delete.setText("Borrar Ejemplar");
        delete.setBounds(420,150,200,100);
        //delete.addActionListener(this);

        select.setText("Buscar Ejemplar");
        select.setBounds(420,320,200,100);
        //select.addActionListener(this);

        /*add(insert);
        add(select);
        add(delete);
        add(update);*/

    }
    private void configLabels(){
        mensajeInicio = new JLabel();
        mensajeInicio2 = new JLabel();
        mensajeInicio.setText("Fisherman's Horizon");

        mensajeInicio.setBounds(175,30,500,100);
        mensajeInicio.setFont(new Font("Arial", Font.PLAIN,30));

        mensajeInicio2.setText("Menu Principal");
        mensajeInicio2.setBounds(220,70,500,100);
        mensajeInicio2.setFont(new Font("Arial", Font.PLAIN,18));

        add(mensajeInicio);
        add(mensajeInicio2);

    }

    public JButton getInsert() {
        return insert;
    }

   /* @Override
    public void actionPerformed(ActionEvent e){
        JButton source = (JButton) e.getSource();

        switch(source.getText()){
            case "Añadir Ejemplar":
                setVisible(false);
               // new PanelPrincipal(new PanelAñadir());
                    break;
        }
    }*/


}
