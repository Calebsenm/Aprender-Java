//Este JScrollPane agrega una barrita para moverse 

import javax.swing.*;

public class Tema_9_JScrollPane extends JFrame {
    
    private JTextField textField_1;
    private JTextArea textArea_1;
    private JScrollPane barra_1;



    public Tema_9_JScrollPane(){
        setLayout(null);

        textField_1 = new JTextField();
        textField_1.setBounds(10,10,200,30);
        add(textField_1);

        // se crea junti a el jtex area
        textArea_1 = new JTextArea();
        barra_1 = new JScrollPane(textArea_1);

        barra_1.setBounds(10,50,400,300);
        add(barra_1);

    }
    public static void main(String[] args) {
        Tema_9_JScrollPane formulario_1 = new Tema_9_JScrollPane();
        formulario_1.setBounds(0,0,540,400);
        formulario_1.setVisible(true);
        formulario_1.setResizable(false);
        formulario_1.setLocation(null);

    }



}