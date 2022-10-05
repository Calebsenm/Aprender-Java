import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Painter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import org.w3c.dom.css.RGBColor;

public class Logica extends JFrame implements KeyListener {

    String tablero[][] = new String[20][20];

    Random Ram = new Random();
    // int AY = Ram.nextInt(19);
    // int AX = Ram.nextInt(19);

    int Y = 0;
    int X = 0;

    // Verifica el ultimo movimiento
    String Ultimo_Movimiento = "3";

    int AY = Ram.nextInt(19);
    int AX = Ram.nextInt(19);

    public Logica() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                this.tablero[i][j] = " ";
            }
        }
        setLayout(null);

        this.setResizable(false);
        this.setBounds(0, 0, 510, 510);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.addKeyListener(this);

        Jugando();

    }

    public static void main(String[] args) {
        /* Create and display the form */
        Logica a = new Logica();

    }

    public void reinicio() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                this.tablero[i][j] = " ";
            }
        }

    }

    public void Jugando() {

        // this.cuerpo[0] = [1,1];

        ArrayList<Integer> Historial_Y = new ArrayList<Integer>();
        ArrayList<Integer> Historial_X = new ArrayList<Integer>();

        ArrayList<Integer> Cuerpo_Y = new ArrayList<Integer>();
        ArrayList<Integer> Cuerpo_X = new ArrayList<Integer>();

        Historial_Y.add(Y);
        Historial_X.add(X);

        Cuerpo_Y.add(Y);
        Cuerpo_X.add(X);
        Historial_Y.add(Y);
        Historial_X.add(X);

        Cuerpo_Y.add(Y);
        Cuerpo_X.add(X);
        


        // this if for the body and the position of the snake

        while (true) {
            // El solo echo de colocar esto lo cambió todo

            paint(getGraphics());

            if (Ultimo_Movimiento == "1") {
                Y += 1;
            } else if (Ultimo_Movimiento == "2") {
                Y -= 1;

            } else if (Ultimo_Movimiento == "3") {
                X += 1;
            } else if (Ultimo_Movimiento == "4") {
                X -= 1;
            }



            if (tablero[Y][X] == "0") {
                System.out.print("Se Murió");
               System.exit(0);
            }


            if (tablero[Y][X] == "+") {
                AY = Ram.nextInt(19);
                AX = Ram.nextInt(19);

                Cuerpo_Y.add(Y);
                Cuerpo_X.add(X);

                tablero[Y][X] = "0";

            }

            


            this.tablero[Y][X] = "0";
            
            this.tablero[AY][AX] = "+";

            

            System.out.println();

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    System.out.print(tablero[i][j]);
                }
                System.out.println();
            }

            if (Historial_Y.size() + 1 != Cuerpo_Y.size()) {

                Historial_X.remove(0);
                Historial_Y.remove(0);

            } else {

                for (int index = 0; index < Historial_X.size(); index++) {
                    tablero[Historial_Y.get(index)][Historial_X.get(index)] = "0";
                }
            }

            Historial_Y.add(Y);
            Historial_X.add(X);

            tablero[Historial_Y.get(0)][Historial_X.get(0)] = " ";

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                // TODO: handle exception
            }

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            System.out.println("Presionó Enter!" + (char) key);
            Ultimo_Movimiento = "4";

        } else if (key == KeyEvent.VK_UP) {

            System.out.println("Presionó Enter!" + (char) key);

            Ultimo_Movimiento = "2";

        } else if (key == KeyEvent.VK_DOWN) {

            System.out.println("Presionó Enter!" + (char) key);

            Ultimo_Movimiento = "1";

        } else if (key == KeyEvent.VK_RIGHT) {

            System.out.println("Presionó Enter!" + (char) key);

            Ultimo_Movimiento = "3";

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        g.drawRect(60, 40, 400, 400);

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j] == "0") {
                    g.setColor(new Color(255, 0, 0));
                    g.fillRect((j * 20) + 60, (i * 20) + 40, 20, 20);

                }

                else if (tablero[i][j] == "+") {
                    g.setColor(new Color(123, 6, 55));
                    g.fillRect((j * 20) + 60, (i * 20) + 40, 20, 20);
                    g.drawString("Este Juego Fue Creado por caleb ", 100, 470);
                }

            }

        }

    }

}
