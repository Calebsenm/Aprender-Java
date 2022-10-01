import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class Vista_Autos extends JFrame implements ActionListener {
    
    JLabel Titutlo1;
    JLabel Titutlo2;
    JLabel Titutlo3;
    JLabel Titutlo4;
    JLabel Titutlo5;
    
    JButton Button1;
    JTextField tField1;
    JTextField tField2;

    JRadioButton radioButton1;



    public Vista_Autos(){

        setLayout(null);
        setVisible(true);
        setBounds(3,3,800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
       
        Titutlo1 = new JLabel("Registrar Auto");
        Titutlo1.setBounds(160,80,100,50);
        add(Titutlo1);


        Titutlo2 = new JLabel("Dias desde el ultimo mantenimiento");
        Titutlo2.setBounds(120,200,220,50);
        add(Titutlo2);

        Titutlo3 = new JLabel("Placa");
        Titutlo3.setBounds(120,150,100,50);
        add(Titutlo3);
        
        Titutlo4 = new JLabel("Tiene seguro");
        Titutlo4.setBounds(120,320,100,50);
        add(Titutlo4);
    
        Button1 = new JButton("Boton Crear Instancia");
        Button1.setBounds(120,380,200,60);
        add(Button1);
        Button1.addActionListener(this);

        tField1 = new JTextField("");
        tField1.setBounds(220,150,200,50);
        add(tField1);

        
    }


    public static void main(String[] arg){

        Vista_Autos vista = new Vista_Autos();
    }

    
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.BLACK);

        g.drawRect(80, 100, 300, 400);
        g.drawRect(420, 100, 300, 400);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}