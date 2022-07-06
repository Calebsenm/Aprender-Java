import javax.swing.*;
import javax.swing.event.*;



public class Tema_16_JCheckBox extends JFrame implements ChangeListener{
    private JCheckBox checkBox_1,checkBox_2,checkBox_3;

    public Tema_16_JCheckBox(){

        setLayout(null);
        checkBox_1 = new JCheckBox("Ingles");
        checkBox_1.setBounds(10,10,150,30);
        checkBox_1.addChangeListener(this);
        add(checkBox_1);

        //-------------------------------------------
        checkBox_2 = new JCheckBox("Frances");
        checkBox_2.setBounds(10,50,150,30);
        checkBox_2.addChangeListener(this);
        add(checkBox_2);

        //-------------------------------------------
        checkBox_3 = new JCheckBox("Alemán");
        checkBox_3.setBounds(10,90,150,30);
        checkBox_3.addChangeListener(this);
        add(checkBox_3);

    }

    public void stateChanged(ChangeEvent e){
        String cad = "";
        if (checkBox_1.isSelected() == true){
            cad += "Ingles-";

        }
        if (checkBox_2.isSelected() == true){
            cad += "Frances-";
        }
        if (checkBox_3.isSelected() == true){
            cad += "Aleman";
        }
        setTitle(cad);
    }
    
    public static void main(String[] args) {
        Tema_16_JCheckBox formulario1 = new Tema_16_JCheckBox();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);

    }
}
