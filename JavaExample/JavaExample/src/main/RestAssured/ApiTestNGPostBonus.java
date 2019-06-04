package src.main.RestAssured;

import io.restassured.config.SSLConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import src.main.util.OutPutResult;
import src.main.util.RTBody;
import src.main.util.Str2JsonFile;
import src.main.util.Str2JsonAppendFile;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.openqa.selenium.support.ui.ExpectedConditions.and;


public class ApiTestNGPostBonus {

    String uri;
    String jsonString;
    public static   HashMap map = new HashMap();

    @BeforeTest
    public void postdata(){
        map.put("client_id", "V2Wkew1NeiWQUgAnmyGU4mnAHYv1jTPM");
        map.put("client_secret", "vZL-MVfQepAYNqcPkFnz5qc0BagQ574hBX_OtW_1pz1SHzyuPu6o1WihbvYQus6A");
        map.put("audience", "https://partners.loyalty.com");
        map.put("grant_type", "client_credentials");
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
        String uri="https://loyaltyone-sandbox-pin.auth0.com/oauth/token";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
        String resTitle=given()
                .contentType("application/json")
                .body(map)
                .when()
                .post(uri)
                .then()
                .statusCode(200)
                .and()
                .extract().path("access_token");
        //body("title", equalTo("this is projectdebug.com"));
        System.out.println(resTitle) ;

    }
    @Test
    public void testPOSTHeaderAccpt(){
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://loyaltyone-sandbox-pin.auth0.com/oauth/token";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
        String resTitle=given()
                .contentType("application/json")
                .accept("application/json")
                .body(map)
                .when()
                .post(uri)
                .then()
                .statusCode(200)
                .and()
                .extract().path("access_token");
        //body("title", equalTo("this is projectdebug.com"));
        System.out.println(resTitle) ;

    }
    @Test
    public void testPOSTRespBody(){
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://loyaltyone-sandbox-pin.auth0.com/oauth/token";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
        String resTitle=given()
                .contentType("application/json")
                .body(map)
                .when()
                .post(uri).asString();
//                .then()
//                .statusCode(200)
//                .and()
//                .extract().path("access_token");
        //body("title", equalTo("this is projectdebug.com"));
        System.out.println(resTitle) ;

    }
    @Test
    public void testPOSTMap(){
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://loyaltyone-sandbox-pin.auth0.com/oauth/token";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
        given()
                .contentType("application/json")
                .body(map)
                .when()
                .post(uri)
                .then()
                .statusCode(200);
        //  .and()
        // .body("title", equalTo("this is projectdebug.com"));


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
    public void PostResponse()
    {
        org.apache.log4j.BasicConfigurator.configure();
        String uri="https://loyaltyone-sandbox-pin.auth0.com/oauth/token";
        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
        // src.main.RestAssured.baseURI = "https://loyaltyone-sandbox-pin.auth0.com/oauth";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        // Create new JSON Object
        JsonObject loginCredentials = new JsonObject();
        loginCredentials.addProperty("client_id", "V2Wkew1NeiWQUgAnmyGU4mnAHYv1jTPM");
        loginCredentials.addProperty("client_secret", "vZL-MVfQepAYNqcPkFnz5qc0BagQ574hBX_OtW_1pz1SHzyuPu6o1WihbvYQus6A");
        loginCredentials.addProperty("audience", "https://partners.loyalty.com");
        loginCredentials.addProperty("grant_type", "client_credentials");
        httpRequest.body(loginCredentials.toString());


        Response response = httpRequest.post(uri);
        jsonString=response.toString();
        String data=response.getBody().asString();
        System.out.println(data);
        Str2JsonFile sjf=new Str2JsonFile();
        sjf.inputStr(data,"/QA/TESTRESULT/temp5.json");
//       the appending json must write into another josn file or not following steps cannot get last access_token and token_type
        String access_token = response.jsonPath().get("access_token");
        System.out.println(access_token);
        String token_type = response.jsonPath().get("token_type");
        System.out.println(token_type);

        Str2JsonAppendFile sjf1=new Str2JsonAppendFile();
        sjf1.inputStr(data,"/QA/TESTRESULT/temp6.json");



        OutPutResult outR = new OutPutResult();
        outR.inputStr("Assert API test data success"+"access_token:"+access_token+"token_type:"+token_type);
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
