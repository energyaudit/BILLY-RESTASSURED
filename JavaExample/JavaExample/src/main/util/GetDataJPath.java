package src.main.util;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class GetDataJPath {
    public static boolean vrf;

    public static String inputpar(String puri,String Jpath)  {

//        try {
        org.apache.log4j.BasicConfigurator.configure();


        if(puri.toLowerCase().contains("https")) { RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }

    //   Response resp= src.main.RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        Response resp= RestAssured.get(puri);
            String data=resp.getBody().asString();
            System.out.println(data);
            System.out.println("Response time:"+resp.getTime());
            JsonPath jsonPath=new JsonPath(data);
            String weat=jsonPath.getString(Jpath);
            System.out.println(weat);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
              return weat;
    }

}
