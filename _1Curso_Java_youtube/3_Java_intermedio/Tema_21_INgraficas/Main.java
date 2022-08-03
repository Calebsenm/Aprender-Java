
import javax.swing.*;
import java.awt.event.*;


public class Main extends JFrame implements ActionListener{

    private JTextField textField_1;
    private JLabel jLabel_1;
    private JButton boto_1;

    public Main(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        jLabel_1 = new JLabel("Mensaje");
        jLabel_1.setBounds(15,10,100,30);
        add(jLabel_1);

        textField_1 = new JTextField();
        textField_1.setBounds(80,16,190,20);
        add(textField_1);

        boto_1 = new JButton("Mostrar");
        boto_1.setBounds(10,60,100,30);
        add(boto_1);
        boto_1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boto_1){
            String cadena = textField_1.getText();
            JOptionPane.showMessageDialog(null,cadena);
        }
    }

    public static void main(String[] args) {
        Main formulaio = new Main();
        formulaio.setBounds(0,0,300,150);
        formulaio.setVisible(true);
        formulaio.setLocationRelativeTo(null);
    }
        
}