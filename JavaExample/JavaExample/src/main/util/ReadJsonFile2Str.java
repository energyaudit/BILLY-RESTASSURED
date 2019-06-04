package src.main.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class ReadJsonFile2Str {
public static String resultO;

    public static String inputpar(String path)   {

        try {

            ObjectMapper mapper = new ObjectMapper();

            //     JsonNode root = mapper.readTree(new File("C:\\QA\\TEST\\TEST DOC\\user2.json"));
            JsonNode root = mapper.readTree(new File(path));


             resultO = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);



        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultO;
    }

}
