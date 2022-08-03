
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public static String user = "";
    String pass = "";
    
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
    
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/img.png"));
        return retValue;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel_Logo = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_user = new javax.swing.JTextField();
        jButton_Ingresar = new javax.swing.JButton();
        jLabel_Foother = new javax.swing.JLabel();
        jLavel_Walpaper = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 270, 270));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 210, 30));

        txt_user.setBackground(new java.awt.Color(153, 153, 255));
        txt_user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 210, 30));

        jButton_Ingresar.setText("Ingresar");
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 210, 30));

        jLabel_Foother.setText("Made by Caleb");
        getContentPane().add(jLabel_Foother, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 80, 30));
        getContentPane().add(jLavel_Walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        // TODO add your handling code here:
        user = txt_user.getText().trim();
        pass = txt_password.getText().trim();
        
        if(!user.equals("") || !pass.equals("")){
            try{
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "select tipo_nivel, estatus from usuarios where username = '" + user
                        +"' and password = '" + pass + "'"
                );
                
                ResultSet rs = pst.executeQuery(); 
                if(rs.next()){
                    
                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");
                    
                    if(tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Administrador().setVisible(true);
                        
                    }   else if(tipo_nivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Capturista().setVisible(true);
                        
                    }   else if(tipo_nivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Tecnico().setVisible(true);
                    }
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Datos de acceso incorrectos");
                    txt_user.setText("");
                    txt_password.setText("");
                    
                }
                
            } catch(SQLException e){
                System.out.print("Error al acceder" + e);
                JOptionPane.showMessageDialog(null,"Error al iniciar secion contacte al administrador !!");
            
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Debes llenar todos los campos..");
        }
        
        
        
        
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JLabel jLabel_Foother;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLavel_Walpaper;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
