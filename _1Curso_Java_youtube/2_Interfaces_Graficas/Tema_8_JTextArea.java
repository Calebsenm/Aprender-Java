import javax.swing.*;

public class Tema_8_JTextArea extends JFrame {
    
    private JTextField textField_1;
    // this is for the text area 
    private JTextArea textArea_1;

    public Tema_8_JTextArea(){
        setLayout(null);

        textField_1 = new JTextField();
        textField_1.setBounds(10,10,200,30);
        add(textField_1);

        textArea_1 = new JTextArea();
        textArea_1.setBounds(10,50,400,500);
        add(textArea_1);


    }
    public static void main(String[] args) {
        Tema_8_JTextArea formulario_1 = new Tema_8_JTextArea();
        formulario_1.setBounds(0,0,540,400);
        formulario_1.setVisible(true);
        formulario_1.setResizable(false);
        formulario_1.setLocation(null);

    }



}
