package src.main.util;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;


public class TestCode {
    public static boolean vrf;

    public static boolean inputpar(String puri,int pcode) {
        try {
        org.apache.log4j.BasicConfigurator.configure();
       if(puri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        Response resp= RestAssured.get(puri);
     int code=resp.getStatusCode();
        if (code==pcode){vrf=true; } else {vrf = false; }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(vrf);
        return vrf;
    }

}
