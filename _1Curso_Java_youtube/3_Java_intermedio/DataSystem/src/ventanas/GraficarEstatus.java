/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Ernesto
 */
public class GraficarEstatus extends javax.swing.JFrame {

    String user;
    int NuevoIngreso, NoReparado, EnRevision, Reparado, Entregado;

    String[] vector_estatus_nombre = new String[5];
    int[] vector_estatus_cantidad = new int[5];

    /**
     * Creates new form GraficarEstatus
     */
    public GraficarEstatus() {
        initComponents();

        user = Login.user;

        setSize(550, 450);
        setResizable(false);
        setTitle("Técnico - Sesión de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        
        try{
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    
            "select status, count(status) as Cantidad from equipos group by status");
            ResultSet rs = pst.executeQuery();
            
            
            if(rs.next()){
                int posicion = 0;
                do{
                    vector_estatus_nombre[posicion] =  rs.getString(1);
                    vector_estatus_cantidad[posicion] =  rs.getInt(2);
                    
                    
                    if(vector_estatus_nombre[posicion].equalsIgnoreCase("En revision")){
                        EnRevision = vector_estatus_cantidad[posicion];
                    }
                    
                    else if(vector_estatus_nombre[posicion].equalsIgnoreCase("Entrgado")){
                        Entregado = vector_estatus_cantidad[posicion];
                    }
                    else if(vector_estatus_nombre[posicion].equalsIgnoreCase("No reparado")){
                        NoReparado = vector_estatus_cantidad[posicion];
                    }
                    
                    else if(vector_estatus_nombre[posicion].equalsIgnoreCase("Nuevo ingreso")){
                        NuevoIngreso = vector_estatus_cantidad[posicion];
                    }
                    
                    else if(vector_estatus_nombre[posicion].equalsIgnoreCase("Reparado")){
                        Reparado = vector_estatus_cantidad[posicion];
                    }
                    
                    posicion++;
                    
                    
                } while(rs.next());
                
            }  
            
        }   catch(Exception e){
            System.err.println("Error en cargar usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar!!, ");
        }
        repaint();
        
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gráfica de estatus");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel_footer.setText("Creado por La Geekipedia de Ernesto ®");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarEstatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    // End of variables declaration//GEN-END:variables

    public int EstatusMasRepetido(int NuevoIngreso, int NoReparado,int EnRevision,int Reparado,int Entrgado){

        if(NuevoIngreso > NoReparado && NuevoIngreso > EnRevision && NuevoIngreso > Reparado && NuevoIngreso > Entregado){
            return NuevoIngreso;
            
        }   else if(NoReparado > EnRevision && NoReparado > Reparado && NoReparado > Entregado){
            return Reparado;
            
        }   else if(EnRevision > Reparado && EnRevision  > Entregado){
            return EnRevision;
        
        }   else if(Reparado > Entregado){
            return Reparado;
        
        }   else{
            return EnRevision;
        }   
            
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int Estatus_Mas_Repetido = EstatusMasRepetido(NuevoIngreso,NoReparado,EnRevision,Reparado,Entregado);
    
        int largo_NuevoIngreso = NuevoIngreso * 400/ Estatus_Mas_Repetido;
        int largo_NoReparado = NoReparado * 400 / Estatus_Mas_Repetido;
        int largo_EnRevision = EnRevision * 400 / Estatus_Mas_Repetido;
        int largo_Reparado = Reparado * 400 / Estatus_Mas_Repetido;
        int largo_Entregado = Entregado * 400 / Estatus_Mas_Repetido;
        
        g.setColor(new Color(240,248,0));//yellow
        g.fillRect(100,100,largo_NuevoIngreso,40);
        g.drawString("Nuevo ingreso ",10 ,118);
        g.drawString("Cantidad: " + NuevoIngreso,10,133);
        
        g.setColor(new Color(255,0,0));//red
        g.fillRect(100,150,largo_NoReparado,40);
        g.drawString("No Reparado",10 ,168);
        g.drawString("Cantidad: " + NoReparado,10,183);
        
        g.setColor(new Color(0,0,0));//black
        g.fillRect(100,200,largo_EnRevision,40);
        g.drawString("En Revision",10 ,218);
        g.drawString("Cantidad: " + EnRevision,10,233);
        
        g.setColor(new Color(255,255,255));//white
        g.fillRect(100,250,largo_Reparado,40);
        g.drawString("Reparado",10 ,268);
        g.drawString("Cantidad: " + Reparado ,10,283);
        
        
        g.setColor(new Color(0,85,0));//green
        g.fillRect(100,300,largo_Entregado,40);
        g.drawString("Entregado",10 ,318);
        g.drawString("Cantidad: " + Entregado ,10,333);
    }  
}
