import javax.swing.*;
import java.awt.event.*;

public class Tema_7_Juego extends JFrame implements ActionListener{
    private JButton Numero1;
    private JButton Numero2;
    private JButton Numero3;
    private JButton Numero4;
    private JButton Numero5;
    private JButton Numero6;
    private JButton Numero7;
    private JButton Numero8;
    private JButton Numero9;

    
    // contructor 
    public Tema_7_Juego(){
        // variables 
        
        int Numeros[] = new int [9];
    
        for(int i = 0; i < Numeros.length; i++ ){
            if (i < 8){
                Numeros[i] = (int) (Math.random()*8+1);
            }
            
        }
        setLayout(null);
        
        Numero1 = new JButton(""+ Numeros[0]);
        Numero1.setBounds(0,0,50,50);
        add(Numero1);
        Numero1.addActionListener(this);

        Numero2 = new JButton(""+ Numeros[1]);
        Numero2.setBounds(50,0,50,50);
        add(Numero2);
        Numero2.addActionListener(this);

        Numero3 = new JButton(""+ Numeros[2]);
        Numero3.setBounds(100,0,50,50);
        add(Numero3);
        Numero3.addActionListener(this);


        Numero4 = new JButton(""+ Numeros[3]);
        Numero4.setBounds(0,50,50,50);
        add(Numero4);
        Numero4.addActionListener(this);

        Numero5 = new JButton(""+ Numeros[4]);
        Numero5.setBounds(50,50,50,50);
        add(Numero5);
        Numero5.addActionListener(this);

        Numero6 = new JButton(""+ Numeros[5]);
        Numero6.setBounds(100,50,50,50);
        add(Numero6);
        Numero6.addActionListener(this);

        Numero7 = new JButton(""+ Numeros[6]);
        Numero7.setBounds(0,100,50,50);
        add(Numero7);
        Numero7.addActionListener(this);

        Numero8 = new JButton(""+ Numeros[7]);
        Numero8.setBounds(50,100,50,50);
        add(Numero8);
        Numero8.addActionListener(this);

        Numero9 = new JButton(""+ Numeros[8]);
        Numero9.setBounds(100,100,50,50);
        add(Numero9);
        Numero9.addActionListener(this);
        
        
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == Numero1 || e.getSource() == Numero2 || e.getSource() == Numero3 || e.getSource() == Numero4 || e.getSource() == Numero5 || e.getSource() == Numero6 || e.getSource() == Numero7 || e.getSource() == Numero8 || e.getSource() == Numero9){
            

        }
    }

    public static void main(String[] args) {
        Tema_7_Juego ventana = new Tema_7_Juego();
        ventana.setBounds(0,0,300,300);
        ventana.setVisible(true);
        ventana.setLocation(null);

        ventana.setResizable(false);
    }
    

}
