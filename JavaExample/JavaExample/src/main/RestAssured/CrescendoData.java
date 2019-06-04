package src.main.RestAssured;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import src.main.util.GetDataJPath;
import src.main.util.RTBody;
import src.main.util.OutPutResult;
import src.main.util.CountListFreq;

import src.main.util.Str2JsonFile;

import java.util.ArrayList;
import java.util.Map;

import static io.restassured.RestAssured.given;
        import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.fail;


public class CrescendoData  {

    @Test
    public void TestbodyURI3()

    {
        int l=20;

        ArrayList<String> list = new ArrayList<String>();
        for(int k=0;k<l;k++){
            //    String puri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
            String puri="http://34.214.27.37/api/dice/3";
            RTBody rty= new RTBody();
            String jsonString=rty.inputpar(puri);
            Str2JsonFile sjf=new Str2JsonFile();
       //     sjf.inputStr(jsonString,"C:\\QA\\TESTRESULT\\temp.json");
            sjf.inputStr(jsonString,"/QA/TESTRESULT/temp2.json");

            GetDataJPath gdj=new GetDataJPath();
            String  result=gdj.inputpar(puri,"value" );

            list.add(result);

            OutPutResult outR = new OutPutResult();
            outR.inputStr(" API test data BODY URI1 success result is:"+jsonString+result);
        }
        CountListFreq clf=new CountListFreq();
        Map outMp=clf.countFrequencies(list);

    }
    @Test
    public void TestbodyURI2()

    {
        int l=20;

        ArrayList<String> list = new ArrayList<String>();
        for(int k=0;k<l;k++){
            //    String puri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
            String puri="http://34.214.27.37/api/dice/2";
            RTBody rty= new RTBody();
            String jsonString=rty.inputpar(puri);
            Str2JsonFile sjf=new Str2JsonFile();
            sjf.inputStr(jsonString,"/QA/TESTRESULT/temp2.json");

            GetDataJPath gdj=new GetDataJPath();
            String  result=gdj.inputpar(puri,"value" );

            list.add(result);

            OutPutResult outR = new OutPutResult();
            outR.inputStr(" API test data BODY URI1 success result is:"+jsonString+result);
        }
        CountListFreq clf=new CountListFreq();
        Map outMp=clf.countFrequencies(list);

    }
    @Test
    public void TestbodyURI1()

    {
        int l=20;

        ArrayList<String> list = new ArrayList<String>();
        for(int k=0;k<l;k++){
            //    String puri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
            String puri="http://34.214.27.37/api/dice/1";
            RTBody rty= new RTBody();
            String jsonString=rty.inputpar(puri);
            Str2JsonFile sjf=new Str2JsonFile();
            sjf.inputStr(jsonString,"/QA/TESTRESULT/temp2.json");

            GetDataJPath gdj=new GetDataJPath();
            String  result=gdj.inputpar(puri,"value" );

            list.add(result);

            OutPutResult outR = new OutPutResult();
            outR.inputStr(" API test data BODY URI1 success result is:"+jsonString+result);
        }
        CountListFreq clf=new CountListFreq();
        Map outMp=clf.countFrequencies(list);

    }




}
