package Inorar_XD;

// import java.awt.Color;
// import java.awt.Graphics;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.Painter;
// import java.util.Random;
// import java.awt.EventQueue;
// import java.awt.event.*;
// import javax.swing.*;
// import org.w3c.dom.css.RGBColor;

// public class Ventana_Principal extends JFrame implements KeyListener {

//     // tablero
//     Logica tablero = new Logica();
//     // la clase instanciadora de los colores
//     Color1 ListaColor = new Color1();
//     private int colores[] = ListaColor.getColrin();

//     private JButton bAceptar;
//     // cordenadas de la cabeza
    
   
//     String Ultimo_movimiento = "D";

//     String tablero1[][] = tablero.getTablero();
    
//     // los cuadritos de jpanel
//     // private JPanel panel1;

    
//     public Ventana_Principal() {

//         setLayout(null);;
//         this.setResizable(false);
//         this.setBounds(0, 0, 510, 510);
//         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//         this.setLocationRelativeTo(null);
//         this.setVisible(true);
//         this.addKeyListener(this);
       
//         tablero.Jugando();
        

//     }

//     //

//     @Override
//     public void paint(Graphics g) {
//         super.paint(g);
//         g.drawRect(60, 40, 400, 400);
        

//         // while (true) {

//         //     KeyListener teclas = new KeyListener() {

//         //         @Override
//         //         public void keyTyped(KeyEvent e) {
//         //             // TODO Auto-generated method stub

//         //         }

//         //         @Override
//         //         public void keyPressed(KeyEvent e) {

//         //         }

//         //         @Override
//         //         public void keyReleased(KeyEvent e) {
//         //             // TODO Auto-generated method stub

//         //         }
//         //     };
//         //     addKeyListener(teclas);

//         //     for (int i = 0; i < tablero1.length; i++) {
//         //         for (int j = 0; j < tablero1.length; j++) {

//         //             if (tablero1[i][j] == "0") {

//         //                 g.setColor(new Color(colores[0], colores[1], colores[2]));
//         //                 g.fillRect((j * 20) + 60, (i * 20) + 40, 20, 20);

//         //             }

//         //             if (tablero1[i][j] == "+") {
//         //                 g.setColor(new Color(255, 0, 0));
//         //                 g.fillRect((j * 20) + 60, (i * 20) + 40, 20, 20);
//         //             }

//         //         }
//         //     }

//         //     System.out.println();
//         //     // for (int i = 0; i < tablero1.length; i++) {
//         //     // for (int j = 0; j < tablero1.length; j++) {
//         //     // System.out.print(tablero1[i][j]);
//         //     // }
//         //     // System.out.println();
//         //     // }

//         //     try {
//         //         Thread.sleep(1000);
//         //     } catch (Exception e) {
//         //         // TODO: handle exception
//         //     }

//         // }

//     }

//     @Override
//     public void keyPressed(KeyEvent e) {
//         // TODO Auto-generated method stub
//         int key = e.getKeyCode();

//         if (key == KeyEvent.VK_A) {

//             System.out.println("Presionó Enter!" + (char) key);
//         }
//         if (key == KeyEvent.VK_W) {

//             System.out.println("Presionó Enter!" + (char) key);
//         }
//         if (key == KeyEvent.VK_S) {

//             System.out.println("Presionó Enter!" + (char) key);
//         }
//         if (key == KeyEvent.VK_D) {

//             System.out.println("Presionó Enter!" + (char) key);
//         }

//     }

//     @Override
//     public void keyReleased(KeyEvent e) {
//     }

//     @Override
//     public void keyTyped(KeyEvent e) {

//     }

// }
