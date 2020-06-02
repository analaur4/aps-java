package backend.DataHandler;
import java.io.*;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ControlStory implements IDataHandler {
    private JSONObject story;
    private JSONParser parser = new JSONParser();
    private JSONObject scene;


    public ControlStory(String pathFile) throws IOException, ParseException {
        this.story =  (JSONObject) this.parser.parse(new FileReader(pathFile)) ;
    }

    @Override
    public void scene(String scene) {
        this.scene = (JSONObject) story.get(scene);
    }

    @Override
    public String dataString(String field) {
        return (String) scene.get(field);
    }

    @Override
    public ArrayList<String> dataArray(String field) {
        JSONArray temp =  (JSONArray) scene.get(field);
        int len = temp.size();
        ArrayList <String> tempArray = new ArrayList<>();
        for(int i = 0; i < len; i++){
            tempArray.add((String) temp.get(i));
        }
        return tempArray;
    }
}
