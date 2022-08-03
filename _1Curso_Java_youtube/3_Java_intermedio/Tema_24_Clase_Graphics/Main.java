import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
public class Main extends JFrame{

    public Main(){

        this.setBounds(0,0,600,400);
        this.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Main().setVisible(true);
            }

        });
    }

    public void paint(Graphics g){
        super.paint(g);
    
        g.setColor(Color.CYAN);
        //lineas
        g.drawLine(0,70,100,70);

        //rectangulo
        g.drawRect(150, 100, 100, 50);

        // bordes redondeados
        g.drawRoundRect(200, 200, 100, 50, 10, 10);

        // obalos
        g.drawOval(350, 70, 50, 70);


        // triangulo
        int vectorX [] = {500 ,550, 450};
        int vectory [] = {70, 120, 120};
        g.drawPolygon(vectorX ,vectory,3);

        // rellenos
        g.setColor(Color.GREEN);
        g.fillRect(150, 270, 50,70);
        g.fillRoundRect(250, 270, 50, 70, 6, 6);
        g.fillOval(350, 270, 50, 70);

        int vectorX2 [] = {500 ,550, 450};
        int vectorY3 [] = {270, 320, 320};
        g.fillPolygon(vectorX2 ,vectorY3,3);

    
    
    }
}

