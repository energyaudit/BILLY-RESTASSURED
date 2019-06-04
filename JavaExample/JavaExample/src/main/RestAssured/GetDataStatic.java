package src.main.RestAssured;

import static io.restassured.RestAssured.*;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import src.main.util.OutPutResult;

public class GetDataStatic {
    @Test
    public void TestResponsecode()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

    //   Response resp= src.main.RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        Response resp= get(uri);
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
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        //   Response resp= src.main.RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        Response resp= get(uri);
        String data=resp.getBody().asString();
        System.out.println(data);
        System.out.println("Response time:"+resp.getTime());
    //    Assert.assertEquals(code,200);

        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test data success");
    }
}
