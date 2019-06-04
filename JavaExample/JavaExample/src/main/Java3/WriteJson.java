package src.main.Java3;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by byang on 2018-09-18.
 */


public class WriteJson {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", new Integer(100));

        JSONArray list = new JSONArray();
        list.put("msg 1");
        list.put("msg 2");
        list.put("msg 3");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("C:\\QA\\TEST\\Data\\test.json")) {

            file.write(obj.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

}