
package tema_26_1;

import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;



public class RegistroAlumnos extends javax.swing.JFrame {

    public RegistroAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_grupo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Grupo");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el nombre del alumno");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Generar reporte");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(txt_grupo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_status, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins","root","");
            PreparedStatement pst = cn.prepareStatement("insert into alumnos values(?,?,?)");
            pst.setString(1, "0");
            pst.setString(2,txt_nombre.getText().trim());
            pst.setString(3,txt_grupo.getText());
            pst.executeUpdate();
            
            txt_nombre.setText("");
            txt_grupo.setText("");
            
            label_status.setText("Registro Exitoso");
            
            
        }
        catch (Exception e){
            System.out.println("Error NO sabes programar :(" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins","root","");
            PreparedStatement pst = cn.prepareStatement("select * from alumnos where ID = ?");
            pst.setString(1, txt_buscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_nombre.setText(rs.getString("NombreAlumno"));
                txt_grupo.setText(rs.getString("Grupo"));
            }   else{
                JOptionPane.showMessageDialog(null,"Alumno no registrado");
                
            }
            
            label_status.setText("Registro Exitoso");
            
            
        }
        catch (Exception e){
            System.out.println("Error NO sabes programar :(" + e);
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txt_buscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins","root","");
            PreparedStatement pst = cn.prepareStatement("update alumnos set NombreAlumno = ?,Grupo = ? where ID = "+ ID);
            
            pst.setString(1, txt_nombre.getText().trim());
            pst.setString(2, txt_grupo.getText().trim());
            pst.executeUpdate();
            
             
            label_status.setText("Modificacion exitosa");
            // ResultSet rs = pst.executeQuery();
            
            
            
        }
        catch (Exception e){
            System.out.println("Error NO sabes programar :(" + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins","root","");
            PreparedStatement pst = cn.prepareStatement("delete from alumnos where ID = ?");
           
            pst.setString(1, txt_buscar.getText().trim());
      
            pst.executeUpdate();
            
            txt_nombre.setText("");
            txt_grupo.setText("");
            txt_buscar.setText("");
             
            label_status.setText("El registro está eliminado");
            // ResultSet rs = pst.executeQuery();
            
            
            
        }
        catch (Exception e){
            System.out.println("Error NO sabes programar :(" + e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,new FileOutputStream(ruta + "/Desktop/Programacion/Aprender-Java/Curso_Java_youtube/3_Java_intermedio/Tema_26_1/src/tema_26_1/pdf/Reporte.pdf"));
            
            Image header = Image.getInstance("src/img/img.png");
            header.scaleToFit(650,1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.add("Formato creado por caleb XD\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma",18,Font.BOLD,BaseColor.BLUE));
            parrafo.add("Alumnos registrados\n\n");
            
            
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Codigo");
            tabla.addCell("Nombre del alumno");
            tabla.addCell("Grupo");

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins","root","");
                PreparedStatement pst = cn.prepareStatement("select * from alumnos");
            
                ResultSet rs = pst.executeQuery();
                if(rs.next()){

                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));

                    } while(rs.next());
                    documento.add(tabla);
                
                }
            
            } catch (Exception e) {
                System.out.print("Error xd " + e );
            }

            documento.close();
            JOptionPane.showMessageDialog(null,"Reporte creado");

        } catch (Exception e) {
            //TODO: handle exception
            System.out.print("Error xd " + e );
        } 
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
