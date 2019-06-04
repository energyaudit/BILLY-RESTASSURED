package src.main.util;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class RAPBody {


    public static String inputpar(String puri,HashMap map)  {


        org.apache.log4j.BasicConfigurator.configure();
        if(puri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        String RespPBody=given()
                .contentType("application/json")
                .body(map)
                .when()
                .post(puri).asString();


        System.out.println(RespPBody);
        return RespPBody;

}

}
