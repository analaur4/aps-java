package aps.backend;
import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHandler {
    String resourceName = "./Assets/gamefile.json";
 
    public JSONObject initialize() {
        InputStream is = JsonHandler.class.getResourceAsStream(this.resourceName);
        if (is == null) {
            throw new NullPointerException("Cannot find resource file " + this.resourceName);
        }
        JSONTokener JsonTokener = new JSONTokener(is);
        JSONObject GameDataJson = new JSONObject(JsonTokener);
        return GameDataJson.getJSONObject("1");
    }
 
    public JSONObject nextScene(String sceneId) {
        InputStream is = JsonHandler.class.getResourceAsStream(this.resourceName);
        if (is == null) {
            throw new NullPointerException("Cannot find resource file " + this.resourceName);
        }
        JSONTokener JsonTokener = new JSONTokener(is);
        JSONObject GameDataJson = new JSONObject(JsonTokener);
        return GameDataJson.getJSONObject(sceneId);
    }
}
