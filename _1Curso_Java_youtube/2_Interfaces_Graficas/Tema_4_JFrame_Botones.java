import javax.swing.*;
import java.awt.event.*;


public class Tema_4_JFrame_Botones extends JFrame implements ActionListener{
    JButton boton1;

    // el diseño 
    public Tema_4_JFrame_Botones(){
        setLayout(null);
        boton1 = new JButton("No me undas jajajaj");
        boton1.setBounds(250,250,150,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        	
        Tema_4_JFrame_Botones formulario = new Tema_4_JFrame_Botones();
        formulario.setBounds(0,0,450,350);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);

    
    }
    

}
