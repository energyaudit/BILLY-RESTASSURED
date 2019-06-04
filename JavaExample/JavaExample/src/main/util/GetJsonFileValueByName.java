package src.main.util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class GetJsonFileValueByName {
    public static ArrayList<String> list = new ArrayList<String>();

    public static ArrayList inputStr(String fpath,String nam)  {
        ArrayList<JSONObject> json = new ArrayList<JSONObject>();
        JSONObject obj;
        // The name of the file to open.
      //  String fileName = "C:\\QA\\TESTRESULT\\Dump\\testout1.txt";
        String fileName =fpath;

        // This will reference one line at a time
        String line = null;


        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                obj = (JSONObject) new JSONParser().parse(line);
                json.add(obj);

                String result = obj.get(nam).toString();
                System.out.println(result);
                list.add(result);
            }
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
}