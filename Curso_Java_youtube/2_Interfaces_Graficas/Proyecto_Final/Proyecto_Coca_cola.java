package Proyecto_Final;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class Proyecto_Coca_cola extends JFrame implements ActionListener {
    private JLabel cocacola_1;
    private JLabel cocacola_2;
    private JLabel cocacola_3;
    private JLabel cocacola_4;
    private JButton boton1;
    private JTextField field_1;

    JFrame frame  = new JFrame();
    public static String Texto = "";

   

    public Proyecto_Coca_cola(){
        setLayout(null);
        setTitle("Vienvenido");
        // El color de fondo de una imagen 
        getContentPane().setBackground(Color.RED);
        // para colocar la imagen 

        setIconImage(new ImageIcon(getClass().getResource("images/coca.png")).getImage());


        ImageIcon imagen = new ImageIcon(getClass().getResource("images/coca.png"));
        cocacola_1  = new JLabel(imagen);
        cocacola_1.setBounds(10,20,300,200);
        add(cocacola_1);

        cocacola_2 = new JLabel("Systema de control Vacacional");
        cocacola_2.setFont(new Font ("Andale Mono",3,15));
        cocacola_2.setBounds(40,210,300,40);
        cocacola_2.setForeground(Color.WHITE);
        add(cocacola_2);

        cocacola_3 = new JLabel("ingresa su nombre: ");
        cocacola_3.setBounds(60,230,200,40);
        cocacola_3.setForeground(Color.WHITE);
        add(cocacola_3);

        field_1 = new JTextField();
        field_1.setBounds(60,260,200,40);
        add(field_1);

        cocacola_4 = new JLabel("2022 the cocacola company");
        cocacola_4.setBounds(60,430,400,40);
        cocacola_4.setForeground(Color.WHITE);
        add(cocacola_4);

        boton1 = new JButton("Siguiente");
        boton1.setBounds(80,320,150,40);
        add(boton1);
        boton1.addActionListener(this);


    }


    public void actionPerformed(ActionEvent e){
        int valo = field_1.getText().length();
        
        if (e.getSource() == boton1){
            if (valo > 0){
                
                Texto = field_1.getText();
                
                Ventana_1 formulario_1 = new Ventana_1();
                formulario_1.setBounds(0,0,400,400);
                formulario_1.setVisible(true);
                formulario_1.setLocationRelativeTo(null);
                formulario_1.setResizable(false);
                // esto es para agregar la nueva pestaña
                formulario_1.setVisible(true); 
                this.dispose();

            }else{
                JOptionPane.showMessageDialog(null, "No sea pendejo ");
            }
            
        }
    }
    
    public static void main(String[] args) {

        Proyecto_Coca_cola Formulario = new Proyecto_Coca_cola();
        Formulario.setBounds(0,0,340,500);
        Formulario.setVisible(true);
        Formulario.setResizable(false);
        Formulario.setLocationRelativeTo(null);

        

       
    }
   
  

}
