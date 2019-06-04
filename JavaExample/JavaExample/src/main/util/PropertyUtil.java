package src.main.util;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by byang on 8/28/2017.
 */
public class PropertyUtil {

    protected static String getMessage(String source, String key) {
        try {
            Properties properties = new Properties();
            properties.load(PropertyUtil.class.getClass().getResourceAsStream(source));

            String property = properties.getProperty(key);
            if(property == null || "".equals(property)){
                throw new RuntimeException("Missing Property : " + key);
            }
            return property;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getMessageForApplication(String key){
        return getMessage("/application.properties", key);
    }
//   FOLLOWING IS TESTING THIS CLASS
    public static void main(String[] args){
        System.out.println(getMessageForApplication("baseUrl"));
    }

}
