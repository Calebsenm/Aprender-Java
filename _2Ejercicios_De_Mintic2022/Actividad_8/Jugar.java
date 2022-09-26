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



    static int fichas[][] = new int[3][3];

    public Jugar() {
    }

    public Jugar(int a) {
        setLayout(null);
        this.repaint();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(110, 110, 500, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(this);


        uno = new JButton(String.valueOf(fichas[0][0]));
        uno.setBounds(50,50, 50, 50);
        uno.addActionListener(this);
        add(uno);

        dos = new JButton(String.valueOf(fichas[0][1]));
        dos.setBounds(100, 50, 50, 50);
        dos.addActionListener(this);
        add(dos);

        tres = new JButton(String.valueOf(fichas[0][2]));
        tres.setBounds(150, 50, 50, 50);
        tres.addActionListener(this);
        add(tres);

        cuatro = new JButton(String.valueOf(fichas[1][0]));
        cuatro.setBounds(50, 100, 50, 50);
        cuatro.addActionListener(this);
        add(cuatro);

        cinco = new JButton(String.valueOf(fichas[1][1]));
        cinco.setBounds(100, 100, 50, 50);
        cinco.addActionListener(this);
        add(cinco);

        seis = new JButton(String.valueOf(fichas[1][2]));
        seis.setBounds(150, 100, 50, 50);
        seis.addActionListener(this);
        add(seis);

        siete = new JButton(String.valueOf(fichas[2][0]));
        siete.setBounds(50, 150, 50, 50);
        siete.addActionListener(this);
        add(siete);

        ocho = new JButton(String.valueOf(fichas[2][1]));
        ocho.setBounds(100, 150, 50, 50);
        ocho.addActionListener(this);
        add(ocho);

        nueve = new JButton(String.valueOf(fichas[2][2]));
        nueve.setBounds(150, 150, 50, 50);
        nueve.addActionListener(this);
        nueve.setBackground(new Color(11, 34, 44));
        add(nueve);

    }

    public static void main(String[] args) {

        /* Create and display the form */
        int iterator = 1;

        for (int index = 0; index < fichas.length; index++) {
            for (int i = 0; i < fichas.length; i++) {
                fichas[index][i] = iterator;

                iterator++;
            }
        }

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugar(1).setVisible(true);
            }
        });

        System.err.println();

    }

 

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == uno) {
            int auxiliar1 = getPosicionUno_x();
            int auxiliar2 = getPosicionUno_y();

            setPosicionUno_x(getPosicionNueve_x());
            setPosicionUno_y(getPosicionNueve_y());
            
            setPosicionNueve_x(auxiliar1);
            setPosicionNueve_y(auxiliar2);
        
            uno.setLocation(getPosicionUno_x(), getPosicionUno_y());
            nueve.setLocation(getPosicionNueve_x(),getPosicionNueve_y());

        }

        if (e.getSource() == dos) {
            int auxiliar1 = getPosicionDos_x();
            int auxiliar2 = getPosicionDos_y();
            System.out.println(getPosicionNueve_x());

            setPosicionDos_x(getPosicionNueve_x());
            setPosicionDos_y(getPosicionNueve_y());
            
            setPosicionNueve_x(auxiliar1);
            setPosicionNueve_y(auxiliar2);
        
            System.out.println(getPosicionNueve_x());

            dos.setLocation(getPosicionDos_x(), getPosicionDos_y());
            nueve.setLocation(getPosicionNueve_x(),getPosicionNueve_y());
        }

        if (e.getSource() == tres) {

           
        }
        if (e.getSource() == cuatro) {

        }
        if (e.getSource() == cinco) {
         
        }
        if (e.getSource() == seis) {
      
        }
        if (e.getSource() == siete) {

        }
        if (e.getSource() == ocho) {
  
        }

    }

    public int getPosicionNueve_y() {
        return posicionNueve_y;
    }

    public void setPosicionNueve_y(int Nueva_Posicion) {
        this.posicionNueve_y = Nueva_Posicion;
    }
    public int getPosicionNueve_x() {
        return posicionNueve_y;
    }

    public void setPosicionNueve_x(int Nueva_Posicion) {
        this.posicionNueve_y = Nueva_Posicion;
    }

    public int getPosicionUno_y() {
        return posicionUno_y;
    }

    public void setPosicionUno_y(int Nueva_Posicion) {
        this.posicionUno_y = Nueva_Posicion;
    }

    public int getPosicionUno_x() {
        return posicionUno_x;
    }

    public void setPosicionUno_x(int Nueva_Posicion) {
        this.posicionUno_x = Nueva_Posicion;
    }



    
    public int getPosicionDos_y() {
        return posicionDos_y;
    }

    public void setPosicionDos_y(int Nueva_Posicion) {
        this.posicionDos_y = Nueva_Posicion;
    }

    public int getPosicionDos_x() {
        return posicionDos_x;
    }

    public void setPosicionDos_x(int Nueva_Posicion) {
        this.posicionDos_x = Nueva_Posicion;
    }


}