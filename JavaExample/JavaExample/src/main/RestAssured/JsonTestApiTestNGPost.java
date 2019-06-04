package src.main.RestAssured;

import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.apache.http.HttpStatus;
import src.main.util.OutPutResult;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import src.main.util.RTBody;
import src.main.util.Str2JsonFile;

import java.util.HashMap;


public class JsonTestApiTestNGPost {

    String uri;
    public static   HashMap map = new HashMap();

    @BeforeTest
    public void postdata(){
        map.put("userId", "2");
        map.put("id", "19");
        map.put("title", "this is projectdebug.com");
        map.put("body", "this is REST-Assured Tutorial");
        //The above hashmap created json object as following for testPost testing:
//        {
//“userId”: 2,
//“id”: 19,
//“title”: “this is projectdebug.com”,
//“body”: “this is REST-Assured Tutorial”
//        }

    }

    @Test
    public void testPOST(){
        org.apache.log4j.BasicConfigurator.configure();
        String uri="http://jsonplaceholder.typicode.com/posts/";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
        given()
                .contentType("application/json")
                .body(map)
                .when()
                .post(uri)
                .then()
                .statusCode(201)
                .and()
                .body("title", equalTo("this is projectdebug.com"));
    }
    @Test
    public void TestResponsecode()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        given()
                .when()
                .get(uri)
                .then()
                .assertThat()
                .statusCode(200);
        // Assert.assertEquals(code,200);
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
        RTBody rty= new RTBody();
        String jsonString=rty.inputpar(uri);
        Str2JsonFile sjf=new Str2JsonFile();
        sjf.inputStr(jsonString,"/QA/TESTRESULT/temp4.json");
        System.out.println("Response time:"+resp.getTime());
        JsonPath jsonPath=new JsonPath(data);
        String weat=jsonPath.getString("weather[0].main");
        System.out.println(weat);

        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test data success");
    }
    @Test
    public void TestResponsebdy1()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="http://ergast.com/api/f1/2017/circuits.json";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        given()
                .when()
                .get(uri)
                .then()
                .assertThat()
                .body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));

        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test body size success");
    }
    @Test
    public void TestHeader()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="http://ergast.com/api/f1/2017/circuits.json";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        given()
                .when()
                .get(uri)
                .then()
                .assertThat()
                .header("Content-Length",equalTo("4551"));

        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test header success");
    }



    @Test(dataProvider = "circuitLocations")
    public void circuitLocationTest(String circuitId, String location) {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="http://ergast.com/api/f1/circuits/{circuitId}.json";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
        given().
                pathParameters("circuitId",circuitId).
                when().
                get(uri).
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits[0].Location.country",equalTo(location));

    }
    @DataProvider(name = "circuitLocations")
    public String[][] createCircuitTestData() {

        return new String[][] {
                {"adelaide","Australia"},
                {"detroit","USA"},
                {"george","South Africa"}
        };
    }

}
