package WEB1.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;



public class assertFloatByCss {
    public static boolean vrf;
    public static  String ele;
    public static boolean  inputStr(WebDriver dr,String cs, int ept) throws Exception {
       try {

        ele =dr.findElement(By.cssSelector(cs)).getText();

        float f = Float.parseFloat(ele);
     if (f>0){vrf=true; } else {vrf = false; }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(vrf);
        return vrf;
    }
}