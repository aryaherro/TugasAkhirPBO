/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Jempol
 */
public class IsiProdi extends javax.swing.JFrame {

    /**
     * Creates new form IsiProdi
     */
    public IsiProdi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNIM = new javax.swing.JTextField();
        jBtnGO = new javax.swing.JButton();
        jBtnProposal = new javax.swing.JRadioButton();
        jBtnTA = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jDate = new javax.swing.JFormattedTextField();
        jSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\DIAGRAM OOP\\GUI\\src\\Image_pckg\\BackLogo.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 0, 60, 50);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("FAKULTAS TEKNIK INFORMATIKA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 440, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("==============================================");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 50, 530, 26);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("NIM MAHASISWA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 110, 180, 30);

        jtxtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNIMActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtNIM);
        jtxtNIM.setBounds(210, 100, 310, 50);

        jBtnGO.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jBtnGO.setText("GO");
        jBtnGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnGOMouseClicked(evt);
            }
        });
        getContentPane().add(jBtnGO);
        jBtnGO.setBounds(440, 160, 80, 29);

        jBtnProposal.setBackground(new java.awt.Color(255, 255, 102));
        jBtnProposal.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jBtnProposal.setText("PROPOSAL TA");
        jBtnProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProposalActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnProposal);
        jBtnProposal.setBounds(30, 200, 120, 27);

        jBtnTA.setBackground(new java.awt.Color(255, 255, 102));
        jBtnTA.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jBtnTA.setText("TA");
        jBtnTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTAActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnTA);
        jBtnTA.setBounds(180, 200, 70, 27);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("MASUKKAN JADWAL SEMINAR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 240, 250, 30);

        jDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d MMM y"))));
        jDate.setText("day / month / year");
        jDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDateActionPerformed(evt);
            }
        });
        getContentPane().add(jDate);
        jDate.setBounds(280, 240, 190, 30);

        jSimpan.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jSimpan.setText("SIMPAN");
        jSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jSimpan);
        jSimpan.setBounds(430, 490, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jempol\\Downloads\\maha.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 542);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        LoginMahasiswa c = new LoginMahasiswa();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jtxtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNIMActionPerformed
        String nim = jtxtNIM.getText();
    }//GEN-LAST:event_jtxtNIMActionPerformed

    private void jBtnGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnGOMouseClicked

    private void jBtnProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProposalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnProposalActionPerformed

    private void jBtnTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnTAActionPerformed

    private void jSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanActionPerformed
        JOptionPane.showMessageDialog(jSimpan, "data telah disimpan");
    }//GEN-LAST:event_jSimpanActionPerformed

    private void jDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateActionPerformed

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
            java.util.logging.Logger.getLogger(IsiProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IsiProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IsiProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IsiProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IsiProdi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGO;
    private javax.swing.JRadioButton jBtnProposal;
    private javax.swing.JRadioButton jBtnTA;
    private javax.swing.JFormattedTextField jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jSimpan;
    private javax.swing.JTextField jtxtNIM;
    // End of variables declaration//GEN-END:variables
}