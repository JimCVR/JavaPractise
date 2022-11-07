package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAñadirPez extends JPanel implements ActionListener {
    private int resB = -1;
    private JButton confirmar;
    private JButton clear;

    private JLabel titulo;
    private JLabel mensajeError;

    private JLabel labelNombre;
    private JLabel labelLongitud;
    private JLabel labelPeso;
    private JLabel labelLoc;
    private JLabel labelRecord;
    private JLabel labelRecordOwner;

    private JTextField cajaNombre;
    private JTextField cajaLong;
    private JTextField cajaPeso;
    private JTextField cajaLoc;
    private JTextField cajaRecord;
    private JTextField cajaRecordOwner;


    public PanelAñadirPez(){
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
        confirmar.setBounds(425, cajaRecordOwner.getY()+65,150,40);
        confirmar.addActionListener(this);

        clear.setText("Deshacer");
        clear.setFont(new Font("source serif pro", Font.PLAIN,16));
        clear.setBounds(250, cajaRecordOwner.getY()+65,150,40);
        clear.addActionListener(this);

        add(confirmar);
        add(clear);
    }
    private void configLabels(){
        titulo = new JLabel();
        labelLongitud = new JLabel();
        labelNombre = new JLabel();
        labelPeso = new JLabel();
        labelLoc = new JLabel();
        labelRecord = new JLabel();
        labelRecordOwner = new JLabel();

        titulo.setText("Añadir Pez");
        titulo.setBounds(50,0,500,75);
        titulo.setFont(new Font("source serif pro", Font.PLAIN,30));

        mensajeError = new JLabel();
        mensajeError.setText("*ERROR: CAMPOS SIN RELLENAR*");
        mensajeError.setBounds(300,titulo.getY(),500,100);
        mensajeError.setFont(new Font("source serif pro", Font.BOLD,16));
        mensajeError.setForeground(Color.RED);
        mensajeError.setVisible(false);

        labelNombre.setText("Nombre: ");
        labelNombre.setBounds(150,85,200,30);
        labelNombre.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelLongitud.setText("Longitud(cm): ");
        labelLongitud.setBounds(150, labelNombre.getY()+65,200,30);
        labelLongitud.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelPeso.setText("Peso(kg): ");
        labelPeso.setBounds(150,labelLongitud.getY()+65,200,30);
        labelPeso.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelLoc.setText("Localizacion: ");
        labelLoc.setBounds(150, labelPeso.getY()+65,200,30);
        labelLoc.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelRecord.setText("Record (cm): ");
        labelRecord.setBounds(150, labelLoc.getY()+65,200,30);
        labelRecord.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelRecordOwner.setText("ID_Pescador: ");
        labelRecordOwner.setBounds(150, labelRecord.getY()+65,200,30);
        labelRecordOwner.setFont(new Font("source serif pro",Font.PLAIN,24));


        add(titulo);
        add(labelNombre);
        add(labelLongitud);
        add(labelPeso);
        add(labelLoc);
        add(labelRecord);
        add(labelRecordOwner);
        add(mensajeError);

    }

    public void configTextField(){
        cajaNombre = new JTextField();
        cajaLong = new JTextField();
        cajaPeso = new JTextField();
        cajaLoc = new JTextField();
        cajaRecord = new JTextField();
        cajaRecordOwner = new JTextField();

        cajaNombre.setBounds(325, labelNombre.getY(), 200,30);
        cajaNombre.setFont(new Font("source serif pro",Font.PLAIN,18));

        cajaLong.setBounds(325, labelLongitud.getY(), 200,30);
        cajaLong.setFont(new Font("source serif pro",Font.PLAIN,18));

        cajaPeso.setBounds(325, labelPeso.getY(), 200,30);
        cajaPeso.setFont(new Font("source serif pro",Font.PLAIN,18));

        cajaLoc.setBounds(325, labelLoc.getY(), 200,30);
        cajaLoc.setFont(new Font("source serif pro",Font.PLAIN,18));

        cajaRecord.setBounds(325, labelRecord.getY(), 200,30);
        cajaRecord.setFont(new Font("source serif pro",Font.PLAIN,18));

        cajaRecordOwner.setBounds(325, labelRecordOwner.getY(), 200,30);
        cajaRecordOwner.setFont(new Font("source serif pro",Font.PLAIN,18));

        add(cajaLong);
        add(cajaNombre);
        add(cajaPeso);
        add(cajaLoc);
        add(cajaRecord);
        add(cajaRecordOwner);

    }
    public void setTextBlanco(){
        cajaLong.setText("");
        cajaNombre.setText("");
        cajaPeso.setText("");
        cajaLoc.setText("");
        cajaRecord.setText("");
        cajaRecordOwner.setText("");
    }
    public int añadirPescador(){
        return PezDao.insert(new Pez(cajaNombre.getText(),cajaLong.getText(), cajaPeso.getText(), cajaLoc.getText(), cajaRecord.getText(),cajaRecordOwner.getText()));
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
