package src.main.util;

import io.restassured.config.SSLConfig;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;


public class RTHeader {
    public static boolean vrf;

    public static boolean inputpar(String puri,String size) {

        try {
            org.apache.log4j.BasicConfigurator.configure();
       //     String uri="http://ergast.com/api/f1/2017/circuits.json";
            if(puri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

            given()
                    .when()
                    .get(puri)
                    .then()
                    .assertThat()
                    .header("Content-Length",equalTo(size));
            vrf=true;
        } catch (Exception e) {
            vrf=false;
        }
return vrf;
    }

}
