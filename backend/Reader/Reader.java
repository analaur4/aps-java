package backend.Reader;
import java.io.*;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reader implements IReader {
    private JSONObject story;
    private JSONParser parser = new JSONParser();
    private JSONObject scene;


    public Reader(String pathFile) throws IOException, ParseException {
        this.story =  (JSONObject) this.parser.parse(new FileReader(pathFile)) ;
    }

    @Override
    public void principal(String Scene){
        this.scene = (JSONObject) story.get(Scene);
    }

    @Override
    public String observation() {
        return (String) scene.get("obs");
    }

    @Override
    public String message() {
        return (String) scene.get("message");
    }

    @Override
    public String person() {
        return (String) scene.get("person");
    }

    @Override
    public ArrayList<String> option() {
        JSONArray temp =  (JSONArray) scene.get("options");
        int len = temp.size();
        ArrayList <String> tempArray = new ArrayList<>();
        for(int i = 0; i < len; i++){
            tempArray.add((String) temp.get(i));
        }
        return tempArray;
    }

    @Override
    public ArrayList<String> way() {
        JSONArray temp =  (JSONArray) scene.get("way");
        int len = temp.size();
        ArrayList <String> tempArray = new ArrayList<>();
        for(int i = 0; i < len; i++){
            tempArray.add((String) temp.get(i));
        }
        return tempArray;
    }
}
