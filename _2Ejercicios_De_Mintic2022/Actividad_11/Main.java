import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Main extends JFrame implements ActionListener {

    public JButton SI = new JButton("SI");
    public JButton NO = new JButton("NO");


    public Main() {
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(12, 33, 500, 500);
        setLocationRelativeTo(null);

        JLabel hola = new JLabel("¿ Quieres Dormir ? Unde el boton SI");
        hola.setBounds(22, 33, 203, 33);
        add(hola);

        NO.setBounds(100, 100, 100, 50);

        NO.addActionListener((ActionListener) this);
        add(NO);

        SI.setBounds(200, 100, 100, 50);
        add(SI);



    }

    public static void main(String[] args) {
        Main hola = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == NO) {

            JOptionPane.showMessageDialog(null,"Ves a adormir");
        }
        
    }

    

}