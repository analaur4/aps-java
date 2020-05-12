package backend.DataHandler;

import java.util.ArrayList;

public interface IDataHandler {

    void scene(String scene);
    String dataString(String field);
    ArrayList<String> dataArray(String field);


}
