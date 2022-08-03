//converstir datos de enteros a string 
import javax.swing.*;
import java.awt.event.*;


public class Tema_11_Parse extends JFrame implements ActionListener{

    private JTextField textField_1;
    private JTextField textField_2;
    

    private JLabel label_1;
    private JLabel label_2;
    private JLabel label_3;

    private JButton button_1;

    public Tema_11_Parse(){
        setLayout(null);
        label_1 = new JLabel("Valor 1:");
        label_1.setBounds(50,5,100,30);
        add(label_1);

        label_2 = new JLabel("Valor 2: ");
        label_2.setBounds(50,35,100,30);
        add(label_2);

        label_3 = new JLabel("Resultado: ");
        label_3.setBounds(120,80,100,30);
        add(label_3);

        textField_1 = new JTextField();
        textField_1.setBounds(120,10,150,20);
        add(textField_1);

        textField_2 = new JTextField();
        textField_2.setBounds(120,40,150,20);
        add(textField_2);

        button_1 = new JButton("Sumar");
        button_1.setBounds(10,80,100,30);
        add(button_1);
        button_1.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_1){
            int valor_1 = 0,valor_2 = 0,resultado = 0;

            //cambiar elvalor Integer.ParseInt
            valor_1 = Integer.parseInt(textField_1.getText());
            valor_2 = Integer.parseInt(textField_2.getText());
            
            resultado = valor_1 + valor_2;
            label_3.setText("El resultado es: " + resultado);
        }
    }
    public static void main(String[] args) {
        Tema_11_Parse  formulario = new Tema_11_Parse();
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }


}