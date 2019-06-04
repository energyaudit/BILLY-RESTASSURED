package src.main.util;

import io.restassured.config.SSLConfig;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RTNodeSize {
    public static boolean vrf;

    public static boolean inputpar(String puri,int size) {

        try {
            org.apache.log4j.BasicConfigurator.configure();
       //     String uri="http://ergast.com/api/f1/2017/circuits.json";
            if(puri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

            given()
                    .when()
                    .get(puri)
                    .then()
                    .assertThat()
                    .body("MRData.CircuitTable.Circuits.circuitId",hasSize(size));
            vrf=true;
        } catch (Exception e) {
            vrf=false;
        }
return vrf;
    }

}
