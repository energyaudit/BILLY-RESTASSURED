package src.main.RestAssured;


import org.junit.Test;

import src.main.util.*;

import java.util.HashMap;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class TestCallUti {
    @Test
    public void TestResponsecode() {

        String puri = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        TestCode tcd = new TestCode();
        boolean result = tcd.inputpar(puri,200);
        assertTrue(result);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test code success");
    }

    @Test
    public void TestGetDataJpath() {

        String puri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        GetDataJPath gdj=new GetDataJPath();
        String  result=gdj.inputpar(puri,"weather[0].main" );


        //    String weat=jsonPath.getString("weather[0].main");
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API get data call getDataJpath success");
    }
    @Test
    public void TestRTsize()
    {

        String puri="http://ergast.com/api/f1/2017/circuits.json";
        RTNodeSize rts=new RTNodeSize();
        boolean result=rts.inputpar(puri,20);
        assertTrue(result);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test body size success");
    }
    @Test
    public void Testbody()
    {
        String puri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        RTBody rty= new RTBody();
       rty.inputpar(puri);
        OutPutResult outR = new OutPutResult();
        outR.inputStr(" API test data BODY success");
    }

    @Test
    public void TestShemaVerify()
    {
        String puri="https://jsonplaceholder.typicode.com/posts/1";
        RTSchemaVe rty= new RTSchemaVe();
        rty.inputpar(puri,"schemaFile.json",200);
        OutPutResult outR = new OutPutResult();
        outR.inputStr(" API test Test ShemaVerify success");
    }

    @Test
    public void TestAuth()
    {
        String puri="http://restapi.demoqa.com/authentication/CheckForAuthentication";
        RTAuthCode rty= new RTAuthCode();
        rty.inputpar(puri,"schemaFile.json","ToolsQA",200);
        OutPutResult outR = new OutPutResult();
        outR.inputStr(" API test Test AUTH success");
    }


    @Test
    public void TestResponseTime()
    {
        String puri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        //   String puri="http://ergast.com/api/f1/2017/circuits.json";
        RTime rty= new RTime();
        rty.inputpar(puri);
        OutPutResult outR = new OutPutResult();
        outR.inputStr(" API test data API Response Time success");
    }
    @Test
    public void TestRTheader()
    {

        String puri="http://ergast.com/api/f1/2017/circuits.json";
        RTHeader rth=new RTHeader();
        boolean result=rth.inputpar(puri,"4551");
        assertTrue(result);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test header content success");
    }
    @Test
    public void testPOSTResPath(){

        String puri="https://loyaltyone-sandbox-pin.auth0.com/oauth/token";
        HashMap map = new HashMap();
        map.put("client_id", "V2Wkew1NeiWQUgAnmyGU4mnAHYv1jTPM");
        map.put("client_secret", "vZL-MVfQepAYNqcPkFnz5qc0BagQ574hBX_OtW_1pz1SHzyuPu6o1WihbvYQus6A");
        map.put("audience", "https://partners.loyalty.com");
        map.put("grant_type", "client_credentials");

        RPResPath rppt=new RPResPath();
        String rePath=rppt.inputpar(puri,map,200,"access_token");
        System.out.println(rePath) ;
    }

    @Test
    public void testPOSTResBody(){

        String puri="https://loyaltyone-sandbox-pin.auth0.com/oauth/token";
        HashMap map = new HashMap();
        map.put("client_id", "V2Wkew1NeiWQUgAnmyGU4mnAHYv1jTPM");
        map.put("client_secret", "vZL-MVfQepAYNqcPkFnz5qc0BagQ574hBX_OtW_1pz1SHzyuPu6o1WihbvYQus6A");
        map.put("audience", "https://partners.loyalty.com");
        map.put("grant_type", "client_credentials");

        RAPBody rppt=new RAPBody();
        String rePath=rppt.inputpar(puri,map);
        System.out.println(rePath) ;
    }
    @Test
    public void testPOSTResCode(){

        String puri="https://loyaltyone-sandbox-pin.auth0.com/oauth/token";
        HashMap map = new HashMap();
        map.put("client_id", "V2Wkew1NeiWQUgAnmyGU4mnAHYv1jTPM");
        map.put("client_secret", "vZL-MVfQepAYNqcPkFnz5qc0BagQ574hBX_OtW_1pz1SHzyuPu6o1WihbvYQus6A");
        map.put("audience", "https://partners.loyalty.com");
        map.put("grant_type", "client_credentials");

        PostCode rppt=new  PostCode();
        boolean rePath=rppt.inputpar(puri,map,200);
        System.out.println(rePath) ;
    }
    @Test
    public void testPOSTResPath1(){

        String puri="http://jsonplaceholder.typicode.com/posts/";
        HashMap map = new HashMap();
        map.put("userId", "2");
        map.put("id", "19");
        map.put("title", "this is projectdebug.com");
        map.put("body", "this is REST-Assured Tutorial");

        RPResPath rppt=new RPResPath();
        String rePath=rppt.inputpar(puri,map,201,"title");
        System.out.println(rePath) ;
    }
    @Test
    public void testPOSTResBody1(){

        String puri="http://jsonplaceholder.typicode.com/posts/";
        HashMap map = new HashMap();
        map.put("userId", "2");
        map.put("id", "19");
        map.put("title", "this is projectdebug.com");
        map.put("body", "this is REST-Assured Tutorial");

        RAPBody rppt=new RAPBody();
        String rePath=rppt.inputpar(puri,map);
        System.out.println(rePath) ;
    }
    @Test
    public void testPOSTResCode1(){

        String puri="http://jsonplaceholder.typicode.com/posts/";
        HashMap map = new HashMap();
        map.put("userId", "2");
        map.put("id", "19");
        map.put("title", "this is projectdebug.com");
        map.put("body", "this is REST-Assured Tutorial");

        PostCode rppt=new PostCode();
        boolean rePath=rppt.inputpar(puri,map,201);
        System.out.println(rePath) ;
    }

}
