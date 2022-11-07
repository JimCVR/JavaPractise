package Tema_10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
    /**
     * Clase Ventana
     * Muestra la estructuta que deberia tener una Ventana en Java con la libreria
     * Swing, contiene una etiqueta, un caja de texto y un boton, que tiene la
     * accion de mostrar el texto en la caja por una ventana de mensaje.
     * @author Daniel Alvarez (a3dany)
     */
    public class IMC extends JFrame implements ActionListener {
        private JLabel texto; // etiqueta o texto no editable
        private JLabel texto2;
        private JLabel texto3;
        private JTextField caja; // caja de texto, para insertar datos
        private JTextField caja2;
        private JTextField caja3;
        private JButton boton; // boton con una determinada accion
        public IMC() {
            super(); // usamos el contructor de la clase padre JFrame
            configurarVentana(); // configuramos la ventana
            inicializarComponentes(); // inicializamos los atributos o componentes
        }
        private void configurarVentana() {
            this.setTitle("Esta Es Una Ventana"); // colocamos titulo a la ventana
            this.setSize(410, 310); // colocamos tamanio a la ventana (ancho, alto)
            this.setLocationRelativeTo(null); // centramos la ventana en la pantalla
            this.setLayout(null); // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
            this.setResizable(true); // hacemos que la ventana no sea redimiensionable
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hacemos que cuando se cierre la ventana termina todo proceso
        }
        private void inicializarComponentes() {
// creamos los componentes
            texto = new JLabel();
            texto2 = new JLabel();
            texto3 = new JLabel();
            caja = new JTextField();
            caja2 = new JTextField();
            caja3 = new JTextField();
            boton = new JButton();
// configuramos los componentes
            texto.setText("Inserte Altura: "); // colocamos un texto a la etiqueta
            texto.setBounds(50, 50, 100, 25); // colocamos posicion y tamanio al texto (x, y, ancho, alto)
            texto2.setText("Inserte peso: ");
            texto2.setBounds(50,100,100,25);
            texto3.setText("IMC: ");
            texto3.setBounds(50,150,100,25);
            caja.setBounds(150, 50, 100, 25);// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
            caja2.setBounds(150, 100, 100, 25);
            caja3.setBounds(150, 150, 100, 25);

            boton.setText("Calcular IMC"); // colocamos un texto al boton
            boton.setBounds(50, 200, 200, 30); // colocamos posicion y tamanio al boton (x, y, ancho, alto)
            boton.addActionListener(this); // hacemos que el boton tenga una accion y esa accion estara en esta clase
// adicionamos los componentes a la ventana
            this.add(texto);
            this.add(texto2);
            this.add(texto3);
            this.add(caja);
            this.add(caja2);
            this.add(caja3);
            this.add(boton);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String caja01 = caja.getText(); // obtenemos el contenido de la caja de texto
            String caja02 = caja2.getText();
            double altura = Double.parseDouble(caja01);
            double peso = Double.parseDouble(caja02);
            double IMC = peso/(altura*altura);
            caja3.setText(IMC+""); // mostramos un mensaje (frame, mensaje)
        }
        public static void main(String[] args) {
            IMC V = new IMC(); // creamos una ventana
            V.setVisible(true); // hacemos visible la ventana creada
        }
    }
