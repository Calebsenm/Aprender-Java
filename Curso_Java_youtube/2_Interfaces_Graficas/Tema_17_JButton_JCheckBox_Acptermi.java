import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Tema_17_JButton_JCheckBox_Acptermi extends JFrame implements ActionListener,ChangeListener{

    private JLabel label_1;
    private JCheckBox checkBox_1;
    private JButton button_1;

    public Tema_17_JButton_JCheckBox_Acptermi(){
        setLayout(null);

        label_1 = new JLabel("Aceptar terminos y condisciones ");
        label_1.setBounds(10,10,400,30);
        add(label_1);

        checkBox_1 = new JCheckBox("Acepto");
        checkBox_1.setBounds(10, 10, 400, 30);
        checkBox_1.addChangeListener(this);

        add(checkBox_1);

        button_1 = new JButton("Continuar");
        button_1.setBounds(10,100,100,30);
        add(button_1);
        button_1.addActionListener(this);
        button_1.setEnabled(false);

    }

    public void stateChanged(ChangeEvent e){
        if (checkBox_1.isSelected() == true){
            button_1.setEnabled(true);
        } else{
            button_1.setEnabled(false);

        }
    }

    public void actionPerformed(ActionEvent e ){
        if (e.getSource() == button_1 ){
            //cerrar el programa 
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        
        Tema_17_JButton_JCheckBox_Acptermi formulario1 = new Tema_17_JButton_JCheckBox_Acptermi();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
        

    }
}
