/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author UnGui
 */
public class IconSettings extends javax.swing.JFrame {

    /**
     * Creates new form IconSettings
     */
    public IconSettings() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mudar Foto de Perfil");
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/NewIcon__UserNewCinza_1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(145, 270, 150, 140);

        jPanel1.setBackground(new java.awt.Color(116, 170, 67));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 230, 435, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil01.png"))); // NOI18N
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(15, 20, 100, 94);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil02.png"))); // NOI18N
        jRadioButton2.setPreferredSize(new java.awt.Dimension(94, 103));
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(115, 20, 100, 94);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil03.png"))); // NOI18N
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(220, 20, 100, 94);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil04.png"))); // NOI18N
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(320, 20, 100, 94);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil05.png"))); // NOI18N
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(15, 130, 100, 94);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil06.png"))); // NOI18N
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(115, 130, 100, 94);

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil07.png"))); // NOI18N
        getContentPane().add(jRadioButton7);
        jRadioButton7.setBounds(220, 130, 100, 94);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil01.png"))); // NOI18N
        getContentPane().add(jRadioButton9);
        jRadioButton9.setBounds(320, 130, 100, 94);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/btn__salvar.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 320, 120, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/btn__cancelar.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-3, 320, 120, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/Subtração 2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 440, 420);

        setBounds(20, 100, 454, 452);
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
            java.util.logging.Logger.getLogger(IconSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IconSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IconSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IconSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IconSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
