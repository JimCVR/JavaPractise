package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDelete extends JPanel implements ActionListener {
    private int resB = -1;
    private JButton buscar;
    private JButton borrar;
    private JLabel titulo;
    private JLabel mensajeError;
    private JTextField cajaBusqueda;
    private JLabel labelId;
    private JLabel labelNombre;
    private JLabel labelEdad;
    private JLabel labelNacion;
    private JLabel labelEspecialidad;
    private JLabel idSalida;
    private JLabel nombreSalida;
    private JLabel edadSalida;
    private JLabel nacionSalida;
    private JLabel especialidadSalida;

    public PanelDelete(){
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
        labelId = new JLabel();
        labelNombre = new JLabel();
        labelEdad = new JLabel();
        labelNacion = new JLabel();
        labelEspecialidad = new JLabel();


        idSalida = new JLabel();
        nombreSalida = new JLabel();
        edadSalida = new JLabel();
        nacionSalida = new JLabel();
        especialidadSalida = new JLabel();

        titulo.setText("Borrar Pescador");
        titulo.setBounds(50,0,500,75);
        titulo.setFont(new Font("source serif pro", Font.PLAIN,30));

        mensajeError = new JLabel();
        mensajeError.setText("*ERROR: ID NO ENCONTRADO*");
        mensajeError.setBounds(275,450,500,100);
        mensajeError.setFont(new Font("source serif pro", Font.PLAIN,16));
        mensajeError.setForeground(Color.RED);
        mensajeError.setVisible(false);

        labelId.setText("ID: ");
        labelId.setBounds(150,125,200,30);
        labelId.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelNombre.setText("Nombre: ");
        labelNombre.setBounds(150, labelId.getY()+75,200,30);
        labelNombre.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelEdad.setText("Edad: ");
        labelEdad.setBounds(150,labelNombre.getY()+75,200,30);
        labelEdad.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelNacion.setText("Nacionalidad: ");
        labelNacion.setBounds(150,labelEdad.getY()+75,200,30);
        labelNacion.setFont(new Font("source serif pro",Font.PLAIN,24));

        labelEspecialidad.setText("Especialidad: ");
        labelEspecialidad.setBounds(150,labelNacion.getY()+75,200,30);
        labelEspecialidad.setFont(new Font("source serif pro",Font.PLAIN,24));

        idSalida.setText("");
        idSalida.setBounds(325, labelId.getY(), 200,30);
        idSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        nombreSalida.setText("");
        nombreSalida.setBounds(325, labelNombre.getY(), 200,30);
        nombreSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        edadSalida.setText("");
        edadSalida.setBounds(325, labelEdad.getY(), 200,30);
        edadSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        nacionSalida.setText("");
        nacionSalida.setBounds(325, labelNacion.getY(), 200,30);
        nacionSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        especialidadSalida.setText("");
        especialidadSalida.setBounds(325, labelEspecialidad.getY(), 200,30);
        especialidadSalida.setFont(new Font("source serif pro",Font.PLAIN,24));

        add(titulo);
        add(labelId);
        add(labelNombre);
        add(labelEdad);
        add(labelNacion);
        add(labelEspecialidad);
        add(mensajeError);

        add(idSalida);
        add(nombreSalida);
        add(edadSalida);
        add(nacionSalida);
        add(especialidadSalida);
    }
    public void configTextField(){
        cajaBusqueda = new JTextField();
        cajaBusqueda.setBounds(325,titulo.getY()+45,200,30);
        add(cajaBusqueda);
    }

    private void configButtons(){
        buscar = new JButton();
        borrar = new JButton();

        buscar.setText("Buscar");
        buscar.setFont(new Font("source serif pro", Font.PLAIN,16));
        buscar.setBounds(530,titulo.getY()+45,100,30);
        buscar.addActionListener(this);

        borrar.setText("Borrar");
        borrar.setFont(new Font("source serif pro", Font.PLAIN,16));
        borrar.setBounds(600,mensajeError.getY(),150,50);
        borrar.addActionListener(this);


        add(buscar);
        add(borrar);
    }
    public void setTextBlanco(){
        idSalida.setText("");
        nombreSalida.setText("");
        edadSalida.setText("");
        nacionSalida.setText("");
        especialidadSalida.setText("");
    }
    public int buscar(){
        try {
            String[] campos = PescadorDao.select(Integer.parseInt(cajaBusqueda.getText())).split(";");
            idSalida.setText(campos[0]);
            nombreSalida.setText(campos[1]);
            edadSalida.setText(campos[2]);
            nacionSalida.setText(campos[3]);
            especialidadSalida.setText(campos[4]);
            mensajeError.setVisible(false);
            return 0;
        } catch (NumberFormatException n) {
            mensajeError.setVisible(true);
            return -1;
        } catch (ArrayIndexOutOfBoundsException a) {
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
                resB = buscar();
                break;
            case "Borrar":
                if( resB == 0){

                    if (JOptionPane.showConfirmDialog(null, "¿Estas seguro de borrar este pescador?", "Elige una opcion...", JOptionPane.YES_NO_OPTION) == 0) {
                        if (PescadorDao.delete(Integer.parseInt(cajaBusqueda.getText())) == 0) {
                            mensajeError.setVisible(false);
                            JOptionPane.showMessageDialog(null, "Tabla Borrada satisfactoriamente");
                            setTextBlanco();
                            resB = -1;
                        }
                    }
                }
                break;
        }

    }
}
