import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Position;
import java.awt.event.*;

public class Main extends JFrame  implements ActionListener{

    JButton _3X3;
    JButton _4X4;
    JButton _5X5;
    JButton _6X6;

    JLabel textField;
    public static int tamaño = 3;

    public Main(){
        setLayout(null);

        this.setVisible(true);
        
        this.setBounds(101,110,300,400);
        this.setResizable(false);

        this.setLocationRelativeTo(this);

        _3X3 = new JButton("3 X 3");
        _3X3.setBounds(40,50,200,50);
        _3X3.addActionListener(this);
        add(_3X3);
        
        _4X4 = new JButton("4 X 4");
        _4X4.setBounds(40,100,200,50);
        _4X4.addActionListener(this);
        add(_4X4);


        _5X5 = new JButton("5 X 5");
        _5X5.setBounds(40,150,200,50);
        _5X5.addActionListener(this);
        add(_5X5);

        _6X6 = new JButton("6 X 6");
        _6X6.setBounds(40,200,200,50);
        _6X6.addActionListener(this);
        add(_6X6);

        textField = new JLabel("Creado por Caleb");
        textField.setBounds(90,250,200,50);
        add(textField);
    }
    
    public static void main(String[] args) {
        Main ventana = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == _3X3){
            System.out.println("3x3");
            Jugar juego = new Jugar();
            juego.setVisible(true);
            tamaño = 3;

            dispose();
        }
        else if (e.getSource() == _4X4){
            System.out.println("4x4");
            System.out.println("3x3");
            Jugar juego = new Jugar();
            juego.setVisible(true);
            tamaño = 4;

            dispose();
        }

        else if (e.getSource() == _5X5){
            System.out.println("5x5");
            System.out.println("3x3");
            Jugar juego = new Jugar();
            juego.setVisible(true);
            tamaño = 5;

            dispose();
        }
        if (e.getSource() == _6X6){
            System.out.println("6x6");
            System.out.println("3x3");
            Jugar juego = new Jugar();
            juego.setVisible(true);
            tamaño = 6;
            dispose();
        }

    }

    
}