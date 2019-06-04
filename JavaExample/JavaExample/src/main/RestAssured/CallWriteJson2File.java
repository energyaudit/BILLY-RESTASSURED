package src.main.RestAssured;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import src.main.util.OutPutResult;
import src.main.util.Str2JsonFile;

import java.io.FileWriter;
import java.io.IOException;


public class CallWriteJson2File {
    @Test
    public void TestResponsecode()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        if(uri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

    //   Response resp= src.main.RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        Response resp= RestAssured.get(uri);
     int code=resp.getStatusCode();
       System.out.print(code);
        Assert.assertEquals(code,200);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test code success");
    }
    @Test
    public void Testbody()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        if(uri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        //   Response resp= src.main.RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        Response resp= RestAssured.get(uri);
        String data=resp.asString();
        System.out.println(data);
        System.out.println("Response time:"+resp.getTime());

        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test data success");
    }
    @Test
    public void TestbodyJsonFile()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        if(uri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        //   Response resp= src.main.RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        Response resp= RestAssured.get(uri);
        String jsonString=resp.asString();

        try {
         //   FileWriter writer = new FileWriter("C:\\QA\\TESTRESULT\\temp.json");
            FileWriter writer = new FileWriter("/QA/TESTRESULT/temp.json",true);

            writer.write(jsonString);
            writer.close();
//            FileWriter w = new FileWriter("C:\\QA\\TESTRESULT\\temp.json");
//            BufferedWriter out = new BufferedWriter(w);
//            out.newLine();
//            out.write(jsonString);
//            out.flush();
//            out.close();

        } catch (IOException e) {
            System.out.println("exception " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Response time:"+resp.getTime());
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test data write to jason file success");
    }
    @Test
    public void TesCallWriteJsonFile()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        if(uri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        //   Response resp= src.main.RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        Response resp= RestAssured.get(uri);
        String jsonString=resp.asString();

       Str2JsonFile sjf=new Str2JsonFile();
       sjf.inputStr(jsonString,"C:\\QA\\TESTRESULT\\temp.json");
        System.out.println("Response time:"+resp.getTime());
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test data write to jason file success"+jsonString);
    }
}
