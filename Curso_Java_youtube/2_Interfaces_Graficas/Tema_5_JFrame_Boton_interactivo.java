import javax.swing.*;
import java.awt.event.*;

public class Tema_5_JFrame_Boton_interactivo extends JFrame implements ActionListener {
    private JButton Boton1, Boton2, Boton3;
    private JLabel label1;

    public Tema_5_JFrame_Boton_interactivo() {
        setLayout(null);
        Boton1 = new JButton("1");
        Boton1.setBounds(10, 100, 90, 30);
        add(Boton1);

        Boton1.addActionListener(this);

        Boton2 = new JButton("2");
        Boton2.setBounds(110, 100, 90, 30);
        add(Boton2);

        Boton2.addActionListener(this);

        Boton3 = new JButton("3");
        Boton3.setBounds(210, 100, 90, 30);
        add(Boton3);

        Boton3.addActionListener(this);

        label1 = new JLabel("En espera");
        label1.setBounds(10, 10, 300, 30);
        add(label1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Boton1) {
            label1.setText("Has precionado el boton 1");
        }
        if (e.getSource() == Boton2) {
            label1.setText("Has precionado el boton 2");
        }
        if (e.getSource() == Boton3) {
            label1.setText("Has precionado el boton 3");
        }

    }

    public static void main(String[] args) {
        Tema_5_JFrame_Boton_interactivo formulario1 = new Tema_5_JFrame_Boton_interactivo();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);


    }
}
