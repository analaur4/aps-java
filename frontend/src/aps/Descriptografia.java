package aps;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UnGui
 */
public class Descriptografia extends javax.swing.JFrame {

    /**
     * Creates new form Descriptografia
     */
    public static boolean acerto = false;
    public static int ordemPuzzle = 0; //0 = primeira ordem de questões
    int fracassou = 0; //Variavel criada para caso o usuário errer 3 vezes .
    TelaPuzzle janelinhaTeste = new TelaPuzzle();
    TelaGameOver gameOver = new TelaGameOver();
    
    int seconds = 0;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            seconds ++;
            if(seconds >= 100){
                seconds = 100;
                timer.cancel();
                closeWindow();
            }
            jProgressBar1.setValue(seconds);
            if(seconds == 22){
                int testeFracasso = 0; //0 = false
                janelinhaTeste.setVisible(true);
                do {
                    seconds = 22;
                    for(int i=6;i >= 0;i--){ 
                        janelinhaTeste.jLabel1.setText(i + " segundos restantes");
                        try {                            
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Descriptografia.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                        if (janelinhaTeste.isVisible() == false){
                            break;
                        }else if (i == 0){
                            testeFracasso = 1; //1 = true ;
                            janelinhaTeste.setVisible(false);                                
                            break;
                        }
                    }
                    if (testeFracasso == 1){
                        break;
                    }       
                }while(janelinhaTeste.isVisible());
                if(acerto == true) {
                    ordemPuzzle += 1;
                    int cont = seconds - 22;
                    seconds -= cont ;
                    jProgressBar1.setValue(seconds);  
                }
                if (acerto == false || testeFracasso == 1) {//Usuário Errou
                    seconds -= 24; //Para fica visivel ao usuário a perca de 30
                    jProgressBar1.setValue(-24);
                    jProgressBar1.setValue(seconds);
                    jProgressBar1.setValue(-14);
                    fracassou += 1;
                    ordemPuzzle += 1;
                }
            } else if(seconds == 62){
                 int testeFracasso = 0; //0 = false
                janelinhaTeste.setVisible(true);
                do {
                    seconds = 62;
                    for(int i=6;i >= 0;i--){
                        janelinhaTeste.jLabel1.setText(i + " segundos restantes");
                        try {                            
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Descriptografia.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                        if (janelinhaTeste.isVisible() == false){
                            break;
                        }else if (i == 0){
                            testeFracasso = 1; //1 = true ;
                            janelinhaTeste.setVisible(false);                                
                            break;
                        }
                    }
                    if (testeFracasso == 1){
                        break;
                    }                      
                }while(janelinhaTeste.isVisible());
                if(acerto == true) {
                    ordemPuzzle += 1;
                    int cont = seconds - 62;
                    seconds -= cont ;
                    jProgressBar1.setValue(seconds);  
                }else if (acerto == false || testeFracasso == 1) {//Usuário Errou
                    seconds -= 27; //Para fica visivel ao usuário a perca de 30
                    jProgressBar1.setValue(-27);
                    jProgressBar1.setValue(seconds);
                    jProgressBar1.setValue(-14);
                    fracassou += 1;
                    ordemPuzzle += 1;
                }             
            }else if (seconds == 92){
                int testeFracasso = 0; //0 = false
                janelinhaTeste.setVisible(true);
                do {
                    seconds = 92;
                    for(int i=6;i >= 0;i--){
                        janelinhaTeste.jLabel1.setText(i + " segundos restantes");
                        try {                            
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Descriptografia.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                        if (janelinhaTeste.isVisible() == false){
                            break;
                        }else if (i == 0){
                            testeFracasso = 1; //1 = true ;
                            janelinhaTeste.setVisible(false);                                
                            break;
                        }
                    }
                    if (testeFracasso == 1){
                        break;
                    }                        
                }while(janelinhaTeste.isVisible());
                if(acerto == true) {
                    ordemPuzzle += 1;
                    int cont = seconds - 92;
                    seconds -= cont ;
                    jProgressBar1.setValue(seconds);  
                }else if (acerto == false || testeFracasso == 1) {//Usuário Errou
                    seconds -= 24; //Para fica visivel ao usuário a perca de 30
                    jProgressBar1.setValue(-24);
                    jProgressBar1.setValue(seconds);
                    jProgressBar1.setValue(-14);
                    fracassou += 1;
                    ordemPuzzle += 1;
                }                      
            } //fim Condicional If == 32/67/97
            if (fracassou >= 3){ //Caso Usuário tenha Errado 3, terá o fim do jogo iniciado.
                timer.cancel();
                try {
                    Thread.sleep(200);
                    gameOver.setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Descriptografia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }//Fim Condicional fracassou
        }    
    };    
//    int intervaloSeconds = 500 ;
    public void start(){
        timer.scheduleAtFixedRate(task,100,500);
    }
    
    public Descriptografia() {
        initComponents();
    }
    
    public void closeWindow() {
        if (seconds == 100) {
            this.setVisible(false);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(79, 146, 65));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 300, 670, 80);

        jPanel1.setBackground(new java.awt.Color(11, 15, 11));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/giphy.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 480, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 380);

        setSize(new java.awt.Dimension(669, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
            start();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Descriptografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Descriptografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Descriptografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Descriptografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Descriptografia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
