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
   private JTextArea area_1;
   private JScrollPane eScrollPane_1;
   private JCheckBox checkBox_1;



   public Ventana_1() {
      setLayout(null);
      boton_1 = new JButton("Aceptar");
      boton_1.setBounds(30,300,100,30);
      boton_1.addActionListener(this);
      add(boton_1);

      boton_2 = new JButton("No Acepto");
      boton_2.setBounds(150,300,100,30);
      boton_2.addActionListener(this);
      add(boton_2);

      //------------------------------------------------------
      lavel_1 = new JLabel("Terminos y condiciones");
      lavel_1.setBounds(120,10,200,30);
      add(lavel_1);
      //--------------------------------------------------
      Proyecto_Coca_cola variable = new Proyecto_Coca_cola();
      String Texto_2 = variable.Texto;

      label_2 = new JLabel("Yo " + Texto_2 + " Acepto");
      label_2.setBounds(40,250,100,50);
      add(label_2);
      // ------------------------------------------------------
      checkBox_1 = new JCheckBox();
      checkBox_1.setBounds(40,250,100,30);
      add(checkBox_1);
      checkBox_1.addChangeListener(this);
      //----------------------------------------------------
      area_1 = new JTextArea();
      eScrollPane_1 = new JScrollPane(area_1);
      eScrollPane_1.setBounds(20,35,350,200);
      add(eScrollPane_1);
      //----------------------------------------------------
      



   }

    public void actionPerformed(ActionEvent e) {


      if (e.getSource() == boton_1){

         

       } else if (e.getSource() == boton_2){
      
          
        Proyecto_Coca_cola Formulario = new Proyecto_Coca_cola();
        Formulario.setBounds(0,0,340,500);
        Formulario.setVisible(true);
        Formulario.setResizable(false);
        Formulario.setLocationRelativeTo(null);

        // El color de fondo de una imagen 
        Formulario.getContentPane().setBackground(Color.RED);

        this.dispose();

       
        }
         
    }
   
   public static void main(String args[]) {
      Ventana_1 formulario_1 = new Ventana_1();
      formulario_1.setBounds(0,0,400,400);
      formulario_1.setVisible(true);
      formulario_1.setLocationRelativeTo(null);
      formulario_1.setResizable(false);
   }

   @Override
   public void stateChanged(ChangeEvent e) {
      // TODO Auto-generated method stub
      
   }
   
  
}
