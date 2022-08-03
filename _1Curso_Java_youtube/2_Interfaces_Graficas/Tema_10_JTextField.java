import javax.swing.*;
import java.awt.event.*;

public class Tema_10_JTextField extends JFrame implements ActionListener {

    private JTextField textField_1;
    private JScrollPane scrollPane_1;
    private JTextArea textArea_1;
    private JButton button_1;

    String texto  = "";

    public Tema_10_JTextField(){

        setLayout(null);
        textField_1 = new JTextField();
        textField_1.setBounds(10,10,200,30);
        add(textField_1);

        button_1 = new JButton("Agregar ");
        button_1.setBounds(250,10,100,30);
        add(button_1);
        button_1.addActionListener(this);

        textArea_1 = new JTextArea();
        scrollPane_1 = new JScrollPane(textArea_1);
        scrollPane_1.setBounds(10,50,400,300);
        add(scrollPane_1);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_1){
            texto +=  textField_1.getText() + "\n ";
            textArea_1.setText(texto);
            textField_1.setText("");
        }
    }

    public static void main(String[] args) {
        Tema_10_JTextField formulario_1 = new Tema_10_JTextField();
        formulario_1.setBounds(0,0,450,400);
        formulario_1.setVisible(true);
        formulario_1.setResizable(false);
        formulario_1.setLocationRelativeTo(null);
        
    }

}