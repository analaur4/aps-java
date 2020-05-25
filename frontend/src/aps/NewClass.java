package aps;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author UnGui
 */
public class NewClass {
    public static void main(String args[]) {
        //Instanciando a Tela Splash.
        SplashScreen obj = new SplashScreen();
        obj.setVisible(true);
        //Logo quando iniciado, Desabilitando a Frase "Key Validada Bom Jogo !", para Ativação mais abaixo.
        obj.lbl__keyValidadaBomJogo.setVisible(false);
        
        //Começo Tela Splash Screen -> Loading
        try {
            for (int i=0; i<=100; i++)
            {
                Thread.sleep(100);
                obj.Porcentagem__Carregamento.setText(Integer.toString(i)+"%");
                obj.barra__Progresso.setValue(i);
            }
            //Habilitando o Label "Key Validada Bom Jogo !"
            obj.lbl__keyValidadaBomJogo.setVisible(true);
            //Desabilitando o Label "Verificando Key".
            obj.jLabel4.setVisible(false);
            //Atraso entre a Tela Splash e TelaInicial.
            Thread.sleep(2000);
            //Habilitando Tela Inicial e Fechando SplashScreen
            obj.setVisible(false);
            new TelaInicial().setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro no Carregamento, O jogo será Fechado");
            System.exit(0);
        }
        //Começo Tela Splash Screen -> Loading        
    }
    //Começo Classe Dados Usuário
    //Valores Criado
    private String nome;
    private String url__profile;
    //Método Set para Modificar
    public void setNome(String newNome){
        this.nome = newNome;
    }
    public void setUrl(String newUrl){
        this.url__profile = newUrl;
    }
    //Método Get Para pegar 
    public String getNome(){
        return nome;
    }
    public String getUrl(){
        return url__profile;
    }
    //Fim Classe Dados Usuário
    //Método Puzzle
    public void instacimanetoPuzzle() {

        
        DescriptografandoAndEnviando obj = new DescriptografandoAndEnviando();
        TelaPuzzle janelinhaTeste = new TelaPuzzle();
        obj.setVisible(true);
        
        int fracassou = 0; //Variavel criada para caso o usuário errer 3 vezes .
            
        
//        for (int i = 0; i <= 100;i++) {
////            getDelay(100);
//            sleep();
//            obj.jProgressBar1.setValue(i);
//        }

//        try {
//            for (int i=0; i<=100; i++)
//            {//Começo Loop For
//                //Preciso saber quando ele fechou o puzzle => janelinhaTeste.isVisible()
//                //E se errou ou acertou => boolean teste
//                Thread.sleep(100);
//                obj.jProgressBar1.setValue(i);
//                if(i == 32){//começo Condicional If == 32
//                    janelinhaTeste.setVisible(true);
//                    do {
//                        System.out.println("");
//                    }while(janelinhaTeste.isVisible());
//                    if (acerto == false) {//Usuário Errou
//                        i -= 30 ;
//                        fracassou += 1 ;
//                    }             
//                }else if(i == 67){
//                    janelinhaTeste.setVisible(true);
//                    do {
//                        System.out.println("");
//                    }while(janelinhaTeste.isVisible());
//                    if (acerto == false) {//Usuário Errou
//                        i -= 30;
//                        fracassou += 1;
//                    }                     
//                }else if(i == 97){
//                    janelinhaTeste.setVisible(true);
//                    do {
//                        System.out.println("");
//                    }while(janelinhaTeste.isVisible());
//                    if (acerto == false) {//Usuário Errou
//                        i -= 30;
//                        fracassou += 1;
//                    }                  
//                } //fim Condicional If == 32/67/97
//                if (fracassou >= 3){//Caso Usuário tenha Errado 3, terá o fim do jogo iniciado.
//                    JOptionPane.showMessageDialog(null,"GAMER OVER < MAN");  
//                    Thread.sleep(2000);
//                    System.exit(0);
//                }//Fim Condicional fracassou
//            }//Fim Loop For
//        } catch (Exception e){
//            JOptionPane.showMessageDialog(null,"Erro no Carregamento, O jogo será Fechado");
//            System.exit(0);
//        }//Fim Try - Catch       
    }//Fim main AreaDeTeste       
    
    //Fim método puzzle
}
