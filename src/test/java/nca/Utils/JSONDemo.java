package nca.Utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by temp on 21.08.2015.
 */
public class JSONDemo {

    public long readJson(String file) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

            JSONArray initialArray = (JSONArray) parser.parse(new FileReader(file));
            Long[] ids = new Long[initialArray.size()];
            String[] names = new String[initialArray.size()];
            for (int index = 0; index < initialArray.size(); index++) {
                JSONObject object = (JSONObject) initialArray.get(index);
                ids[index] = (Long) object.get("id");
                names[index] = (String) object.get("name");
            }
            long id =  ids[0];
        return id;
    }


}
