package Proyecto_Final;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.event.*;

public class Ventana_1 extends JFrame implements ActionListener,ChangeListener{
  
   
   private JButton boton_1;
   private JButton boton_2;
   private JLabel lavel_1;
   private JLabel label_2;
   private JLabel label_3;

   private JTextArea area_1;
   private JScrollPane eScrollPane_1;
   private JCheckBox checkBox_1;



   public Ventana_1() {
      setLayout(null);
      // para cerrar definitivamente el programa con la x
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Lisencia de Uso ");
      
      setIconImage(new ImageIcon(getClass().getResource("images/coca.png")).getImage());


      boton_1 = new JButton("Aceptar");
      boton_1.setBounds(30,300,100,30);
      boton_1.addActionListener(this);

      // para que no este activo
      boton_1.setEnabled(false);
      add(boton_1);

      boton_2 = new JButton("No Acepto");
      boton_2.setBounds(150,300,100,30);
      boton_2.addActionListener(this);
      add(boton_2);

      //------------------------------------------------------
      lavel_1 = new JLabel("Terminos y condiciones");
      lavel_1.setBounds(215,5,200,30);
      
      lavel_1.setForeground(new Color(0,0,0));
      add(lavel_1);
      //--------------------------------------------------
      Proyecto_Coca_cola variable = new Proyecto_Coca_cola();
      String Texto_2 = variable.Texto;

      label_2 = new JLabel("Yo " + Texto_2 + " Acepto");
      label_2.setBounds(60,260,200,50);
      add(label_2);
      //-------------------------------------------------------
      ImageIcon imagenes_uwu = new ImageIcon(getClass().getResource("images/coca.png"));

      label_3 = new JLabel (imagenes_uwu);
      label_3.setBounds(250,260,150,50);
      add(label_3);
      // ------------------------------------------------------
      checkBox_1 = new JCheckBox();
      checkBox_1.setBounds(30,270,30,30);
      add(checkBox_1);
      checkBox_1.addChangeListener(this);
      //--------------------------------------------
      //----------------------------------------------------
      String  hola = "\n \nUsted debe complir el tartado del comersio de la ley 12.20";
      area_1 = new JTextArea(hola);
      // para que no modifique
      area_1.setEditable(false);
  
      eScrollPane_1 = new JScrollPane(area_1);
      eScrollPane_1.setBounds(20,35,350,200);
      add(eScrollPane_1);
      //----------------------------------------------------
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == boton_1){
         
         Ventana_2 Ventana2 = new Ventana_2();
Ventana2.setBounds(0,0,600,500);
         Ventana2.setLocationRelativeTo(null);
         Ventana2.setResizable(false);
         Ventana2.setVisible(true);
         this.dispose();

       } else if (e.getSource() == boton_2){
             
        Proyecto_Coca_cola Formulario = new Proyecto_Coca_cola();
        Formulario.setBounds(0,0,340,500);
        Formulario.setVisible(true);
        Formulario.setResizable(false);
        Formulario.setLocationRelativeTo(null);

        // El color de fondo de una imagen 
        Formulario.getContentPane().setBackground(Color.RED);

        this.dispose();
        //una alternativa seria //this.setVisible(false);



       
      }
         
   }
   public void stateChanged(ChangeEvent e) {
      if (checkBox_1.isSelected() == true){
         boton_1.setEnabled(true);
         boton_2.setEnabled(false);
      } else{
         boton_1.setEnabled(false);
         boton_2.setEnabled(true);
      }
         
   }

   
   public static void main(String args[]) {
      Ventana_1 formulario_1 = new Ventana_1();
      formulario_1.setBounds(0,0,400,400);
      formulario_1.setVisible(true);
      formulario_1.setLocationRelativeTo(null);
      formulario_1.setResizable(false);
   }

   
   
   
  
}
