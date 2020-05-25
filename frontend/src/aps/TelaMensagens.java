package aps;

import static aps.TelaInicial.profileURL;
import static aps.TelaInicial.nameUser;
import aps.backend.JsonHandler;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author ana.conceicao
 */
public class TelaMensagens extends javax.swing.JFrame {

    JsonHandler jsonHandler = new JsonHandler();
    JSONObject objJSON = jsonHandler.initialize();
    JSONObject newObjJSON = objJSON;
    TelaGameOver gameOver = new TelaGameOver();
    TelaEmail email = new TelaEmail();
    
    /**
     * Creates new form Desktop
     */
    public TelaMensagens() {
        initComponents();
        
        //Começo Modificando URL__PROFILE
//      Aqui estamos colocando o valor salvo na Variavel Global / TelaINICIAL
        ImageIcon newProfile = new ImageIcon(profileURL);
        //Modificando o Icon
        url__profile.setIcon(newProfile);
        //FIM Modificando URL__PROFILE
        
        txt__mensagger.setText(objJSON.getString("name") + "\n" + objJSON.getString("message") + ", " + nameUser + "\n\n");
        Alternativa01.setText(objJSON.getJSONArray("options").getString(0));
        Alternativa02.setText(objJSON.getJSONArray("options").getString(1));
        Alternativa03.setText(objJSON.getJSONArray("options").getString(2));
    }

    public void alterOptions() {
        Alternativa01.setText(newObjJSON.getJSONArray("options").getString(0));
        Alternativa02.setText(newObjJSON.getJSONArray("options").getString(1));
        Alternativa03.setText(newObjJSON.getJSONArray("options").getString(2));
        txt__mensagger.setText(txt__mensagger.getText() + newObjJSON.getString("name") + "\n" + newObjJSON.getString("message") + "\n\n");
        AnswerGroup.clearSelection();
    }
    
    public void alterEvent() {
        if (null != newObjJSON.get("event")) switch (newObjJSON.getInt("event")) {
            case 0:
                gameOver.setVisible(true);
                break;
            case 3:
                JOptionPane.showMessageDialog(this,"Descriptografar");
                newObjJSON = jsonHandler.nextScene(newObjJSON.getJSONArray("path").getString(0));
                alterOptions();
                break;
            case 4:
                email.setVisible(true);
                newObjJSON = jsonHandler.nextScene(newObjJSON.getJSONArray("path").getString(0));
                alterOptions();
                break;
            case 5:
                JOptionPane.showMessageDialog(this,"Créditos");
                System.exit(0);
                break;
            default:
                break;
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

        AnswerGroup = new javax.swing.ButtonGroup();
        url__profile = new javax.swing.JLabel();
        btn__Enviar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Alternativa03 = new javax.swing.JRadioButton();
        Alternativa02 = new javax.swing.JRadioButton();
        Alternativa01 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt__mensagger = new javax.swing.JTextArea();
        layout__mensegger = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensagens");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);
        getContentPane().add(url__profile);
        url__profile.setBounds(30, 400, 150, 120);

        btn__Enviar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn__Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/btn__enviar.png"))); // NOI18N
        btn__Enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn__Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn__EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btn__Enviar);
        btn__Enviar.setBounds(790, 420, 100, 70);

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 390, 150, 23);

        AnswerGroup.add(Alternativa03);
        Alternativa03.setText("Resposta C");
        Alternativa03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Alternativa03);
        Alternativa03.setBounds(220, 480, 510, 23);

        AnswerGroup.add(Alternativa02);
        Alternativa02.setText("Resposta B");
        Alternativa02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Alternativa02);
        Alternativa02.setBounds(220, 440, 510, 23);

        AnswerGroup.add(Alternativa01);
        Alternativa01.setText("Resposta A");
        Alternativa01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Alternativa01);
        Alternativa01.setBounds(220, 400, 510, 23);

        txt__mensagger.setEditable(false);
        txt__mensagger.setColumns(20);
        txt__mensagger.setLineWrap(true);
        txt__mensagger.setRows(5);
        jScrollPane1.setViewportView(txt__mensagger);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(11, 30, 990, 335);

        layout__mensegger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps/image/layout__Mensagger.png"))); // NOI18N
        getContentPane().add(layout__mensegger);
        layout__mensegger.setBounds(0, 0, 1011, 540);

        setSize(new java.awt.Dimension(1010, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Evento Clicked Button Enviar
    private void btn__EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn__EnviarActionPerformed
        
        if (Alternativa01.isSelected()){
            txt__mensagger.setText(txt__mensagger.getText() + nameUser + "\n" +
            newObjJSON.getJSONArray("options").getString(0) + "\n\n");
            
            newObjJSON = jsonHandler.nextScene(newObjJSON.getJSONArray("path").getString(0));
            alterOptions();
            alterEvent();
            
        }else if(Alternativa02.isSelected()){
            txt__mensagger.setText(txt__mensagger.getText() + nameUser + "\n" +
            newObjJSON.getJSONArray("options").getString(1) + "\n\n");
            
            newObjJSON = jsonHandler.nextScene(newObjJSON.getJSONArray("path").getString(1));
            alterOptions();
            alterEvent();

        }else if(Alternativa03.isSelected()){
            txt__mensagger.setText(txt__mensagger.getText() + nameUser + "\n" +
            newObjJSON.getJSONArray("options").getString(2) + "\n\n");
            
            newObjJSON = jsonHandler.nextScene(newObjJSON.getJSONArray("path").getString(2));
            alterOptions();
            alterEvent();

        }
        
    }//GEN-LAST:event_btn__EnviarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//                NewClass MainPrincipal = new NewClass();
        //Chamando método que está localizado no nosso MainPrincipal
//        MainPrincipal.instacimanetoPuzzle();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMensagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMensagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMensagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMensagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMensagens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Alternativa01;
    private javax.swing.JRadioButton Alternativa02;
    private javax.swing.JRadioButton Alternativa03;
    private javax.swing.ButtonGroup AnswerGroup;
    private javax.swing.JButton btn__Enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel layout__mensegger;
    private javax.swing.JTextArea txt__mensagger;
    public javax.swing.JLabel url__profile;
    // End of variables declaration//GEN-END:variables
}
