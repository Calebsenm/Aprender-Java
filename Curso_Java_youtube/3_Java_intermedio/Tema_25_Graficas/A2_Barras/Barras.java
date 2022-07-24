package A2_Barras;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

public class Barras<Graphics> extends JFrame implements ActionListener{

    private JLabel lavel1;
    private JLabel lavel2;
    private JTextField field2;
    private JLabel lavel3;
    private JTextField field3;
    private JLabel lavel4;
    private JTextField field4;

    private JButton button1;

    
    
    boolean Bandera = false;
    public Barras(){
        setLayout(null);

        lavel1 = new JLabel("Color favorito");
        lavel1.setBounds(100,10,100,20);
        add(lavel1);

        lavel2 = new JLabel("Rojo");
        lavel2.setBounds(10,300,50,20);
        add(lavel2);


        field2 = new JTextField();
        field2.setBounds(60,300,50,20);
        add(field2);

        lavel3 = new JLabel("Verde");
        lavel3.setBounds(10,320,50,20);
        add(lavel3);

        field3 = new JTextField();
        field3.setBounds(60,320,50,20);
        
        add(field3);


        lavel4 = new JLabel("Azul");
        lavel4.setBounds(10,340,50,20);
        add(lavel4);

        field4 = new JTextField();
        field4.setBounds(60,340,50,20);
        add(field4);
        
         
        button1 = new JButton("Generar");
        button1.setBounds(200,320,100,30);
        add(button1);
        button1.addActionListener(this);

       
    }

    public static void main(String[] args) {
        
        Barras ventana = new Barras();
        ventana.setVisible(true);
        ventana.setBounds(0,0,396,400);
        ventana.setLocationRelativeTo(null);

    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            Bandera = true;
            repaint();
            System.out.println("Loro logaritmico");
        }
        
    }


    public void paint(java.awt.Graphics g){
        super.paint(g);
        if (Bandera == true ){

            String A = field2.getText();
            System.out.println(A);
            int rojo = (int) Double.parseDouble(A);

            String B = field3.getText();
            int verde = (int) Double.parseDouble(B);

            String C = field4.getText();
            int azul = (int) Double.parseDouble(C);
            
        
            int valor_mayor = ValorMayor(rojo, verde,azul);

            int largo_rojo = rojo * 400 / valor_mayor;
            int largo_verde = verde * 400 / valor_mayor;
            int largo_Azul = azul * 400 / valor_mayor;

            g.setColor(new Color(255,0,0));
            g.fillRect(100, 100, largo_rojo, 40 );
            g.drawString("Color Rojo",10,125);

            g.setColor(new Color(0,120,0));
            g.fillRect(100, 150, largo_verde, 40 );
            g.drawString("Color Verde",10,175);
            
            g.setColor(new Color(0,0,255));
            g.fillRect(100, 200, largo_Azul, 40 );
            g.drawString("Color Azul",10,225);
            

        }
    }

    public int ValorMayor(int v_rojo, int v_verde,int v_azul){
        if (v_rojo > v_verde && v_rojo > v_azul ){
            return v_rojo;
        
        }   else if(v_verde > v_azul){
            return v_verde;
        
        }   else{
            return v_azul;

        }
    }

}