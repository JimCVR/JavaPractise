package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAñadir extends JPanel implements ActionListener {

    private JButton confirmar;
    private JButton clear;

    private JLabel titulo;
    private JLabel mensajeError;

    private JLabel labelNombre;
    private JTextField cajaNombre;
    private JLabel labelId;
    private JTextField cajaId;
    private JLabel labelEdad;
    private JTextField cajaEdad;

    private JLabel labelNacion;
    private JTextField cajaNacion;


    private JLabel labelEspecialidad;
    private JTextField cajaEspecialidad;

    public PanelAñadir(){
        iniciarComponentes();
    }


    public void iniciarComponentes(){
        configPanels();
        configLabels();
        configTextField();
        configButtons();
    }
    private void configPanels(){
        setLayout(null);
        setBackground(Color.cyan.darker());
    }
    private void configButtons(){

        confirmar = new JButton();
        clear = new JButton();

        confirmar.setText("Confirmar");
        confirmar.setFont(new Font("source serif pro", Font.PLAIN,16));
        confirmar.setBounds(425, cajaEspecialidad.getY()+85,150,40);
        confirmar.addActionListener(this);

        clear.setText("Deshacer");
        clear.setFont(new Font("source serif pro", Font.PLAIN,16));
        clear.setBounds(250, cajaEspecialidad.getY()+85,150,40);
        clear.addActionListener(this);

        add(confirmar);
        add(clear);
    }
    private void configLabels(){
        titulo = new JLabel();
        labelId = new JLabel();
        labelNombre = new JLabel();
        labelEdad = new JLabel();
        labelNacion = new JLabel();
        labelEspecialidad = new JLabel();

        titulo.setText("Añadir Pescador");
        titulo.setBounds(50,0,500,75);
        titulo.setFont(new Font("source serif pro", Font.PLAIN,30));

        mensajeError = new JLabel();
        mensajeError.setText("*ERROR: CAMPOS SIN RELLENAR*");
        mensajeError.setBounds(300,titulo.getY(),500,100);
        mensajeError.setFont(new Font("source serif pro", Font.BOLD,16));
        mensajeError.setForeground(Color.RED);
        mensajeError.setVisible(false);

        labelId.setText("ID: ");
        labelId.setBounds(150,85,200,30);
        labelId.setFont(new Font("source serif pro",Font.PLAIN,24));



        labelNombre.setText("Nombre:");
        labelNombre.setBounds(150, labelId.getY()+65,200,30);
        labelNombre.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelEdad.setText("Edad:");
        labelEdad.setBounds(150,labelNombre.getY()+65,200,30);
        labelEdad.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelNacion.setText("Nacionalidad:");
        labelNacion.setBounds(150, labelEdad.getY()+65,200,30);
        labelNacion.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelEspecialidad.setText("Especialidad:");
        labelEspecialidad.setBounds(150, labelNacion.getY()+65,200,30);
        labelEspecialidad.setFont(new Font("source serif pro",Font.PLAIN,24));

        add(titulo);
        add(labelId);
        add(labelNombre);
        add(labelEdad);
        add(labelNacion);
        add(labelEspecialidad);
        add(mensajeError);
    }

    public void configTextField(){
        cajaId = new JTextField();
        cajaNombre = new JTextField();
        cajaEdad = new JTextField();
        cajaNacion = new JTextField();
        cajaEspecialidad = new JTextField();

        cajaId.setBounds(325, labelId.getY(), 200,30);
        cajaNombre.setBounds(325, labelNombre.getY(), 200,30);
        cajaEdad.setBounds(325, labelEdad.getY(), 200,30);
        cajaNacion.setBounds(325, labelNacion.getY(), 200,30);
        cajaEspecialidad.setBounds(325, labelEspecialidad.getY(), 200,30);

        add(cajaId);
        add(cajaNombre);
        add(cajaEdad);
        add(cajaNacion);
        add(cajaEspecialidad);
    }
    public void setTextBlanco(){
        cajaId.setText("");
        cajaNombre.setText("");
        cajaEdad.setText("");
        cajaNacion.setText("");
        cajaEspecialidad.setText("");
    }
    public int añadirPescador(){
        return PescadorDao.insert(new Pescador(cajaId.getText(),cajaNombre.getText(),cajaEdad.getText(),cajaNacion.getText(),cajaEspecialidad.getText()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();


        switch (source.getText()) {
            case "Deshacer":
                setTextBlanco();
                break;

            case "Confirmar":
                if(añadirPescador() == 0)
                    mensajeError.setVisible(true);
                    else{
                        mensajeError.setVisible(false);
                        setTextBlanco();
                        JOptionPane.showMessageDialog(null, "Operacion realizada con exito");
                    }
                break;
        }
    }
}
