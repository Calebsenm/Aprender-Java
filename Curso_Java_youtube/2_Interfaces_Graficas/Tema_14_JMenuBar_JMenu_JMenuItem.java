import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Tema_14_JMenuBar_JMenu_JMenuItem extends JFrame implements ActionListener{
    //barra 
    private JMenuBar menuBar_1;
    private JMenu menu_1;
    private JMenuItem menuItem_1, menuItem_2,menuItem_3;

    public Tema_14_JMenuBar_JMenu_JMenuItem(){
        setLayout(null);


        menuBar_1 = new JMenuBar();
        setJMenuBar(menuBar_1);
        
        menu_1 = new JMenu("Opciones");
        menuBar_1.add(menu_1);

        menuItem_1  = new JMenuItem("Rojo");
        menuItem_1.addActionListener(this);
        menu_1.add(menuItem_1);

        menuItem_2  = new JMenuItem("Verde");
        menuItem_2.addActionListener(this);
        menu_1.add(menuItem_2);

        menuItem_3  = new JMenuItem("Verde");
        menuItem_3.addActionListener(this);
        menu_1.add(menuItem_3);
    }

    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();

        if (e.getSource() == menuItem_1 ){
            fondo.setBackground(new Color(255,0,0));

        } if (e.getSource() == menuItem_2 ){
            fondo.setBackground(new Color(0,255,0));

        } if (e.getSource() == menuItem_3){
            fondo.setBackground(new Color(0,0,255));

        }
    }

    public static void main(String[] args) {
        Tema_14_JMenuBar_JMenu_JMenuItem formulario1 = new Tema_14_JMenuBar_JMenu_JMenuItem();

        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
