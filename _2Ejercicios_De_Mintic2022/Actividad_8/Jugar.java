import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Position;
import java.awt.event.*;




public class Jugar extends JFrame {

    JButton _3X3;
    JButton _4X4;
    JButton _5X5;
    JButton _6X6;

    JLabel textField;
   


    public Jugar(){
        setLayout(null);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(110,110,500,500);
        this.setResizable(false);
        
        this.setLocationRelativeTo(this);

      
    }
    
    public static void main(String[] args) {
        Jugar ventana = new Jugar();
        
        
    
    }

    

    
}