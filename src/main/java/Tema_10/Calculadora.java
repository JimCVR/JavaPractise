package Tema_10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Calculadora extends JFrame implements ActionListener {
    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bPunto;
    private JButton bAns;
    private JButton bClear;
    private JButton bMulti;
    private JButton bSuma;
    private JButton bResta;
    private JButton bDivi;
    private JButton bResult;
    private JLabel resultado;
    private JTextField operacion;
    private double resultadoAnterior;
    private double num1;
    private double num2;
    private String op;

    public Calculadora(){
        super();
        num1 = 0;
        num2 = 0;
        op = "";
        configurarVentana();
        iniciarComponentes();
    }
    public void configurarVentana(){
        setTitle("Calculadora MK II");
        setSize(540,320);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void iniciarComponentes(){
        b0 = new JButton();
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        bPunto = new JButton();
        bAns = new JButton();
        bClear = new JButton();
        bDivi = new JButton();
        bMulti = new JButton();
        bSuma = new JButton();
        bResta = new JButton();
        bResult = new JButton();
        resultado = new JLabel();
        operacion = new JTextField();

        bPunto.setText(".");
        bPunto.addActionListener(this);
        bPunto.setBounds(150,200,42,25);

        bAns.setText("ans");
        bAns.addActionListener(this);
        bAns.setBounds(234,100,84,25);

        bClear.setText("C");
        bClear.addActionListener(this);
        bClear.setBounds(150,100,84,25);

        b0.setText("0");
        b0.addActionListener(this);
        b0.setBounds(192,200,42,25);

        b1.setText("1");
        b1.addActionListener(this);
        b1.setBounds(150,175,42,25);

        b2.setText("2");
        b2.addActionListener(this);
        b2.setBounds(192,175,42,25);

        b3.setText("3");
        b3.addActionListener(this);
        b3.setBounds(234,175,42,25);

        b4.setText("4");
        b4.addActionListener(this);
        b4.setBounds(150,150,42,25);

        b5.setText("5");
        b5.addActionListener(this);
        b5.setBounds(192,150,42,25);

        b6.setText("6");
        b6.addActionListener(this);
        b6.setBounds(234,150,42,25);

        b7.setText("7");
        b7.addActionListener(this);
        b7.setBounds(150,125,42,25);

        b8.setText("8");
        b8.addActionListener(this);
        b8.setBounds(192,125,42,25);

        b9.setText("9");
        b9.addActionListener(this);
        b9.setBounds(234,125,42,25);

        bSuma.setText("+");
        bSuma.addActionListener(this);
        bSuma.setBounds(276,125,42,25);

        bResta.setText("-");
        bResta.addActionListener(this);
        bResta.setBounds(276,150,42,25);

        bMulti.setText("*");
        bMulti.addActionListener(this);
        bMulti.setBounds(276,175,42,25);

        bDivi.setText("/");
        bDivi.addActionListener(this);
        bDivi.setBounds(276,200,42,25);

        bResult.setText("=");
        bResult.addActionListener(this);
        bResult.setBounds(234,200,42,25);

        operacion.setEditable(false);
        operacion.setBounds(135,50,200,30);

        resultado.setText("=");
        resultado.setBounds(340,50,150,30);

        add(bPunto);
        add(bAns);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bSuma);
        add(bResta);
        add(bMulti);
        add(bDivi);
        add(bResult);
        add(operacion);
        add(resultado);
        add(bClear);
    }


    private double calcular(double n1,double n2,String operacion){
        switch (operacion) {
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
            case "*":
                return n1*n2;
            case "/":
                return n1/n2;
        }
        return 0;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JButton source = (JButton) e.getSource();
        String cuenta = operacion.getText();

        switch(source.getText()){

            case ".":
                cuenta+=".";
                operacion.setText(cuenta);
                break;

            case "C":
                cuenta = "";
                operacion.setText(cuenta);
                break;
            case "ans":
                cuenta += ""+resultadoAnterior;
                operacion.setText(cuenta);
                break;

            case "0":
                cuenta+="0";
                operacion.setText(cuenta);
                break;
            case "1":
                cuenta+="1";
                operacion.setText(cuenta);
                break;
            case "2":
                cuenta+="2";
                operacion.setText(cuenta);
                break;
            case "3":
                cuenta+="3";
                operacion.setText(cuenta);
                break;
            case "4":
                cuenta+="4";
                operacion.setText(cuenta);
                break;
            case "5":
                cuenta+="5";
                operacion.setText(cuenta);
                break;
            case "6":
                cuenta+="6";
                operacion.setText(cuenta);
                break;
            case "7":
                cuenta+="7";
                operacion.setText(cuenta);
                break;
            case "8":
                cuenta+="8";
                operacion.setText(cuenta);
                break;
            case "9":
                cuenta+="9";
                operacion.setText(cuenta);
                break;
            case "+":
                cuenta+="+";
                operacion.setText(cuenta);
                op = "+";
                break;
            case "-":
                cuenta+="-";
                operacion.setText(cuenta);
                op = "-";
                break;
            case "*":
                cuenta+="*";
                operacion.setText(cuenta);
                op = "*";
                break;
            case "/":
                cuenta+="/";
                operacion.setText(cuenta);
                op = "/";
                break;
            case "=":
                String [] aCuenta = cuenta.split("[\\+\\-\\*\\/]");
                num1 = Double.parseDouble(aCuenta[0]);
                num2 = Double.parseDouble(aCuenta[1]);
                operacion.setText("");
                resultadoAnterior = calcular(num1, num2, op);
                resultado.setText("= "+resultadoAnterior);
                break;

        }
    }
    public static void main(String []args){
        Calculadora c = new Calculadora();
        c.setVisible(true);
    }
}
