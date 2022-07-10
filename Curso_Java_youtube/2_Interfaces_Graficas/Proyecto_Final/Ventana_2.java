package Proyecto_Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana_2 extends JFrame implements ActionListener {
    private JLabel label_1;
    private JLabel label_2;
    private JLabel label_3;
    private JLabel label_4;
    private JLabel label_5;
    private JLabel label_6;
    private JLabel label_7;
    private JLabel label_8;
    private JLabel label_9;
    private JLabel label_10;

    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    private JMenuBar menuBar_1;
    
    private JMenu menu_1;
    private JMenu menu_2;
    private JMenuItem menu_3;
    private JMenuItem menu_4;

    private JMenuItem menuItem_1;
    private JMenuItem menuItem_2;
    private JMenuItem menuItem_3;

    private JMenu menu_22;
    private JMenuItem menu_23;
    private JMenu menu_24;
    private JMenuItem menu_25;
    
    private JComboBox comboBox_1;
    private JComboBox comboBox_2;

    private JTextField textField_11;
    
    public Ventana_2(){

        setLayout(null);

        //----------------------------------------------------------
        ImageIcon imagenes_1 = new ImageIcon(getClass().getResource("images/coca.png"));
    

        //----------------------------------------------------------
        //----------------------------------------------------------
        label_1 = new JLabel(imagenes_1);
        label_1.setBounds(10,10,300,60);
        add(label_1);
        //----------------------------------------------------------
        Proyecto_Coca_cola variable = new Proyecto_Coca_cola();
        String Texto_2 = variable.Texto;
        label_2 = new JLabel("Vienvenido " + Texto_2);
        label_2.setBounds(400,10,100,60);
        add(label_2);
        // ---------------------------------------------------------
        label_3 = new JLabel("Datos del trabajador para el calculo de vacaciones");
        label_3.setBounds(150,150,300,60);
        add(label_3);

        //----------------------------------------------------------
        label_4 = new JLabel("Nombre completo");
        label_4.setBounds(10,200,150,30);
        add(label_4);

        textField_1  = new JTextField();
        textField_1.setBounds(10,230,150,30);
        add(textField_1);

        //----------------------------------------------------------
        label_5 = new JLabel("Apellido Paterno");
        label_5.setBounds(10,250,100,30);
        add(label_5);

        textField_2 = new JTextField();
        textField_2.setBounds(10,280,150,30);
        add(textField_2);

        //----------------------------------------------------------
        label_6 = new JLabel("Apellido Materno");
        label_6.setBounds(10,300,100,30);
        add(label_6);

        textField_3 = new JTextField();
        textField_3.setBounds(10,330,150,30);
        add(textField_3);

        //-----------------------------------------------------------
        label_7 = new JLabel("@2022 the cocacola compani todos los derechos reservados ");
        label_7.setBounds(80,400,400,30);
        add(label_7);

        //------------------------------------------------------------

        label_8 = new JLabel("Departamento");
        label_8.setBounds(200,200,100,30);
        add(label_8);

        //----------------------------------------------------------
        label_9 = new JLabel("Selecciona la antinguedad");
        label_9.setBounds(200,250,200,30);
        add(label_9);

        //----------------------------------------------------------
        label_10 = new JLabel("Resultado del calculo ");
        label_10.setBounds(200,300,200,30);
        add(label_10);

        //-----------------------------------------------------------
        //first new label of buttons 

        menuBar_1 = new JMenuBar();
        setJMenuBar(menuBar_1);

        menu_1 = new JMenu("Opciones");
        menuBar_1.add(menu_1);


        //-----------------------------------------------
        menu_22 = new JMenu("Calcular");
        menuBar_1.add(menu_22);
     

        menu_24 = new JMenu("Acerca de");
        menuBar_1.add(menu_24);
        //------------------------------------------------------------
        //-------------------------------------------------------------
        menu_2 = new JMenu("Color de fondo");
        menu_1.add(menu_2);

        menuItem_1 = new JMenuItem("Rojo");
        menuItem_2 = new JMenuItem("Negro");
        menuItem_3 = new JMenuItem("Morado");

        menu_2.add(menuItem_1);
        menu_2.add(menuItem_2);
        menu_2.add(menuItem_3);

        menuItem_1.addActionListener(this);
        menuItem_2.addActionListener(this);
        menuItem_3.addActionListener(this);

        

        
    //----------------------------------------------------------
        menu_3 = new JMenuItem("Nuevo");
        menu_1.add(menu_3);
        menu_3.addActionListener(this);

        menu_4 = new JMenuItem("Salir");
        menu_1.add(menu_4);
        menu_4.addActionListener(this);
    // -----------------------------------------------

        menu_23 = new JMenuItem("Validaciones");
        menu_22.add(menu_23);
        menu_23.addActionListener(this);

    //-----------------------------------
        menu_25 = new JMenuItem("Mensaje del creador");
        menu_24.add(menu_25);
        menu_25.addActionListener(this);

    //--------------------------------------------------------
        comboBox_1 = new JComboBox<>();
        comboBox_1.setBounds(200,230,200,30);
        comboBox_1.addItem("Atencion al cliente");
        comboBox_1.addItem("Departamento de logistica");
        comboBox_1.addItem("Departamento de gerencia");

        

        add(comboBox_1);

        comboBox_2 = new JComboBox<>();
        comboBox_2.setBounds(200,280,200,30);
        comboBox_2.addItem("1 - año de servicio");
        comboBox_2.addItem("2 - 6 años de servicio");
        comboBox_2.addItem("7 - o mas años de servicio");
        
        add(comboBox_2);

        // -----------------------------------------------
        textField_11 = new JTextField ();
        textField_11.setBounds(200,330,200,80);
        add(textField_11);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu_23){

            String Nombre_001 = textField_1.getText();
            String Apellido_P = textField_2.getText();
            String Apellido_M = textField_3.getText();
            
            String Departamento_01 = comboBox_1.getSelectedItem().toString();
            String Antiguedad_01 = comboBox_2.getSelectedItem().toString();

            if (Nombre_001.equals("") || Apellido_P.equals("") || Apellido_M.equals("") || Departamento_01.equals("")|| Antiguedad_01.equals("")){
                JOptionPane.showMessageDialog(null,"Debes llenar todos los campos ");

            }   else{
                    if (Departamento_01.equals("Atencion al cliente")){
                        
                        if(Antiguedad_01.equals("1 - año de servicio")){
                            textField_11.setText("\n\n Eltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n  recibe 6 dias de vacaciones");
                        }
                            if (Antiguedad_01.equals("2 - 6 años de servicio")){
                                textField_11.setText("\n\n Eltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n  recibe 14 dias de vacaciones");
                            } 
                                if (Antiguedad_01.equals("7 - o mas años de servicio")){
                                    textField_11.setText("\n\n Eltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n  recibe 20 dias de vacaciones");
                                }
                    } 

                    if (Departamento_01.equals("Departamento de logistica")){
                        
                        if(Antiguedad_01.equals("1 - año de servicio")){
                            textField_11.setText("\n\n Eltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n  recibe 7 dias de vacaciones");
                        }
                            if (Antiguedad_01.equals("2 - 6 años de servicio")){
                                textField_11.setText("\n\n Eltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n recibe 15 dias de vacaciones");
                            } 
                                if (Antiguedad_01.equals("7 - o mas años de servicio")){
                                    textField_11.setText("\n\n Eltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n  recibe 22 dias de vacaciones");
                                }
                    }

                    if (Departamento_01.equals("Departamento de gerencia")){
                        
                        if(Antiguedad_01.equals("1 - año de servicio")){
                            textField_11.setText("\n\nEltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n  recibe 10 dias de vacaciones");
                        }
                            if (Antiguedad_01.equals("2 - 6 años de servicio")){
                                textField_11.setText("\n\n Eltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n  recibe 20 dias de vacaciones");
                            } 
                                if (Antiguedad_01.equals("7 - o mas años de servicio")){
                                    textField_11.setText("\n\n Eltrabajador " + Nombre_001 + Apellido_P + Apellido_M + "\n\n quien trabaja en " + Departamento_01 + " con " + Antiguedad_01 +"\n\n  recibe 30 dias de vacaciones");
                                }
                    } 

                    

            }
        }

        if (e.getSource() == menuItem_1 ){

            getContentPane().setBackground(new Color(255,0,0));

        }

        if (e.getSource() == menuItem_2 ){
            getContentPane().setBackground(new Color(0,0,0));
        }

        if (e.getSource() == menuItem_3){
            getContentPane().setBackground(new Color(51,0,51));
        }

        if (e.getSource() == menu_3){

            textField_1.setText("");
            textField_2.setText("");
            textField_3.setText("");
            comboBox_1.setSelectedIndex(0);
            comboBox_2.setSelectedIndex(0);
            textField_11.setText("\n  Aqui Aparece el resultado del calculo de las vacaciones. ");
            
        }

        if (e.getSource() == menu_4){
            Proyecto_Coca_cola Formulario = new Proyecto_Coca_cola();
            Formulario.setBounds(0,0,340,500);
            Formulario.setVisible(true);
            Formulario.setResizable(false);
            Formulario.setLocationRelativeTo(null);
            this.dispose();
        }

        if (e.getSource() == menu_25){
            
            JOptionPane.showMessageDialog(null,"Desarrollado por caleb \n " + "El dia 9/07/202  a las 9:43 pm Que Emociion !!");
        }
    }
    


}
