import javax.swing.*;
import java.awt.event.*;

public class Tema_6_JTextField extends JFrame implements ActionListener{

    private JTextField tesxtfield1;
    private JLabel label1;
    private JButton boton1;

    public Tema_6_JTextField(){
        setLayout(null);
        label1 = new JLabel("Usuario ");
        label1.setBounds(30,9,100,30);
        add(label1);

        tesxtfield1 = new JTextField();
        tesxtfield1.setBounds(30,30,200,30);
        add(tesxtfield1);
        

        boton1 = new JButton("Dame click");
        boton1.setBounds(30,60,200,30);
        add(boton1);

        boton1.addActionListener(this);
        
        // JTextField ventana = new JTextField("ingresa algo ");
        
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){

            // para recuperar el texto 
            String Texto = tesxtfield1.getText();
            this.setTitle(Texto); 

        }
        
    }
    public static void main(String[] args) {
        Tema_6_JTextField ventana = new Tema_6_JTextField();

        ventana.setBounds(0,0,450,300);
        ventana.setVisible(true);
       
        ventana.setLocation(null);
        ventana.setResizable(false);
    }



}
