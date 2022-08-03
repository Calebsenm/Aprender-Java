import javax.swing.*;
import javax.swing.event.*;


public class Tema_18_Swing_JRadioButton extends JFrame implements ChangeListener{

    private JRadioButton Radio_1, Radio_2,Radio_3;
    // grupo de botones XD 
    private ButtonGroup bg;

    public Tema_18_Swing_JRadioButton(){
        setLayout(null);

        bg = new ButtonGroup();
        Radio_1 = new JRadioButton("40 * 80");
        Radio_1.setBounds(10,20,100,30);
        Radio_1.addChangeListener(this);
        add(Radio_1);
        bg.add(Radio_1);

        Radio_2 = new JRadioButton("80 * 60");
        Radio_2.setBounds(10,70,100,30);
        Radio_2.addChangeListener(this);
        add(Radio_2);
        bg.add(Radio_2);

        Radio_3 = new JRadioButton("124 * 78");
        Radio_3.setBounds(10,120,100,30);
        Radio_3.addChangeListener(this);
        add(Radio_3);
        bg.add(Radio_3);

    }
    public void stateChanged(ChangeEvent e){
        if (Radio_1.isSelected()){
            setSize(600 , 400);

        } if (Radio_2.isSelected()){
            setSize(800 , 600);

        } if(Radio_3.isSelected()) {
            setSize(1240, 780);
        }
    }

    public static void main(String[] args) {
        
        Tema_18_Swing_JRadioButton formulario1 = new Tema_18_Swing_JRadioButton();
        formulario1.setBounds(0,0,350,230);
        formulario1.setVisible(true);
        formulario1.setResizable(false);


    }
    
}
