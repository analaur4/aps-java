package aps;

import static aps.TelaInicial.profileURL;
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        previewProfile = new javax.swing.JLabel();
        btn__salvar = new javax.swing.JLabel();
        btn__cancelar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton01 = new javax.swing.JRadioButton();
        jRadioButton04 = new javax.swing.JRadioButton();
        jRadioButton02 = new javax.swing.JRadioButton();
        jRadioButton05 = new javax.swing.JRadioButton();
        jRadioButton07 = new javax.swing.JRadioButton();
        jRadioButton06 = new javax.swing.JRadioButton();
        jRadioButton08 = new javax.swing.JRadioButton();
        jRadioButton03 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mudar Foto de Perfil");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        previewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/NewIcon__UserNewCinza_1.png"))); // NOI18N
        getContentPane().add(previewProfile);
        previewProfile.setBounds(150, 260, 150, 140);

        btn__salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn__salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn__salvarMouseClicked(evt);
            }
        });
        getContentPane().add(btn__salvar);
        btn__salvar.setBounds(340, 330, 100, 50);

        btn__cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn__cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn__cancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btn__cancelar);
        btn__cancelar.setBounds(10, 330, 100, 50);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWeights = new double[] {0.0, 10.0, 0.0, 10.0};
        jPanel2Layout.rowWeights = new double[] {0.0, 10.0, 0.0, 10.0};
        jPanel2.setLayout(jPanel2Layout);

        buttonGroup1.add(jRadioButton01);
        jRadioButton01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil01.png"))); // NOI18N
        jRadioButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton01ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        jPanel2.add(jRadioButton01, gridBagConstraints);

        buttonGroup1.add(jRadioButton04);
        jRadioButton04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil04.png"))); // NOI18N
        jRadioButton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton04ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jRadioButton04, gridBagConstraints);

        buttonGroup1.add(jRadioButton02);
        jRadioButton02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil02.png"))); // NOI18N
        jRadioButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton02ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jRadioButton02, gridBagConstraints);

        buttonGroup1.add(jRadioButton05);
        jRadioButton05.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil05.png"))); // NOI18N
        jRadioButton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton05ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jRadioButton05, gridBagConstraints);

        buttonGroup1.add(jRadioButton07);
        jRadioButton07.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil07.png"))); // NOI18N
        jRadioButton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton07ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel2.add(jRadioButton07, gridBagConstraints);

        buttonGroup1.add(jRadioButton06);
        jRadioButton06.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil06.png"))); // NOI18N
        jRadioButton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton06ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jRadioButton06, gridBagConstraints);

        buttonGroup1.add(jRadioButton08);
        jRadioButton08.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil10.png"))); // NOI18N
        jRadioButton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton08ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel2.add(jRadioButton08, gridBagConstraints);

        buttonGroup1.add(jRadioButton03);
        jRadioButton03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/users/94x94/perfil03.png"))); // NOI18N
        jRadioButton03.setPreferredSize(new java.awt.Dimension(94, 103));
        jRadioButton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton03ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jRadioButton03, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 430, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/fundoSettingProfile.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 470, 423);

        setBounds(20, 100, 448, 421);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton04ActionPerformed
            ImageIcon ImagePreview = new ImageIcon("src/aps/image/users/147x131/perfil04.png");
            previewProfile.setIcon(ImagePreview);            
    }//GEN-LAST:event_jRadioButton04ActionPerformed

    private void jRadioButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton01ActionPerformed
            ImageIcon ImagePreview = new ImageIcon("src/aps/image/users/147x131/perfil01.png");
            previewProfile.setIcon(ImagePreview);            
    }//GEN-LAST:event_jRadioButton01ActionPerformed

    private void jRadioButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton02ActionPerformed
            ImageIcon ImagePreview = new ImageIcon("src/aps/image/users/147x131/perfil02.png");
            previewProfile.setIcon(ImagePreview);            
    }//GEN-LAST:event_jRadioButton02ActionPerformed

    private void jRadioButton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton03ActionPerformed
            ImageIcon ImagePreview = new ImageIcon("src/aps/image/users/147x131/perfil03.png");
            previewProfile.setIcon(ImagePreview);            
    }//GEN-LAST:event_jRadioButton03ActionPerformed

    private void jRadioButton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton05ActionPerformed
            ImageIcon ImagePreview = new ImageIcon("src/aps/image/users/147x131/perfil05.png");
            previewProfile.setIcon(ImagePreview);            
    }//GEN-LAST:event_jRadioButton05ActionPerformed

    private void jRadioButton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton06ActionPerformed
            ImageIcon ImagePreview = new ImageIcon("src/aps/image/users/147x131/perfil11.png");
            previewProfile.setIcon(ImagePreview); 
    }//GEN-LAST:event_jRadioButton06ActionPerformed

    private void jRadioButton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton07ActionPerformed
            ImageIcon ImagePreview = new ImageIcon("src/aps/image/users/147x131/perfil07.png");
            previewProfile.setIcon(ImagePreview); 
    }//GEN-LAST:event_jRadioButton07ActionPerformed

    private void jRadioButton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton08ActionPerformed
            ImageIcon ImagePreview = new ImageIcon("src/aps/image/users/147x131/perfil10.png");
            previewProfile.setIcon(ImagePreview);            
    }//GEN-LAST:event_jRadioButton08ActionPerformed

    private void btn__cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn__cancelarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn__cancelarMouseClicked

    //Event ao clickar btn Salvar
    private void btn__salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn__salvarMouseClicked
        //Instaciando Classe
        ClassMain dadosUsuario = new ClassMain();
        //Pegando o Caminho do Icon do previewProfile.
        previewProfile.getIcon();
        //Agora estamos mandando o novo Icon para Classe Dados Usuário
        dadosUsuario.setUrl(previewProfile.getIcon().toString());
        System.out.println("Modifiquei");
        profileURL = dadosUsuario.getUrl();
        //Começo Modificando Icon Tela New User
        
        //Instanciando a TelaNewUser
        TelaNewUser telaNewUser = new TelaNewUser();
        //Criando o Objeto Icon, e pegando usando o Método Get na Classe Dados Usuário
        ImageIcon newProfile = new ImageIcon(dadosUsuario.getUrl());
        //Modificando o Icon
        telaNewUser.icon__userNew.setIcon(newProfile);
        System.out.println("IconSettings get = " + dadosUsuario.getUrl());

        //Fim Modificando Icon Tela New User
        
        this.setVisible(false);
    }//GEN-LAST:event_btn__salvarMouseClicked

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
    private javax.swing.JLabel btn__cancelar;
    private javax.swing.JLabel btn__salvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton01;
    private javax.swing.JRadioButton jRadioButton02;
    private javax.swing.JRadioButton jRadioButton03;
    private javax.swing.JRadioButton jRadioButton04;
    private javax.swing.JRadioButton jRadioButton05;
    private javax.swing.JRadioButton jRadioButton06;
    private javax.swing.JRadioButton jRadioButton07;
    private javax.swing.JRadioButton jRadioButton08;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel previewProfile;
    // End of variables declaration//GEN-END:variables
}
