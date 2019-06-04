package src.main.RestAssured;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import src.main.util.CountListFreq;
import src.main.util.GetJsonFileValueByName;
import src.main.util.OutPutResult;
import src.main.util.ReadJsonFile2Str;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.Matchers.hasSize;



public class CallUtilReadJsonFile {
    @Test
    public void CallUtilReadJsonFile() {
        ReadJsonFile2Str rj2s = new ReadJsonFile2Str();
   //;     String resultO = rj2s.inputpar("C:\\QA\\TESTRESULT\\user2.json");

        String resultO = rj2s.inputpar("/QA/TESTRESULT/user2.json");

        System.out.println("Before Update " + resultO);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test code success");
    }

    @Test
    public void AnalyzeJsonFile() {
        ArrayList<JSONObject> json = new ArrayList<JSONObject>();
        JSONObject obj;
        // The name of the file to open.
        String fileName = "C:\\QA\\TESTRESULT\\Dump\\testout1.txt";

        // This will reference one line at a time
        String line = null;
        ArrayList<String> list = new ArrayList<String>();

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                obj = (JSONObject) new JSONParser().parse(line);
                json.add(obj);
                System.out.println((Long) obj.get("dieVersion") + ":" +
                        (Long) obj.get("value"));
                String result = obj.get("value").toString();
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


        CountListFreq clf = new CountListFreq();
        Map outMp = clf.countFrequencies(list);
        OutPutResult outR = new OutPutResult();
        outR.inputStr(" API test data analysis result success");
    }

    @Test
    public void Call1GetJsonFileValueByName() {
        GetJsonFileValueByName gjv = new GetJsonFileValueByName();
        ArrayList alst = gjv.inputStr("C:\\QA\\TESTRESULT\\Dump\\testout1.txt", "value");

        CountListFreq clf = new CountListFreq();
        Map outMp = clf.countFrequencies(alst);
        OutPutResult outR = new OutPutResult();
        outR.inputStr(" API test data analysis result success");
    }

    @Test
    public void Call2GetJsonFileValueByName() {
        GetJsonFileValueByName gjv = new GetJsonFileValueByName();
    //    ArrayList alst = gjv.inputStr("C:\\QA\\TESTRESULT\\Dump\\testout2.txt", "value");
        ArrayList alst = gjv.inputStr("/QA/TESTRESULT/Dump/testout2.txt", "value");


        CountListFreq clf = new CountListFreq();
        Map outMp = clf.countFrequencies(alst);
        OutPutResult outR = new OutPutResult();
        outR.inputStr(" API test data analysis result success");
    }
    @Test
    public void Call3GetJsonFileValueByName() {
        GetJsonFileValueByName gjv = new GetJsonFileValueByName();
        ArrayList alst = gjv.inputStr("C:\\QA\\TESTRESULT\\Dump\\testout3.txt", "value");

        CountListFreq clf = new CountListFreq();
        Map outMp = clf.countFrequencies(alst);
        OutPutResult outR = new OutPutResult();
        outR.inputStr(" API test data analysis result success");
    }









}
