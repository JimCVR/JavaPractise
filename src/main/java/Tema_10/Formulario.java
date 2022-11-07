package Tema_10;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Formulario extends JFrame implements ActionListener {
    private JLabel textoNombre;// etiqueta o texto no editable
    private JLabel textoEmail;
    private JLabel textoPass;
    private JLabel textoRePass;
    private JLabel textoVerificar;
    private JTextField cajaNombre;
    private JTextField cajaEmail;
    private JTextField cajaPass;
    private JTextField cajaRePass;// caja de texto, para insertar datos
    private JButton botonEnviar;// boton con una determinada accion
    private JButton botonCargar;
    public Formulario() {
        super();
        configurarVentana();
        inicializarComponentes();

    }
    private void configurarVentana() {
        setTitle("Adivina El numero"); // colocamos titulo a la ventana
        setSize(540, 320); // colocamos tamanio a la ventana (ancho, alto)
        setLocationRelativeTo(null); // centramos la ventana en la pantalla
        setLayout(null); // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        setResizable(true); // hacemos que la ventana no sea redimiensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hacemos que cuando se cierre la ventana termina todo proceso
    }
    private void inicializarComponentes() {
// creamos los componentes
        textoNombre = new JLabel();
        textoEmail = new JLabel();
        textoPass = new JLabel();
        textoRePass = new JLabel();
        cajaNombre = new JTextField();
        cajaEmail = new JTextField();
        cajaPass = new JPasswordField();
        cajaRePass = new JPasswordField();
        botonEnviar = new JButton();
        botonCargar = new JButton();
// configuramos los componentes
        textoNombre.setText("Nombre: "); // colocamos un texto a la etiqueta
        textoNombre.setBounds(50, 50, 150, 25); // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        textoEmail.setText("Email: ");
        textoEmail.setBounds(50,75,150,25);
        textoPass.setText("Contraseña: ");
        textoPass.setBounds(50,100,100,25);
        textoRePass.setText("Repite contraseña: ");
        textoRePass.setBounds(50,125,150,25);
        cajaNombre.setBounds(250, 50, 100, 25);
        cajaEmail.setBounds(250, 75, 100, 25);
        cajaPass.setBounds(250, 100, 100, 25);
        cajaRePass.setBounds(250, 125, 100, 25);// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        botonEnviar.setText("Enviar"); // colocamos un texto al boton
        botonEnviar.setBounds(250, 200, 100, 30); // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botonEnviar.addActionListener(this); // hacemos que el boton tenga una accion y esa accion estara en esta clase
        botonCargar.setText("Cargar");
        botonCargar.setBounds(100,200,100,30);
        botonCargar.addActionListener(this);
// adicionamos los componentes a la ventana
        add(textoNombre);
        add(textoEmail);
        add(textoPass);
        add(textoRePass);
        add(cajaNombre);
        add(cajaEmail);
        add(cajaPass);
        add(cajaRePass);
        add(botonEnviar);
        add(botonCargar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();


        try{
            if(source.getText().equals(botonEnviar.getText())) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("formulario.txt"));
                bw.write(cajaNombre.getText() + ";");
                bw.write(cajaEmail.getText() + ";");
                if (cajaPass.getText().equals(cajaRePass.getText())) {
                    bw.write(cajaPass.getText() + ";");
                } else {
                    JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
                }
                bw.close();
            }else{
                BufferedReader br = new BufferedReader(new FileReader("formulario.txt"));
                String leer = "";
                while((leer = br.readLine()) != null){
                    String [] linea = leer.split("\\;");
                    cajaNombre.setText(linea[0]);
                    cajaEmail.setText(linea[1]);
                    cajaPass.setText(linea[2]);
                    cajaRePass.setText(linea[2]);
                }
                br.close();
            }
        }catch(IOException o){System.err.println("Error");}

    }
    public static void main(String []args){
        Formulario f = new Formulario();
        f.setVisible(true);
    }
}
