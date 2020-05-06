package backend.DataHandler;

import java.util.ArrayList;

public class ControlStoryTest {
    public static void main(String[] args) {

        try{
            //testando objeto criado partir da classe especialista

            ControlStory story = new ControlStory("Story/story1.json");
            story.scene("Cena_1_Beat_1_B");

            System.out.println("observation : " + story.dataString("obs"));
            System.out.println("message : " + story.dataString("message"));
            System.out.println("person : " +  story.dataString("person"));

            //testando array de options
            ArrayList<String> let = story.dataArray("options");
            System.out.println("option : " + let.toString());

            System.out.println("\ntestendo\n");

            //Modulo desaclopado, com fraca dependencia.
            IDataHandler storys = new ControlStory("Story/story1.json");
            storys.scene("Cena_1_Beat_1_B");

            System.out.println("observation : " + storys.dataString("obs"));
            System.out.println("message : " + storys.dataString("message"));
            System.out.println("person : " +  storys.dataString("person"));

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
