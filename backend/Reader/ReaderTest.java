package backend.Reader;

import java.util.ArrayList;

public class ReaderTest {
    public static void main(String[] args) {

        try{
            //testando objeto criado partir da classe especialista

            Reader story = new Reader("Story/story1.json");
            story.principal("Cena_1_Beat_1_B");

            System.out.println(story.observation());
            System.out.println(story.message());
            System.out.println(story.person());

            //testando array de options
            ArrayList<String> let = story.option();
            System.out.println(let.toString());

            System.out.println("\ntestendo\n");

            //Modulo desaclopado, com fraca dependencia.
            IReader storys = new Reader("Story/story1.json");
            storys.principal("Cena_1_Beat_1_B");

            System.out.println(storys.observation());
            System.out.println(storys.message());
            System.out.println(storys.person());

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
