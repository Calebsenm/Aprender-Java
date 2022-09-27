import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Position;
import java.awt.event.*;

public class Jugar extends JFrame implements ActionListener {

    JButton uno;
    JButton dos;
    JButton tres;
    JButton cuatro;
    JButton cinco;
    JButton seis;
    JButton siete;
    JButton ocho;
    JButton nueve;


    int posicionUno_x = 50;
    int posicionUno_y = 50;

    int posicionDos_x = 100;
    int posicionDos_y = 50;

    int posicionTres_x = 150;
    int posicionTres_y = 50;

    int posicionCuatro_x = 50;
    int posicionCuatro_y = 100;

    int posicionCinco_x = 100;
    int posicionCinco_y = 100;

    int posicionSeis_x = 150;
    int posicionSeis_y = 100;

    int posicionSiete_x = 50;
    int posicionSiete_y = 150;

    int posicionOcho_x = 100;
    int posicionOcho_y = 150;

    int posicionNueve_x = 150;
    int posicionNueve_y = 150;

   


    String TABLERO[] = new String[9];


    public Jugar() {
    }

    public Jugar(int a) {
        setLayout(null);
        this.repaint();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(110, 110, 500, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(this);

        for (int i = 0; i < TABLERO.length; i++) {
            if(i<8){
                 TABLERO[i] =String.valueOf(i+1);
            }
           
        }
        TABLERO[8] = " ";
        

        uno = new JButton("1");
        uno.setBounds(50,50, 50, 50);
        uno.addActionListener(this);
        add(uno);

        dos = new JButton("2");
        dos.setBounds(100, 50, 50, 50);
        dos.addActionListener(this);
        add(dos);

        tres = new JButton("3");
        tres.setBounds(150, 50, 50, 50);
        tres.addActionListener(this);
        add(tres);

        cuatro = new JButton("4");
        cuatro.setBounds(50, 100, 50, 50);
        cuatro.addActionListener(this);
        add(cuatro);

        cinco = new JButton("5");
        cinco.setBounds(100, 100, 50, 50);
        cinco.addActionListener(this);
        add(cinco);

        seis = new JButton("6");
        seis.setBounds(150, 100, 50, 50);
        seis.addActionListener(this);
        add(seis);

        siete = new JButton("7");
        siete.setBounds(50, 150, 50, 50);
        siete.addActionListener(this);
        add(siete);

        ocho = new JButton("8");
        ocho.setBounds(100, 150, 50, 50);
        ocho.addActionListener(this);
        add(ocho);

        nueve = new JButton(" ");
        nueve.setBounds(150, 150, 50, 50);
        nueve.addActionListener(this);
        nueve.setBackground(new Color(11, 34, 44));
        add(nueve);

       

    }

    public static void main(String[] args) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugar(1).setVisible(true);
            }
        });

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Clase_Verificar veri = new Clase_Verificar(TABLERO);

        if (e.getSource() == uno && veri.isLlave1() )  {
        

            int auX = posicionUno_x;
            int auY = posicionDos_y;

            posicionUno_x = posicionNueve_x;
            posicionUno_y = posicionNueve_y;

            posicionNueve_x  = auX;
            posicionNueve_y  = auY;

            uno.setLocation(posicionNueve_x,posicionNueve_y);
            nueve.setLocation(posicionUno_x,posicionUno_y);

            veri.setLlave1(false);
            veri.setLlave4(false);
        }

        else if (e.getSource() == dos && veri.isLlave2()) {
         

            int auX = posicionDos_x;
            int auY = posicionDos_y;

            posicionDos_x = posicionNueve_x;
            posicionDos_y = posicionNueve_y;

            posicionNueve_x  = auX;
            posicionNueve_y  = auY;

            dos.setLocation(posicionNueve_x,posicionNueve_y);
            nueve.setLocation(posicionDos_x,posicionDos_y);

            veri.setLlave1(false);
            veri.setLlave5(false);
            veri.setLlave2(false);
        }

        else if (e.getSource() == tres && veri.isLlave3()) {

            int auX = posicionTres_x;
            int auY = posicionTres_y;

            posicionTres_x = posicionNueve_x;
            posicionTres_y = posicionNueve_y;

            posicionNueve_x  = auX;
            posicionNueve_y  = auY;

            tres.setLocation(posicionNueve_x,posicionNueve_y);
            nueve.setLocation(posicionTres_x,posicionTres_y);
            
            veri.setLlave2(false);
            veri.setLlave3(false);

        }
        else if (e.getSource() == cuatro && veri.isLlave4()) {

            int auX = posicionCuatro_x;
            int auY = posicionCuatro_y;

            posicionCuatro_x = posicionNueve_x;
            posicionCuatro_y = posicionNueve_y;

            posicionNueve_x  = auX;
            posicionNueve_y  = auY;

            cuatro.setLocation(posicionNueve_x,posicionNueve_y);
            nueve.setLocation(posicionCuatro_x,posicionCuatro_y);

            veri.setLlave3(false);
            veri.setLlave5(false);
            veri.setLlave6(false);

        }
        else if (e.getSource() == cinco && veri.isLlave5()) {
            int auX = posicionCinco_x;
            int auY = posicionCinco_y;

            posicionCinco_x = posicionNueve_x;
            posicionCinco_y = posicionNueve_y;

            posicionNueve_x  = auX;
            posicionNueve_y  = auY;

            cinco.setLocation(posicionNueve_x,posicionNueve_y);
            nueve.setLocation(posicionCinco_x,posicionCinco_y);

            veri.setLlave2(false);
            veri.setLlave4(false);
            veri.setLlave8(false);
            veri.setLlave6(false);

        }
        else if (e.getSource() == seis && veri.isLlave6()) {
      
            int auX = posicionSeis_x;
            int auY = posicionSeis_y;

            posicionSeis_x = posicionNueve_x;
            posicionSeis_y = posicionNueve_y;

            posicionNueve_x  = auX;
            posicionNueve_y  = auY;

            seis.setLocation(posicionNueve_x,posicionNueve_y);
            nueve.setLocation(posicionSeis_x,posicionSeis_y);

            veri.setLlave3(false);
            veri.setLlave5(false);
            veri.setLlave9(false);
        }
        else if (e.getSource() == siete && veri.isLlave7()) {
            int auX = posicionSiete_x;
            int auY = posicionSiete_y;

            posicionSiete_x = posicionNueve_x;
            posicionSiete_y = posicionNueve_y;

            posicionNueve_x  = auX;
            posicionNueve_y  = auY;

            siete.setLocation(posicionNueve_x,posicionNueve_y);
            nueve.setLocation(posicionSiete_x,posicionSiete_y);

            veri.setLlave4(false);
            veri.setLlave8(false);
        }
        else if (e.getSource() == ocho && veri.isLlave8()) {
            int auX = posicionOcho_x;
            int auY = posicionOcho_y;

            posicionOcho_x = posicionNueve_x;
            posicionOcho_y = posicionNueve_y;

            posicionNueve_x  = auX;
            posicionNueve_y  = auY;

            ocho.setLocation(posicionNueve_x,posicionNueve_y);
            nueve.setLocation(posicionOcho_x,posicionOcho_y);

            veri.setLlave4(false);
            veri.setLlave8(false);
        }

    }


}