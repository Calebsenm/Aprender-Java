//(Swing - JComboBox)
//ItemListener 

import javax.swing.*;
import java.awt.event.*;

public class Tema_12_JcomBoBox extends JFrame implements ItemListener {
    private JComboBox comboBo_1;

    public Tema_12_JcomBoBox() {
        setLayout(null);
        comboBo_1 = new JComboBox();
        comboBo_1.setBounds(10, 10, 80, 20);
        add(comboBo_1);

        comboBo_1.addItem("Rojo");
        comboBo_1.addItem("Verde");
        comboBo_1.addItem("Amarillo");
        comboBo_1.addItem("Azul");
        comboBo_1.addItem("Negro");

        comboBo_1.addItemListener(this);
    }

    
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == comboBo_1) {
            String seleccion = comboBo_1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }
    
    public static void main(String[] args) {
        Tema_12_JcomBoBox formulario = new Tema_12_JcomBoBox();
        formulario.setBounds(0, 0, 300, 150);
        formulario.setResizable(false);
        formulario.setVisible(true);
        formulario.setLocation(null);

    }

    
}
