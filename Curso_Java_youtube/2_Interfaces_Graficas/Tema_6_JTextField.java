import javax.swing.*;
import java.awt.event.*;

public class Tema_6_JTextField extends JFrame implements ActionListener{

    private JTextField tesxtfield1;
    private JLabel label1;
    private JButton boton1;

    public Tema_6_JTextField(){
        setLayout(null);
        label1 = new JLabel();
        label1.setBounds(30,10,100,30);
        add(label1);

        tesxtfield1 = new JTextField();
        tesxtfield1.setBounds(30,30,200,30);
        add(tesxtfield1);

        boton1 = new JButton();
        boton1.setBounds(60,60,100,50);
        add(boton1);

        boton1.addActionListener(this);
        
        // JTextField ventana = new JTextField("ingresa algo ");
        
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(tesxtfield1);
    }
    public static void main(String[] args) {
       Tema_6_JTextField ventana = new Tema_6_JTextField();

       ventana.setBounds(0,0,450,300);
       ventana.setVisible(true);
       ventana.setResizable(false);
       ventana.setLocation(null);
    
    }



}
