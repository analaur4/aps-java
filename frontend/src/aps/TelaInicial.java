package aps;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author UnGui
 */

public class TelaInicial extends javax.swing.JFrame {
    //Variavel Global que não queria ter criado
    //Ajustar Futuramente
    public static String profileURL = "src/aps/image/NewIcon__UserNewCinza.png" ;
    public static String nameUser = "";
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        //Tela Full Screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel__cabecalho = new javax.swing.JPanel();
        barraFerramenta = new javax.swing.JPanel();
        EventClicked__ShutDown = new javax.swing.JLabel();
        icon__shutDown = new javax.swing.JLabel();
        lbl__Desligar = new javax.swing.JLabel();
        linha__User = new javax.swing.JPanel();
        icon__User = new javax.swing.JLabel();
        lblDescricao2 = new javax.swing.JLabel();
        lblDescricao1 = new javax.swing.JLabel();
        lblNewUser = new javax.swing.JLabel();
        image__window = new javax.swing.JLabel();
        background__Inicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1365, 785));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        panel__cabecalho.setBackground(new java.awt.Color(148, 186, 67));

        javax.swing.GroupLayout panel__cabecalhoLayout = new javax.swing.GroupLayout(panel__cabecalho);
        panel__cabecalho.setLayout(panel__cabecalhoLayout);
        panel__cabecalhoLayout.setHorizontalGroup(
            panel__cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1365, Short.MAX_VALUE)
        );
        panel__cabecalhoLayout.setVerticalGroup(
            panel__cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(panel__cabecalho);
        panel__cabecalho.setBounds(0, 0, 1365, 70);

        barraFerramenta.setBackground(new java.awt.Color(148, 186, 67));
        barraFerramenta.setLayout(null);

        EventClicked__ShutDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EventClicked__ShutDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventClicked__ShutDownMouseClicked(evt);
            }
        });
        barraFerramenta.add(EventClicked__ShutDown);
        EventClicked__ShutDown.setBounds(100, 10, 190, 50);

        icon__shutDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/icon__desligar_1.png"))); // NOI18N
        barraFerramenta.add(icon__shutDown);
        icon__shutDown.setBounds(110, 20, 46, 38);

        lbl__Desligar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl__Desligar.setForeground(new java.awt.Color(255, 255, 255));
        lbl__Desligar.setText("Desligar");
        barraFerramenta.add(lbl__Desligar);
        lbl__Desligar.setBounds(160, 20, 270, 40);

        getContentPane().add(barraFerramenta);
        barraFerramenta.setBounds(0, 690, 1365, 80);

        linha__User.setBackground(new java.awt.Color(58, 121, 18));

        javax.swing.GroupLayout linha__UserLayout = new javax.swing.GroupLayout(linha__User);
        linha__User.setLayout(linha__UserLayout);
        linha__UserLayout.setHorizontalGroup(
            linha__UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        linha__UserLayout.setVerticalGroup(
            linha__UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        getContentPane().add(linha__User);
        linha__User.setBounds(300, 430, 4, 180);

        icon__User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/icon__userInicial.png"))); // NOI18N
        icon__User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon__User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon__UserMouseClicked(evt);
            }
        });
        getContentPane().add(icon__User);
        icon__User.setBounds(330, 420, 130, 126);

        lblDescricao2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lblDescricao2.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao2.setText("Ou crie um novo");
        getContentPane().add(lblDescricao2);
        lblDescricao2.setBounds(860, 380, 390, 40);

        lblDescricao1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lblDescricao1.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao1.setText("Escolha seu usuário,");
        getContentPane().add(lblDescricao1);
        lblDescricao1.setBounds(710, 340, 410, 40);

        lblNewUser.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lblNewUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNewUser.setText("Novo Usuário");
        getContentPane().add(lblNewUser);
        lblNewUser.setBounds(480, 460, 270, 40);

        image__window.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/plant__logo.png"))); // NOI18N
        getContentPane().add(image__window);
        image__window.setBounds(950, 100, 220, 220);
        getContentPane().add(background__Inicial);
        background__Inicial.setBounds(0, -10, 1365, 785);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Aqui serã Eventos que irão ocorrer quando aberto o FormWindow
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Começo BackGround
        ImageIcon background = new ImageIcon("src/aps/image/background__Inicial.png");
        background.setImage(background.getImage().getScaledInstance(1365 ,900, 1));
        background__Inicial.setIcon(background);
        //Fim BackGround
    }//GEN-LAST:event_formWindowOpened

    //Evento Clicked da Label Icon User // Ação => Fechar tela Atual, transição para proxima tela
    private void icon__UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon__UserMouseClicked
        this.setVisible(false);
        new TelaNewUser().setVisible(true);
    }//GEN-LAST:event_icon__UserMouseClicked

    //Label invisible que irá possibilitar ao clickar o efeito de Exit
    private void EventClicked__ShutDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventClicked__ShutDownMouseClicked
        //Icon Desligar => iconShutDown
        ImageIcon iconShutDown = new ImageIcon("src/aps/image/icon__desligar_1.png");            
            //Perguntando ao usuário se realmente deseja sair do sistema 
            if (JOptionPane.showConfirmDialog(null,"Deseja Desligar ?","Desligamento",JOptionPane.OK_OPTION, JOptionPane.CANCEL_OPTION,iconShutDown) == JOptionPane.OK_OPTION)
                {
                    System.exit(0);
                }          
    }//GEN-LAST:event_EventClicked__ShutDownMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventClicked__ShutDown;
    private javax.swing.JLabel background__Inicial;
    private javax.swing.JPanel barraFerramenta;
    private javax.swing.JLabel icon__User;
    private javax.swing.JLabel icon__shutDown;
    private javax.swing.JLabel image__window;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JLabel lblDescricao2;
    private javax.swing.JLabel lblNewUser;
    private javax.swing.JLabel lbl__Desligar;
    private javax.swing.JPanel linha__User;
    private javax.swing.JPanel panel__cabecalho;
    // End of variables declaration//GEN-END:variables
}
