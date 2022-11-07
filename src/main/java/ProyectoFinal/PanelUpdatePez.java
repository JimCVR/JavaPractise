package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelUpdatePez extends JPanel implements ActionListener {
    private int resB = -1;

    private JButton confirmar;
    private JButton clear;
    private JButton buscar;

    private JLabel titulo;
    private JLabel mensajeError;

    private JLabel labelNombre;
    private JLabel labelLongitud;
    private JLabel labelPeso;
    private JLabel labelLoc;
    private JLabel labelRecord;
    private JLabel labelRecordOwner;

    private JLabel longSalida;
    private JLabel nombreSalida;
    private JLabel pesoSalida;
    private JLabel locSalida;
    private JLabel recordSalida;
    private JLabel recordOwnerSalida;

    private JTextField cajaNombre;
    private JTextField cajaLong;
    private JTextField cajaPeso;
    private JTextField cajaLoc;
    private JTextField cajaRecord;
    private JTextField cajaRecordOwner;
    private JTextField cajaBusqueda;

    public PanelUpdatePez(){
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
        buscar = new JButton();


        buscar.setText("Buscar");
        buscar.setFont(new Font("source serif pro", Font.PLAIN,16));
        buscar.setBounds(600,titulo.getY()+20,100,30);
        buscar.addActionListener(this);

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
        add(buscar);
    }
    private void configLabels(){
        titulo = new JLabel();
        labelLongitud = new JLabel();
        labelNombre = new JLabel();
        labelPeso = new JLabel();
        labelLoc = new JLabel();
        labelRecord = new JLabel();
        labelRecordOwner = new JLabel();

        longSalida = new JLabel();
        nombreSalida = new JLabel();
        pesoSalida = new JLabel();
        locSalida = new JLabel();
        recordSalida = new JLabel();
        recordOwnerSalida = new JLabel();

        titulo.setText("Añadir Pez");
        titulo.setBounds(50,0,500,75);
        titulo.setFont(new Font("source serif pro", Font.PLAIN,30));

        mensajeError = new JLabel();
        mensajeError.setText("*ERROR: NO SE PUDO REALIZAR LA OPERACION*");
        mensajeError.setBounds(275,titulo.getY()+15,500,100);
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


        longSalida.setText("");
        longSalida.setBounds(580, labelLongitud.getY(), 200,30);
        longSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        nombreSalida.setText("");
        nombreSalida.setBounds(580, labelNombre.getY(), 200,30);
        nombreSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        pesoSalida.setText("");
        pesoSalida.setBounds(580, labelPeso.getY(), 200,30);
        pesoSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        locSalida.setText("");
        locSalida.setBounds(580, labelLoc.getY(), 200,30);
        locSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        recordSalida.setText("");
        recordSalida.setBounds(580, labelRecord.getY(), 200,30);
        recordSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        recordOwnerSalida.setText("");
        recordOwnerSalida.setBounds(580, labelRecordOwner.getY(), 200,30);
        recordOwnerSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        add(titulo);
        add(labelNombre);
        add(labelLongitud);
        add(labelPeso);
        add(labelLoc);
        add(labelRecord);
        add(labelRecordOwner);
        add(mensajeError);

        add(longSalida);
        add(nombreSalida);
        add(pesoSalida);
        add(locSalida);
        add(recordSalida);
        add(recordOwnerSalida);

    }
    public void configTextField() {
        cajaNombre = new JTextField();
        cajaLong = new JTextField();
        cajaPeso = new JTextField();
        cajaLoc = new JTextField();
        cajaRecord = new JTextField();
        cajaRecordOwner = new JTextField();
        cajaBusqueda = new JTextField();


        cajaNombre.setBounds(325, labelNombre.getY(), 200, 30);
        cajaNombre.setFont(new Font("source serif pro", Font.PLAIN, 18));

        cajaLong.setBounds(325, labelLongitud.getY(), 200, 30);
        cajaLong.setFont(new Font("source serif pro", Font.PLAIN, 18));

        cajaPeso.setBounds(325, labelPeso.getY(), 200, 30);
        cajaPeso.setFont(new Font("source serif pro", Font.PLAIN, 18));

        cajaLoc.setBounds(325, labelLoc.getY(), 200, 30);
        cajaLoc.setFont(new Font("source serif pro", Font.PLAIN, 18));

        cajaRecord.setBounds(325, labelRecord.getY(), 200, 30);
        cajaRecord.setFont(new Font("source serif pro", Font.PLAIN, 18));

        cajaRecordOwner.setBounds(325, labelRecordOwner.getY(), 200, 30);
        cajaRecordOwner.setFont(new Font("source serif pro", Font.PLAIN, 18));
        cajaBusqueda.setBounds(375, titulo.getY() + 20, 200, 30);

        add(cajaLong);
        add(cajaNombre);
        add(cajaPeso);
        add(cajaLoc);
        add(cajaRecord);
        add(cajaRecordOwner);
        add(cajaBusqueda);
    }
        public void setTextBlanco(){
            cajaLong.setText("");
            cajaNombre.setText("");
            cajaPeso.setText("");
            cajaLoc.setText("");
            cajaRecord.setText("");
            cajaRecordOwner.setText("");
        }

    public int updatePez(){
       int error = 0;
        if(!cajaNombre.getText().equals("")){
            error += PezDao.update(cajaBusqueda.getText(), "nombre", cajaNombre.getText());
        }
        if(!cajaLong.getText().equals("")){
            error += PezDao.update(cajaBusqueda.getText(), "longitud", cajaLong.getText());
        }
        if(!cajaPeso.getText().equals("")){
            error += PezDao.update(cajaBusqueda.getText(), "peso", cajaPeso.getText());
        }
        if(!cajaLoc.getText().equals("")){
            error += PezDao.update(cajaBusqueda.getText(), "localizacion", cajaLoc.getText());
        }
        if(!cajaRecord.getText().equals("")){
            error += PezDao.update(cajaBusqueda.getText(), "recordLongitud", cajaRecord.getText());
        }
        if(!cajaRecordOwner.getText().equals("")){
            error += PezDao.update(cajaBusqueda.getText(), "id_pescador", cajaRecordOwner.getText());
        }

        return error;
    }

    public int buscar(){
        try{
            String [] campos = PezDao.select(cajaBusqueda.getText()).split(";");
            nombreSalida.setText(campos[0]);
            longSalida.setText(campos[1]);
            pesoSalida.setText(campos[2]);
            locSalida.setText(campos[3]);
            recordSalida.setText(campos[4]);
            recordOwnerSalida.setText(campos[5]);
            mensajeError.setVisible(false);
            return 0;
        }catch(NumberFormatException n){
            mensajeError.setVisible(true);
            return -1;
        }catch(ArrayIndexOutOfBoundsException a){
            setTextBlanco();
            mensajeError.setVisible(true);
            return -1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();


        switch (source.getText()) {
            case "Buscar":
                setTextBlanco();
                resB = buscar();

                break;
            case "Deshacer":
                setTextBlanco();
                break;

            case "Confirmar":
                mensajeError.setVisible(false);
                if(updatePez() == 0)
                    mensajeError.setVisible(true);
                else if(resB == 0) {
                    mensajeError.setVisible(false);
                    setTextBlanco();
                    JOptionPane.showMessageDialog(null, "Operacion realizada con exito");
                    buscar();
                    resB =-1;
                }
                break;
        }
    }
}
