package aps;

/**
 *
 * @author UnGui
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
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

        barra__Progresso = new javax.swing.JProgressBar();
        panel__SplashScreen = new javax.swing.JPanel();
        lbl__keyValidadaBomJogo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Porcentagem__Carregamento = new javax.swing.JLabel();
        gifCubo__splashScreen = new javax.swing.JLabel();
        logo__splashScreen = new javax.swing.JLabel();
        lbl01__BetaFechado = new javax.swing.JLabel();
        Membros__splashScreen = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        barra__Progresso.setForeground(new java.awt.Color(148, 149, 153));
        getContentPane().add(barra__Progresso);
        barra__Progresso.setBounds(-1, 380, 520, 40);

        panel__SplashScreen.setBackground(new java.awt.Color(35, 31, 32));
        panel__SplashScreen.setLayout(null);

        lbl__keyValidadaBomJogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl__keyValidadaBomJogo.setForeground(new java.awt.Color(255, 255, 255));
        lbl__keyValidadaBomJogo.setText("Key Validada bom Jogo !");
        panel__SplashScreen.add(lbl__keyValidadaBomJogo);
        lbl__keyValidadaBomJogo.setBounds(190, 340, 310, 38);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Validando sua Beta Key");
        panel__SplashScreen.add(jLabel4);
        jLabel4.setBounds(370, 360, 150, 20);

        Porcentagem__Carregamento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Porcentagem__Carregamento.setForeground(new java.awt.Color(255, 255, 255));
        Porcentagem__Carregamento.setText("0");
        panel__SplashScreen.add(Porcentagem__Carregamento);
        Porcentagem__Carregamento.setBounds(50, 340, 90, 38);

        gifCubo__splashScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/loadingSplashScreen.gif"))); // NOI18N
        panel__SplashScreen.add(gifCubo__splashScreen);
        gifCubo__splashScreen.setBounds(160, 0, 400, 380);

        logo__splashScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/newIcon__plantLogo.png"))); // NOI18N
        panel__SplashScreen.add(logo__splashScreen);
        logo__splashScreen.setBounds(50, 50, 73, 53);

        lbl01__BetaFechado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl01__BetaFechado.setForeground(new java.awt.Color(204, 204, 204));
        lbl01__BetaFechado.setText("Em Beta Fechado");
        panel__SplashScreen.add(lbl01__BetaFechado);
        lbl01__BetaFechado.setBounds(10, 0, 90, 30);

        Membros__splashScreen.setEditable(false);
        Membros__splashScreen.setBackground(new java.awt.Color(35, 31, 32));
        Membros__splashScreen.setColumns(20);
        Membros__splashScreen.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        Membros__splashScreen.setForeground(new java.awt.Color(204, 204, 204));
        Membros__splashScreen.setLineWrap(true);
        Membros__splashScreen.setRows(5);
        Membros__splashScreen.setText("Ana Laura\nCarlos Eduardo\nDanilo Silva\nGuilherme Ribeiro\nThiago Silva\nWillians Faria");
        panel__SplashScreen.add(Membros__splashScreen);
        Membros__splashScreen.setBounds(10, 150, 150, 120);

        getContentPane().add(panel__SplashScreen);
        panel__SplashScreen.setBounds(0, 0, 520, 400);

        setSize(new java.awt.Dimension(518, 415));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Membros__splashScreen;
    public javax.swing.JLabel Porcentagem__Carregamento;
    public javax.swing.JProgressBar barra__Progresso;
    private javax.swing.JLabel gifCubo__splashScreen;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl01__BetaFechado;
    public javax.swing.JLabel lbl__keyValidadaBomJogo;
    private javax.swing.JLabel logo__splashScreen;
    private javax.swing.JPanel panel__SplashScreen;
    // End of variables declaration//GEN-END:variables
}
