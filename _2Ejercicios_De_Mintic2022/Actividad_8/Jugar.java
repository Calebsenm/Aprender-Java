import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Position;
import java.awt.event.*;




public class Jugar extends JFrame implements ActionListener{

   JButton uno;
   JButton dos;
   JButton tres;
   JButton cuatro;
   JButton cinco;
   JButton seis;
   JButton siete;
   JButton ocho;



    public Jugar(){
        setLayout(null);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(110,110,500,500);
        this.setResizable(false);
        
        this.setLocationRelativeTo(this);



        uno = new JButton("1");
        uno.setBounds(50,50,50,50);
        uno.addActionListener(this);
        add(uno);

        dos = new JButton("2");
        dos.setBounds(100,50,50,50);
        dos.addActionListener(this);
        add(dos);

        tres = new JButton("3");
        tres.setBounds(150,50,50,50);
        tres.addActionListener(this);
        add(tres);
        

        cuatro = new JButton("4");
        cuatro.setBounds(50,100,50,50);
        cuatro.addActionListener(this);
        add(cuatro);

        cinco = new JButton("5");
        cinco.setBounds(100,100,50,50);
        cinco.addActionListener(this);
        add(cinco);

        seis = new JButton("6");
        seis.setBounds(150,100,50,50);
        seis.addActionListener(this);
        add(seis);


        siete = new JButton("7");
        siete.setBounds(50,150,50,50);
        siete.addActionListener(this);
        add(siete);

        ocho = new JButton("8");
        ocho.setBounds(100,150,50,50);
        ocho.addActionListener(this);
        add(ocho);

        JButton nueve = new JButton();
        nueve.setBounds(150,150,50,50);
        nueve.addActionListener(this);
        nueve.setBackground(new Color(11,34,44));
        add(nueve);
    }
    
    public static void main(String[] args) {
        Jugar ventana = new Jugar();

        System.err.println();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    

    
}