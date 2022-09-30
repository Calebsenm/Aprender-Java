import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener{

    public JButton registro = new JButton("Ingresar ");
    public ArrayList usuarios = new ArrayList();
    public ArrayList passwd = new ArrayList();
    JTextField name = new JTextField();
    JTextField Password2 = new JTextField();

    public Main() {
        setLayout(null);
        this.setResizable(false);
        this.setBounds(0, 0, 400, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        
        JLabel lavel11 = new JLabel("Password");
        lavel11.setBounds(80, 310, 300, 30);
        add(lavel11);

        JPanel hola = new JPanel();
        hola.setBounds(50,80,280,140);
        hola.setBackground(new Color(12,33,33));
        add(hola);

        JLabel lavel1 = new JLabel("Vienvenido al sistema De cuentas");
        lavel1.setBounds(80, 40, 300, 30);
        add(lavel1);

        
        registro.setBounds(130, 400, 100, 30);
        registro.addActionListener((ActionListener) this);
        add(registro);

        JLabel Usuario = new JLabel("INgrese su usuario");
        Usuario.setBounds(80, 240, 200, 30);
        add(Usuario);

        
        name.setBounds(100, 270, 200, 30);
        add(name);

        Password2.setBounds(100, 340, 200, 30);
        add(Password2);

        passwd.add("A");
        usuarios.add("A");

    }

    public static void main(String[] args) {

        Main ventana = new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        if(e.getSource() == registro){
            for (int index = 0; index <usuarios.size(); index++) {
                
                if (usuarios.get(index).equals(name.getText())) {
                    JOptionPane.showMessageDialog(null,"Ingreso Exitoso" );
                }   else{
                    JOptionPane.showMessageDialog(null,"NO sea pendejo el usuario " + name.getText() + "No existe" );
                }
                if (passwd.get(index).equals(name.getText())) {
                    JOptionPane.showMessageDialog(null,"Ingreso Exitoso" );
                }
                else{
                    JOptionPane.showMessageDialog(null,"NO sea pendejo el usuario " + name.getText() + "No existe" );
                }
            }
        }
    }
}