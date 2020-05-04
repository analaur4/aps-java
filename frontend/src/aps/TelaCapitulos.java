/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author UnGui
 */
public class TelaCapitulos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCapitulos
     */
    public TelaCapitulos() {
        initComponents();
        //Tela Full Screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraFerramenta = new javax.swing.JPanel();
        icon__shutDown = new javax.swing.JLabel();
        lbl__Desligar = new javax.swing.JLabel();
        jPanel__principal = new javax.swing.JPanel();
        user__profile = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton3__Cap3 = new javax.swing.JRadioButton();
        jRadioButton1__Cap1 = new javax.swing.JRadioButton();
        jRadioButton2____Cap2 = new javax.swing.JRadioButton();
        background__Capitulos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1365, 785));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        barraFerramenta.setBackground(new java.awt.Color(148, 186, 67));
        barraFerramenta.setLayout(null);

        icon__shutDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/icon__desligar_1.png"))); // NOI18N
        barraFerramenta.add(icon__shutDown);
        icon__shutDown.setBounds(110, 15, 38, 38);

        lbl__Desligar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl__Desligar.setForeground(new java.awt.Color(255, 255, 255));
        lbl__Desligar.setText("Desligar");
        barraFerramenta.add(lbl__Desligar);
        lbl__Desligar.setBounds(170, 20, 99, 29);

        getContentPane().add(barraFerramenta);
        barraFerramenta.setBounds(0, 680, 1365, 70);

        jPanel__principal.setBackground(new java.awt.Color(168, 183, 95));
        jPanel__principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(116, 170, 67), 5));
        jPanel__principal.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel__principal.setLayout(null);

        user__profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/user__profile.png"))); // NOI18N
        jPanel__principal.add(user__profile);
        user__profile.setBounds(80, 80, 340, 331);

        jPanel3.setBackground(new java.awt.Color(116, 170, 67));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel__principal.add(jPanel3);
        jPanel3.setBounds(491, 16, 8, 448);

        jRadioButton3__Cap3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jRadioButton3__Cap3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3__Cap3.setText("Capitulo 03");
        jPanel__principal.add(jRadioButton3__Cap3);
        jRadioButton3__Cap3.setBounds(620, 390, 210, 37);

        jRadioButton1__Cap1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jRadioButton1__Cap1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1__Cap1.setText("Capitulo 01");
        jRadioButton1__Cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1__Cap1MouseClicked(evt);
            }
        });
        jPanel__principal.add(jRadioButton1__Cap1);
        jRadioButton1__Cap1.setBounds(620, 50, 200, 37);

        jRadioButton2____Cap2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jRadioButton2____Cap2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2____Cap2.setText("Capitulo 02");
        jPanel__principal.add(jRadioButton2____Cap2);
        jRadioButton2____Cap2.setBounds(620, 210, 200, 37);

        getContentPane().add(jPanel__principal);
        jPanel__principal.setBounds(210, 90, 960, 480);
        getContentPane().add(background__Capitulos);
        background__Capitulos.setBounds(0, 0, 1365, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Aqui serã Eventos que irão ocorrer quando aberto o FormWindow
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Começo BackGround
        ImageIcon background = new ImageIcon("src/aps/image/wallpaper.png");
        background.setImage(background.getImage().getScaledInstance(1365 ,900, 1));
        background__Capitulos.setIcon(background);
        //Fim BackGround
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton1__Cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1__Cap1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaDesktop().setVisible(true);
    }//GEN-LAST:event_jRadioButton1__Cap1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaCapitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCapitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCapitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCapitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCapitulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background__Capitulos;
    private javax.swing.JPanel barraFerramenta;
    private javax.swing.JLabel icon__shutDown;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel__principal;
    private javax.swing.JRadioButton jRadioButton1__Cap1;
    private javax.swing.JRadioButton jRadioButton2____Cap2;
    private javax.swing.JRadioButton jRadioButton3__Cap3;
    private javax.swing.JLabel lbl__Desligar;
    private javax.swing.JLabel user__profile;
    // End of variables declaration//GEN-END:variables
}
