package Proyecto_Final;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class Proyecto_Coca_cola extends JFrame implements ActionListener {
    private JLabel cocacola_1;
    private JLabel cocacola_2;
    private JLabel cocacola_3;
    private JLabel cocacola_4;
    
    private JButton boton1;

    private JTextField field_1;

    public Proyecto_Coca_cola(){
        setLayout(null);

        
        cocacola_1.setBounds(60,20,100,200);
        add(cocacola_1);

        cocacola_2 = new JLabel("Systema de control Vacacional");
        cocacola_2.setBounds(60,210,200,40);
        cocacola_2.setForeground(Color.WHITE);
        add(cocacola_2);

        cocacola_3 = new JLabel("ingresa su nombre: ");
        cocacola_3.setBounds(60,230,200,40);
        cocacola_3.setForeground(Color.WHITE);
        add(cocacola_3);

        field_1 = new JTextField();
        field_1.setBounds(60,260,200,40);
        add(field_1);

        cocacola_4 = new JLabel("2022 the cocacola company");
        cocacola_4.setBounds(60,430,400,40);
        cocacola_4.setForeground(Color.WHITE);
        add(cocacola_4);

        boton1 = new JButton("Siguiente");
        boton1.setBounds(80,320,150,40);
        add(boton1);
        boton1.addActionListener(this);


        setTitle("Bienvenido");    
        
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == boton1){
            System.out.println("Hello word");
        }
    }
    
    public static void main(String[] args) {

        Proyecto_Coca_cola Formulario = new Proyecto_Coca_cola();
        Formulario.setBounds(0,0,340,500);
        Formulario.setVisible(true);
        Formulario.setResizable(false);
        Formulario.setLocationRelativeTo(null);

        // El color de fondo de una imagen 
        Formulario.getContentPane().setBackground(Color.RED);

       
    }
   
  

}
