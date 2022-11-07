package ProyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelInicio extends JPanel implements ActionListener {

    private JButton iniciar;
    private JLabel labelId;
    private JLabel labelPass;
    private JTextField cajaId;
    private JTextField cajaPass;
    private JLabel mensajeInicio;
    private JLabel mensajeError;
    private Object[] possibleValues = { "Pez", "Pescador"};

    public PanelInicio(){
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        configPanels();
        configButtons();
        configTextField();
        configLabels();

    }



    private void configPanels(){
        setLayout(null);
        setBackground(Color.cyan.darker());
    }
    private void configButtons(){
        iniciar = new JButton();
        iniciar.setText("Iniciar Sesion");
        iniciar.setFont(new Font("source serif pro", Font.PLAIN,16));
        iniciar.setBounds(300,350,150,50);
        iniciar.addActionListener(this);
        add(iniciar);

    }
    private void configLabels(){
        mensajeInicio = new JLabel();
        mensajeError = new JLabel();
        labelId = new JLabel();
        labelPass = new JLabel();

        mensajeInicio.setText("Fisherman's Horizon");
        mensajeInicio.setBounds(250,1,500,100);
        mensajeInicio.setFont(new Font("source serif pro", Font.PLAIN,30));

        mensajeError.setText("*Error: Usuario o Constraseña incorrectos*");
        mensajeError.setBounds(200,400,500,100);
        mensajeError.setFont(new Font("Arial", Font.PLAIN,18));
        mensajeError.setForeground(Color.RED);
        mensajeError.setVisible(false);
        mensajeError.setFont(new Font("source serif pro", Font.PLAIN,24));

        labelId.setText("Usuario");
        labelId.setBounds(300,100,500,100);
        labelId.setFont(new Font("Arial", Font.PLAIN,18));
        labelId.setFont(new Font("source serif pro", Font.PLAIN,24));

        labelPass.setText("Contraseña");
        labelPass.setBounds(300,200,500,100);
        labelPass.setFont(new Font("Arial", Font.PLAIN,18));
        labelPass.setFont(new Font("source serif pro", Font.PLAIN,24));

        add(mensajeInicio);
        add(mensajeError);
        add(labelId);
        add(labelPass);

    }

    private void configTextField(){
        cajaId = new JTextField();
        cajaPass = new JPasswordField();

        cajaId.setBounds(275,175,200,30);
        cajaId.setFont(new Font("source serif pro", Font.PLAIN,18));
        cajaPass.setBounds(275,275,200,30);

        add(cajaId);
        add(cajaPass);

    }

    public JButton getIniciar() {
        return iniciar;
    }

   @Override
    public void actionPerformed(ActionEvent e){
       JComponent comp = (JComponent) e.getSource();
       Window win = SwingUtilities.getWindowAncestor(comp);
       try{
           if(OracleEnlace.USER.equals(cajaId.getText()) && OracleEnlace.PASS.equals(cajaPass.getText())  ) {
               mensajeError.setVisible(false);
               String  selectedValue =(String) JOptionPane.showInputDialog(null,"Elige tabla", "Fisherman's Horizon",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
               switch (selectedValue){
                   case "Pez":
                       win.dispose();
                       setVisible(false);
                       VentanaPez pez = new VentanaPez();
                       pez.setVisible(true);
                       break;
                   case "Pescador":
                       win.dispose();
                       setVisible(false);
                       VentanaPescador pesc = new VentanaPescador();
                       pesc.setVisible(true);
                       break;
                   default:

                       break;
               }
           }else {
               mensajeError.setVisible(true);
               throw new NullPointerException();
           }
       }catch(NullPointerException n){

       }
    }
}
