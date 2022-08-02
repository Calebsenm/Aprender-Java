
package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setSize(400,550);
        setResizable(false);
        setTitle("Acceso al sistema");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper = new ImageIcon("src/images/img2.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLavel_Walpaper.getWidth(),
                    jLavel_Walpaper.getHeight(),Image.SCALE_DEFAULT));
        jLavel_Walpaper.setIcon(icono);
        this.repaint();
    
    
        ImageIcon wallpper_Logo = new ImageIcon("src/images/img.png");
        Icon icono_logo = new ImageIcon(wallpper_Logo.getImage().getScaledInstance(jLabel_Logo.getWidth(),
                jLabel_Logo.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Logo = new javax.swing.JLabel();
        jLavel_Walpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 270, 270));
        getContentPane().add(jLavel_Walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 544));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLavel_Walpaper;
    // End of variables declaration//GEN-END:variables
}
