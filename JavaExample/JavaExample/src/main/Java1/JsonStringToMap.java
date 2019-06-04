package src.main.Java1;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by byang on 2018-09-19.
 */

public class JsonStringToMap {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            String json = "{\"name\":\"mkyong\", \"age\":29}";

            Map<String, Object> map = new HashMap<String, Object>();

            // convert JSON string to Map
            map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});

            System.out.println(map);
//Map to JSON
            ObjectMapper mapper1 = new ObjectMapper();
            String json1 = "";

            Map<String, Object> map1 = new HashMap<String, Object>();
            map.put("name", "mkyong");
            map.put("age", 29);

            // convert map to JSON string
            json1 = mapper1.writeValueAsString(map);

            System.out.println(json1);

            json1 = mapper1.writerWithDefaultPrettyPrinter().writeValueAsString(map);

            // pretty print
            System.out.println(json1);
            FileWriter w = new FileWriter("C:\\QA\\TESTRESULT\\temp1.json");
            BufferedWriter out = new BufferedWriter(w);
            out.newLine();
            out.write(json1);
            out.flush();
            out.close();

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}