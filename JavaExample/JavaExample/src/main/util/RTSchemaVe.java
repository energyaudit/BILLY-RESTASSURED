package src.main.util;


import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.http.HttpStatus;


import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class RTSchemaVe {


     //   public static boolean vrf;

        public static void inputpar(String puri,String shemaPath,Integer expeCode) {
                org.apache.log4j.BasicConfigurator.configure();
                if(puri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

                 given()
                        .accept(ContentType.JSON)
                        .when()
                        .get(puri)
                        .then()
                        .assertThat()
                        .body(JsonSchemaValidator.matchesJsonSchemaInClasspath(shemaPath))
                        .statusCode(expeCode);

        }

}