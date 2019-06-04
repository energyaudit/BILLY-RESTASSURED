package WEB1.util;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;


public class alertExist {
    public static boolean vrf;

    public static boolean inputStr(WebDriver dr) {
        try {
            dr.switchTo().alert();
            vrf = true;
        } catch (NoAlertPresentException Ex) {
            vrf = false;
        }
        System.out.println(vrf);
        return vrf;
    }
}