package src.main.util;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class RTAuthCode {
    public static boolean vrf;

    public static boolean inputpar(String puri,String authUsr,String authPwd,int pcode) {
        try {
        org.apache.log4j.BasicConfigurator.configure();
       if(puri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

            int code= given()
                    .auth().preemptive().basic("ToolsQA","TestPassword").when()
                    .get(puri).getStatusCode();
        if (code==pcode){vrf=true; } else {vrf = false; }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(vrf);
        return vrf;
    }

}
