package src.main.util;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

import java.io.FileWriter;
import java.io.IOException;


public class RTime {
    public static boolean vrf;

    public static long inputpar(String puri)  {

//        try {
        org.apache.log4j.BasicConfigurator.configure();
        if(puri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

        Response resp= RestAssured.get(puri);
        String data=resp.asString();
        System.out.println(data);
        String jsonString=data;
        long RespTime=resp.getTime();

        try {
           // FileWriter writer = new FileWriter("C:\\QA\\TESTRESULT\\temp.json");
            FileWriter writer = new FileWriter("/QA/TESTRESULT/temp.json");

            writer.write(jsonString);
            writer.close();
        } catch (IOException e) {
            System.out.println("exception " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Response time:"+resp.getTime());
              return RespTime;
    }

}
