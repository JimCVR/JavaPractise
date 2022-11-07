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

public class AdivinaNumero extends JFrame implements ActionListener {
    private JLabel texto; // etiqueta o texto no editable
    private JLabel texto2;
    private JLabel texto3;
    private JTextField caja; // caja de texto, para insertar datos
    private JButton boton; // boton con una determinada accion
    private int numero;
    public AdivinaNumero() {
        super(); // usamos el contructor de la clase padre JFrame
        numero = (int) (Math.random()*100);
        configurarVentana(); // configuramos la ventana
        inicializarComponentes(); // inicializamos los atributos o componentes

    }
    private void configurarVentana() {
        this.setTitle("Adivina El numero"); // colocamos titulo a la ventana
        this.setSize(810, 630); // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null); // centramos la ventana en la pantalla
        this.setLayout(null); // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false); // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hacemos que cuando se cierre la ventana termina todo proceso
    }
    private void inicializarComponentes() {
// creamos los componentes
        texto = new JLabel();
        texto2 = new JLabel();
        texto3 = new JLabel();
        caja = new JTextField();
        boton = new JButton();
// configuramos los componentes
        texto.setText("Introduce numero: "); // colocamos un texto a la etiqueta
        texto.setBounds(50, 50, 150, 25); // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        texto2.setText(" ");
        texto2.setBounds(50,125,150,30);
        texto3.setText(numero+"");
        texto3.setBounds(50,100,100,25);
        caja.setBounds(250, 50, 100, 25);// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setText("Introducir"); // colocamos un texto al boton
        boton.setBounds(50, 200, 200, 30); // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this); // hacemos que el boton tenga una accion y esa accion estara en esta clase
// adicionamos los componentes a la ventana
        this.add(texto);
        this.add(texto2);
        this.add(texto3);
        this.add(caja);
        this.add(boton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String lectura_respuesta = caja.getText();
        int respuesta = Integer.parseInt(lectura_respuesta);
        if(numero < respuesta){
            texto2.setText("Es menor");
        } else if (numero > respuesta){
            texto2.setText("Es mayor");
        } else texto2.setText("HAS ACERTADO!");



    }
    public static void main(String[] args) {
        AdivinaNumero V = new AdivinaNumero(); // creamos una ventana
        V.setVisible(true); // hacemos visible la ventana creada
    }
}
