/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Belen
 */
public class Panel4 extends javax.swing.JFrame {

    /**
     * Creates new form Panel4
     */
    public Panel4() {
        JOptionPane.showMessageDialog(null, "CREE PANEL2", "prueba", JOptionPane.INFORMATION_MESSAGE);
        initComponents();
        setTitle("Redes Sociales");
        this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/73537678_2463897243868204_8414604552279425024_n (2).jpg")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSalir = new javax.swing.JButton();
        pikagif = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbwhatsapp = new javax.swing.JButton();
        jbinstagram = new javax.swing.JButton();
        jbfacebook = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbyoutubeJuntadas = new javax.swing.JButton();
        jbRedesSociales = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 90, 30));

        pikagif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/maravillloooooosoooo.gif"))); // NOI18N
        getContentPane().add(pikagif, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, 100));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Whatsapp:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 90, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Instagram:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Facebook:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Youtube:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 90, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Youtube Juntadas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 140, 30));

        jbwhatsapp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbwhatsapp.setText("IR");
        jbwhatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbwhatsappActionPerformed(evt);
            }
        });
        getContentPane().add(jbwhatsapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 30));

        jbinstagram.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbinstagram.setText("IR");
        jbinstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinstagramActionPerformed(evt);
            }
        });
        getContentPane().add(jbinstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, 30));

        jbfacebook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbfacebook.setText("IR");
        jbfacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfacebookActionPerformed(evt);
            }
        });
        getContentPane().add(jbfacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("IR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 30));

        jbyoutubeJuntadas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbyoutubeJuntadas.setText("IR");
        jbyoutubeJuntadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbyoutubeJuntadasActionPerformed(evt);
            }
        });
        getContentPane().add(jbyoutubeJuntadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 50, -1));

        jbRedesSociales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbRedesSociales.setForeground(new java.awt.Color(255, 255, 255));
        jbRedesSociales.setText("Redes Sociales");
        getContentPane().add(jbRedesSociales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/hurl1.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbwhatsappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbwhatsappActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://chat.whatsapp.com/08fMwHhZIJPAsUbHG4c7Ud"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR,no se puede ejecutar el mensaje");
        }
    }//GEN-LAST:event_jbwhatsappActionPerformed

    private void jbinstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinstagramActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://instagram.com/incursioneshurlingham"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR,no se puede ejecutar el mensaje");
        }
    }//GEN-LAST:event_jbinstagramActionPerformed

    private void jbfacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfacebookActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/groups/120983805238041"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR,no se puede ejecutar el mensaje");
        }
    }//GEN-LAST:event_jbfacebookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/channel/UCRoivzovgpVjGtaFUOI-glw"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR,no se puede ejecutar el mensaje");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbyoutubeJuntadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbyoutubeJuntadasActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/channel/UCLeyo8rDyUN-hdl_TdlGZZw"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR,no se puede ejecutar el mensaje");
        }
    }//GEN-LAST:event_jbyoutubeJuntadasActionPerformed

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
            java.util.logging.Logger.getLogger(Panel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jbRedesSociales;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbfacebook;
    private javax.swing.JButton jbinstagram;
    private javax.swing.JButton jbwhatsapp;
    private javax.swing.JButton jbyoutubeJuntadas;
    private javax.swing.JLabel pikagif;
    // End of variables declaration//GEN-END:variables
}
