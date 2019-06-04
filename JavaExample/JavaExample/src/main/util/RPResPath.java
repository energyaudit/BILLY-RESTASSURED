package src.main.util;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class RPResPath {


    public static String inputpar(String puri,HashMap map,Integer code,String pathPra)  {


        org.apache.log4j.BasicConfigurator.configure();
        if(puri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        String RespTitle=given()
                .contentType("application/json")
                .body(map)
                .when()
                .post(puri)
                .then()
                .statusCode(code)
                .and()
                .extract().path(pathPra);

        System.out.println(RespTitle);
        return RespTitle;

}

}
