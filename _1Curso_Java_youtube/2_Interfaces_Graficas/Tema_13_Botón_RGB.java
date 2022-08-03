import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tema_13_Botón_RGB extends JFrame implements ActionListener {

    private JLabel label_1, label_2, label_3;
    private JComboBox combo_1, combo_2,combo_3;
    private JButton boton_1;
 
    private Tema_13_Botón_RGB(){
        setLayout(null);
        label_1 = new JLabel("Rojo");
        label_1.setBounds(10,10,100,10);
        add(label_1);

        combo_1 = new JComboBox<>();
        combo_1.setBounds(120,10,50,30);
        
        for(int i = 0; i <= 255 ; i++){
            //parseo cambiar el valor
            combo_1.addItem(String.valueOf(i));

        }
        add(combo_1);


        label_2 = new JLabel("Verde");
        label_2.setBounds(10,50,100,10);
        add(label_2);

        combo_2 = new JComboBox<>();
        combo_2.setBounds(120,50,50,30);
        
        for(int i = 0; i <= 255 ; i++){
            combo_2.addItem(String.valueOf(i));
        }
        add(combo_2);


        
        label_3 = new JLabel("Azul");
        label_3.setBounds(10,90,100,10);
        add(label_3);

        combo_3 = new JComboBox<>();
        combo_3.setBounds(120,90,50,30);
        
        for(int i = 0; i <= 255 ; i++){
            combo_3.addItem(String.valueOf(i));
        }
        add(combo_3);


        boton_1 = new JButton("Dame un click");
        boton_1.setBounds(10,130,100,30);
        add(boton_1);
        boton_1.addActionListener(this);


            
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == boton_1){
            // recuperar lo que se selccionó
            String cadena1 = combo_1.getSelectedItem().toString();
            String cadena2 = combo_2.getSelectedItem().toString();
            String cadena3 = combo_3.getSelectedItem().toString();
        

            // para colocar el color 
            int Rojo = Integer.parseInt(cadena1);
            int Verde = Integer.parseInt(cadena2);
            int Azul = Integer.parseInt(cadena3);


            Color color_1 = new Color (Rojo,Verde,Azul) ;
            boton_1.setBackground(color_1);
        }
    
    }

    public static void main(String[] args) {
        Tema_13_Botón_RGB formulario = new Tema_13_Botón_RGB();
        formulario.setBounds(0,0,190,220);
        formulario.setVisible(true);
        formulario.setResizable(false);

        formulario.setLocationRelativeTo(null);


        
    }
}