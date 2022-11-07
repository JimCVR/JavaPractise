package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelUpdate extends JPanel implements ActionListener {
    private int resB = -1;

    private JButton confirmar;
    private JButton clear;
    private JButton buscar;
    private JRadioButtonMenuItem asf;

    private JLabel idSalida;
    private JLabel nombreSalida;
    private JLabel edadSalida;
    private JLabel nacionSalida;
    private JLabel especialidadSalida;


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

    private JTextField cajaBusqueda;

    private JLabel labelEspecialidad;
    private JTextField cajaEspecialidad;

    public PanelUpdate(){
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
        confirmar.setBounds(425, cajaEspecialidad.getY()+85,150,40);
        confirmar.addActionListener(this);

        clear.setText("Deshacer");
        clear.setFont(new Font("source serif pro", Font.PLAIN,16));
        clear.setBounds(250, cajaEspecialidad.getY()+85,150,40);
        clear.addActionListener(this);

        add(confirmar);
        add(clear);
        add(buscar);
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

        titulo.setText("Modificar Pescador");
        titulo.setBounds(50,0,500,75);
        titulo.setFont(new Font("source serif pro", Font.PLAIN,30));

        mensajeError = new JLabel();
        mensajeError.setText("*ERROR: NO SE PUDO REALIZAR LA OPERACION*");
        mensajeError.setBounds(275,titulo.getY()+15,500,100);
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
        cajaId = new JTextField();
        cajaNombre = new JTextField();
        cajaEdad = new JTextField();
        cajaNacion = new JTextField();
        cajaEspecialidad = new JTextField();
        cajaBusqueda = new JTextField();

        cajaId.setBounds(325, labelId.getY(), 200,30);
        cajaNombre.setBounds(325, labelNombre.getY(), 200,30);
        cajaEdad.setBounds(325, labelEdad.getY(), 200,30);
        cajaNacion.setBounds(325, labelNacion.getY(), 200,30);
        cajaEspecialidad.setBounds(325, labelEspecialidad.getY(), 200,30);
        cajaBusqueda.setBounds(375, titulo.getY() + 20, 200, 30);

        add(cajaId);
        add(cajaNombre);
        add(cajaEdad);
        add(cajaNacion);
        add(cajaEspecialidad);
        add(cajaBusqueda);
    }
    public void setTextBlanco(){
        cajaId.setText("");
        cajaNombre.setText("");
        cajaEdad.setText("");
        cajaNacion.setText("");
        cajaEspecialidad.setText("");
    }
    public int updatePescador(){
       int error = 0;
        if(!cajaId.getText().equals("")){
            error += PescadorDao.update(cajaBusqueda.getText(), "id", cajaId.getText());
        }
        if(!cajaNombre.getText().equals("")){
            error += PescadorDao.update(cajaBusqueda.getText(), "nombre", cajaNombre.getText());
        }
        if(!cajaEdad.getText().equals("")){
            error += PescadorDao.update(cajaBusqueda.getText(), "edad", cajaEdad.getText());
        }
        if(!cajaNacion.getText().equals("")){
            error += PescadorDao.update(cajaBusqueda.getText(), "nacionalidad", cajaNacion.getText());
        }
        if(!cajaEspecialidad.getText().equals("")){
            error += PescadorDao.update(cajaBusqueda.getText(), "especialidad", cajaEspecialidad.getText());
        }

        return error;
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
                setTextBlanco();
                resB = buscar();
                break;
            case "Deshacer":
                setTextBlanco();
                break;

            case "Confirmar":
                mensajeError.setVisible(false);
                if(updatePescador() == 0)
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
