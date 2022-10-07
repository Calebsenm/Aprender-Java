import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Painter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import org.w3c.dom.css.RGBColor;

public class main  extends JFrame implements ActionListener{

    JButton boton1;
    JButton boton2;
    JButton boton3;

    public main(){
        setLayout(null);

        this.setResizable(false);
        this.setBounds(0, 0, 510, 510);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        // botones
        boton1 = new JButton(" Jugar ");
        boton1.setBounds(150,100,200,60);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Puntajes");
        boton2.setBounds(150,180,200,60);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Ajustes");
        boton3.setBounds(150,260,200,60);
        add(boton3);
        boton3.addActionListener(this);




    }

    public static void main(String[] args) {

        main ventana = new main();
       
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource() == boton1) {


            super.dispose();
            Snake vista = new Snake();
            
        


        }   else if (e.getSource() == boton2){

            super.dispose();
            V_puntajes puntajes = new V_puntajes();
            puntajes.setVisible(true);



        }   else if(e.getSource() == boton3){

            super.dispose();
            V_ajustes ajustes = new V_ajustes();
            ajustes.setVisible(true);

        }
        
    }
    

    
}
