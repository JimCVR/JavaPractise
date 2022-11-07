package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSelectPez extends JPanel implements ActionListener {

    private JButton buscar;
    private JLabel titulo;
    private JLabel mensajeError;
    private JTextField cajaBusqueda;
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

    public PanelSelectPez(){
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

        titulo.setText("Buscar Pez");
        titulo.setBounds(50,0,500,75);
        titulo.setFont(new Font("source serif pro", Font.PLAIN,30));

        mensajeError = new JLabel();
        mensajeError.setText("*ERROR: NOMBRE NO ENCONTRADO*");
        mensajeError.setBounds(275,titulo.getY()+45,500,100);
        mensajeError.setFont(new Font("source serif pro", Font.BOLD,16));
        mensajeError.setForeground(Color.RED);
        mensajeError.setVisible(false);

        labelNombre.setText("Nombre: ");
        labelNombre.setBounds(150,125,200,30);
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
        longSalida.setBounds(325, labelLongitud.getY(), 200,30);
        longSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        nombreSalida.setText("");
        nombreSalida.setBounds(325, labelNombre.getY(), 200,30);
        nombreSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        pesoSalida.setText("");
        pesoSalida.setBounds(325, labelPeso.getY(), 200,30);
        pesoSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        locSalida.setText("");
        locSalida.setBounds(325, labelLoc.getY(), 200,30);
        locSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        recordSalida.setText("");
        recordSalida.setBounds(325, labelRecord.getY(), 200,30);
        recordSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        recordOwnerSalida.setText("");
        recordOwnerSalida.setBounds(325, labelRecordOwner.getY(), 200,30);
        recordOwnerSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        add(titulo);
        add(labelLongitud);
        add(labelNombre);
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
    public void configTextField(){
        cajaBusqueda = new JTextField();
        cajaBusqueda.setBounds(325,titulo.getY()+45,200,30);
        add(cajaBusqueda);
    }

    private void configButtons(){
        buscar = new JButton();
        buscar.setText("Buscar");
        buscar.setFont(new Font("source serif pro", Font.PLAIN,16));
        buscar.setBounds(530,titulo.getY()+45,100,30);
        buscar.addActionListener(this);
        add(buscar);
    }
    public void setTextBlanco(){
        longSalida.setText("");
        nombreSalida.setText("");
        pesoSalida.setText("");
        locSalida.setText("");
        recordSalida.setText("");
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
            buscar();
    }
}
