package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSelect extends JPanel implements ActionListener {

    private JButton buscar;
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

    public PanelSelect(){
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

        titulo.setText("Buscar Pescador");
        titulo.setBounds(50,0,500,75);
        titulo.setFont(new Font("source serif pro", Font.PLAIN,30));

        mensajeError = new JLabel();
        mensajeError.setText("*ERROR: ID NO ENCONTRADO*");
        mensajeError.setBounds(275,titulo.getY()+45,500,100);
        mensajeError.setFont(new Font("source serif pro", Font.BOLD,16));
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


        buscar.setText("Buscar");
        buscar.setFont(new Font("source serif pro", Font.PLAIN,16));
        buscar.setBounds(530,titulo.getY()+45,100,30);
        buscar.addActionListener(this);
        add(buscar);
    }
    public void setTextBlanco(){
        idSalida.setText("");
        nombreSalida.setText("");
        edadSalida.setText("");
        nacionSalida.setText("");
        especialidadSalida.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String [] campos = PescadorDao.select(Integer.parseInt(cajaBusqueda.getText())).split(";");
            idSalida.setText(campos[0]);
            nombreSalida.setText(campos[1]);
            edadSalida.setText(campos[2]);
            nacionSalida.setText(campos[3]);
            especialidadSalida.setText(campos[4]);
            mensajeError.setVisible(false);
        }catch(NumberFormatException n){
            mensajeError.setVisible(true);
        }catch(ArrayIndexOutOfBoundsException a){
            setTextBlanco();
            mensajeError.setVisible(true);
        }
    }
}
