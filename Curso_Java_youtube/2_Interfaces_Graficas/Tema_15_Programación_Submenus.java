import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tema_15_Programación_Submenus extends JFrame implements ActionListener {
    // la barra
    private JMenuBar menuBar__1;
    // opciones
    private JMenu menu__1, menu_2, menu_3;
    private JMenuItem menuItem_1, menuItem_2, menuItem_3, menuItem_4;

    public Tema_15_Programación_Submenus() {

        setLayout(null);
        menuBar__1 = new JMenuBar();
        setJMenuBar(menuBar__1);

        menu__1 = new JMenu("Opciones ");
        menuBar__1.add(menu__1);

        menu_2 = new JMenu("Tamaño de la ventana");
        menu__1.add(menu_2);

        menu_3 = new JMenu("Color de fondo ");
        menu__1.add(menu_3);

        menuItem_1 = new JMenuItem("300*200");
        menu_2.add(menuItem_1);
        menuItem_1.addActionListener(this);

        menuItem_2 = new JMenuItem("640*480");
        menu_2.add(menuItem_2);
        menuItem_2.addActionListener(this);

        // -------------------------------------
        menuItem_3 = new JMenuItem("Rojo");
        menu_3.add(menuItem_3);
        menuItem_3.addActionListener(this);

        menuItem_4 = new JMenuItem("Azul");
        menu_3.add(menuItem_4);
        menuItem_4.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();
       
        if (e.getSource() == menuItem_1) {
            setSize(300, 200);

        }
        if (e.getSource() == menuItem_2) {
            setSize(640, 480);

        }
        if (e.getSource() == menuItem_3) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == menuItem_4) {
            getContentPane().setBackground(new Color(0,0,255));
        }

    }

    public static void main(String args[]){

        Tema_15_Programación_Submenus formulario1 = new Tema_15_Programación_Submenus();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

}
