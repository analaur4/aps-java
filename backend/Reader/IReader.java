package backend.Reader;

import java.util.ArrayList;

public interface IReader {

    void principal(String scene);
    String observation();
    String message();
    String person();
    ArrayList<String> option();
    ArrayList<String> way();


}
