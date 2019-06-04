package src.main.Java2;

/**
 * Created by byang on 2018-06-11.
 */


import java.io.FileOutputStream;
        import java.io.OutputStream;
        import java.util.Properties;

public class PropToXml {
    public static void main(String args[]){
        OutputStream os = null;
        Properties prop = new Properties();
        prop.setProperty("name", "tutorialspointexamples");
        prop.setProperty("domain", "www.tutorialspointexamples.com");
        prop.setProperty("email", "tutorialspointexamples@gmail.com");
        try {
            os = new FileOutputStream("TestProp.properties");
            prop.storeToXML(os, "Dynamic Property File");
            System.out.println("XML Property file created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}