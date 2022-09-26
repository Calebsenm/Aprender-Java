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

    int fichas[][] = new int[3][3];

    public Jugar() {

        int iterator = 1;

        for (int index = 0; index < fichas.length; index++) {
            for (int i = 0; i < fichas.length; i++) {
                fichas[index][i] = iterator;

                iterator++;
            }
        }

        fichas[0][0] = 9;

        setLayout(null);

       
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setBounds(110, 110, 500, 500);
            this.setResizable(false);

            this.setLocationRelativeTo(this);

            uno = new JButton(String.valueOf(fichas[0][0]));
            uno.setBounds(50, 50, 50, 50);
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

            JButton nueve = new JButton(String.valueOf(fichas[2][2]));
            nueve.setBounds(150, 150, 50, 50);
            nueve.addActionListener(this);
            nueve.setBackground(new Color(11, 34, 44));
            add(nueve);
        

    }

    public static void main(String[] args) {
        Jugar ventana = new Jugar();

        System.err.println();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == uno) {

            // derecha
            if (fichas[0][1] == 9) {
                int a = fichas[0][0];
                fichas[0][0] = fichas[0][1];
                fichas[0][1] = a;
            }
            // abajo
            else if (fichas[1][0] == 9) {
                int a = fichas[0][0];
                fichas[0][0] = fichas[1][0];
                fichas[1][0] = a;

            }
        }
        if (e.getSource() == dos) {
            for (int i = 0; i < fichas.length; i++) {
                for (int j = 0; j < fichas.length; j++) {
                    System.out.println(fichas[i][j]);
                }
                System.out.println();
            }


            // derecha
            if (fichas[0][2] == 9) {
                int a = fichas[0][1];
                fichas[0][1] = fichas[0][2];
                fichas[0][2] = a;
            }
            // isquierda
            else if (fichas[0][0] == 9) {
                int a = fichas[0][1];
                fichas[0][1] = fichas[0][0];
                fichas[0][0] = a;
            }
            // abajo
            else if (fichas[1][1] == 9) {

                int a = fichas[0][1];
                fichas[0][1] = fichas[1][1];
                fichas[1][1] = a;
            }
        }

        if (e.getSource() == tres) {

            // isquierda
            if (fichas[0][1] == 9) {
                int B = fichas[0][2];
                fichas[0][2] = fichas[0][1];
                fichas[0][1] = B;

            }
            // abajo¿
            else if (fichas[1][2] == 9) {
                int B = fichas[0][2];
                fichas[0][2] = fichas[1][2];
                fichas[1][2] = B;

            }

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
}